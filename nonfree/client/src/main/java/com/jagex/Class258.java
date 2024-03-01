package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public class Class258 {

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	static final int anInt3855 = 8192;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	static final int anInt3856 = 16384;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	static final int anInt3857 = 0;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	static final int anInt3858 = 8192;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	static final int anInt3859 = 4096;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	static final int anInt3860 = 16384;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	static final int anInt3863 = 4096;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!eb;")
	Class240 aClass240_71;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Z")
	boolean aBoolean665;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Z")
	boolean aBoolean666;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	int anInt3861;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!eb;")
	Class240 aClass240_72;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!eb;")
	Class240 aClass240_73;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
	int anInt3862;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!rw;")
	Class539 aClass539_5;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	int anInt3864;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Lclient!ox;")
	Class472 aClass472_60;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	int anInt3865;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Ljava/util/List;")
	List aList5 = new ArrayList();

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Ljava/util/List;")
	List aList6 = new ArrayList();

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap7 = new HashMap();

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap8 = new HashMap();

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Ljava/util/List;")
	List aList7 = new ArrayList();

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap6 = new HashMap();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!rw;")
	Class539 aClass539_6 = null;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
	boolean aBoolean667 = false;

	@OriginalMember(owner = "client!fb", name = "ae", descriptor = "Lclient!ro;")
	Interface58 anInterface58_2 = new Class269(this);

	@OriginalMember(owner = "client!fb", name = "ag", descriptor = "Lclient!ro;")
	Interface58 anInterface58_1 = new Class260(this);

	@OriginalMember(owner = "client!fb", name = "ah", descriptor = "Lclient!ro;")
	Interface58 anInterface58_3 = new Class277(this);

	@OriginalMember(owner = "client!fb", name = "al", descriptor = "Lclient!ro;")
	Interface58 anInterface58_4 = new Class264(this);

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(II)Lclient!ii;", line = 20)
	public static Class338 method26142(@OriginalArg(0) int arg0) {
		if (arg0 == Class338.aClass338_6.anInt4184 * -210852351) {
			return Class338.aClass338_6;
		} else if (Class338.aClass338_4.anInt4184 * -210852351 == arg0) {
			return Class338.aClass338_4;
		} else if (arg0 == Class338.aClass338_5.anInt4184 * -210852351) {
			return Class338.aClass338_5;
		} else if (Class338.aClass338_7.anInt4184 * -210852351 == arg0) {
			return Class338.aClass338_7;
		} else if (Class338.aClass338_9.anInt4184 * -210852351 == arg0) {
			return Class338.aClass338_9;
		} else if (arg0 == Class338.aClass338_8.anInt4184 * -210852351) {
			return Class338.aClass338_8;
		} else if (arg0 == Class338.aClass338_3.anInt4184 * -210852351) {
			return Class338.aClass338_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "(IIII)I", line = 43)
	public static int method26139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class8.method136(arg2 - arg1 + 1);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 | local11;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(Lclient!yf;B)V", line = 71)
	static void method26140(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class662.method32848();
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)Ljava/util/List;", line = 241)
	List method26033() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fb", name = "ap", descriptor = "()Ljava/util/List;", line = 241)
	List method26065() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fb", name = "aq", descriptor = "()Ljava/util/List;", line = 241)
	List method26066() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fb", name = "ax", descriptor = "()Ljava/util/List;", line = 245)
	List method26067() {
		return this.aList7;
	}

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "(I)Ljava/util/List;", line = 245)
	List method26116() {
		return this.aList7;
	}

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "(I)Lclient!eb;", line = 249)
	Class240 method26028() {
		return this.aClass240_71;
	}

	@OriginalMember(owner = "client!fb", name = "av", descriptor = "()Lclient!eb;", line = 249)
	Class240 method26058() {
		return this.aClass240_71;
	}

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "(I)Lclient!eb;", line = 253)
	Class240 method26029() {
		return this.aClass240_72;
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)Lclient!ox;", line = 257)
	Class472 method26030() {
		return this.aClass472_60;
	}

	@OriginalMember(owner = "client!fb", name = "ao", descriptor = "()Lclient!ox;", line = 257)
	Class472 method26044() {
		return this.aClass472_60;
	}

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "(III)V", line = 263)
	public void method26031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean666) {
			return;
		}
		this.anInt3862 = arg0 * -450558187;
		this.aClass240_71 = new Class240(arg1, 100);
		this.aClass240_72 = new Class240(10);
		this.aClass240_71.method25852(new Class274(this));
		@Pc(34) Class657 local34 = new Class657(Class429.aClass429_1);
		Class550.method31034(local34);
		this.method26080();
		this.anInt3865 = -1053037625;
		this.aBoolean666 = true;
	}

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "(S)V", line = 291)
	public void method26032() {
		if (!this.aBoolean666) {
			return;
		}
		Class220.method25543();
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229() != null) {
			if (this.aClass472_60 == null) {
				this.aClass472_60 = new Class472();
			}
			this.aClass472_60.aFloat317 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61.aFloat317;
			this.aClass472_60.aFloat318 = 0.0F;
			this.aClass472_60.aFloat319 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61.aFloat319;
		}
		@Pc(42) Iterator local42 = this.aHashMap7.values().iterator();
		@Pc(49) Interface70 local49;
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526();
		}
		local42 = this.aHashMap8.values().iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526();
		}
		local42 = this.aList7.iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			if (local49.method32527()) {
				this.aHashMap8.remove(local49.method32558());
			} else {
				this.aHashMap7.remove(local49.method32558());
			}
		}
		this.aList7.clear();
		if (this.aClass539_6 != null && this.aClass539_6.method30796() == Class536.aClass536_4 && !this.aBoolean667 && client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(134) Class93_Sub22 local134 = Class102.method2592(Class446.aClass446_32, client.aClass175_2.aClass24_2);
			local134.aClass93_Sub41_Sub2_1.method22395(this.aClass539_6.method30797().method32558());
			client.aClass175_2.method24351(local134);
			this.aBoolean667 = true;
		}
		local42 = this.aList5.iterator();
		while (true) {
			label162: while (true) {
				@Pc(172) Class536 local172;
				@Pc(162) Class539 local162;
				do {
					if (!local42.hasNext()) {
						return;
					}
					local162 = (Class539) local42.next();
					local162.method30813();
					local162.method30795();
					local172 = local162.method30796();
				} while (local162.method30798() != this);
				if (Class536.aClass536_2 == local172 || local172 == Class536.aClass536_8) {
					if (local162.method30869() != Class275.aClass275_5 && local162.method30869() != Class275.aClass275_7) {
						@Pc(382) Iterator local382 = this.aHashMap6.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class272 local397 = (Class272) this.aHashMap6.get(local390);
							if (local397.method26318().contains(local162)) {
								local397.method26312(local162);
								break;
							}
						}
						local162.method30788();
						this.aList6.remove(local162);
					} else if (this.aClass539_6 == local162) {
						this.aBoolean667 = false;
						this.aClass539_6 = null;
						local162.method30788();
						this.aList6.remove(local162);
					} else {
						@Pc(218) int local218 = local162.method30797().method32558();
						@Pc(231) boolean local231 = this.method26072(Class280.aClass280_2.method26450()) > 0.0F;
						if (!this.aBoolean665 && local231) {
							if (this.anInt3865 * -2005296631 == local218) {
								this.method26027(local218);
								this.anInt3865 = -1053037625;
							}
							local162.method30788();
							this.aList6.remove(local162);
						} else if (local218 == this.anInt3861 * -1023303443) {
							this.anInt3861 = 802046747;
							this.aBoolean665 = false;
							local162.method30788();
							this.aList6.remove(local162);
							@Pc(282) Iterator local282 = this.aList5.iterator();
							@Pc(289) Class539 local289;
							@Pc(300) int local300;
							do {
								do {
									if (!local282.hasNext()) {
										continue label162;
									}
									local289 = (Class539) local282.next();
								} while (local289.method30869() != Class275.aClass275_5);
								local300 = local289.method30797().method32558();
							} while ((this.anInt3865 * -2005296631 != local300 || local289.method30796() != Class536.aClass536_2) && local289.method30796() != Class536.aClass536_1 && local289.method30796() != Class536.aClass536_3 && local289.method30796() != Class536.aClass536_4);
							if (local289.method30796() == Class536.aClass536_2) {
								local289.method30793();
							} else {
								local289.method30852();
							}
						} else if (local231) {
							if (!this.aBoolean665 || local218 != this.anInt3865 * -2005296631) {
								local162.method30788();
								this.aList6.remove(local162);
							}
							if (!this.aBoolean665 && this.anInt3865 * -2005296631 == local218) {
								this.anInt3865 = -1053037625;
								this.aClass539_5 = null;
							}
						}
					}
				} else if (local162.method30796() != Class536.aClass536_6 && local162.method30830() == Class280.aClass280_2.method26450()) {
					@Pc(443) boolean local443 = this.method26072(Class280.aClass280_2.method26450()) > 1.0E-4F;
					if (!local443) {
						local162.method30791(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "aj", descriptor = "()V", line = 291)
	public void method26070() {
		if (!this.aBoolean666) {
			return;
		}
		Class220.method25543();
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229() != null) {
			if (this.aClass472_60 == null) {
				this.aClass472_60 = new Class472();
			}
			this.aClass472_60.aFloat317 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61.aFloat317;
			this.aClass472_60.aFloat318 = 0.0F;
			this.aClass472_60.aFloat319 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61.aFloat319;
		}
		@Pc(42) Iterator local42 = this.aHashMap7.values().iterator();
		@Pc(49) Interface70 local49;
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526();
		}
		local42 = this.aHashMap8.values().iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526();
		}
		local42 = this.aList7.iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			if (local49.method32527()) {
				this.aHashMap8.remove(local49.method32558());
			} else {
				this.aHashMap7.remove(local49.method32558());
			}
		}
		this.aList7.clear();
		if (this.aClass539_6 != null && this.aClass539_6.method30796() == Class536.aClass536_4 && !this.aBoolean667 && client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(134) Class93_Sub22 local134 = Class102.method2592(Class446.aClass446_32, client.aClass175_2.aClass24_2);
			local134.aClass93_Sub41_Sub2_1.method22395(this.aClass539_6.method30797().method32558());
			client.aClass175_2.method24351(local134);
			this.aBoolean667 = true;
		}
		local42 = this.aList5.iterator();
		while (true) {
			label162: while (true) {
				@Pc(172) Class536 local172;
				@Pc(162) Class539 local162;
				do {
					if (!local42.hasNext()) {
						return;
					}
					local162 = (Class539) local42.next();
					local162.method30813();
					local162.method30795();
					local172 = local162.method30796();
				} while (local162.method30798() != this);
				if (Class536.aClass536_2 == local172 || local172 == Class536.aClass536_8) {
					if (local162.method30869() != Class275.aClass275_5 && local162.method30869() != Class275.aClass275_7) {
						@Pc(382) Iterator local382 = this.aHashMap6.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class272 local397 = (Class272) this.aHashMap6.get(local390);
							if (local397.method26318().contains(local162)) {
								local397.method26312(local162);
								break;
							}
						}
						local162.method30788();
						this.aList6.remove(local162);
					} else if (this.aClass539_6 == local162) {
						this.aBoolean667 = false;
						this.aClass539_6 = null;
						local162.method30788();
						this.aList6.remove(local162);
					} else {
						@Pc(218) int local218 = local162.method30797().method32558();
						@Pc(231) boolean local231 = this.method26072(Class280.aClass280_2.method26450()) > 0.0F;
						if (!this.aBoolean665 && local231) {
							if (this.anInt3865 * -2005296631 == local218) {
								this.method26027(local218);
								this.anInt3865 = -1053037625;
							}
							local162.method30788();
							this.aList6.remove(local162);
						} else if (local218 == this.anInt3861 * -1023303443) {
							this.anInt3861 = 802046747;
							this.aBoolean665 = false;
							local162.method30788();
							this.aList6.remove(local162);
							@Pc(282) Iterator local282 = this.aList5.iterator();
							@Pc(289) Class539 local289;
							@Pc(300) int local300;
							do {
								do {
									if (!local282.hasNext()) {
										continue label162;
									}
									local289 = (Class539) local282.next();
								} while (local289.method30869() != Class275.aClass275_5);
								local300 = local289.method30797().method32558();
							} while ((this.anInt3865 * -2005296631 != local300 || local289.method30796() != Class536.aClass536_2) && local289.method30796() != Class536.aClass536_1 && local289.method30796() != Class536.aClass536_3 && local289.method30796() != Class536.aClass536_4);
							if (local289.method30796() == Class536.aClass536_2) {
								local289.method30793();
							} else {
								local289.method30852();
							}
						} else if (local231) {
							if (!this.aBoolean665 || local218 != this.anInt3865 * -2005296631) {
								local162.method30788();
								this.aList6.remove(local162);
							}
							if (!this.aBoolean665 && this.anInt3865 * -2005296631 == local218) {
								this.anInt3865 = -1053037625;
								this.aClass539_5 = null;
							}
						}
					}
				} else if (local162.method30796() != Class536.aClass536_6 && local162.method30830() == Class280.aClass280_2.method26450()) {
					@Pc(443) boolean local443 = this.method26072(Class280.aClass280_2.method26450()) > 1.0E-4F;
					if (!local443) {
						local162.method30791(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "ay", descriptor = "()V", line = 291)
	public void method26071() {
		if (!this.aBoolean666) {
			return;
		}
		Class220.method25543();
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229() != null) {
			if (this.aClass472_60 == null) {
				this.aClass472_60 = new Class472();
			}
			this.aClass472_60.aFloat317 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61.aFloat317;
			this.aClass472_60.aFloat318 = 0.0F;
			this.aClass472_60.aFloat319 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61.aFloat319;
		}
		@Pc(42) Iterator local42 = this.aHashMap7.values().iterator();
		@Pc(49) Interface70 local49;
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526();
		}
		local42 = this.aHashMap8.values().iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526();
		}
		local42 = this.aList7.iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			if (local49.method32527()) {
				this.aHashMap8.remove(local49.method32558());
			} else {
				this.aHashMap7.remove(local49.method32558());
			}
		}
		this.aList7.clear();
		if (this.aClass539_6 != null && this.aClass539_6.method30796() == Class536.aClass536_4 && !this.aBoolean667 && client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(134) Class93_Sub22 local134 = Class102.method2592(Class446.aClass446_32, client.aClass175_2.aClass24_2);
			local134.aClass93_Sub41_Sub2_1.method22395(this.aClass539_6.method30797().method32558());
			client.aClass175_2.method24351(local134);
			this.aBoolean667 = true;
		}
		local42 = this.aList5.iterator();
		while (true) {
			label162: while (true) {
				@Pc(172) Class536 local172;
				@Pc(162) Class539 local162;
				do {
					if (!local42.hasNext()) {
						return;
					}
					local162 = (Class539) local42.next();
					local162.method30813();
					local162.method30795();
					local172 = local162.method30796();
				} while (local162.method30798() != this);
				if (Class536.aClass536_2 == local172 || local172 == Class536.aClass536_8) {
					if (local162.method30869() != Class275.aClass275_5 && local162.method30869() != Class275.aClass275_7) {
						@Pc(382) Iterator local382 = this.aHashMap6.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class272 local397 = (Class272) this.aHashMap6.get(local390);
							if (local397.method26318().contains(local162)) {
								local397.method26312(local162);
								break;
							}
						}
						local162.method30788();
						this.aList6.remove(local162);
					} else if (this.aClass539_6 == local162) {
						this.aBoolean667 = false;
						this.aClass539_6 = null;
						local162.method30788();
						this.aList6.remove(local162);
					} else {
						@Pc(218) int local218 = local162.method30797().method32558();
						@Pc(231) boolean local231 = this.method26072(Class280.aClass280_2.method26450()) > 0.0F;
						if (!this.aBoolean665 && local231) {
							if (this.anInt3865 * -2005296631 == local218) {
								this.method26027(local218);
								this.anInt3865 = -1053037625;
							}
							local162.method30788();
							this.aList6.remove(local162);
						} else if (local218 == this.anInt3861 * -1023303443) {
							this.anInt3861 = 802046747;
							this.aBoolean665 = false;
							local162.method30788();
							this.aList6.remove(local162);
							@Pc(282) Iterator local282 = this.aList5.iterator();
							@Pc(289) Class539 local289;
							@Pc(300) int local300;
							do {
								do {
									if (!local282.hasNext()) {
										continue label162;
									}
									local289 = (Class539) local282.next();
								} while (local289.method30869() != Class275.aClass275_5);
								local300 = local289.method30797().method32558();
							} while ((this.anInt3865 * -2005296631 != local300 || local289.method30796() != Class536.aClass536_2) && local289.method30796() != Class536.aClass536_1 && local289.method30796() != Class536.aClass536_3 && local289.method30796() != Class536.aClass536_4);
							if (local289.method30796() == Class536.aClass536_2) {
								local289.method30793();
							} else {
								local289.method30852();
							}
						} else if (local231) {
							if (!this.aBoolean665 || local218 != this.anInt3865 * -2005296631) {
								local162.method30788();
								this.aList6.remove(local162);
							}
							if (!this.aBoolean665 && this.anInt3865 * -2005296631 == local218) {
								this.anInt3865 = -1053037625;
								this.aClass539_5 = null;
							}
						}
					}
				} else if (local162.method30796() != Class536.aClass536_6 && local162.method30830() == Class280.aClass280_2.method26450()) {
					@Pc(443) boolean local443 = this.method26072(Class280.aClass280_2.method26450()) > 1.0E-4F;
					if (!local443) {
						local162.method30791(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "ab", descriptor = "()V", line = 291)
	public void method26105() {
		if (!this.aBoolean666) {
			return;
		}
		Class220.method25543();
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229() != null) {
			if (this.aClass472_60 == null) {
				this.aClass472_60 = new Class472();
			}
			this.aClass472_60.aFloat317 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61.aFloat317;
			this.aClass472_60.aFloat318 = 0.0F;
			this.aClass472_60.aFloat319 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61.aFloat319;
		}
		@Pc(42) Iterator local42 = this.aHashMap7.values().iterator();
		@Pc(49) Interface70 local49;
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526();
		}
		local42 = this.aHashMap8.values().iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526();
		}
		local42 = this.aList7.iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			if (local49.method32527()) {
				this.aHashMap8.remove(local49.method32558());
			} else {
				this.aHashMap7.remove(local49.method32558());
			}
		}
		this.aList7.clear();
		if (this.aClass539_6 != null && this.aClass539_6.method30796() == Class536.aClass536_4 && !this.aBoolean667 && client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(134) Class93_Sub22 local134 = Class102.method2592(Class446.aClass446_32, client.aClass175_2.aClass24_2);
			local134.aClass93_Sub41_Sub2_1.method22395(this.aClass539_6.method30797().method32558());
			client.aClass175_2.method24351(local134);
			this.aBoolean667 = true;
		}
		local42 = this.aList5.iterator();
		while (true) {
			label162: while (true) {
				@Pc(172) Class536 local172;
				@Pc(162) Class539 local162;
				do {
					if (!local42.hasNext()) {
						return;
					}
					local162 = (Class539) local42.next();
					local162.method30813();
					local162.method30795();
					local172 = local162.method30796();
				} while (local162.method30798() != this);
				if (Class536.aClass536_2 == local172 || local172 == Class536.aClass536_8) {
					if (local162.method30869() != Class275.aClass275_5 && local162.method30869() != Class275.aClass275_7) {
						@Pc(382) Iterator local382 = this.aHashMap6.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class272 local397 = (Class272) this.aHashMap6.get(local390);
							if (local397.method26318().contains(local162)) {
								local397.method26312(local162);
								break;
							}
						}
						local162.method30788();
						this.aList6.remove(local162);
					} else if (this.aClass539_6 == local162) {
						this.aBoolean667 = false;
						this.aClass539_6 = null;
						local162.method30788();
						this.aList6.remove(local162);
					} else {
						@Pc(218) int local218 = local162.method30797().method32558();
						@Pc(231) boolean local231 = this.method26072(Class280.aClass280_2.method26450()) > 0.0F;
						if (!this.aBoolean665 && local231) {
							if (this.anInt3865 * -2005296631 == local218) {
								this.method26027(local218);
								this.anInt3865 = -1053037625;
							}
							local162.method30788();
							this.aList6.remove(local162);
						} else if (local218 == this.anInt3861 * -1023303443) {
							this.anInt3861 = 802046747;
							this.aBoolean665 = false;
							local162.method30788();
							this.aList6.remove(local162);
							@Pc(282) Iterator local282 = this.aList5.iterator();
							@Pc(289) Class539 local289;
							@Pc(300) int local300;
							do {
								do {
									if (!local282.hasNext()) {
										continue label162;
									}
									local289 = (Class539) local282.next();
								} while (local289.method30869() != Class275.aClass275_5);
								local300 = local289.method30797().method32558();
							} while ((this.anInt3865 * -2005296631 != local300 || local289.method30796() != Class536.aClass536_2) && local289.method30796() != Class536.aClass536_1 && local289.method30796() != Class536.aClass536_3 && local289.method30796() != Class536.aClass536_4);
							if (local289.method30796() == Class536.aClass536_2) {
								local289.method30793();
							} else {
								local289.method30852();
							}
						} else if (local231) {
							if (!this.aBoolean665 || local218 != this.anInt3865 * -2005296631) {
								local162.method30788();
								this.aList6.remove(local162);
							}
							if (!this.aBoolean665 && this.anInt3865 * -2005296631 == local218) {
								this.anInt3865 = -1053037625;
								this.aClass539_5 = null;
							}
						}
					}
				} else if (local162.method30796() != Class536.aClass536_6 && local162.method30830() == Class280.aClass280_2.method26450()) {
					@Pc(443) boolean local443 = this.method26072(Class280.aClass280_2.method26450()) > 1.0E-4F;
					if (!local443) {
						local162.method30791(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "(B)V", line = 411)
	public void method26048() {
		Class536.method30758();
	}

	@OriginalMember(owner = "client!fb", name = "az", descriptor = "()V", line = 411)
	public void method26073() {
		Class536.method30758();
	}

	@OriginalMember(owner = "client!fb", name = "aa", descriptor = "()V", line = 411)
	public void method26093() {
		Class536.method30758();
	}

	@OriginalMember(owner = "client!fb", name = "af", descriptor = "(Lclient!rw;II)V", line = 415)
	public void method26075(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) Class272 local9 = (Class272) this.aHashMap6.get(arg1);
		if (local9 == null) {
			local9 = new Class272(this);
			this.aHashMap6.put(arg1, local9);
		}
		if (!local9.method26311(arg0)) {
			arg0.method30811(arg2, true);
			local9.method26308(arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "ak", descriptor = "(Lclient!rw;II)V", line = 415)
	public void method26131(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) Class272 local9 = (Class272) this.aHashMap6.get(arg1);
		if (local9 == null) {
			local9 = new Class272(this);
			this.aHashMap6.put(arg1, local9);
		}
		if (!local9.method26311(arg0)) {
			arg0.method30811(arg2, true);
			local9.method26308(arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "(Lclient!rw;III)V", line = 415)
	public void method26134(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) Class272 local9 = (Class272) this.aHashMap6.get(arg1);
		if (local9 == null) {
			local9 = new Class272(this);
			this.aHashMap6.put(arg1, local9);
		}
		if (!local9.method26311(arg0)) {
			arg0.method30811(arg2, true);
			local9.method26308(arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "an", descriptor = "(I)V", line = 428)
	public void method26077(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26318();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			if (!local24.method30801()) {
				local24.method30852();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "bf", descriptor = "(I)V", line = 428)
	public void method26078(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26318();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			if (!local24.method30801()) {
				local24.method30852();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "bl", descriptor = "(I)V", line = 428)
	public void method26079(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26318();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			if (!local24.method30801()) {
				local24.method30852();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "(IB)V", line = 428)
	public void method26091(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26318();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			if (!local24.method30801()) {
				local24.method30852();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(II)V", line = 442)
	public void method26036(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26318();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			local24.method30791(50);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bk", descriptor = "(I)V", line = 442)
	public void method26042(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26318();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			local24.method30791(50);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bh", descriptor = "(I)V", line = 442)
	public void method26081(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26318();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			local24.method30791(50);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bx", descriptor = "(I)V", line = 456)
	public void method26041(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26318();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			local24.method30803();
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(IB)V", line = 456)
	public void method26098(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26318();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			local24.method30803();
		}
	}

	@OriginalMember(owner = "client!fb", name = "bd", descriptor = "()V", line = 470)
	void method26076() {
		@Pc(4) Class276 local4 = new Class276(this);
		@Pc(9) Class259 local9 = new Class259(this);
		@Pc(14) Class271 local14 = new Class271(this);
		@Pc(19) Class262 local19 = new Class262(this);
		@Pc(24) Class257 local24 = new Class257(this);
		Class110_Sub1.method6371(Class265.aClass265_1.method26217(), Class265.aClass265_4.method26217(), 0.2F, local4);
		Class110_Sub1.method6371(Class265.aClass265_3.method26217(), Class265.aClass265_4.method26217(), 1.0F, local9);
		Class110_Sub1.method6371(Class265.aClass265_6.method26217(), Class265.aClass265_4.method26217(), 1.0F, local14);
		Class110_Sub1.method6371(Class265.aClass265_5.method26217(), Class265.aClass265_4.method26217(), 0.8F, local19);
		Class110_Sub1.method6371(Class265.aClass265_2.method26217(), Class265.aClass265_4.method26217(), 1.0F, local24);
		Class110_Sub1.method6371(Class280.aClass280_2.method26450(), Class265.aClass265_3.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_3.method26450(), Class265.aClass265_2.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_7.method26450(), Class265.aClass265_1.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_4.method26450(), Class265.aClass265_1.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_5.method26450(), Class265.aClass265_1.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_6.method26450(), Class265.aClass265_1.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_10.method26450(), Class265.aClass265_1.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_8.method26450(), Class265.aClass265_5.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_9.method26450(), Class280.aClass280_8.method26450(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_1.method26450(), Class280.aClass280_8.method26450(), 1.0F, null);
		Class407.method28582(Class280.aClass280_2.method26450()).method28716(0.75F);
	}

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "(I)V", line = 470)
	void method26080() {
		@Pc(4) Class276 local4 = new Class276(this);
		@Pc(9) Class259 local9 = new Class259(this);
		@Pc(14) Class271 local14 = new Class271(this);
		@Pc(19) Class262 local19 = new Class262(this);
		@Pc(24) Class257 local24 = new Class257(this);
		Class110_Sub1.method6371(Class265.aClass265_1.method26217(), Class265.aClass265_4.method26217(), 0.2F, local4);
		Class110_Sub1.method6371(Class265.aClass265_3.method26217(), Class265.aClass265_4.method26217(), 1.0F, local9);
		Class110_Sub1.method6371(Class265.aClass265_6.method26217(), Class265.aClass265_4.method26217(), 1.0F, local14);
		Class110_Sub1.method6371(Class265.aClass265_5.method26217(), Class265.aClass265_4.method26217(), 0.8F, local19);
		Class110_Sub1.method6371(Class265.aClass265_2.method26217(), Class265.aClass265_4.method26217(), 1.0F, local24);
		Class110_Sub1.method6371(Class280.aClass280_2.method26450(), Class265.aClass265_3.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_3.method26450(), Class265.aClass265_2.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_7.method26450(), Class265.aClass265_1.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_4.method26450(), Class265.aClass265_1.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_5.method26450(), Class265.aClass265_1.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_6.method26450(), Class265.aClass265_1.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_10.method26450(), Class265.aClass265_1.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_8.method26450(), Class265.aClass265_5.method26217(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_9.method26450(), Class280.aClass280_8.method26450(), 1.0F, null);
		Class110_Sub1.method6371(Class280.aClass280_1.method26450(), Class280.aClass280_8.method26450(), 1.0F, null);
		Class407.method28582(Class280.aClass280_2.method26450()).method28716(0.75F);
	}

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "(IIIB)V", line = 514)
	public void method26039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class265.aClass265_4.method26217();
		if (Class407.method28582(arg0) == null && (arg1 == local3 || Class407.method28582(arg1) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class110_Sub1.method6371(arg0, local3 == arg1 ? -1 : arg1, local20, null);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bc", descriptor = "(III)V", line = 514)
	public void method26084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class265.aClass265_4.method26217();
		if (Class407.method28582(arg0) == null && (arg1 == local3 || Class407.method28582(arg1) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class110_Sub1.method6371(arg0, local3 == arg1 ? -1 : arg1, local20, null);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bi", descriptor = "(III)V", line = 514)
	public void method26109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class265.aClass265_4.method26217();
		if (Class407.method28582(arg0) == null && (arg1 == local3 || Class407.method28582(arg1) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class110_Sub1.method6371(arg0, local3 == arg1 ? -1 : arg1, local20, null);
		}
	}

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "(III)V", line = 523)
	public void method26040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class420 local3 = Class407.method28582(arg0);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28716(local11);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bt", descriptor = "(II)V", line = 523)
	public void method26055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class420 local3 = Class407.method28582(arg0);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28716(local11);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bq", descriptor = "(II)V", line = 523)
	public void method26088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class420 local3 = Class407.method28582(arg0);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28716(local11);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bn", descriptor = "(II)V", line = 523)
	public void method26127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class420 local3 = Class407.method28582(arg0);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28716(local11);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bb", descriptor = "(I)F", line = 531)
	float method26034(@OriginalArg(0) int arg0) {
		@Pc(3) Class420 local3 = Class407.method28582(arg0);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method28721();
			local3 = local3.method28723();
		}
		return local5;
	}

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "(II)F", line = 531)
	float method26072(@OriginalArg(0) int arg0) {
		@Pc(3) Class420 local3 = Class407.method28582(arg0);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method28721();
			local3 = local3.method28723();
		}
		return local5;
	}

	@OriginalMember(owner = "client!fb", name = "bm", descriptor = "(I)F", line = 531)
	float method26089(@OriginalArg(0) int arg0) {
		@Pc(3) Class420 local3 = Class407.method28582(arg0);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method28721();
			local3 = local3.method28723();
		}
		return local5;
	}

	@OriginalMember(owner = "client!fb", name = "be", descriptor = "(I)V", line = 541)
	public void method26056(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			@Pc(14) int local14 = local10.method30830();
			@Pc(19) boolean local19 = Class667.method32916(local14, arg0);
			if (local19) {
				local10.method30791(50);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "(IB)V", line = 541)
	public void method26086(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			@Pc(14) int local14 = local10.method30830();
			@Pc(19) boolean local19 = Class667.method32916(local14, arg0);
			if (local19) {
				local10.method30791(50);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "by", descriptor = "(I)V", line = 541)
	public void method26092(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			@Pc(14) int local14 = local10.method30830();
			@Pc(19) boolean local19 = Class667.method32916(local14, arg0);
			if (local19) {
				local10.method30791(50);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "([IB)V", line = 553)
	void method26043(@OriginalArg(0) int[] arg0) {
		if (!this.aBoolean666 || arg0 == null) {
			return;
		}
		@Pc(8) int[] local8 = arg0;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) int local18 = local8[local10];
			this.method26083(local18);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bu", descriptor = "([I)V", line = 553)
	void method26087(@OriginalArg(0) int[] arg0) {
		if (!this.aBoolean666 || arg0 == null) {
			return;
		}
		@Pc(8) int[] local8 = arg0;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) int local18 = local8[local10];
			this.method26083(local18);
		}
	}

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "(IB)V", line = 567)
	public void method26083(@OriginalArg(0) int arg0) {
		if (this.aBoolean666 && arg0 >= 0) {
			this.method26046(arg0, false);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bw", descriptor = "(I)V", line = 567)
	public void method26094(@OriginalArg(0) int arg0) {
		if (this.aBoolean666 && arg0 >= 0) {
			this.method26046(arg0, false);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bo", descriptor = "(I)V", line = 567)
	public void method26095(@OriginalArg(0) int arg0) {
		if (this.aBoolean666 && arg0 >= 0) {
			this.method26046(arg0, false);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bz", descriptor = "(I)V", line = 567)
	public void method26096(@OriginalArg(0) int arg0) {
		if (this.aBoolean666 && arg0 >= 0) {
			this.method26046(arg0, false);
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IZI)Lclient!wr;", line = 573)
	Interface70 method26045(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(19) Interface70 local19 = (Interface70) (arg1 ? this.aClass240_72.method25839((long) arg0) : this.aClass240_71.method25839((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface70) this.aHashMap8.get(arg0);
			} else {
				local19 = (Interface70) this.aHashMap7.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fb", name = "bv", descriptor = "(IZ)Lclient!wr;", line = 573)
	Interface70 method26059(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(19) Interface70 local19 = (Interface70) (arg1 ? this.aClass240_72.method25839((long) arg0) : this.aClass240_71.method25839((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface70) this.aHashMap8.get(arg0);
			} else {
				local19 = (Interface70) this.aHashMap7.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(IZI)Lclient!wr;", line = 583)
	Interface70 method26046(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(10) Interface70 local10 = this.method26045(arg0, arg1);
		if (local10 == null) {
			@Pc(17) Class267 local17 = new Class267(this);
			local10 = Class445.method28893(arg1 ? Class124.aClass497_93 : Class337.aClass497_103, arg0, local17, arg1, this.aClass240_73);
			if (arg1) {
				this.aHashMap8.put(arg0, local10);
			} else {
				this.aHashMap7.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!wr;I)Lclient!rw;", line = 610)
	Class539 method26047(@OriginalArg(0) Interface70 arg0) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class539 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3862 * -305393603) {
					return null;
				}
				@Pc(42) Class539 local42 = arg0.method32540();
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class539) local10.next();
			local6++;
		} while (local17.method30796() != Class536.aClass536_10);
		local17.method30787(arg0);
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "br", descriptor = "(Lclient!wr;)Lclient!rw;", line = 610)
	Class539 method26082(@OriginalArg(0) Interface70 arg0) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class539 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3862 * -305393603) {
					return null;
				}
				@Pc(42) Class539 local42 = arg0.method32540();
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class539) local10.next();
			local6++;
		} while (local17.method30796() != Class536.aClass536_10);
		local17.method30787(arg0);
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "bg", descriptor = "(Lclient!wr;)Lclient!rw;", line = 610)
	Class539 method26099(@OriginalArg(0) Interface70 arg0) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class539 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3862 * -305393603) {
					return null;
				}
				@Pc(42) Class539 local42 = arg0.method32540();
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class539) local10.next();
			local6++;
		} while (local17.method30796() != Class536.aClass536_10);
		local17.method30787(arg0);
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "bp", descriptor = "(Lclient!wr;)Lclient!rw;", line = 610)
	Class539 method26101(@OriginalArg(0) Interface70 arg0) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class539 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3862 * -305393603) {
					return null;
				}
				@Pc(42) Class539 local42 = arg0.method32540();
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class539) local10.next();
			local6++;
		} while (local17.method30796() != Class536.aClass536_10);
		local17.method30787(arg0);
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "ba", descriptor = "(Lclient!wr;)Lclient!rw;", line = 610)
	Class539 method26104(@OriginalArg(0) Interface70 arg0) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class539 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3862 * -305393603) {
					return null;
				}
				@Pc(42) Class539 local42 = arg0.method32540();
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class539) local10.next();
			local6++;
		} while (local17.method30796() != Class536.aClass536_10);
		local17.method30787(arg0);
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(Lclient!rw;I)V", line = 631)
	public void method26068(@OriginalArg(0) Class539 arg0) {
		arg0.method30859(this);
		this.aList6.add(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "bj", descriptor = "(Lclient!rw;)V", line = 631)
	public void method26102(@OriginalArg(0) Class539 arg0) {
		arg0.method30859(this);
		this.aList6.add(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "bs", descriptor = "(Lclient!rw;)V", line = 631)
	public void method26103(@OriginalArg(0) Class539 arg0) {
		arg0.method30859(this);
		this.aList6.add(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "cl", descriptor = "(Lclient!ox;Lclient!ox;F)Z", line = 636)
	boolean method26050(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class472 local3 = Class472.method29574(arg1, arg0);
		return !(local3.method29565() >= arg2);
	}

	@OriginalMember(owner = "client!fb", name = "cg", descriptor = "(Lclient!ox;Lclient!ox;F)Z", line = 636)
	boolean method26090(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class472 local3 = Class472.method29574(arg1, arg0);
		return !(local3.method29565() >= arg2);
	}

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "(Lclient!ox;Lclient!ox;FI)Z", line = 636)
	boolean method26114(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class472 local3 = Class472.method29574(arg1, arg0);
		return !(local3.method29565() >= arg2);
	}

	@OriginalMember(owner = "client!fb", name = "ce", descriptor = "(Lclient!ft;Ljava/lang/Object;IIIILclient!fx;FFLclient!ox;IIZ)Lclient!rw;", line = 642)
	public Class539 method26106(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class278 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class472 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!this.aBoolean666) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg10 = Math.max(0, arg10);
			if (arg6 != Class278.aClass278_2 && !this.method26114(this.aClass472_60, arg9, arg8)) {
				return null;
			}
			if (arg10 <= 0) {
				arg10 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg10 / 255.0F;
			@Pc(52) Interface70 local52 = this.method26046(arg2, arg11);
			@Pc(57) Class539 local57 = this.method26047(local52);
			if (local57 == null) {
				return null;
			}
			local57.method30859(arg1);
			local57.method30802(arg5);
			if (Class278.aClass278_2 != arg6) {
				local57.method30832();
				local57.method30805(arg9);
				local57.method30809(arg7);
				local57.method30875(arg8);
				if (Class278.aClass278_3 == arg6) {
					local57.method30794(this.anInterface58_1);
				} else if (Class278.aClass278_4 == arg6) {
					local57.method30794(this.anInterface58_4);
				} else if (Class278.aClass278_5 == arg6) {
					local57.method30794(this.anInterface58_2);
				} else if (arg6 == Class278.aClass278_1) {
					local57.method30794(this.anInterface58_3);
				} else {
					local57.method30832();
				}
			}
			local57.method30814(local41, 0);
			local57.method30815(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local57.method30816(local46);
			local57.method30799(arg0);
			return local57;
		}
	}

	@OriginalMember(owner = "client!fb", name = "cu", descriptor = "(Lclient!ft;Ljava/lang/Object;IIIILclient!fx;FFLclient!ox;IIZ)Lclient!rw;", line = 642)
	public Class539 method26107(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class278 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class472 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!this.aBoolean666) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg10 = Math.max(0, arg10);
			if (arg6 != Class278.aClass278_2 && !this.method26114(this.aClass472_60, arg9, arg8)) {
				return null;
			}
			if (arg10 <= 0) {
				arg10 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg10 / 255.0F;
			@Pc(52) Interface70 local52 = this.method26046(arg2, arg11);
			@Pc(57) Class539 local57 = this.method26047(local52);
			if (local57 == null) {
				return null;
			}
			local57.method30859(arg1);
			local57.method30802(arg5);
			if (Class278.aClass278_2 != arg6) {
				local57.method30832();
				local57.method30805(arg9);
				local57.method30809(arg7);
				local57.method30875(arg8);
				if (Class278.aClass278_3 == arg6) {
					local57.method30794(this.anInterface58_1);
				} else if (Class278.aClass278_4 == arg6) {
					local57.method30794(this.anInterface58_4);
				} else if (Class278.aClass278_5 == arg6) {
					local57.method30794(this.anInterface58_2);
				} else if (arg6 == Class278.aClass278_1) {
					local57.method30794(this.anInterface58_3);
				} else {
					local57.method30832();
				}
			}
			local57.method30814(local41, 0);
			local57.method30815(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local57.method30816(local46);
			local57.method30799(arg0);
			return local57;
		}
	}

	@OriginalMember(owner = "client!fb", name = "ci", descriptor = "(Lclient!ft;Ljava/lang/Object;IIIILclient!fx;FFLclient!ox;IIZ)Lclient!rw;", line = 642)
	public Class539 method26108(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class278 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class472 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!this.aBoolean666) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg10 = Math.max(0, arg10);
			if (arg6 != Class278.aClass278_2 && !this.method26114(this.aClass472_60, arg9, arg8)) {
				return null;
			}
			if (arg10 <= 0) {
				arg10 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg10 / 255.0F;
			@Pc(52) Interface70 local52 = this.method26046(arg2, arg11);
			@Pc(57) Class539 local57 = this.method26047(local52);
			if (local57 == null) {
				return null;
			}
			local57.method30859(arg1);
			local57.method30802(arg5);
			if (Class278.aClass278_2 != arg6) {
				local57.method30832();
				local57.method30805(arg9);
				local57.method30809(arg7);
				local57.method30875(arg8);
				if (Class278.aClass278_3 == arg6) {
					local57.method30794(this.anInterface58_1);
				} else if (Class278.aClass278_4 == arg6) {
					local57.method30794(this.anInterface58_4);
				} else if (Class278.aClass278_5 == arg6) {
					local57.method30794(this.anInterface58_2);
				} else if (arg6 == Class278.aClass278_1) {
					local57.method30794(this.anInterface58_3);
				} else {
					local57.method30832();
				}
			}
			local57.method30814(local41, 0);
			local57.method30815(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local57.method30816(local46);
			local57.method30799(arg0);
			return local57;
		}
	}

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "(Lclient!ft;Ljava/lang/Object;IIIILclient!fx;FFLclient!ox;IIZI)Lclient!rw;", line = 642)
	public Class539 method26119(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class278 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class472 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		if (!this.aBoolean666) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg11 = Math.max(0, arg11);
			if (arg6 != Class278.aClass278_2 && !this.method26114(this.aClass472_60, arg9, arg8)) {
				return null;
			}
			if (arg11 <= 0) {
				arg11 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg11 / 255.0F;
			@Pc(52) Interface70 local52 = this.method26046(arg2, arg12);
			@Pc(57) Class539 local57 = this.method26047(local52);
			if (local57 == null) {
				return null;
			}
			local57.method30859(arg1);
			local57.method30802(arg5);
			if (Class278.aClass278_2 != arg6) {
				local57.method30832();
				local57.method30805(arg9);
				local57.method30809(arg7);
				local57.method30875(arg8);
				if (Class278.aClass278_3 == arg6) {
					local57.method30794(this.anInterface58_1);
				} else if (Class278.aClass278_4 == arg6) {
					local57.method30794(this.anInterface58_4);
				} else if (Class278.aClass278_5 == arg6) {
					local57.method30794(this.anInterface58_2);
				} else if (arg6 == Class278.aClass278_1) {
					local57.method30794(this.anInterface58_3);
				} else {
					local57.method30832();
				}
			}
			local57.method30814(local41, 0);
			local57.method30815(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local57.method30816(local46);
			local57.method30799(arg0);
			return local57;
		}
	}

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "(Lclient!ft;IIIILclient!fx;FFLclient!ox;IIII)V", line = 690)
	public void method26074(@OriginalArg(0) Class275 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class278 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class472 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean666) {
			return;
		}
		@Pc(20) Class539 local20 = this.method26119(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30852();
		} else {
			local20.method30811(arg11, false);
		}
		this.method26068(local20);
	}

	@OriginalMember(owner = "client!fb", name = "cp", descriptor = "(Lclient!ft;IIIILclient!fx;FFLclient!ox;III)V", line = 690)
	public void method26100(@OriginalArg(0) Class275 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class278 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class472 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean666) {
			return;
		}
		@Pc(20) Class539 local20 = this.method26119(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30852();
		} else {
			local20.method30811(arg11, false);
		}
		this.method26068(local20);
	}

	@OriginalMember(owner = "client!fb", name = "cv", descriptor = "(Lclient!ft;IIIILclient!fx;FFLclient!ox;III)V", line = 690)
	public void method26110(@OriginalArg(0) Class275 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class278 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class472 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean666) {
			return;
		}
		@Pc(20) Class539 local20 = this.method26119(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30852();
		} else {
			local20.method30811(arg11, false);
		}
		this.method26068(local20);
	}

	@OriginalMember(owner = "client!fb", name = "cn", descriptor = "(Lclient!ft;IIIILclient!fx;FFLclient!ox;III)V", line = 690)
	public void method26133(@OriginalArg(0) Class275 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class278 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class472 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean666) {
			return;
		}
		@Pc(20) Class539 local20 = this.method26119(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30852();
		} else {
			local20.method30811(arg11, false);
		}
		this.method26068(local20);
	}

	@OriginalMember(owner = "client!fb", name = "ca", descriptor = "(II)V", line = 700)
	public void method26112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3865 * -2005296631 == arg0) {
			return;
		}
		if (this.aClass539_6 != null) {
			this.aClass539_6.method30791(0);
			this.method26068(this.aClass539_6);
			this.aClass539_6 = null;
		}
		@Pc(42) Class539 local42 = this.method26119(Class275.aClass275_5, this, arg0, 0, arg1, Class280.aClass280_2.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local42 != null) {
			local42.method30803();
			this.aClass539_6 = local42;
		}
		this.aBoolean667 = false;
	}

	@OriginalMember(owner = "client!fb", name = "ae", descriptor = "(III)V", line = 700)
	public void method26122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3865 * -2005296631 == arg0) {
			return;
		}
		if (this.aClass539_6 != null) {
			this.aClass539_6.method30791(0);
			this.method26068(this.aClass539_6);
			this.aClass539_6 = null;
		}
		@Pc(42) Class539 local42 = this.method26119(Class275.aClass275_5, this, arg0, 0, arg1, Class280.aClass280_2.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local42 != null) {
			local42.method30803();
			this.aClass539_6 = local42;
		}
		this.aBoolean667 = false;
	}

	@OriginalMember(owner = "client!fb", name = "cw", descriptor = "()I", line = 717)
	public int method26051() {
		return this.anInt3865 * -2005296631;
	}

	@OriginalMember(owner = "client!fb", name = "ag", descriptor = "(I)I", line = 717)
	public int method26053() {
		return this.anInt3865 * -2005296631;
	}

	@OriginalMember(owner = "client!fb", name = "cx", descriptor = "()I", line = 717)
	public int method26113() {
		return this.anInt3865 * -2005296631;
	}

	@OriginalMember(owner = "client!fb", name = "ah", descriptor = "(II)V", line = 721)
	public void method26054(@OriginalArg(0) int arg0) {
		this.anInt3864 = arg0 * 624068757;
	}

	@OriginalMember(owner = "client!fb", name = "cf", descriptor = "(I)V", line = 721)
	public void method26060(@OriginalArg(0) int arg0) {
		this.anInt3864 = arg0 * 624068757;
	}

	@OriginalMember(owner = "client!fb", name = "cr", descriptor = "(I)V", line = 721)
	public void method26097(@OriginalArg(0) int arg0) {
		this.anInt3864 = arg0 * 624068757;
	}

	@OriginalMember(owner = "client!fb", name = "ct", descriptor = "(I)V", line = 721)
	public void method26115(@OriginalArg(0) int arg0) {
		this.anInt3864 = arg0 * 624068757;
	}

	@OriginalMember(owner = "client!fb", name = "co", descriptor = "(I)V", line = 721)
	public void method26117(@OriginalArg(0) int arg0) {
		this.anInt3864 = arg0 * 624068757;
	}

	@OriginalMember(owner = "client!fb", name = "al", descriptor = "(I)I", line = 725)
	public int method26052() {
		return this.anInt3864 * 1243611837;
	}

	@OriginalMember(owner = "client!fb", name = "ac", descriptor = "(II)V", line = 729)
	void method26027(@OriginalArg(0) int arg0) {
		if (client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(16) Class93_Sub22 local16 = Class102.method2592(Class446.aClass446_16, client.aClass175_2.aClass24_2);
			local16.aClass93_Sub41_Sub2_1.method22395(arg0);
			client.aClass175_2.method24351(local16);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cm", descriptor = "(I)V", line = 729)
	void method26038(@OriginalArg(0) int arg0) {
		if (client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(16) Class93_Sub22 local16 = Class102.method2592(Class446.aClass446_16, client.aClass175_2.aClass24_2);
			local16.aClass93_Sub41_Sub2_1.method22395(arg0);
			client.aClass175_2.method24351(local16);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cq", descriptor = "(I)V", line = 729)
	void method26120(@OriginalArg(0) int arg0) {
		if (client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(16) Class93_Sub22 local16 = Class102.method2592(Class446.aClass446_16, client.aClass175_2.aClass24_2);
			local16.aClass93_Sub41_Sub2_1.method22395(arg0);
			client.aClass175_2.method24351(local16);
		}
	}

	@OriginalMember(owner = "client!fb", name = "ch", descriptor = "(I)V", line = 729)
	void method26121(@OriginalArg(0) int arg0) {
		if (client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(16) Class93_Sub22 local16 = Class102.method2592(Class446.aClass446_16, client.aClass175_2.aClass24_2);
			local16.aClass93_Sub41_Sub2_1.method22395(arg0);
			client.aClass175_2.method24351(local16);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cb", descriptor = "(I)V", line = 737)
	public void method26037(@OriginalArg(0) int arg0) {
		this.method26118(arg0, 255);
	}

	@OriginalMember(owner = "client!fb", name = "ai", descriptor = "(II)V", line = 737)
	public void method26057(@OriginalArg(0) int arg0) {
		this.method26118(arg0, 255);
	}

	@OriginalMember(owner = "client!fb", name = "aw", descriptor = "(IIB)V", line = 741)
	public void method26118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26026(arg0, arg1, false, 0, 0, 0, 0, 0);
	}

	@OriginalMember(owner = "client!fb", name = "as", descriptor = "(IIZIIIIIB)V", line = 745)
	public void method26026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean666 || arg0 == this.anInt3865 * -2005296631) {
			return;
		}
		if (this.aBoolean665 && this.aClass539_5 != null && this.anInt3865 * -2005296631 != arg0) {
			this.aClass539_5.method30793();
			this.aClass539_5.method30788();
			this.aList6.remove(this.aClass539_5);
		}
		@Pc(41) Class539 local41 = this.method26035();
		if (local41 != null && local41.method30797().method32558() == arg0) {
			this.aClass539_5 = local41;
			this.anInt3865 = local41.method30797().method32558() * 1053037625;
			return;
		}
		@Pc(65) boolean local65 = false;
		if (this.anInt3865 * -2005296631 >= 0) {
			@Pc(74) Iterator local74 = this.aList6.iterator();
			while (local74.hasNext()) {
				@Pc(81) Class539 local81 = (Class539) local74.next();
				if (local81.method30869() == Class275.aClass275_5) {
					local81.method30791(2000);
					local65 = true;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
		@Pc(101) Class539 local101 = null;
		if (this.aClass539_6 != null && this.aClass539_6.method30797() != null && this.aClass539_6.method30797().method32558() == arg0 && this.aClass539_6.method30796() == Class536.aClass536_4) {
			local101 = this.aClass539_6;
			this.aClass539_6 = null;
			this.aBoolean667 = false;
		}
		@Pc(140) float local140;
		if (local101 == null) {
			if (arg2) {
				local140 = arg6;
				@Pc(143) float local143 = (float) arg7;
				@Pc(152) Class472 local152 = new Class472((float) arg4, 0.0F, (float) arg5);
				local101 = this.method26119(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, arg0 == this.anInt3864 * 1243611837 ? Class265.aClass265_6.method26217() : Class280.aClass280_2.method26450(), Class278.aClass278_1, local140, local143, local152, arg3, 255, true);
			} else {
				local101 = this.method26119(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, this.anInt3864 * 1243611837 == arg0 ? Class265.aClass265_6.method26217() : Class280.aClass280_2.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local101 == null) {
			return;
		}
		if (local65) {
			local140 = (float) arg1 / 255.0F;
			local101.method30814(local140, 2000);
		}
		local101.method30852();
		this.method26068(local101);
		this.aClass539_5 = local101;
		this.anInt3865 = arg0 * 1053037625;
		if (this.aBoolean665) {
			this.aClass539_5.method30792();
		}
		if (client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(270) Class93_Sub22 local270 = Class102.method2592(Class446.aClass446_32, client.aClass175_2.aClass24_2);
			local270.aClass93_Sub41_Sub2_1.method22395(this.anInt3865 * -2005296631);
			client.aClass175_2.method24351(local270);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cs", descriptor = "(IIZIIIII)V", line = 745)
	public void method26111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean666 || arg0 == this.anInt3865 * -2005296631) {
			return;
		}
		if (this.aBoolean665 && this.aClass539_5 != null && this.anInt3865 * -2005296631 != arg0) {
			this.aClass539_5.method30793();
			this.aClass539_5.method30788();
			this.aList6.remove(this.aClass539_5);
		}
		@Pc(41) Class539 local41 = this.method26035();
		if (local41 != null && local41.method30797().method32558() == arg0) {
			this.aClass539_5 = local41;
			this.anInt3865 = local41.method30797().method32558() * 1053037625;
			return;
		}
		@Pc(65) boolean local65 = false;
		if (this.anInt3865 * -2005296631 >= 0) {
			@Pc(74) Iterator local74 = this.aList6.iterator();
			while (local74.hasNext()) {
				@Pc(81) Class539 local81 = (Class539) local74.next();
				if (local81.method30869() == Class275.aClass275_5) {
					local81.method30791(2000);
					local65 = true;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
		@Pc(101) Class539 local101 = null;
		if (this.aClass539_6 != null && this.aClass539_6.method30797() != null && this.aClass539_6.method30797().method32558() == arg0 && this.aClass539_6.method30796() == Class536.aClass536_4) {
			local101 = this.aClass539_6;
			this.aClass539_6 = null;
			this.aBoolean667 = false;
		}
		@Pc(140) float local140;
		if (local101 == null) {
			if (arg2) {
				local140 = arg6;
				@Pc(143) float local143 = (float) arg7;
				@Pc(152) Class472 local152 = new Class472((float) arg4, 0.0F, (float) arg5);
				local101 = this.method26119(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, arg0 == this.anInt3864 * 1243611837 ? Class265.aClass265_6.method26217() : Class280.aClass280_2.method26450(), Class278.aClass278_1, local140, local143, local152, arg3, 255, true);
			} else {
				local101 = this.method26119(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, this.anInt3864 * 1243611837 == arg0 ? Class265.aClass265_6.method26217() : Class280.aClass280_2.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local101 == null) {
			return;
		}
		if (local65) {
			local140 = (float) arg1 / 255.0F;
			local101.method30814(local140, 2000);
		}
		local101.method30852();
		this.method26068(local101);
		this.aClass539_5 = local101;
		this.anInt3865 = arg0 * 1053037625;
		if (this.aBoolean665) {
			this.aClass539_5.method30792();
		}
		if (client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(270) Class93_Sub22 local270 = Class102.method2592(Class446.aClass446_32, client.aClass175_2.aClass24_2);
			local270.aClass93_Sub41_Sub2_1.method22395(this.anInt3865 * -2005296631);
			client.aClass175_2.method24351(local270);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cy", descriptor = "(IIZIIIII)V", line = 745)
	public void method26124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean666 || arg0 == this.anInt3865 * -2005296631) {
			return;
		}
		if (this.aBoolean665 && this.aClass539_5 != null && this.anInt3865 * -2005296631 != arg0) {
			this.aClass539_5.method30793();
			this.aClass539_5.method30788();
			this.aList6.remove(this.aClass539_5);
		}
		@Pc(41) Class539 local41 = this.method26035();
		if (local41 != null && local41.method30797().method32558() == arg0) {
			this.aClass539_5 = local41;
			this.anInt3865 = local41.method30797().method32558() * 1053037625;
			return;
		}
		@Pc(65) boolean local65 = false;
		if (this.anInt3865 * -2005296631 >= 0) {
			@Pc(74) Iterator local74 = this.aList6.iterator();
			while (local74.hasNext()) {
				@Pc(81) Class539 local81 = (Class539) local74.next();
				if (local81.method30869() == Class275.aClass275_5) {
					local81.method30791(2000);
					local65 = true;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
		@Pc(101) Class539 local101 = null;
		if (this.aClass539_6 != null && this.aClass539_6.method30797() != null && this.aClass539_6.method30797().method32558() == arg0 && this.aClass539_6.method30796() == Class536.aClass536_4) {
			local101 = this.aClass539_6;
			this.aClass539_6 = null;
			this.aBoolean667 = false;
		}
		@Pc(140) float local140;
		if (local101 == null) {
			if (arg2) {
				local140 = arg6;
				@Pc(143) float local143 = (float) arg7;
				@Pc(152) Class472 local152 = new Class472((float) arg4, 0.0F, (float) arg5);
				local101 = this.method26119(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, arg0 == this.anInt3864 * 1243611837 ? Class265.aClass265_6.method26217() : Class280.aClass280_2.method26450(), Class278.aClass278_1, local140, local143, local152, arg3, 255, true);
			} else {
				local101 = this.method26119(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, this.anInt3864 * 1243611837 == arg0 ? Class265.aClass265_6.method26217() : Class280.aClass280_2.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local101 == null) {
			return;
		}
		if (local65) {
			local140 = (float) arg1 / 255.0F;
			local101.method30814(local140, 2000);
		}
		local101.method30852();
		this.method26068(local101);
		this.aClass539_5 = local101;
		this.anInt3865 = arg0 * 1053037625;
		if (this.aBoolean665) {
			this.aClass539_5.method30792();
		}
		if (client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(270) Class93_Sub22 local270 = Class102.method2592(Class446.aClass446_32, client.aClass175_2.aClass24_2);
			local270.aClass93_Sub41_Sub2_1.method22395(this.anInt3865 * -2005296631);
			client.aClass175_2.method24351(local270);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cc", descriptor = "(IIZIIIII)V", line = 745)
	public void method26125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean666 || arg0 == this.anInt3865 * -2005296631) {
			return;
		}
		if (this.aBoolean665 && this.aClass539_5 != null && this.anInt3865 * -2005296631 != arg0) {
			this.aClass539_5.method30793();
			this.aClass539_5.method30788();
			this.aList6.remove(this.aClass539_5);
		}
		@Pc(41) Class539 local41 = this.method26035();
		if (local41 != null && local41.method30797().method32558() == arg0) {
			this.aClass539_5 = local41;
			this.anInt3865 = local41.method30797().method32558() * 1053037625;
			return;
		}
		@Pc(65) boolean local65 = false;
		if (this.anInt3865 * -2005296631 >= 0) {
			@Pc(74) Iterator local74 = this.aList6.iterator();
			while (local74.hasNext()) {
				@Pc(81) Class539 local81 = (Class539) local74.next();
				if (local81.method30869() == Class275.aClass275_5) {
					local81.method30791(2000);
					local65 = true;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
		@Pc(101) Class539 local101 = null;
		if (this.aClass539_6 != null && this.aClass539_6.method30797() != null && this.aClass539_6.method30797().method32558() == arg0 && this.aClass539_6.method30796() == Class536.aClass536_4) {
			local101 = this.aClass539_6;
			this.aClass539_6 = null;
			this.aBoolean667 = false;
		}
		@Pc(140) float local140;
		if (local101 == null) {
			if (arg2) {
				local140 = arg6;
				@Pc(143) float local143 = (float) arg7;
				@Pc(152) Class472 local152 = new Class472((float) arg4, 0.0F, (float) arg5);
				local101 = this.method26119(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, arg0 == this.anInt3864 * 1243611837 ? Class265.aClass265_6.method26217() : Class280.aClass280_2.method26450(), Class278.aClass278_1, local140, local143, local152, arg3, 255, true);
			} else {
				local101 = this.method26119(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, this.anInt3864 * 1243611837 == arg0 ? Class265.aClass265_6.method26217() : Class280.aClass280_2.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local101 == null) {
			return;
		}
		if (local65) {
			local140 = (float) arg1 / 255.0F;
			local101.method30814(local140, 2000);
		}
		local101.method30852();
		this.method26068(local101);
		this.aClass539_5 = local101;
		this.anInt3865 = arg0 * 1053037625;
		if (this.aBoolean665) {
			this.aClass539_5.method30792();
		}
		if (client.aClass175_2.aClass24_2 != null && Class106.method7580(client.anInt3435 * -849002901)) {
			@Pc(270) Class93_Sub22 local270 = Class102.method2592(Class446.aClass446_32, client.aClass175_2.aClass24_2);
			local270.aClass93_Sub41_Sub2_1.method22395(this.anInt3865 * -2005296631);
			client.aClass175_2.method24351(local270);
		}
	}

	@OriginalMember(owner = "client!fb", name = "at", descriptor = "(I)Lclient!rw;", line = 811)
	Class539 method26035() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		@Pc(10) Class539 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class539) local3.next();
		} while (local10.method30869() != Class275.aClass275_5 || local10.method30796() != Class536.aClass536_5);
		return local10;
	}

	@OriginalMember(owner = "client!fb", name = "ck", descriptor = "()Lclient!rw;", line = 811)
	Class539 method26123() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		@Pc(10) Class539 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class539) local3.next();
		} while (local10.method30869() != Class275.aClass275_5 || local10.method30796() != Class536.aClass536_5);
		return local10;
	}

	@OriginalMember(owner = "client!fb", name = "cz", descriptor = "()Lclient!rw;", line = 811)
	Class539 method26126() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		@Pc(10) Class539 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class539) local3.next();
		} while (local10.method30869() != Class275.aClass275_5 || local10.method30796() != Class536.aClass536_5);
		return local10;
	}

	@OriginalMember(owner = "client!fb", name = "ad", descriptor = "(I)V", line = 822)
	public void method26061() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			if (local10.method30869() == Class275.aClass275_5) {
				local10.method30791(500);
				if (local10.method30797().method32558() == this.anInt3865 * -2005296631) {
					this.method26027(this.anInt3865 * -2005296631);
					break;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
	}

	@OriginalMember(owner = "client!fb", name = "dd", descriptor = "()V", line = 822)
	public void method26069() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			if (local10.method30869() == Class275.aClass275_5) {
				local10.method30791(500);
				if (local10.method30797().method32558() == this.anInt3865 * -2005296631) {
					this.method26027(this.anInt3865 * -2005296631);
					break;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
	}

	@OriginalMember(owner = "client!fb", name = "cj", descriptor = "()V", line = 822)
	public void method26128() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			if (local10.method30869() == Class275.aClass275_5) {
				local10.method30791(500);
				if (local10.method30797().method32558() == this.anInt3865 * -2005296631) {
					this.method26027(this.anInt3865 * -2005296631);
					break;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
	}

	@OriginalMember(owner = "client!fb", name = "cd", descriptor = "()V", line = 822)
	public void method26129() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			if (local10.method30869() == Class275.aClass275_5) {
				local10.method30791(500);
				if (local10.method30797().method32558() == this.anInt3865 * -2005296631) {
					this.method26027(this.anInt3865 * -2005296631);
					break;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
	}

	@OriginalMember(owner = "client!fb", name = "dt", descriptor = "(II)V", line = 838)
	public void method26049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean666 || this.aBoolean665 && arg0 == this.anInt3861 * -1023303443) {
			return;
		}
		if (this.aBoolean665 && arg0 != this.anInt3861 * -1023303443) {
			@Pc(26) Iterator local26 = this.aList5.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class539 local33 = (Class539) local26.next();
				if (local33.method30869() == Class275.aClass275_7) {
					local33.method30788();
					this.aList6.remove(local33);
					this.aBoolean665 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean665 && this.aClass539_5 != null) {
			this.aClass539_5.method30792();
		}
		@Pc(87) Class539 local87 = this.method26119(Class275.aClass275_7, this, arg0, 0, arg1, Class280.aClass280_2.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local87 != null) {
			local87.method30852();
			this.method26068(local87);
			this.aBoolean665 = true;
			this.anInt3861 = arg0 * -802046747;
		}
	}

	@OriginalMember(owner = "client!fb", name = "am", descriptor = "(III)V", line = 838)
	public void method26062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean666 || this.aBoolean665 && arg0 == this.anInt3861 * -1023303443) {
			return;
		}
		if (this.aBoolean665 && arg0 != this.anInt3861 * -1023303443) {
			@Pc(26) Iterator local26 = this.aList5.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class539 local33 = (Class539) local26.next();
				if (local33.method30869() == Class275.aClass275_7) {
					local33.method30788();
					this.aList6.remove(local33);
					this.aBoolean665 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean665 && this.aClass539_5 != null) {
			this.aClass539_5.method30792();
		}
		@Pc(87) Class539 local87 = this.method26119(Class275.aClass275_7, this, arg0, 0, arg1, Class280.aClass280_2.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local87 != null) {
			local87.method30852();
			this.method26068(local87);
			this.aBoolean665 = true;
			this.anInt3861 = arg0 * -802046747;
		}
	}

	@OriginalMember(owner = "client!fb", name = "dr", descriptor = "(II)V", line = 838)
	public void method26130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean666 || this.aBoolean665 && arg0 == this.anInt3861 * -1023303443) {
			return;
		}
		if (this.aBoolean665 && arg0 != this.anInt3861 * -1023303443) {
			@Pc(26) Iterator local26 = this.aList5.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class539 local33 = (Class539) local26.next();
				if (local33.method30869() == Class275.aClass275_7) {
					local33.method30788();
					this.aList6.remove(local33);
					this.aBoolean665 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean665 && this.aClass539_5 != null) {
			this.aClass539_5.method30792();
		}
		@Pc(87) Class539 local87 = this.method26119(Class275.aClass275_7, this, arg0, 0, arg1, Class280.aClass280_2.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local87 != null) {
			local87.method30852();
			this.method26068(local87);
			this.aBoolean665 = true;
			this.anInt3861 = arg0 * -802046747;
		}
	}

	@OriginalMember(owner = "client!fb", name = "da", descriptor = "(II)V", line = 838)
	public void method26132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean666 || this.aBoolean665 && arg0 == this.anInt3861 * -1023303443) {
			return;
		}
		if (this.aBoolean665 && arg0 != this.anInt3861 * -1023303443) {
			@Pc(26) Iterator local26 = this.aList5.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class539 local33 = (Class539) local26.next();
				if (local33.method30869() == Class275.aClass275_7) {
					local33.method30788();
					this.aList6.remove(local33);
					this.aBoolean665 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean665 && this.aClass539_5 != null) {
			this.aClass539_5.method30792();
		}
		@Pc(87) Class539 local87 = this.method26119(Class275.aClass275_7, this, arg0, 0, arg1, Class280.aClass280_2.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local87 != null) {
			local87.method30852();
			this.method26068(local87);
			this.aBoolean665 = true;
			this.anInt3861 = arg0 * -802046747;
		}
	}

	@OriginalMember(owner = "client!fb", name = "au", descriptor = "(Lclient!fg;ILclient!alh;B)V", line = 866)
	public void method26063(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != arg2.aByte100 || !arg2.method24268())) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray47[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray47[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1])) + arg0.anIntArray367[arg1];
		}
		@Pc(111) int local111 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		if (local48 != 0) {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16223() == 0) {
					return;
				}
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub35_1.method16223() == 0) {
				return;
			}
			if (arg0.anInt3877 * 432350475 != -1) {
				@Pc(158) int local158 = 0;
				if (arg2 instanceof Class132_Sub1_Sub1_Sub1) {
					local158 = ((Class132_Sub1_Sub1_Sub1) arg2).method20023();
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub5) {
					local158 = ((Class132_Sub1_Sub1_Sub5) arg2).method24092();
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub4) {
					local158 = ((Class132_Sub1_Sub1_Sub4) arg2).method23912();
				}
				if (local158 != 0 && local158 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20023() && client.anInt3433 * -914512487 != local158) {
					local111 = arg0.anInt3877 * 432350475 * local111 / 100;
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 255) {
						local111 = 255;
					}
				}
			}
			@Pc(220) Class472 local220 = arg2.method24229().aClass472_61;
			@Pc(228) int local228 = (int) local220.aFloat317 - 256 >> 9;
			@Pc(236) int local236 = (int) local220.aFloat319 - 256 >> 9;
			@Pc(249) Class472 local249 = new Class472((float) (local228 << 9), 0.0F, (float) (local236 << 9));
			@Pc(254) int local254 = arg2.aByte100 << 24;
			this.method26074(Class275.aClass275_1, local38, local44, local111, Class280.aClass280_5.method26450(), arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 ? Class278.aClass278_2 : Class278.aClass278_5, 0.0F, (float) (local48 << 9), local249, local254, local65, 0);
		} else if (arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26074(Class275.aClass275_6, local38, local44, local111, Class280.aClass280_4.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, arg2.aByte100, local65, 0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "do", descriptor = "(Lclient!fg;ILclient!alh;)V", line = 866)
	public void method26085(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != arg2.aByte100 || !arg2.method24268())) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray47[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray47[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1])) + arg0.anIntArray367[arg1];
		}
		@Pc(111) int local111 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		if (local48 != 0) {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16223() == 0) {
					return;
				}
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub35_1.method16223() == 0) {
				return;
			}
			if (arg0.anInt3877 * 432350475 != -1) {
				@Pc(158) int local158 = 0;
				if (arg2 instanceof Class132_Sub1_Sub1_Sub1) {
					local158 = ((Class132_Sub1_Sub1_Sub1) arg2).method20023();
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub5) {
					local158 = ((Class132_Sub1_Sub1_Sub5) arg2).method24092();
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub4) {
					local158 = ((Class132_Sub1_Sub1_Sub4) arg2).method23912();
				}
				if (local158 != 0 && local158 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20023() && client.anInt3433 * -914512487 != local158) {
					local111 = arg0.anInt3877 * 432350475 * local111 / 100;
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 255) {
						local111 = 255;
					}
				}
			}
			@Pc(220) Class472 local220 = arg2.method24229().aClass472_61;
			@Pc(228) int local228 = (int) local220.aFloat317 - 256 >> 9;
			@Pc(236) int local236 = (int) local220.aFloat319 - 256 >> 9;
			@Pc(249) Class472 local249 = new Class472((float) (local228 << 9), 0.0F, (float) (local236 << 9));
			@Pc(254) int local254 = arg2.aByte100 << 24;
			this.method26074(Class275.aClass275_1, local38, local44, local111, Class280.aClass280_5.method26450(), arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 ? Class278.aClass278_2 : Class278.aClass278_5, 0.0F, (float) (local48 << 9), local249, local254, local65, 0);
		} else if (arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26074(Class275.aClass275_6, local38, local44, local111, Class280.aClass280_4.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, arg2.aByte100, local65, 0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "dz", descriptor = "(Lclient!fg;ILclient!alh;)V", line = 866)
	public void method26135(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != arg2.aByte100 || !arg2.method24268())) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray47[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray47[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1])) + arg0.anIntArray367[arg1];
		}
		@Pc(111) int local111 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		if (local48 != 0) {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16223() == 0) {
					return;
				}
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub35_1.method16223() == 0) {
				return;
			}
			if (arg0.anInt3877 * 432350475 != -1) {
				@Pc(158) int local158 = 0;
				if (arg2 instanceof Class132_Sub1_Sub1_Sub1) {
					local158 = ((Class132_Sub1_Sub1_Sub1) arg2).method20023();
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub5) {
					local158 = ((Class132_Sub1_Sub1_Sub5) arg2).method24092();
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub4) {
					local158 = ((Class132_Sub1_Sub1_Sub4) arg2).method23912();
				}
				if (local158 != 0 && local158 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20023() && client.anInt3433 * -914512487 != local158) {
					local111 = arg0.anInt3877 * 432350475 * local111 / 100;
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 255) {
						local111 = 255;
					}
				}
			}
			@Pc(220) Class472 local220 = arg2.method24229().aClass472_61;
			@Pc(228) int local228 = (int) local220.aFloat317 - 256 >> 9;
			@Pc(236) int local236 = (int) local220.aFloat319 - 256 >> 9;
			@Pc(249) Class472 local249 = new Class472((float) (local228 << 9), 0.0F, (float) (local236 << 9));
			@Pc(254) int local254 = arg2.aByte100 << 24;
			this.method26074(Class275.aClass275_1, local38, local44, local111, Class280.aClass280_5.method26450(), arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 ? Class278.aClass278_2 : Class278.aClass278_5, 0.0F, (float) (local48 << 9), local249, local254, local65, 0);
		} else if (arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26074(Class275.aClass275_6, local38, local44, local111, Class280.aClass280_4.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, arg2.aByte100, local65, 0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "dv", descriptor = "(Lclient!fg;ILclient!alh;)V", line = 866)
	public void method26136(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != arg2.aByte100 || !arg2.method24268())) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray47[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray47[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1])) + arg0.anIntArray367[arg1];
		}
		@Pc(111) int local111 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		if (local48 != 0) {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16223() == 0) {
					return;
				}
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub35_1.method16223() == 0) {
				return;
			}
			if (arg0.anInt3877 * 432350475 != -1) {
				@Pc(158) int local158 = 0;
				if (arg2 instanceof Class132_Sub1_Sub1_Sub1) {
					local158 = ((Class132_Sub1_Sub1_Sub1) arg2).method20023();
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub5) {
					local158 = ((Class132_Sub1_Sub1_Sub5) arg2).method24092();
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub4) {
					local158 = ((Class132_Sub1_Sub1_Sub4) arg2).method23912();
				}
				if (local158 != 0 && local158 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20023() && client.anInt3433 * -914512487 != local158) {
					local111 = arg0.anInt3877 * 432350475 * local111 / 100;
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 255) {
						local111 = 255;
					}
				}
			}
			@Pc(220) Class472 local220 = arg2.method24229().aClass472_61;
			@Pc(228) int local228 = (int) local220.aFloat317 - 256 >> 9;
			@Pc(236) int local236 = (int) local220.aFloat319 - 256 >> 9;
			@Pc(249) Class472 local249 = new Class472((float) (local228 << 9), 0.0F, (float) (local236 << 9));
			@Pc(254) int local254 = arg2.aByte100 << 24;
			this.method26074(Class275.aClass275_1, local38, local44, local111, Class280.aClass280_5.method26450(), arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 ? Class278.aClass278_2 : Class278.aClass278_5, 0.0F, (float) (local48 << 9), local249, local254, local65, 0);
		} else if (arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26074(Class275.aClass275_6, local38, local44, local111, Class280.aClass280_4.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, arg2.aByte100, local65, 0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "ar", descriptor = "(Lclient!fg;II)V", line = 916)
	public void method26064(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null) {
			return;
		}
		@Pc(23) int local23 = arg0.anIntArrayArray47[arg1][0];
		@Pc(27) int local27 = local23 >> 8;
		@Pc(33) int local33 = local23 >> 5 & 0x7;
		@Pc(50) int local50;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local50 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local50 > 0) {
				local27 = arg0.anIntArrayArray47[arg1][local50];
			}
		}
		local50 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local50 = (int) ((double) arg0.anIntArray367[arg1] + Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		this.method26074(Class275.aClass275_13, local27, local33, local99, Class280.aClass280_5.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local50, 0);
	}

	@OriginalMember(owner = "client!fb", name = "dm", descriptor = "(Lclient!fg;I)V", line = 916)
	public void method26137(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null) {
			return;
		}
		@Pc(23) int local23 = arg0.anIntArrayArray47[arg1][0];
		@Pc(27) int local27 = local23 >> 8;
		@Pc(33) int local33 = local23 >> 5 & 0x7;
		@Pc(50) int local50;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local50 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local50 > 0) {
				local27 = arg0.anIntArrayArray47[arg1][local50];
			}
		}
		local50 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local50 = (int) ((double) arg0.anIntArray367[arg1] + Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		this.method26074(Class275.aClass275_13, local27, local33, local99, Class280.aClass280_5.method26450(), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local50, 0);
	}

	@OriginalMember(owner = "client!fb", name = "ee", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5710)
	static final void method26141(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (!local13.equals(arg0.aString164)) {
			arg0.aString164 = local13;
			Class354.method27696(arg0);
		}
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class117_Sub1.method8385(arg0.anInt3953 * -1549590237);
		}
	}

	@OriginalMember(owner = "client!fb", name = "iz", descriptor = "(Lclient!yf;B)V", line = 6606)
	static final void method26138(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class222.method25583(local11, local14, arg0);
	}
}
