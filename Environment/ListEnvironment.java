package Environment;

public class ListEnvironment<K,V> implements Environment<K,V>
{
	ListNode<K,V> head;
	int	 scopeLevel;

	public ListEnvironment()
	{
		head = null;
		scopeLevel = 0;
	}

	public void beginScope()
	{
        this.scopeLevel++;
	}

	public void endScope()
	{
		if(head != null){
			ListNode<K,V> t = head;
			while(t!=null){
				if(t.scope == this.scopeLevel){
					t = t.next;
				}else{
					break;
				}
			}
			head = t;
		 }
		this.scopeLevel--;
	}

	public boolean inCurrentScope(K key)
	{
		if (this.lookup(key) != null){
			return true;
		}
		else{
			return false;
		}
	}

	public void add(K key, V value)
	{
        if(head == null){
           head = new ListNode(key, value, this.scopeLevel, null);
        }
        else{
            ListNode<K,V> t = head;
            head = new ListNode(key, value, this.scopeLevel, t);
        }
	}

	public V lookup(K key)
	{
        ListNode<K,V> p = head;
        while (p != null)
		{
            if(p.key.equals(key) && p.scope <= this.scopeLevel)
            {
                return p.value;
            }
            p = p.next;
        }
        return null;

	}

	public String toString()
	{
		ListNode<K,V> n = head;
		String s = "lvl: " + scopeLevel + " {";
		while (n != null)
		{
			s += "(";
			if ( n.key == null )
			{
				s += "<sm>";
			}
			else
			{
				s += n.key + "," + n.value;
			}
			s += ")";
			if (n.next != null)
			{
				s += ",";
			}
			n = n.next;
		}
		s += "}";
		return s;
	}
}