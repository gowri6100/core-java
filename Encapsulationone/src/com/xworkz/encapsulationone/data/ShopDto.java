package com.xworkz.encapsulationone.data;

public class ShopDto {
	private String nameOfTheShop;
	private String owner;
	private int noOfItems;
	private String address;
	private int priceOfTheShop;
	private int pincode;
	private String chips;
	private String curd;
	private String milk;
	private int priceChips;
	private int priceCurd;
	private int priceMilk;
	private String biscuit;
	private int biscuitPrice;
	private int dailyIncome;
    private int dailyLoss;
	private  int dailyExpenditure;
	private String vegetable;
	private int vegetablePrice;
	private char firstLetterOfTheShopName;
	private int priceVegetable;
	private boolean isShopIsGood;
	private String energyDrink;
	private String proteinPowder;
	private int energyDrinkPrice;
	private int proteinPowderPrice;
	private int noOfUnUseItems;
	private int usableItem;
	private String fruits;
	private int fruitsPrice;
	private int mostExpensiveItem;
	private int cheapItem;
	private int horlicsPrice;
	private int boostPrice;
	private int breadPrice;
	private int cheesePrice;
	private int paneerPrice;
	private int cheeseSlicePrice;
	private String shampooo;
	private int shampoooPrice;
	private String soap;
	private int soapPrice;
	private String paste;
	private int pastePrice;
	private int noOfBiscuit;
	private int noOfShampooProduct;
	private int lowestPriceBiscuit;
	private int highestPriceBiscuit;
	private int toastPrice;
	private String toast;
	private String jam;
	private int jamPrice;
	private String sauce;
	private int saucePrice;
	private int onionPrice;
	private int tomatoPrice;
	private int chilliPrice;
	private int applePrice;
	private int gauvaPrice;
	private int pineApplePrice;
	private int mangoPrice;
	private int bananaPrice;
	private int potatoPrice;
	private int cucumberPrice;
	private int carrotPrice;
	private int ladyFingerPrice;
	private int beansPrice;
	
	public ShopDto( String nameOfTheShop, String owner,int noOfItems, String address,int priceOfTheShop,
			 int pincode,String chips, String curd,String milk,int priceChips, int priceCurd,
			 int priceMilk,String biscuit, int biscuitPrice, int dailyIncome ,int dailyLoss,
			int dailyExpenditure, String vegetable, int vegetablePrice, char firstLetterOfTheShopName,int priceVegetable,boolean isShopIsGood) {
		
		
		this.nameOfTheShop = nameOfTheShop;
		this.owner = owner;
		this.noOfItems = noOfItems;
		this.address = address;
		this.priceOfTheShop = priceOfTheShop;
		this.pincode = pincode;
		this.chips = chips;
		this.curd = curd;
		this.milk = milk;
		this.priceChips = priceChips;
		this.priceCurd = priceCurd;
		this.priceMilk = priceMilk;
		this.biscuit = biscuit;
		this.biscuitPrice = biscuitPrice;
		this.dailyIncome = dailyIncome;
		this.dailyLoss = dailyLoss;
		this.dailyExpenditure = dailyExpenditure;
		this.vegetable = vegetable;
		this.vegetablePrice = vegetablePrice;
		this.firstLetterOfTheShopName = firstLetterOfTheShopName;
		this.priceVegetable = priceVegetable;
		this.isShopIsGood = isShopIsGood;
			

	}

	public String getNameOfTheShop() {
		return nameOfTheShop;
	}

