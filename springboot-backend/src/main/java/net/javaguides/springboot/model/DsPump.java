package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dsPumps")
public class DsPump {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "shiftDate")
	private String shiftDate;

	@Column(name = "shift")
	private String shift;

	@Column(name = "time")
	private String time;

	@Column(name = "operator")
	private String operator;

	@Column(name = "roSuction")
	private String roSuction;

	@Column(name = "headerPress")
	private String headerPress;

	@Column(name = "p07aFlow")
	private String p07aFlow;

	@Column(name = "p07bFlow")
	private String p07bFlow;

	@Column(name = "p07cFlow")
	private String p07cFlow;

	@Column(name = "p07dFlow")
	private String p07dFlow;

	@Column(name = "p07eFlow")
	private String p07eFlow;

	@Column(name = "p07aPress")
	private String p07aPress;

	@Column(name = "p07bPress")
	private String p07bPress;

	@Column(name = "p07cPress")
	private String p07cPress;

	@Column(name = "p07dPress")
	private String p07dPress;

	@Column(name = "p07ePress")
	private String p07ePress;

	@Column(name = "acidPumpDischargePress")
	private String acidPumpDischargePress;

	@Column(name = "hypoPumpDischargePress")
	private String hypoPumpDischargePress;

	@Column(name = "wwBoosterSuctionPress")
	private String wwBoosterSuctionPress;

	@Column(name = "wwBoosterDischPress")
	private String wwBoosterDischPress;

	@Column(name = "p03aPress")
	private String p03aPress;

	@Column(name = "p03bPress")
	private String p03bPress;

	@Column(name = "p03cPress")
	private String p03cPress;

	@Column(name = "dsHeaderPress")
	private String dsHeaderPress;

	@Column(name = "dsDischPress")
	private String dsDischPress;

	@Column(name = "p09aPress")
	private String p09aPress;

	@Column(name = "p09bPress")
	private String p09bPress;

	@Column(name = "p09cPress")
	private String p09cPress;

	@Column(name = "t14aLevel")
	private String t14aLevel;

	@Column(name = "t14bLevel")
	private String t14bLevel;

	@Column(name = "f15aPress")
	private String f15aPress;

	@Column(name = "f15bPress")
	private String f15bPress;

	@Column(name = "f15cPress")
	private String f15cPress;

	@Column(name = "f15dPress")
	private String f15dPress;

	@Column(name = "cartridgeFilter")
	private String cartridgeFilter;

	@Column(name = "cfDiffPress")
	private String cfDiffPress;

	@Column(name = "t04Level")
	private String t04Level;

	@Column(name = "hypoDayTankLevel")
	private String hypoDayTankLevel;

	@Column(name = "roDischResidual")
	private String roDischResidual;

	@Column(name = "filterDischResidual")
	private String filterDischResidual;

	@Column(name = "dsResidual")
	private String dsResidual;

	@Column(name = "f02aDp")
	private String f02aDp;

	@Column(name = "f02bDp")
	private String f02bDp;

	@Column(name = "f02cDp")
	private String f02cDp;

	@Column(name = "t02aLevel")
	private String t02aLevel;

	@Column(name = "t02bLevel")
	private String t02bLevel;

	@Column(name = "as9838")
	private String as9838;

	@Column(name = "causticLevel")
	private String causticLevel;

	@Column(name = "comments")
	private String comments;

	@Column(name = "f02a")
	private String f02a;

	@Column(name = "f02b")
	private String f02b;

	@Column(name = "f02c")
	private String f02c;

	
	public DsPump() {
		
	}
	
	public DsPump(long id, String shiftDate, String shift, String time, String operator,
			String roSuction, String headerPress, String p07aFlow, String p07bFlow, String p07cFlow, String p07dFlow,
			String p07eFlow, String p07aPress, String p07bPress, String p07cPress, String p07dPress, String p07ePress,
			String acidPumpDischargePress, String hypoPumpDischargePress, String wwBoosterSuctionPress,
			String wwBoosterDischPress, String p03aPress, String p03bPress, String p03cPress, String dsHeaderPress,
			String dsDischPress, String p09aPress, String p09bPress, String p09cPress, String t14aLevel,
			String t14bLevel, String f15aPress, String f15bPress, String f15cPress, String f15dPress,
			String cartridgeFilter, String cfDiffPress, String t04Level, String hypoDayTankLevel,
			String roDischResidual, String filterDischResidual, String dsResidual, String f02aDp, String f02bDp,
			String f02cDp, String t02aLevel, String t02bLevel, String as9838, String causticLevel, String comments,
			String f02a, String f02b, String f02c) {
		super();
		this.id = id;
		this.shiftDate = shiftDate;
		this.shift = shift;
		this.time = time;
		this.operator = operator;
		this.roSuction = roSuction;
		this.headerPress = headerPress;
		this.p07aFlow = p07aFlow;
		this.p07bFlow = p07bFlow;
		this.p07cFlow = p07cFlow;
		this.p07dFlow = p07dFlow;
		this.p07eFlow = p07eFlow;
		this.p07aPress = p07aPress;
		this.p07bPress = p07bPress;
		this.p07cPress = p07cPress;
		this.p07dPress = p07dPress;
		this.p07ePress = p07ePress;
		this.acidPumpDischargePress = acidPumpDischargePress;
		this.hypoPumpDischargePress = hypoPumpDischargePress;
		this.wwBoosterSuctionPress = wwBoosterSuctionPress;
		this.wwBoosterDischPress = wwBoosterDischPress;
		this.p03aPress = p03aPress;
		this.p03bPress = p03bPress;
		this.p03cPress = p03cPress;
		this.dsHeaderPress = dsHeaderPress;
		this.dsDischPress = dsDischPress;
		this.p09aPress = p09aPress;
		this.p09bPress = p09bPress;
		this.p09cPress = p09cPress;
		this.t14aLevel = t14aLevel;
		this.t14bLevel = t14bLevel;
		this.f15aPress = f15aPress;
		this.f15bPress = f15bPress;
		this.f15cPress = f15cPress;
		this.f15dPress = f15dPress;
		this.cartridgeFilter = cartridgeFilter;
		this.cfDiffPress = cfDiffPress;
		this.t04Level = t04Level;
		this.hypoDayTankLevel = hypoDayTankLevel;
		this.roDischResidual = roDischResidual;
		this.filterDischResidual = filterDischResidual;
		this.dsResidual = dsResidual;
		this.f02aDp = f02aDp;
		this.f02bDp = f02bDp;
		this.f02cDp = f02cDp;
		this.t02aLevel = t02aLevel;
		this.t02bLevel = t02bLevel;
		this.as9838 = as9838;
		this.causticLevel = causticLevel;
		this.comments = comments;
		this.f02a = f02a;
		this.f02b = f02b;
		this.f02c = f02c;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShiftDate() {
		return shiftDate;
	}

	public void setShiftDate(String shiftDate) {
		this.shiftDate = shiftDate;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRoSuction() {
		return roSuction;
	}

	public void setRoSuction(String roSuction) {
		this.roSuction = roSuction;
	}

	public String getHeaderPress() {
		return headerPress;
	}

	public void setHeaderPress(String headerPress) {
		this.headerPress = headerPress;
	}

	public String getP07aFlow() {
		return p07aFlow;
	}

	public void setP07aFlow(String p07aFlow) {
		this.p07aFlow = p07aFlow;
	}

	public String getP07bFlow() {
		return p07bFlow;
	}

	public void setP07bFlow(String p07bFlow) {
		this.p07bFlow = p07bFlow;
	}

	public String getP07cFlow() {
		return p07cFlow;
	}

	public void setP07cFlow(String p07cFlow) {
		this.p07cFlow = p07cFlow;
	}

	public String getP07dFlow() {
		return p07dFlow;
	}

	public void setP07dFlow(String p07dFlow) {
		this.p07dFlow = p07dFlow;
	}

	public String getP07eFlow() {
		return p07eFlow;
	}

	public void setP07eFlow(String p07eFlow) {
		this.p07eFlow = p07eFlow;
	}

	public String getP07aPress() {
		return p07aPress;
	}

	public void setP07aPress(String p07aPress) {
		this.p07aPress = p07aPress;
	}

	public String getP07bPress() {
		return p07bPress;
	}

	public void setP07bPress(String p07bPress) {
		this.p07bPress = p07bPress;
	}

	public String getP07cPress() {
		return p07cPress;
	}

	public void setP07cPress(String p07cPress) {
		this.p07cPress = p07cPress;
	}

	public String getP07dPress() {
		return p07dPress;
	}

	public void setP07dPress(String p07dPress) {
		this.p07dPress = p07dPress;
	}

	public String getP07ePress() {
		return p07ePress;
	}

	public void setP07ePress(String p07ePress) {
		this.p07ePress = p07ePress;
	}

	public String getAcidPumpDischargePress() {
		return acidPumpDischargePress;
	}

	public void setAcidPumpDischargePress(String acidPumpDischargePress) {
		this.acidPumpDischargePress = acidPumpDischargePress;
	}

	public String getHypoPumpDischargePress() {
		return hypoPumpDischargePress;
	}

	public void setHypoPumpDischargePress(String hypoPumpDischargePress) {
		this.hypoPumpDischargePress = hypoPumpDischargePress;
	}

	public String getWwBoosterSuctionPress() {
		return wwBoosterSuctionPress;
	}

	public void setWwBoosterSuctionPress(String wwBoosterSuctionPress) {
		this.wwBoosterSuctionPress = wwBoosterSuctionPress;
	}

	public String getWwBoosterDischPress() {
		return wwBoosterDischPress;
	}

	public void setWwBoosterDischPress(String wwBoosterDischPress) {
		this.wwBoosterDischPress = wwBoosterDischPress;
	}

	public String getP03aPress() {
		return p03aPress;
	}

	public void setP03aPress(String p03aPress) {
		this.p03aPress = p03aPress;
	}

	public String getP03bPress() {
		return p03bPress;
	}

	public void setP03bPress(String p03bPress) {
		this.p03bPress = p03bPress;
	}

	public String getP03cPress() {
		return p03cPress;
	}

	public void setP03cPress(String p03cPress) {
		this.p03cPress = p03cPress;
	}

	public String getDsHeaderPress() {
		return dsHeaderPress;
	}

	public void setDsHeaderPress(String dsHeaderPress) {
		this.dsHeaderPress = dsHeaderPress;
	}

	public String getDsDischPress() {
		return dsDischPress;
	}

	public void setDsDischPress(String dsDischPress) {
		this.dsDischPress = dsDischPress;
	}

	public String getP09aPress() {
		return p09aPress;
	}

	public void setP09aPress(String p09aPress) {
		this.p09aPress = p09aPress;
	}

	public String getP09bPress() {
		return p09bPress;
	}

	public void setP09bPress(String p09bPress) {
		this.p09bPress = p09bPress;
	}

	public String getP09cPress() {
		return p09cPress;
	}

	public void setP09cPress(String p09cPress) {
		this.p09cPress = p09cPress;
	}

	public String getT14aLevel() {
		return t14aLevel;
	}

	public void setT14aLevel(String t14aLevel) {
		this.t14aLevel = t14aLevel;
	}

	public String getT14bLevel() {
		return t14bLevel;
	}

	public void setT14bLevel(String t14bLevel) {
		this.t14bLevel = t14bLevel;
	}

	public String getF15aPress() {
		return f15aPress;
	}

	public void setF15aPress(String f15aPress) {
		this.f15aPress = f15aPress;
	}

	public String getF15bPress() {
		return f15bPress;
	}

	public void setF15bPress(String f15bPress) {
		this.f15bPress = f15bPress;
	}

	public String getF15cPress() {
		return f15cPress;
	}

	public void setF15cPress(String f15cPress) {
		this.f15cPress = f15cPress;
	}

	public String getF15dPress() {
		return f15dPress;
	}

	public void setF15dPress(String f15dPress) {
		this.f15dPress = f15dPress;
	}

	public String getCartridgeFilter() {
		return cartridgeFilter;
	}

	public void setCartridgeFilter(String cartridgeFilter) {
		this.cartridgeFilter = cartridgeFilter;
	}

	public String getCfDiffPress() {
		return cfDiffPress;
	}

	public void setCfDiffPress(String cfDiffPress) {
		this.cfDiffPress = cfDiffPress;
	}

	public String getT04Level() {
		return t04Level;
	}

	public void setT04Level(String t04Level) {
		this.t04Level = t04Level;
	}

	public String getHypoDayTankLevel() {
		return hypoDayTankLevel;
	}

	public void setHypoDayTankLevel(String hypoDayTankLevel) {
		this.hypoDayTankLevel = hypoDayTankLevel;
	}

	public String getRoDischResidual() {
		return roDischResidual;
	}

	public void setRoDischResidual(String roDischResidual) {
		this.roDischResidual = roDischResidual;
	}

	public String getFilterDischResidual() {
		return filterDischResidual;
	}

	public void setFilterDischResidual(String filterDischResidual) {
		this.filterDischResidual = filterDischResidual;
	}

	public String getDsResidual() {
		return dsResidual;
	}

	public void setDsResidual(String dsResidual) {
		this.dsResidual = dsResidual;
	}

	public String getF02aDp() {
		return f02aDp;
	}

	public void setF02aDp(String f02aDp) {
		this.f02aDp = f02aDp;
	}

	public String getF02bDp() {
		return f02bDp;
	}

	public void setF02bDp(String f02bDp) {
		this.f02bDp = f02bDp;
	}

	public String getF02cDp() {
		return f02cDp;
	}

	public void setF02cDp(String f02cDp) {
		this.f02cDp = f02cDp;
	}

	public String getT02aLevel() {
		return t02aLevel;
	}

	public void setT02aLevel(String t02aLevel) {
		this.t02aLevel = t02aLevel;
	}

	public String getT02bLevel() {
		return t02bLevel;
	}

	public void setT02bLevel(String t02bLevel) {
		this.t02bLevel = t02bLevel;
	}

	public String getAs9838() {
		return as9838;
	}

	public void setAs9838(String as9838) {
		this.as9838 = as9838;
	}

	public String getCausticLevel() {
		return causticLevel;
	}

	public void setCausticLevel(String causticLevel) {
		this.causticLevel = causticLevel;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getF02a() {
		return f02a;
	}

	public void setF02a(String f02a) {
		this.f02a = f02a;
	}

	public String getF02b() {
		return f02b;
	}

	public void setF02b(String f02b) {
		this.f02b = f02b;
	}

	public String getF02c() {
		return f02c;
	}

	public void setF02c(String f02c) {
		this.f02c = f02c;
	}
	
}
