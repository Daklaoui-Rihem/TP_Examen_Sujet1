package examenTP;

public class OrganiseEvtMois {
	private int mois;
	private ThemeEvt theme;
	private Evenement tabEv[];
	
	int nbMax()
	{
		switch(mois)
		{
		case 2:return 28;
		case 4:return 30;
		case 6:return 30;
		case 9:return 30;
		case 11:return 30;
		default:return 31;
		}
	}

	public OrganiseEvtMois(int mois, ThemeEvt theme) {
		super();
		this.mois = mois;
		this.theme = theme;
	    this.tabEv =new Evenement[nbMax()];
	}
	
	void ajouter(Evenement Evt, int jour) throws EvtException
	{
		if(theme.theme(Evt))
		{
			if(jour<1 || jour>nbMax())
			{
				throw new EvtException("Jour Incorrecte");
			}
			else {
				if(tabEv[jour-1]==null)
				{
					tabEv[jour-1]=Evt;
				}
				else {
					boolean test=false;
					for(int i=0;i<nbMax();i++)
					{
						if(tabEv[i]==null)
						{
							tabEv[i]=Evt;
							test=true;
							break;
						}
					}
					if(test==false)
					{
						throw new EvtException("Complet");
					}
				}
			}
		}	
	}
	void afficherCalendrierEvts()
	{
		for(int i=0;i<nbMax();i++)
		{
			System.out.println(tabEv[i]);
		}
	}
}