	public void setNameOfTheShop(String nameOfTheShop) {
		this.nameOfTheShop = nameOfTheShop;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPriceOfTheShop() {
		return priceOfTheShop;
	}

	public void setPriceOfTheShop(int priceOfTheShop) {
		this.priceOfTheShop = priceOfTheShop;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getChips() {
		return chips;
	}

	public void setChips(String chips) {
		this.chips = chips;
	}

	public String getCurd() {
		return curd;
	}

	public void setCurd(String curd) {
		this.curd = curd;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public int getPriceChips() {
		return priceChips;
	}

	public void setPriceChips(int priceChips) {
		this.priceChips = priceChips;
	}

	public int getPriceCurd() {
		return priceCurd;
	}

	public void setPriceCurd(int priceCurd) {
		this.priceCurd = priceCurd;
	}

	public int getPriceMilk() {
		return priceMilk;
	}

	public void setPriceMilk(int priceMilk) {
		this.priceMilk = priceMilk;
	}

	public String getBiscuit() {
		return biscuit;
	}

	public void setBiscuit(String biscuit) {
		this.biscuit = biscuit;
	}

	public int getBiscuitPrice() {
		return biscuitPrice;
	}

	public void setBiscuitPrice(int biscuitPrice) {
		this.biscuitPrice = biscuitPrice;
	}

	public int getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(int dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public int getDailyLoss() {
		return dailyLoss;
	}

	public void setDailyLoss(int dailyLoss) {
		this.dailyLoss = dailyLoss;
	}

	public int getDailyExpenditure() {
		return dailyExpenditure;
	}

	public void setDailyExpenditure(int dailyExpenditure) {
		this.dailyExpenditure = dailyExpenditure;
	}

	public String getVegetable() {
		return vegetable;
	}

	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}

	public int getVegetablePrice() {
		return vegetablePrice;
	}

	public void setVegetablePrice(int vegetablePrice) {
		this.vegetablePrice = vegetablePrice;
	}

	public char getFirstLetterOfTheShopName() {
		return firstLetterOfTheShopName;
	}

	public void setFirstLetterOfTheShopName(char firstLetterOfTheShopName) {
		this.firstLetterOfTheShopName = firstLetterOfTheShopName;
	}

	public int getPriceVegetable() {
		return priceVegetable;
	}

	public void setPriceVegetable(int priceVegetable) {
		this.priceVegetable = priceVegetable;
	}

	public boolean isShopIsGood() {
		return isShopIsGood;
	}

	public void setShopIsGood(boolean isShopIsGood) {
		this.isShopIsGood = isShopIsGood;
	}

	public String getEnergyDrink() {
		return energyDrink;
	}

	public void setEnergyDrink(String energyDrink) {
		this.energyDrink = energyDrink;
	}

	public String getProteinPowder() {
		return proteinPowder;
	}

	public void setProteinPowder(String proteinPowder) {
		this.proteinPowder = proteinPowder;
	}

	public int getEnergyDrinkPrice() {
		return energyDrinkPrice;
	}

	public void setEnergyDrinkPrice(int energyDrinkPrice) {
		this.energyDrinkPrice = energyDrinkPrice;
	}

	public int getProteinPowderPrice() {
		return proteinPowderPrice;
	}

	public void setProteinPowderPrice(int proteinPowderPrice) {
		this.proteinPowderPrice = proteinPowderPrice;
	}

	public int getNoOfUnUseItems() {
		return noOfUnUseItems;
	}

	public void setNoOfUnUseItems(int noOfUnUseItems) {
		this.noOfUnUseItems = noOfUnUseItems;
	}

	public int getUsableItem() {
		return usableItem;
	}

	public void setUsableItem(int usableItem) {
		this.usableItem = usableItem;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public int getFruitsPrice() {
		return fruitsPrice;
	}

	public void setFruitsPrice(int fruitsPrice) {
		this.fruitsPrice = fruitsPrice;
	}

	public int getMostExpensiveItem() {
		return mostExpensiveItem;
	}

	public void setMostExpensiveItem(int mostExpensiveItem) {
		this.mostExpensiveItem = mostExpensiveItem;
	}

	public int getCheapItem() {
		return cheapItem;
	}

	public void setCheapItem(int cheapItem) {
		this.cheapItem = cheapItem;
	}

	public int getHorlicsPrice() {
		return horlicsPrice;
	}

	public void setHorlicsPrice(int horlicsPrice) {
		this.horlicsPrice = horlicsPrice;
	}

	public int getBoostPrice() {
		return boostPrice;
	}

	public void setBoostPrice(int boostPrice) {
		this.boostPrice = boostPrice;
	}

	public int getBreadPrice() {
		return breadPrice;
	}

	public void setBreadPrice(int breadPrice) {
		this.breadPrice = breadPrice;
	}

	public int getCheesePrice() {
		return cheesePrice;
	}

	public void setCheesePrice(int cheesePrice) {
		this.cheesePrice = cheesePrice;
	}

	public int getPaneerPrice() {
		return paneerPrice;
	}

	public void setPaneerPrice(int paneerPrice) {
		this.paneerPrice = paneerPrice;
	}

	public int getCheeseSlicePrice() {
		return cheeseSlicePrice;
	}

	public void setCheeseSlicePrice(int cheeseSlicePrice) {
		this.cheeseSlicePrice = cheeseSlicePrice;
	}

	public String getShampooo() {
		return shampooo;
	}

	public void setShampooo(String shampooo) {
		this.shampooo = shampooo;
	}

	public int getShampoooPrice() {
		return shampoooPrice;
	}

	public void setShampoooPrice(int shampoooPrice) {
		this.shampoooPrice = shampoooPrice;
	}

	public String getSoap() {
		return soap;
	}

	public void setSoap(String soap) {
		this.soap = soap;
	}

	public int getSoapPrice() {
		return soapPrice;
	}

	public void setSoapPrice(int soapPrice) {
		this.soapPrice = soapPrice;
	}

	public String getPaste() {
		return paste;
	}

	public void setPaste(String paste) {
		this.paste = paste;
	}

	public int getPastePrice() {
		return pastePrice;
	}

	public void setPastePrice(int pastePrice) {
		this.pastePrice = pastePrice;
	}

	public int getNoOfBiscuit() {
		return noOfBiscuit;
	}

	public void setNoOfBiscuit(int noOfBiscuit) {
		this.noOfBiscuit = noOfBiscuit;
	}

	public int getNoOfShampooProduct() {
		return noOfShampooProduct;
	}

	public void setNoOfShampooProduct(int noOfShampooProduct) {
		this.noOfShampooProduct = noOfShampooProduct;
	}

	public int getLowestPriceBiscuit() {
		return lowestPriceBiscuit;
	}

	public void setLowestPriceBiscuit(int lowestPriceBiscuit) {
		this.lowestPriceBiscuit = lowestPriceBiscuit;
	}

	public int getHighestPriceBiscuit() {
		return highestPriceBiscuit;
	}

	public void setHighestPriceBiscuit(int highestPriceBiscuit) {
		this.highestPriceBiscuit = highestPriceBiscuit;
	}

	public int getToastPrice() {
		return toastPrice;
	}

	public void setToastPrice(int toastPrice) {
		this.toastPrice = toastPrice;
	}

	public String getToast() {
		return toast;
	}

	public void setToast(String toast) {
		this.toast = toast;
	}

	public String getJam() {
		return jam;
	}

	public void setJam(String jam) {
		this.jam = jam;
	}

	public int getJamPrice() {
		return jamPrice;
	}

	public void setJamPrice(int jamPrice) {
		this.jamPrice = jamPrice;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public int getSaucePrice() {
		return saucePrice;
	}

	public void setSaucePrice(int saucePrice) {
		this.saucePrice = saucePrice;
	}

	public int getOnionPrice() {
		return onionPrice;
	}

	public void setOnionPrice(int onionPrice) {
		this.onionPrice = onionPrice;
	}

	public int getTomatoPrice() {
		return tomatoPrice;
	}

	public void setTomatoPrice(int tomatoPrice) {
		this.tomatoPrice = tomatoPrice;
	}

	public int getChilliPrice() {
		return chilliPrice;
	}

	public void setChilliPrice(int chilliPrice) {
		this.chilliPrice = chilliPrice;
	}

	public int getApplePrice() {
		return applePrice;
	}

	public void setApplePrice(int applePrice) {
		this.applePrice = applePrice;
	}

	public int getGauvaPrice() {
		return gauvaPrice;
	}

	public void setGauvaPrice(int gauvaPrice) {
		this.gauvaPrice = gauvaPrice;
	}

	public int getPineApplePrice() {
		return pineApplePrice;
	}

	public void setPineApplePrice(int pineApplePrice) {
		this.pineApplePrice = pineApplePrice;
	}

	public int getMangoPrice() {
		return mangoPrice;
	}

	public void setMangoPrice(int mangoPrice) {
		this.mangoPrice = mangoPrice;
	}

	public int getBananaPrice() {
		return bananaPrice;
	}

	public void setBananaPrice(int bananaPrice) {
		this.bananaPrice = bananaPrice;
	}

	public int getPotatoPrice() {
		return potatoPrice;
	}

	public void setPotatoPrice(int potatoPrice) {
		this.potatoPrice = potatoPrice;
	}

	public int getCucumberPrice() {
		return cucumberPrice;
	}

	public void setCucumberPrice(int cucumberPrice) {
		this.cucumberPrice = cucumberPrice;
	}

	public int getCarrotPrice() {
		return carrotPrice;
	}

	public void setCarrotPrice(int carrotPrice) {
		this.carrotPrice = carrotPrice;
	}

	public int getLadyFingerPrice() {
		return ladyFingerPrice;
	}

	public void setLadyFingerPrice(int ladyFingerPrice) {
		this.ladyFingerPrice = ladyFingerPrice;
	}

	public int getBeansPrice() {
		return beansPrice;
	}

	public void setBeansPrice(int beansPrice) {
		this.beansPrice = beansPrice;
	}
	
}
