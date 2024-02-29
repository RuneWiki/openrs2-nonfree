package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public class Class261 {

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
	static final int anInt3810 = 8192;

	@OriginalMember(owner = "client!fw", name = "v", descriptor = "I")
	static final int anInt3811 = 16384;

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
	static final int anInt3812 = 8192;

	@OriginalMember(owner = "client!fw", name = "y", descriptor = "I")
	static final int anInt3813 = 0;

	@OriginalMember(owner = "client!fw", name = "w", descriptor = "I")
	static final int anInt3814 = 4096;

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "I")
	static final int anInt3816 = 4096;

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
	static final int anInt3818 = 16384;

	@OriginalMember(owner = "client!fw", name = "az", descriptor = "I")
	public static int anInt3821;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
	int anInt3815;

	@OriginalMember(owner = "client!fw", name = "q", descriptor = "Z")
	boolean aBoolean656;

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "Lclient!er;")
	Class232 aClass232_68;

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "Lclient!er;")
	Class232 aClass232_69;

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
	int anInt3817;

	@OriginalMember(owner = "client!fw", name = "u", descriptor = "Lclient!oo;")
	Class447 aClass447_60;

	@OriginalMember(owner = "client!fw", name = "o", descriptor = "Lclient!qs;")
	Class496 aClass496_5;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
	int anInt3819;

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
	int anInt3820;

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "Z")
	boolean aBoolean658;

	@OriginalMember(owner = "client!fw", name = "z", descriptor = "Lclient!er;")
	Class232 aClass232_70;

	@OriginalMember(owner = "client!fw", name = "x", descriptor = "Ljava/util/List;")
	List aList6 = new ArrayList();

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "Ljava/util/List;")
	List aList8 = new ArrayList();

	@OriginalMember(owner = "client!fw", name = "s", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap6 = new HashMap();

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap7 = new HashMap();

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "Ljava/util/List;")
	List aList7 = new ArrayList();

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap8 = new HashMap();

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "Lclient!qs;")
	Class496 aClass496_6 = null;

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "Z")
	boolean aBoolean657 = false;

	@OriginalMember(owner = "client!fw", name = "aj", descriptor = "Lclient!qx;")
	Interface57 anInterface57_1 = new Class238(this);

	@OriginalMember(owner = "client!fw", name = "ai", descriptor = "Lclient!qx;")
	Interface57 anInterface57_3 = new Class223(this);

	@OriginalMember(owner = "client!fw", name = "ag", descriptor = "Lclient!qx;")
	Interface57 anInterface57_4 = new Class255(this);

	@OriginalMember(owner = "client!fw", name = "al", descriptor = "Lclient!qx;")
	Interface57 anInterface57_2 = new Class219(this);

	@OriginalMember(owner = "client!fw", name = "ae", descriptor = "()Ljava/util/List;", line = 241)
	List method26253() {
		return this.aList8;
	}

	@OriginalMember(owner = "client!fw", name = "ah", descriptor = "()Ljava/util/List;", line = 241)
	List method26254() {
		return this.aList8;
	}

	@OriginalMember(owner = "client!fw", name = "as", descriptor = "()Ljava/util/List;", line = 241)
	List method26255() {
		return this.aList8;
	}

	@OriginalMember(owner = "client!fw", name = "aq", descriptor = "()Ljava/util/List;", line = 241)
	List method26256() {
		return this.aList8;
	}

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "(B)Ljava/util/List;", line = 241)
	List method26257() {
		return this.aList8;
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)Ljava/util/List;", line = 245)
	List method26258() {
		return this.aList7;
	}

	@OriginalMember(owner = "client!fw", name = "ay", descriptor = "()Ljava/util/List;", line = 245)
	List method26259() {
		return this.aList7;
	}

	@OriginalMember(owner = "client!fw", name = "af", descriptor = "()Ljava/util/List;", line = 245)
	List method26260() {
		return this.aList7;
	}

	@OriginalMember(owner = "client!fw", name = "an", descriptor = "()Ljava/util/List;", line = 245)
	List method26261() {
		return this.aList7;
	}

	@OriginalMember(owner = "client!fw", name = "am", descriptor = "()Ljava/util/List;", line = 245)
	List method26262() {
		return this.aList7;
	}

	@OriginalMember(owner = "client!fw", name = "v", descriptor = "(B)Lclient!er;", line = 249)
	Class232 method26263() {
		return this.aClass232_70;
	}

	@OriginalMember(owner = "client!fw", name = "ab", descriptor = "()Lclient!er;", line = 249)
	Class232 method26264() {
		return this.aClass232_70;
	}

	@OriginalMember(owner = "client!fw", name = "aa", descriptor = "()Lclient!er;", line = 249)
	Class232 method26265() {
		return this.aClass232_70;
	}

	@OriginalMember(owner = "client!fw", name = "ap", descriptor = "()Lclient!er;", line = 249)
	Class232 method26266() {
		return this.aClass232_70;
	}

	@OriginalMember(owner = "client!fw", name = "aw", descriptor = "()Lclient!er;", line = 249)
	Class232 method26267() {
		return this.aClass232_70;
	}

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "(I)Lclient!er;", line = 253)
	Class232 method26268() {
		return this.aClass232_68;
	}

	@OriginalMember(owner = "client!fw", name = "y", descriptor = "(I)Lclient!oo;", line = 257)
	Class447 method26269() {
		return this.aClass447_60;
	}

	@OriginalMember(owner = "client!fw", name = "az", descriptor = "()Lclient!oo;", line = 257)
	Class447 method26270() {
		return this.aClass447_60;
	}

	@OriginalMember(owner = "client!fw", name = "bc", descriptor = "(II)V", line = 263)
	public void method26271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean656) {
			return;
		}
		this.anInt3817 = arg0 * 271243903;
		this.aClass232_70 = new Class232(arg1, 100);
		this.aClass232_68 = new Class232(10);
		this.aClass232_70.method25833(new Class218(this));
		@Pc(34) Class650 local34 = new Class650(Class386.aClass386_2);
		Class580.method31678(local34);
		this.method26298();
		this.anInt3815 = 794851075;
		this.aBoolean656 = true;
	}

	@OriginalMember(owner = "client!fw", name = "bj", descriptor = "(II)V", line = 263)
	public void method26272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean656) {
			return;
		}
		this.anInt3817 = arg0 * 271243903;
		this.aClass232_70 = new Class232(arg1, 100);
		this.aClass232_68 = new Class232(10);
		this.aClass232_70.method25833(new Class218(this));
		@Pc(34) Class650 local34 = new Class650(Class386.aClass386_2);
		Class580.method31678(local34);
		this.method26298();
		this.anInt3815 = 794851075;
		this.aBoolean656 = true;
	}

	@OriginalMember(owner = "client!fw", name = "w", descriptor = "(IIB)V", line = 263)
	public void method26273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean656) {
			return;
		}
		this.anInt3817 = arg0 * 271243903;
		this.aClass232_70 = new Class232(arg1, 100);
		this.aClass232_68 = new Class232(10);
		this.aClass232_70.method25833(new Class218(this));
		@Pc(34) Class650 local34 = new Class650(Class386.aClass386_2);
		Class580.method31678(local34);
		this.method26298();
		this.anInt3815 = 794851075;
		this.aBoolean656 = true;
	}

	@OriginalMember(owner = "client!fw", name = "ba", descriptor = "()V", line = 291)
	public void method26274() {
		if (!this.aBoolean656) {
			return;
		}
		Class242.method26014();
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085() != null) {
			if (this.aClass447_60 == null) {
				this.aClass447_60 = new Class447();
			}
			this.aClass447_60.aFloat277 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat277;
			this.aClass447_60.aFloat276 = 0.0F;
			this.aClass447_60.aFloat278 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat278;
		}
		@Pc(41) Iterator local41 = this.aHashMap6.values().iterator();
		@Pc(48) Interface69 local48;
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aHashMap7.values().iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aList7.iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			if (local48.method32149()) {
				this.aHashMap7.remove(local48.method32165());
			} else {
				this.aHashMap6.remove(local48.method32165());
			}
		}
		this.aList7.clear();
		if (this.aClass496_6 != null && this.aClass496_6.method30110() == Class486.aClass486_4 && !this.aBoolean657 && client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(132) Class77_Sub20 local132 = Class365.method28132(Class414.aClass414_48, client.aClass82_2.aClass16_1);
			local132.aClass77_Sub39_Sub1_2.method22417(this.aClass496_6.method30129().method32165());
			client.aClass82_2.method2004(local132);
			this.aBoolean657 = true;
		}
		local41 = this.aList6.iterator();
		while (true) {
			label162: while (true) {
				@Pc(170) Class486 local170;
				@Pc(160) Class496 local160;
				do {
					if (!local41.hasNext()) {
						return;
					}
					local160 = (Class496) local41.next();
					local160.method30152();
					local160.method30109();
					local170 = local160.method30110();
				} while (local160.method30114() != this);
				if (Class486.aClass486_7 == local170 || Class486.aClass486_3 == local170) {
					if (local160.method30118() != Class239.aClass239_11 && local160.method30118() != Class239.aClass239_1) {
						@Pc(382) Iterator local382 = this.aHashMap8.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class258 local397 = (Class258) this.aHashMap8.get(local390);
							if (local397.method26238().contains(local160)) {
								local397.method26236(local160);
								break;
							}
						}
						local160.method30092();
						this.aList8.remove(local160);
					} else if (this.aClass496_6 == local160) {
						this.aBoolean657 = false;
						this.aClass496_6 = null;
						local160.method30092();
						this.aList8.remove(local160);
					} else {
						@Pc(216) int local216 = local160.method30129().method32165();
						@Pc(229) boolean local229 = this.method26310(Class220.aClass220_9.method25727()) > 0.0F;
						if (!this.aBoolean658 && local229) {
							if (local216 == this.anInt3815 * -1966156715) {
								this.method26349(local216);
								this.anInt3815 = 794851075;
							}
							local160.method30092();
							this.aList8.remove(local160);
						} else if (this.anInt3820 * 1867711623 == local216) {
							this.anInt3820 = 1685159625;
							this.aBoolean658 = false;
							local160.method30092();
							this.aList8.remove(local160);
							@Pc(281) Iterator local281 = this.aList6.iterator();
							@Pc(288) Class496 local288;
							@Pc(299) int local299;
							do {
								do {
									if (!local281.hasNext()) {
										continue label162;
									}
									local288 = (Class496) local281.next();
								} while (local288.method30118() != Class239.aClass239_11);
								local299 = local288.method30129().method32165();
							} while ((local299 != this.anInt3815 * -1966156715 || local288.method30110() != Class486.aClass486_7) && local288.method30110() != Class486.aClass486_6 && local288.method30110() != Class486.aClass486_1 && local288.method30110() != Class486.aClass486_4);
							if (local288.method30110() == Class486.aClass486_7) {
								local288.method30105();
							} else {
								local288.method30099();
							}
						} else if (local229) {
							if (!this.aBoolean658 || this.anInt3815 * -1966156715 != local216) {
								local160.method30092();
								this.aList8.remove(local160);
							}
							if (!this.aBoolean658 && local216 == this.anInt3815 * -1966156715) {
								this.anInt3815 = 794851075;
								this.aClass496_5 = null;
							}
						}
					}
				} else if (local160.method30110() != Class486.aClass486_8 && local160.method30120() == Class220.aClass220_9.method25727()) {
					@Pc(443) boolean local443 = this.method26310(Class220.aClass220_9.method25727()) > 1.0E-4F;
					if (!local443) {
						local160.method30100(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "(B)V", line = 291)
	public void method26275() {
		if (!this.aBoolean656) {
			return;
		}
		Class242.method26014();
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085() != null) {
			if (this.aClass447_60 == null) {
				this.aClass447_60 = new Class447();
			}
			this.aClass447_60.aFloat277 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat277;
			this.aClass447_60.aFloat276 = 0.0F;
			this.aClass447_60.aFloat278 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat278;
		}
		@Pc(41) Iterator local41 = this.aHashMap6.values().iterator();
		@Pc(48) Interface69 local48;
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aHashMap7.values().iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aList7.iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			if (local48.method32149()) {
				this.aHashMap7.remove(local48.method32165());
			} else {
				this.aHashMap6.remove(local48.method32165());
			}
		}
		this.aList7.clear();
		if (this.aClass496_6 != null && this.aClass496_6.method30110() == Class486.aClass486_4 && !this.aBoolean657 && client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(132) Class77_Sub20 local132 = Class365.method28132(Class414.aClass414_48, client.aClass82_2.aClass16_1);
			local132.aClass77_Sub39_Sub1_2.method22417(this.aClass496_6.method30129().method32165());
			client.aClass82_2.method2004(local132);
			this.aBoolean657 = true;
		}
		local41 = this.aList6.iterator();
		while (true) {
			label162: while (true) {
				@Pc(170) Class486 local170;
				@Pc(160) Class496 local160;
				do {
					if (!local41.hasNext()) {
						return;
					}
					local160 = (Class496) local41.next();
					local160.method30152();
					local160.method30109();
					local170 = local160.method30110();
				} while (local160.method30114() != this);
				if (Class486.aClass486_7 == local170 || Class486.aClass486_3 == local170) {
					if (local160.method30118() != Class239.aClass239_11 && local160.method30118() != Class239.aClass239_1) {
						@Pc(382) Iterator local382 = this.aHashMap8.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class258 local397 = (Class258) this.aHashMap8.get(local390);
							if (local397.method26238().contains(local160)) {
								local397.method26236(local160);
								break;
							}
						}
						local160.method30092();
						this.aList8.remove(local160);
					} else if (this.aClass496_6 == local160) {
						this.aBoolean657 = false;
						this.aClass496_6 = null;
						local160.method30092();
						this.aList8.remove(local160);
					} else {
						@Pc(216) int local216 = local160.method30129().method32165();
						@Pc(229) boolean local229 = this.method26310(Class220.aClass220_9.method25727()) > 0.0F;
						if (!this.aBoolean658 && local229) {
							if (local216 == this.anInt3815 * -1966156715) {
								this.method26349(local216);
								this.anInt3815 = 794851075;
							}
							local160.method30092();
							this.aList8.remove(local160);
						} else if (this.anInt3820 * 1867711623 == local216) {
							this.anInt3820 = 1685159625;
							this.aBoolean658 = false;
							local160.method30092();
							this.aList8.remove(local160);
							@Pc(281) Iterator local281 = this.aList6.iterator();
							@Pc(288) Class496 local288;
							@Pc(299) int local299;
							do {
								do {
									if (!local281.hasNext()) {
										continue label162;
									}
									local288 = (Class496) local281.next();
								} while (local288.method30118() != Class239.aClass239_11);
								local299 = local288.method30129().method32165();
							} while ((local299 != this.anInt3815 * -1966156715 || local288.method30110() != Class486.aClass486_7) && local288.method30110() != Class486.aClass486_6 && local288.method30110() != Class486.aClass486_1 && local288.method30110() != Class486.aClass486_4);
							if (local288.method30110() == Class486.aClass486_7) {
								local288.method30105();
							} else {
								local288.method30099();
							}
						} else if (local229) {
							if (!this.aBoolean658 || this.anInt3815 * -1966156715 != local216) {
								local160.method30092();
								this.aList8.remove(local160);
							}
							if (!this.aBoolean658 && local216 == this.anInt3815 * -1966156715) {
								this.anInt3815 = 794851075;
								this.aClass496_5 = null;
							}
						}
					}
				} else if (local160.method30110() != Class486.aClass486_8 && local160.method30120() == Class220.aClass220_9.method25727()) {
					@Pc(443) boolean local443 = this.method26310(Class220.aClass220_9.method25727()) > 1.0E-4F;
					if (!local443) {
						local160.method30100(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "bv", descriptor = "()V", line = 291)
	public void method26276() {
		if (!this.aBoolean656) {
			return;
		}
		Class242.method26014();
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085() != null) {
			if (this.aClass447_60 == null) {
				this.aClass447_60 = new Class447();
			}
			this.aClass447_60.aFloat277 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat277;
			this.aClass447_60.aFloat276 = 0.0F;
			this.aClass447_60.aFloat278 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat278;
		}
		@Pc(41) Iterator local41 = this.aHashMap6.values().iterator();
		@Pc(48) Interface69 local48;
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aHashMap7.values().iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aList7.iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			if (local48.method32149()) {
				this.aHashMap7.remove(local48.method32165());
			} else {
				this.aHashMap6.remove(local48.method32165());
			}
		}
		this.aList7.clear();
		if (this.aClass496_6 != null && this.aClass496_6.method30110() == Class486.aClass486_4 && !this.aBoolean657 && client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(132) Class77_Sub20 local132 = Class365.method28132(Class414.aClass414_48, client.aClass82_2.aClass16_1);
			local132.aClass77_Sub39_Sub1_2.method22417(this.aClass496_6.method30129().method32165());
			client.aClass82_2.method2004(local132);
			this.aBoolean657 = true;
		}
		local41 = this.aList6.iterator();
		while (true) {
			label162: while (true) {
				@Pc(170) Class486 local170;
				@Pc(160) Class496 local160;
				do {
					if (!local41.hasNext()) {
						return;
					}
					local160 = (Class496) local41.next();
					local160.method30152();
					local160.method30109();
					local170 = local160.method30110();
				} while (local160.method30114() != this);
				if (Class486.aClass486_7 == local170 || Class486.aClass486_3 == local170) {
					if (local160.method30118() != Class239.aClass239_11 && local160.method30118() != Class239.aClass239_1) {
						@Pc(382) Iterator local382 = this.aHashMap8.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class258 local397 = (Class258) this.aHashMap8.get(local390);
							if (local397.method26238().contains(local160)) {
								local397.method26236(local160);
								break;
							}
						}
						local160.method30092();
						this.aList8.remove(local160);
					} else if (this.aClass496_6 == local160) {
						this.aBoolean657 = false;
						this.aClass496_6 = null;
						local160.method30092();
						this.aList8.remove(local160);
					} else {
						@Pc(216) int local216 = local160.method30129().method32165();
						@Pc(229) boolean local229 = this.method26310(Class220.aClass220_9.method25727()) > 0.0F;
						if (!this.aBoolean658 && local229) {
							if (local216 == this.anInt3815 * -1966156715) {
								this.method26349(local216);
								this.anInt3815 = 794851075;
							}
							local160.method30092();
							this.aList8.remove(local160);
						} else if (this.anInt3820 * 1867711623 == local216) {
							this.anInt3820 = 1685159625;
							this.aBoolean658 = false;
							local160.method30092();
							this.aList8.remove(local160);
							@Pc(281) Iterator local281 = this.aList6.iterator();
							@Pc(288) Class496 local288;
							@Pc(299) int local299;
							do {
								do {
									if (!local281.hasNext()) {
										continue label162;
									}
									local288 = (Class496) local281.next();
								} while (local288.method30118() != Class239.aClass239_11);
								local299 = local288.method30129().method32165();
							} while ((local299 != this.anInt3815 * -1966156715 || local288.method30110() != Class486.aClass486_7) && local288.method30110() != Class486.aClass486_6 && local288.method30110() != Class486.aClass486_1 && local288.method30110() != Class486.aClass486_4);
							if (local288.method30110() == Class486.aClass486_7) {
								local288.method30105();
							} else {
								local288.method30099();
							}
						} else if (local229) {
							if (!this.aBoolean658 || this.anInt3815 * -1966156715 != local216) {
								local160.method30092();
								this.aList8.remove(local160);
							}
							if (!this.aBoolean658 && local216 == this.anInt3815 * -1966156715) {
								this.anInt3815 = 794851075;
								this.aClass496_5 = null;
							}
						}
					}
				} else if (local160.method30110() != Class486.aClass486_8 && local160.method30120() == Class220.aClass220_9.method25727()) {
					@Pc(443) boolean local443 = this.method26310(Class220.aClass220_9.method25727()) > 1.0E-4F;
					if (!local443) {
						local160.method30100(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "bd", descriptor = "()V", line = 291)
	public void method26277() {
		if (!this.aBoolean656) {
			return;
		}
		Class242.method26014();
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085() != null) {
			if (this.aClass447_60 == null) {
				this.aClass447_60 = new Class447();
			}
			this.aClass447_60.aFloat277 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat277;
			this.aClass447_60.aFloat276 = 0.0F;
			this.aClass447_60.aFloat278 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat278;
		}
		@Pc(41) Iterator local41 = this.aHashMap6.values().iterator();
		@Pc(48) Interface69 local48;
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aHashMap7.values().iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aList7.iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			if (local48.method32149()) {
				this.aHashMap7.remove(local48.method32165());
			} else {
				this.aHashMap6.remove(local48.method32165());
			}
		}
		this.aList7.clear();
		if (this.aClass496_6 != null && this.aClass496_6.method30110() == Class486.aClass486_4 && !this.aBoolean657 && client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(132) Class77_Sub20 local132 = Class365.method28132(Class414.aClass414_48, client.aClass82_2.aClass16_1);
			local132.aClass77_Sub39_Sub1_2.method22417(this.aClass496_6.method30129().method32165());
			client.aClass82_2.method2004(local132);
			this.aBoolean657 = true;
		}
		local41 = this.aList6.iterator();
		while (true) {
			label162: while (true) {
				@Pc(170) Class486 local170;
				@Pc(160) Class496 local160;
				do {
					if (!local41.hasNext()) {
						return;
					}
					local160 = (Class496) local41.next();
					local160.method30152();
					local160.method30109();
					local170 = local160.method30110();
				} while (local160.method30114() != this);
				if (Class486.aClass486_7 == local170 || Class486.aClass486_3 == local170) {
					if (local160.method30118() != Class239.aClass239_11 && local160.method30118() != Class239.aClass239_1) {
						@Pc(382) Iterator local382 = this.aHashMap8.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class258 local397 = (Class258) this.aHashMap8.get(local390);
							if (local397.method26238().contains(local160)) {
								local397.method26236(local160);
								break;
							}
						}
						local160.method30092();
						this.aList8.remove(local160);
					} else if (this.aClass496_6 == local160) {
						this.aBoolean657 = false;
						this.aClass496_6 = null;
						local160.method30092();
						this.aList8.remove(local160);
					} else {
						@Pc(216) int local216 = local160.method30129().method32165();
						@Pc(229) boolean local229 = this.method26310(Class220.aClass220_9.method25727()) > 0.0F;
						if (!this.aBoolean658 && local229) {
							if (local216 == this.anInt3815 * -1966156715) {
								this.method26349(local216);
								this.anInt3815 = 794851075;
							}
							local160.method30092();
							this.aList8.remove(local160);
						} else if (this.anInt3820 * 1867711623 == local216) {
							this.anInt3820 = 1685159625;
							this.aBoolean658 = false;
							local160.method30092();
							this.aList8.remove(local160);
							@Pc(281) Iterator local281 = this.aList6.iterator();
							@Pc(288) Class496 local288;
							@Pc(299) int local299;
							do {
								do {
									if (!local281.hasNext()) {
										continue label162;
									}
									local288 = (Class496) local281.next();
								} while (local288.method30118() != Class239.aClass239_11);
								local299 = local288.method30129().method32165();
							} while ((local299 != this.anInt3815 * -1966156715 || local288.method30110() != Class486.aClass486_7) && local288.method30110() != Class486.aClass486_6 && local288.method30110() != Class486.aClass486_1 && local288.method30110() != Class486.aClass486_4);
							if (local288.method30110() == Class486.aClass486_7) {
								local288.method30105();
							} else {
								local288.method30099();
							}
						} else if (local229) {
							if (!this.aBoolean658 || this.anInt3815 * -1966156715 != local216) {
								local160.method30092();
								this.aList8.remove(local160);
							}
							if (!this.aBoolean658 && local216 == this.anInt3815 * -1966156715) {
								this.anInt3815 = 794851075;
								this.aClass496_5 = null;
							}
						}
					}
				} else if (local160.method30110() != Class486.aClass486_8 && local160.method30120() == Class220.aClass220_9.method25727()) {
					@Pc(443) boolean local443 = this.method26310(Class220.aClass220_9.method25727()) > 1.0E-4F;
					if (!local443) {
						local160.method30100(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "bb", descriptor = "()V", line = 291)
	public void method26278() {
		if (!this.aBoolean656) {
			return;
		}
		Class242.method26014();
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085() != null) {
			if (this.aClass447_60 == null) {
				this.aClass447_60 = new Class447();
			}
			this.aClass447_60.aFloat277 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat277;
			this.aClass447_60.aFloat276 = 0.0F;
			this.aClass447_60.aFloat278 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat278;
		}
		@Pc(41) Iterator local41 = this.aHashMap6.values().iterator();
		@Pc(48) Interface69 local48;
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aHashMap7.values().iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aList7.iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			if (local48.method32149()) {
				this.aHashMap7.remove(local48.method32165());
			} else {
				this.aHashMap6.remove(local48.method32165());
			}
		}
		this.aList7.clear();
		if (this.aClass496_6 != null && this.aClass496_6.method30110() == Class486.aClass486_4 && !this.aBoolean657 && client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(132) Class77_Sub20 local132 = Class365.method28132(Class414.aClass414_48, client.aClass82_2.aClass16_1);
			local132.aClass77_Sub39_Sub1_2.method22417(this.aClass496_6.method30129().method32165());
			client.aClass82_2.method2004(local132);
			this.aBoolean657 = true;
		}
		local41 = this.aList6.iterator();
		while (true) {
			label162: while (true) {
				@Pc(170) Class486 local170;
				@Pc(160) Class496 local160;
				do {
					if (!local41.hasNext()) {
						return;
					}
					local160 = (Class496) local41.next();
					local160.method30152();
					local160.method30109();
					local170 = local160.method30110();
				} while (local160.method30114() != this);
				if (Class486.aClass486_7 == local170 || Class486.aClass486_3 == local170) {
					if (local160.method30118() != Class239.aClass239_11 && local160.method30118() != Class239.aClass239_1) {
						@Pc(382) Iterator local382 = this.aHashMap8.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class258 local397 = (Class258) this.aHashMap8.get(local390);
							if (local397.method26238().contains(local160)) {
								local397.method26236(local160);
								break;
							}
						}
						local160.method30092();
						this.aList8.remove(local160);
					} else if (this.aClass496_6 == local160) {
						this.aBoolean657 = false;
						this.aClass496_6 = null;
						local160.method30092();
						this.aList8.remove(local160);
					} else {
						@Pc(216) int local216 = local160.method30129().method32165();
						@Pc(229) boolean local229 = this.method26310(Class220.aClass220_9.method25727()) > 0.0F;
						if (!this.aBoolean658 && local229) {
							if (local216 == this.anInt3815 * -1966156715) {
								this.method26349(local216);
								this.anInt3815 = 794851075;
							}
							local160.method30092();
							this.aList8.remove(local160);
						} else if (this.anInt3820 * 1867711623 == local216) {
							this.anInt3820 = 1685159625;
							this.aBoolean658 = false;
							local160.method30092();
							this.aList8.remove(local160);
							@Pc(281) Iterator local281 = this.aList6.iterator();
							@Pc(288) Class496 local288;
							@Pc(299) int local299;
							do {
								do {
									if (!local281.hasNext()) {
										continue label162;
									}
									local288 = (Class496) local281.next();
								} while (local288.method30118() != Class239.aClass239_11);
								local299 = local288.method30129().method32165();
							} while ((local299 != this.anInt3815 * -1966156715 || local288.method30110() != Class486.aClass486_7) && local288.method30110() != Class486.aClass486_6 && local288.method30110() != Class486.aClass486_1 && local288.method30110() != Class486.aClass486_4);
							if (local288.method30110() == Class486.aClass486_7) {
								local288.method30105();
							} else {
								local288.method30099();
							}
						} else if (local229) {
							if (!this.aBoolean658 || this.anInt3815 * -1966156715 != local216) {
								local160.method30092();
								this.aList8.remove(local160);
							}
							if (!this.aBoolean658 && local216 == this.anInt3815 * -1966156715) {
								this.anInt3815 = 794851075;
								this.aClass496_5 = null;
							}
						}
					}
				} else if (local160.method30110() != Class486.aClass486_8 && local160.method30120() == Class220.aClass220_9.method25727()) {
					@Pc(443) boolean local443 = this.method26310(Class220.aClass220_9.method25727()) > 1.0E-4F;
					if (!local443) {
						local160.method30100(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "bl", descriptor = "()V", line = 291)
	public void method26279() {
		if (!this.aBoolean656) {
			return;
		}
		Class242.method26014();
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085() != null) {
			if (this.aClass447_60 == null) {
				this.aClass447_60 = new Class447();
			}
			this.aClass447_60.aFloat277 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat277;
			this.aClass447_60.aFloat276 = 0.0F;
			this.aClass447_60.aFloat278 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61.aFloat278;
		}
		@Pc(41) Iterator local41 = this.aHashMap6.values().iterator();
		@Pc(48) Interface69 local48;
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aHashMap7.values().iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			local48.method32150();
		}
		local41 = this.aList7.iterator();
		while (local41.hasNext()) {
			local48 = (Interface69) local41.next();
			if (local48.method32149()) {
				this.aHashMap7.remove(local48.method32165());
			} else {
				this.aHashMap6.remove(local48.method32165());
			}
		}
		this.aList7.clear();
		if (this.aClass496_6 != null && this.aClass496_6.method30110() == Class486.aClass486_4 && !this.aBoolean657 && client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(132) Class77_Sub20 local132 = Class365.method28132(Class414.aClass414_48, client.aClass82_2.aClass16_1);
			local132.aClass77_Sub39_Sub1_2.method22417(this.aClass496_6.method30129().method32165());
			client.aClass82_2.method2004(local132);
			this.aBoolean657 = true;
		}
		local41 = this.aList6.iterator();
		while (true) {
			label162: while (true) {
				@Pc(170) Class486 local170;
				@Pc(160) Class496 local160;
				do {
					if (!local41.hasNext()) {
						return;
					}
					local160 = (Class496) local41.next();
					local160.method30152();
					local160.method30109();
					local170 = local160.method30110();
				} while (local160.method30114() != this);
				if (Class486.aClass486_7 == local170 || Class486.aClass486_3 == local170) {
					if (local160.method30118() != Class239.aClass239_11 && local160.method30118() != Class239.aClass239_1) {
						@Pc(382) Iterator local382 = this.aHashMap8.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class258 local397 = (Class258) this.aHashMap8.get(local390);
							if (local397.method26238().contains(local160)) {
								local397.method26236(local160);
								break;
							}
						}
						local160.method30092();
						this.aList8.remove(local160);
					} else if (this.aClass496_6 == local160) {
						this.aBoolean657 = false;
						this.aClass496_6 = null;
						local160.method30092();
						this.aList8.remove(local160);
					} else {
						@Pc(216) int local216 = local160.method30129().method32165();
						@Pc(229) boolean local229 = this.method26310(Class220.aClass220_9.method25727()) > 0.0F;
						if (!this.aBoolean658 && local229) {
							if (local216 == this.anInt3815 * -1966156715) {
								this.method26349(local216);
								this.anInt3815 = 794851075;
							}
							local160.method30092();
							this.aList8.remove(local160);
						} else if (this.anInt3820 * 1867711623 == local216) {
							this.anInt3820 = 1685159625;
							this.aBoolean658 = false;
							local160.method30092();
							this.aList8.remove(local160);
							@Pc(281) Iterator local281 = this.aList6.iterator();
							@Pc(288) Class496 local288;
							@Pc(299) int local299;
							do {
								do {
									if (!local281.hasNext()) {
										continue label162;
									}
									local288 = (Class496) local281.next();
								} while (local288.method30118() != Class239.aClass239_11);
								local299 = local288.method30129().method32165();
							} while ((local299 != this.anInt3815 * -1966156715 || local288.method30110() != Class486.aClass486_7) && local288.method30110() != Class486.aClass486_6 && local288.method30110() != Class486.aClass486_1 && local288.method30110() != Class486.aClass486_4);
							if (local288.method30110() == Class486.aClass486_7) {
								local288.method30105();
							} else {
								local288.method30099();
							}
						} else if (local229) {
							if (!this.aBoolean658 || this.anInt3815 * -1966156715 != local216) {
								local160.method30092();
								this.aList8.remove(local160);
							}
							if (!this.aBoolean658 && local216 == this.anInt3815 * -1966156715) {
								this.anInt3815 = 794851075;
								this.aClass496_5 = null;
							}
						}
					}
				} else if (local160.method30110() != Class486.aClass486_8 && local160.method30120() == Class220.aClass220_9.method25727()) {
					@Pc(443) boolean local443 = this.method26310(Class220.aClass220_9.method25727()) > 1.0E-4F;
					if (!local443) {
						local160.method30100(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "(ZI)V", line = 341)
	public static void method26280() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 0);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 1);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!fw", name = "q", descriptor = "(I)V", line = 411)
	public void method26281() {
		Class498.method30184();
	}

	@OriginalMember(owner = "client!fw", name = "bi", descriptor = "()V", line = 411)
	public void method26282() {
		Class498.method30184();
	}

	@OriginalMember(owner = "client!fw", name = "by", descriptor = "()V", line = 411)
	public void method26283() {
		Class498.method30184();
	}

	@OriginalMember(owner = "client!fw", name = "bx", descriptor = "()V", line = 411)
	public void method26284() {
		Class498.method30184();
	}

	@OriginalMember(owner = "client!fw", name = "bw", descriptor = "()V", line = 411)
	public void method26285() {
		Class498.method30184();
	}

	@OriginalMember(owner = "client!fw", name = "x", descriptor = "(Lclient!qs;III)V", line = 415)
	public void method26286(@OriginalArg(0) Class496 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(10) Class258 local10 = (Class258) this.aHashMap8.get(arg1);
		if (local10 == null) {
			local10 = new Class258(this);
			this.aHashMap8.put(arg1, local10);
		}
		if (!local10.method26241(arg0)) {
			arg0.method30148(arg2, true);
			local10.method26233(arg0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "bs", descriptor = "(Lclient!qs;II)V", line = 415)
	public void method26287(@OriginalArg(0) Class496 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(10) Class258 local10 = (Class258) this.aHashMap8.get(arg1);
		if (local10 == null) {
			local10 = new Class258(this);
			this.aHashMap8.put(arg1, local10);
		}
		if (!local10.method26241(arg0)) {
			arg0.method30148(arg2, true);
			local10.method26233(arg0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "bg", descriptor = "(Lclient!qs;II)V", line = 415)
	public void method26288(@OriginalArg(0) Class496 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(10) Class258 local10 = (Class258) this.aHashMap8.get(arg1);
		if (local10 == null) {
			local10 = new Class258(this);
			this.aHashMap8.put(arg1, local10);
		}
		if (!local10.method26241(arg0)) {
			arg0.method30148(arg2, true);
			local10.method26233(arg0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "bt", descriptor = "(Lclient!qs;II)V", line = 415)
	public void method26289(@OriginalArg(0) Class496 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(10) Class258 local10 = (Class258) this.aHashMap8.get(arg1);
		if (local10 == null) {
			local10 = new Class258(this);
			this.aHashMap8.put(arg1, local10);
		}
		if (!local10.method26241(arg0)) {
			arg0.method30148(arg2, true);
			local10.method26233(arg0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "(IB)V", line = 428)
	public void method26290(@OriginalArg(0) int arg0) {
		@Pc(6) Class258 local6 = (Class258) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26238();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class496 local24 = (Class496) local17.next();
			if (!local24.method30150()) {
				local24.method30099();
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "bz", descriptor = "(I)V", line = 428)
	public void method26291(@OriginalArg(0) int arg0) {
		@Pc(6) Class258 local6 = (Class258) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26238();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class496 local24 = (Class496) local17.next();
			if (!local24.method30150()) {
				local24.method30099();
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "s", descriptor = "(II)V", line = 442)
	public void method26292(@OriginalArg(0) int arg0) {
		@Pc(6) Class258 local6 = (Class258) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26238();
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class496 local23 = (Class496) local16.next();
			local23.method30100(50);
		}
	}

	@OriginalMember(owner = "client!fw", name = "bf", descriptor = "(I)V", line = 442)
	public void method26293(@OriginalArg(0) int arg0) {
		@Pc(6) Class258 local6 = (Class258) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26238();
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class496 local23 = (Class496) local16.next();
			local23.method30100(50);
		}
	}

	@OriginalMember(owner = "client!fw", name = "bu", descriptor = "(I)V", line = 442)
	public void method26294(@OriginalArg(0) int arg0) {
		@Pc(6) Class258 local6 = (Class258) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26238();
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class496 local23 = (Class496) local16.next();
			local23.method30100(50);
		}
	}

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "(II)V", line = 456)
	public void method26295(@OriginalArg(0) int arg0) {
		@Pc(6) Class258 local6 = (Class258) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26238();
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class496 local23 = (Class496) local16.next();
			local23.method30093();
		}
	}

	@OriginalMember(owner = "client!fw", name = "bn", descriptor = "(I)V", line = 456)
	public void method26296(@OriginalArg(0) int arg0) {
		@Pc(6) Class258 local6 = (Class258) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26238();
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class496 local23 = (Class496) local16.next();
			local23.method30093();
		}
	}

	@OriginalMember(owner = "client!fw", name = "bp", descriptor = "(I)V", line = 456)
	public void method26297(@OriginalArg(0) int arg0) {
		@Pc(6) Class258 local6 = (Class258) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26238();
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class496 local23 = (Class496) local16.next();
			local23.method30093();
		}
	}

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)V", line = 470)
	void method26298() {
		@Pc(4) Class227 local4 = new Class227(this);
		@Pc(9) Class260 local9 = new Class260(this);
		@Pc(14) Class251 local14 = new Class251(this);
		@Pc(19) Class250 local19 = new Class250(this);
		@Pc(24) Class252 local24 = new Class252(this);
		Class617.method32381(Class228.aClass228_4.method25803(), Class228.aClass228_2.method25803(), 0.2F, local4);
		Class617.method32381(Class228.aClass228_3.method25803(), Class228.aClass228_2.method25803(), 1.0F, local9);
		Class617.method32381(Class228.aClass228_1.method25803(), Class228.aClass228_2.method25803(), 1.0F, local14);
		Class617.method32381(Class228.aClass228_5.method25803(), Class228.aClass228_2.method25803(), 0.8F, local19);
		Class617.method32381(Class228.aClass228_6.method25803(), Class228.aClass228_2.method25803(), 1.0F, local24);
		Class617.method32381(Class220.aClass220_9.method25727(), Class228.aClass228_3.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_2.method25727(), Class228.aClass228_6.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_8.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_3.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_4.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_5.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_6.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_7.method25727(), Class228.aClass228_5.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_10.method25727(), Class220.aClass220_7.method25727(), 1.0F, null);
		Class617.method32381(Class220.aClass220_1.method25727(), Class220.aClass220_7.method25727(), 1.0F, null);
		Class657.method33049(Class220.aClass220_9.method25727()).method28470(0.75F);
	}

	@OriginalMember(owner = "client!fw", name = "bk", descriptor = "()V", line = 470)
	void method26299() {
		@Pc(4) Class227 local4 = new Class227(this);
		@Pc(9) Class260 local9 = new Class260(this);
		@Pc(14) Class251 local14 = new Class251(this);
		@Pc(19) Class250 local19 = new Class250(this);
		@Pc(24) Class252 local24 = new Class252(this);
		Class617.method32381(Class228.aClass228_4.method25803(), Class228.aClass228_2.method25803(), 0.2F, local4);
		Class617.method32381(Class228.aClass228_3.method25803(), Class228.aClass228_2.method25803(), 1.0F, local9);
		Class617.method32381(Class228.aClass228_1.method25803(), Class228.aClass228_2.method25803(), 1.0F, local14);
		Class617.method32381(Class228.aClass228_5.method25803(), Class228.aClass228_2.method25803(), 0.8F, local19);
		Class617.method32381(Class228.aClass228_6.method25803(), Class228.aClass228_2.method25803(), 1.0F, local24);
		Class617.method32381(Class220.aClass220_9.method25727(), Class228.aClass228_3.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_2.method25727(), Class228.aClass228_6.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_8.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_3.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_4.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_5.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_6.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_7.method25727(), Class228.aClass228_5.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_10.method25727(), Class220.aClass220_7.method25727(), 1.0F, null);
		Class617.method32381(Class220.aClass220_1.method25727(), Class220.aClass220_7.method25727(), 1.0F, null);
		Class657.method33049(Class220.aClass220_9.method25727()).method28470(0.75F);
	}

	@OriginalMember(owner = "client!fw", name = "bo", descriptor = "()V", line = 470)
	void method26300() {
		@Pc(4) Class227 local4 = new Class227(this);
		@Pc(9) Class260 local9 = new Class260(this);
		@Pc(14) Class251 local14 = new Class251(this);
		@Pc(19) Class250 local19 = new Class250(this);
		@Pc(24) Class252 local24 = new Class252(this);
		Class617.method32381(Class228.aClass228_4.method25803(), Class228.aClass228_2.method25803(), 0.2F, local4);
		Class617.method32381(Class228.aClass228_3.method25803(), Class228.aClass228_2.method25803(), 1.0F, local9);
		Class617.method32381(Class228.aClass228_1.method25803(), Class228.aClass228_2.method25803(), 1.0F, local14);
		Class617.method32381(Class228.aClass228_5.method25803(), Class228.aClass228_2.method25803(), 0.8F, local19);
		Class617.method32381(Class228.aClass228_6.method25803(), Class228.aClass228_2.method25803(), 1.0F, local24);
		Class617.method32381(Class220.aClass220_9.method25727(), Class228.aClass228_3.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_2.method25727(), Class228.aClass228_6.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_8.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_3.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_4.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_5.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_6.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_7.method25727(), Class228.aClass228_5.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_10.method25727(), Class220.aClass220_7.method25727(), 1.0F, null);
		Class617.method32381(Class220.aClass220_1.method25727(), Class220.aClass220_7.method25727(), 1.0F, null);
		Class657.method33049(Class220.aClass220_9.method25727()).method28470(0.75F);
	}

	@OriginalMember(owner = "client!fw", name = "br", descriptor = "()V", line = 470)
	void method26301() {
		@Pc(4) Class227 local4 = new Class227(this);
		@Pc(9) Class260 local9 = new Class260(this);
		@Pc(14) Class251 local14 = new Class251(this);
		@Pc(19) Class250 local19 = new Class250(this);
		@Pc(24) Class252 local24 = new Class252(this);
		Class617.method32381(Class228.aClass228_4.method25803(), Class228.aClass228_2.method25803(), 0.2F, local4);
		Class617.method32381(Class228.aClass228_3.method25803(), Class228.aClass228_2.method25803(), 1.0F, local9);
		Class617.method32381(Class228.aClass228_1.method25803(), Class228.aClass228_2.method25803(), 1.0F, local14);
		Class617.method32381(Class228.aClass228_5.method25803(), Class228.aClass228_2.method25803(), 0.8F, local19);
		Class617.method32381(Class228.aClass228_6.method25803(), Class228.aClass228_2.method25803(), 1.0F, local24);
		Class617.method32381(Class220.aClass220_9.method25727(), Class228.aClass228_3.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_2.method25727(), Class228.aClass228_6.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_8.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_3.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_4.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_5.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_6.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_7.method25727(), Class228.aClass228_5.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_10.method25727(), Class220.aClass220_7.method25727(), 1.0F, null);
		Class617.method32381(Class220.aClass220_1.method25727(), Class220.aClass220_7.method25727(), 1.0F, null);
		Class657.method33049(Class220.aClass220_9.method25727()).method28470(0.75F);
	}

	@OriginalMember(owner = "client!fw", name = "bm", descriptor = "()V", line = 470)
	void method26302() {
		@Pc(4) Class227 local4 = new Class227(this);
		@Pc(9) Class260 local9 = new Class260(this);
		@Pc(14) Class251 local14 = new Class251(this);
		@Pc(19) Class250 local19 = new Class250(this);
		@Pc(24) Class252 local24 = new Class252(this);
		Class617.method32381(Class228.aClass228_4.method25803(), Class228.aClass228_2.method25803(), 0.2F, local4);
		Class617.method32381(Class228.aClass228_3.method25803(), Class228.aClass228_2.method25803(), 1.0F, local9);
		Class617.method32381(Class228.aClass228_1.method25803(), Class228.aClass228_2.method25803(), 1.0F, local14);
		Class617.method32381(Class228.aClass228_5.method25803(), Class228.aClass228_2.method25803(), 0.8F, local19);
		Class617.method32381(Class228.aClass228_6.method25803(), Class228.aClass228_2.method25803(), 1.0F, local24);
		Class617.method32381(Class220.aClass220_9.method25727(), Class228.aClass228_3.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_2.method25727(), Class228.aClass228_6.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_8.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_3.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_4.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_5.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_6.method25727(), Class228.aClass228_4.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_7.method25727(), Class228.aClass228_5.method25803(), 1.0F, null);
		Class617.method32381(Class220.aClass220_10.method25727(), Class220.aClass220_7.method25727(), 1.0F, null);
		Class617.method32381(Class220.aClass220_1.method25727(), Class220.aClass220_7.method25727(), 1.0F, null);
		Class657.method33049(Class220.aClass220_9.method25727()).method28470(0.75F);
	}

	@OriginalMember(owner = "client!fw", name = "z", descriptor = "(IIII)V", line = 514)
	public void method26303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class228.aClass228_2.method25803();
		if (Class657.method33049(arg0) == null && (local3 == arg1 || Class657.method33049(arg1) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class617.method32381(arg0, arg1 == local3 ? -1 : arg1, local20, null);
		}
	}

	@OriginalMember(owner = "client!fw", name = "bq", descriptor = "(III)V", line = 514)
	public void method26304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class228.aClass228_2.method25803();
		if (Class657.method33049(arg0) == null && (local3 == arg1 || Class657.method33049(arg1) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class617.method32381(arg0, arg1 == local3 ? -1 : arg1, local20, null);
		}
	}

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "(III)V", line = 523)
	public void method26305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class399 local3 = Class657.method33049(arg0);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28470(local11);
		}
	}

	@OriginalMember(owner = "client!fw", name = "cg", descriptor = "(II)V", line = 523)
	public void method26306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class399 local3 = Class657.method33049(arg0);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28470(local11);
		}
	}

	@OriginalMember(owner = "client!fw", name = "bh", descriptor = "(II)V", line = 523)
	public void method26307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class399 local3 = Class657.method33049(arg0);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28470(local11);
		}
	}

	@OriginalMember(owner = "client!fw", name = "be", descriptor = "(II)V", line = 523)
	public void method26308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class399 local3 = Class657.method33049(arg0);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28470(local11);
		}
	}

	@OriginalMember(owner = "client!fw", name = "cb", descriptor = "(II)V", line = 523)
	public void method26309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class399 local3 = Class657.method33049(arg0);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28470(local11);
		}
	}

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "(II)F", line = 531)
	float method26310(@OriginalArg(0) int arg0) {
		@Pc(3) Class399 local3 = Class657.method33049(arg0);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method28469();
			local3 = local3.method28474();
		}
		return local5;
	}

	@OriginalMember(owner = "client!fw", name = "cc", descriptor = "(I)F", line = 531)
	float method26311(@OriginalArg(0) int arg0) {
		@Pc(3) Class399 local3 = Class657.method33049(arg0);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method28469();
			local3 = local3.method28474();
		}
		return local5;
	}

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "(IB)V", line = 541)
	public void method26312(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList8.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class496 local10 = (Class496) local3.next();
			@Pc(14) int local14 = local10.method30120();
			@Pc(19) boolean local19 = Class108.method9022(local14, arg0);
			if (local19) {
				local10.method30100(50);
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "cf", descriptor = "([I)V", line = 553)
	void method26313(@OriginalArg(0) int[] arg0) {
		if (!this.aBoolean656 || arg0 == null) {
			return;
		}
		@Pc(8) int[] local8 = arg0;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) int local18 = local8[local10];
			this.method26315(local18);
		}
	}

	@OriginalMember(owner = "client!fw", name = "u", descriptor = "([II)V", line = 553)
	void method26314(@OriginalArg(0) int[] arg0) {
		if (!this.aBoolean656 || arg0 == null) {
			return;
		}
		@Pc(8) int[] local8 = arg0;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) int local18 = local8[local10];
			this.method26315(local18);
		}
	}

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "(II)V", line = 567)
	public void method26315(@OriginalArg(0) int arg0) {
		if (this.aBoolean656 && arg0 >= 0) {
			this.method26322(arg0, false);
		}
	}

	@OriginalMember(owner = "client!fw", name = "cl", descriptor = "(I)V", line = 567)
	public void method26316(@OriginalArg(0) int arg0) {
		if (this.aBoolean656 && arg0 >= 0) {
			this.method26322(arg0, false);
		}
	}

	@OriginalMember(owner = "client!fw", name = "cp", descriptor = "(I)V", line = 567)
	public void method26317(@OriginalArg(0) int arg0) {
		if (this.aBoolean656 && arg0 >= 0) {
			this.method26322(arg0, false);
		}
	}

	@OriginalMember(owner = "client!fw", name = "ck", descriptor = "(IZ)Lclient!vg;", line = 573)
	Interface69 method26318(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean656) {
			return null;
		}
		@Pc(19) Interface69 local19 = (Interface69) (arg1 ? this.aClass232_68.method25835((long) arg0) : this.aClass232_70.method25835((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface69) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface69) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "(IZI)Lclient!vg;", line = 573)
	Interface69 method26319(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean656) {
			return null;
		}
		@Pc(19) Interface69 local19 = (Interface69) (arg1 ? this.aClass232_68.method25835((long) arg0) : this.aClass232_70.method25835((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface69) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface69) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fw", name = "cw", descriptor = "(IZ)Lclient!vg;", line = 573)
	Interface69 method26320(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean656) {
			return null;
		}
		@Pc(19) Interface69 local19 = (Interface69) (arg1 ? this.aClass232_68.method25835((long) arg0) : this.aClass232_70.method25835((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface69) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface69) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fw", name = "cz", descriptor = "(IZ)Lclient!vg;", line = 583)
	Interface69 method26321(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean656) {
			return null;
		}
		@Pc(10) Interface69 local10 = this.method26319(arg0, arg1);
		if (local10 == null) {
			@Pc(18) Class244 local18 = new Class244(this);
			local10 = Class256.method26213(arg1 ? Class569.aClass478_130 : Class146_Sub1.aClass478_48, arg0, local18, arg1, this.aClass232_69);
			if (arg1) {
				this.aHashMap7.put(arg0, local10);
			} else {
				this.aHashMap6.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!fw", name = "o", descriptor = "(IZI)Lclient!vg;", line = 583)
	Interface69 method26322(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean656) {
			return null;
		}
		@Pc(10) Interface69 local10 = this.method26319(arg0, arg1);
		if (local10 == null) {
			@Pc(18) Class244 local18 = new Class244(this);
			local10 = Class256.method26213(arg1 ? Class569.aClass478_130 : Class146_Sub1.aClass478_48, arg0, local18, arg1, this.aClass232_69);
			if (arg1) {
				this.aHashMap7.put(arg0, local10);
			} else {
				this.aHashMap6.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!fw", name = "ch", descriptor = "(IZ)Lclient!vg;", line = 583)
	Interface69 method26323(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean656) {
			return null;
		}
		@Pc(10) Interface69 local10 = this.method26319(arg0, arg1);
		if (local10 == null) {
			@Pc(18) Class244 local18 = new Class244(this);
			local10 = Class256.method26213(arg1 ? Class569.aClass478_130 : Class146_Sub1.aClass478_48, arg0, local18, arg1, this.aClass232_69);
			if (arg1) {
				this.aHashMap7.put(arg0, local10);
			} else {
				this.aHashMap6.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lclient!vg;B)Lclient!qs;", line = 610)
	Class496 method26324(@OriginalArg(0) Interface69 arg0) {
		if (!this.aBoolean656) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList6.iterator();
		@Pc(17) Class496 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3817 * 834069887) {
					return null;
				}
				@Pc(42) Class496 local42 = arg0.method32147();
				this.aList6.add(local42);
				return local42;
			}
			local17 = (Class496) local10.next();
			local6++;
		} while (local17.method30110() != Class486.aClass486_10);
		local17.method30090(arg0);
		return local17;
	}

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "(Lclient!qs;I)V", line = 631)
	public void method26325(@OriginalArg(0) Class496 arg0) {
		arg0.method30112(this);
		this.aList8.add(arg0);
	}

	@OriginalMember(owner = "client!fw", name = "ca", descriptor = "(Lclient!qs;)V", line = 631)
	public void method26326(@OriginalArg(0) Class496 arg0) {
		arg0.method30112(this);
		this.aList8.add(arg0);
	}

	@OriginalMember(owner = "client!fw", name = "cr", descriptor = "(Lclient!qs;)V", line = 631)
	public void method26327(@OriginalArg(0) Class496 arg0) {
		arg0.method30112(this);
		this.aList8.add(arg0);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!oo;Lclient!oo;FI)Z", line = 636)
	boolean method26328(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class447 local3 = Class447.method29160(arg1, arg0);
		return !(local3.method29170() >= arg2);
	}

	@OriginalMember(owner = "client!fw", name = "ct", descriptor = "(Lclient!oo;Lclient!oo;F)Z", line = 636)
	boolean method26329(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class447 local3 = Class447.method29160(arg1, arg0);
		return !(local3.method29170() >= arg2);
	}

	@OriginalMember(owner = "client!fw", name = "cx", descriptor = "(Lclient!oo;Lclient!oo;F)Z", line = 636)
	boolean method26330(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class447 local3 = Class447.method29160(arg1, arg0);
		return !(local3.method29170() >= arg2);
	}

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "(Lclient!ez;Ljava/lang/Object;IIIILclient!ev;FFLclient!oo;IIZI)Lclient!qs;", line = 642)
	public Class496 method26331(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class235 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class447 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		if (!this.aBoolean656) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(14) int local14 = Math.max(0, Math.min(arg4, 255));
			arg11 = Math.max(0, arg11);
			if (Class235.aClass235_2 != arg6 && !this.method26328(this.aClass447_60, arg9, arg8)) {
				return null;
			}
			if (arg11 <= 0) {
				arg11 = 255;
			}
			@Pc(40) float local40 = (float) local14 / 255.0F;
			@Pc(45) float local45 = (float) arg11 / 255.0F;
			@Pc(51) Interface69 local51 = this.method26322(arg2, arg12);
			@Pc(56) Class496 local56 = this.method26324(local51);
			if (local56 == null) {
				return null;
			}
			local56.method30112(arg1);
			local56.method30123(arg5);
			if (Class235.aClass235_2 != arg6) {
				local56.method30126();
				local56.method30131(arg9);
				local56.method30143(arg7);
				local56.method30144(arg8);
				if (Class235.aClass235_1 == arg6) {
					local56.method30107(this.anInterface57_3);
				} else if (arg6 == Class235.aClass235_4) {
					local56.method30107(this.anInterface57_2);
				} else if (Class235.aClass235_3 == arg6) {
					local56.method30107(this.anInterface57_1);
				} else if (arg6 == Class235.aClass235_5) {
					local56.method30107(this.anInterface57_4);
				} else {
					local56.method30126();
				}
			}
			local56.method30155(local40, 0);
			local56.method30158(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local56.method30160(local45);
			local56.method30117(arg0);
			return local56;
		}
	}

	@OriginalMember(owner = "client!fw", name = "cm", descriptor = "(Lclient!ez;Ljava/lang/Object;IIIILclient!ev;FFLclient!oo;IIZ)Lclient!qs;", line = 642)
	public Class496 method26332(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class235 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class447 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!this.aBoolean656) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(14) int local14 = Math.max(0, Math.min(arg4, 255));
			arg10 = Math.max(0, arg10);
			if (Class235.aClass235_2 != arg6 && !this.method26328(this.aClass447_60, arg9, arg8)) {
				return null;
			}
			if (arg10 <= 0) {
				arg10 = 255;
			}
			@Pc(40) float local40 = (float) local14 / 255.0F;
			@Pc(45) float local45 = (float) arg10 / 255.0F;
			@Pc(51) Interface69 local51 = this.method26322(arg2, arg11);
			@Pc(56) Class496 local56 = this.method26324(local51);
			if (local56 == null) {
				return null;
			}
			local56.method30112(arg1);
			local56.method30123(arg5);
			if (Class235.aClass235_2 != arg6) {
				local56.method30126();
				local56.method30131(arg9);
				local56.method30143(arg7);
				local56.method30144(arg8);
				if (Class235.aClass235_1 == arg6) {
					local56.method30107(this.anInterface57_3);
				} else if (arg6 == Class235.aClass235_4) {
					local56.method30107(this.anInterface57_2);
				} else if (Class235.aClass235_3 == arg6) {
					local56.method30107(this.anInterface57_1);
				} else if (arg6 == Class235.aClass235_5) {
					local56.method30107(this.anInterface57_4);
				} else {
					local56.method30126();
				}
			}
			local56.method30155(local40, 0);
			local56.method30158(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local56.method30160(local45);
			local56.method30117(arg0);
			return local56;
		}
	}

	@OriginalMember(owner = "client!fw", name = "cv", descriptor = "(Lclient!ez;Ljava/lang/Object;IIIILclient!ev;FFLclient!oo;IIZ)Lclient!qs;", line = 642)
	public Class496 method26333(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class235 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class447 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!this.aBoolean656) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(14) int local14 = Math.max(0, Math.min(arg4, 255));
			arg10 = Math.max(0, arg10);
			if (Class235.aClass235_2 != arg6 && !this.method26328(this.aClass447_60, arg9, arg8)) {
				return null;
			}
			if (arg10 <= 0) {
				arg10 = 255;
			}
			@Pc(40) float local40 = (float) local14 / 255.0F;
			@Pc(45) float local45 = (float) arg10 / 255.0F;
			@Pc(51) Interface69 local51 = this.method26322(arg2, arg11);
			@Pc(56) Class496 local56 = this.method26324(local51);
			if (local56 == null) {
				return null;
			}
			local56.method30112(arg1);
			local56.method30123(arg5);
			if (Class235.aClass235_2 != arg6) {
				local56.method30126();
				local56.method30131(arg9);
				local56.method30143(arg7);
				local56.method30144(arg8);
				if (Class235.aClass235_1 == arg6) {
					local56.method30107(this.anInterface57_3);
				} else if (arg6 == Class235.aClass235_4) {
					local56.method30107(this.anInterface57_2);
				} else if (Class235.aClass235_3 == arg6) {
					local56.method30107(this.anInterface57_1);
				} else if (arg6 == Class235.aClass235_5) {
					local56.method30107(this.anInterface57_4);
				} else {
					local56.method30126();
				}
			}
			local56.method30155(local40, 0);
			local56.method30158(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local56.method30160(local45);
			local56.method30117(arg0);
			return local56;
		}
	}

	@OriginalMember(owner = "client!fw", name = "cu", descriptor = "(Lclient!ez;Ljava/lang/Object;IIIILclient!ev;FFLclient!oo;IIZ)Lclient!qs;", line = 642)
	public Class496 method26334(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class235 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class447 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!this.aBoolean656) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(14) int local14 = Math.max(0, Math.min(arg4, 255));
			arg10 = Math.max(0, arg10);
			if (Class235.aClass235_2 != arg6 && !this.method26328(this.aClass447_60, arg9, arg8)) {
				return null;
			}
			if (arg10 <= 0) {
				arg10 = 255;
			}
			@Pc(40) float local40 = (float) local14 / 255.0F;
			@Pc(45) float local45 = (float) arg10 / 255.0F;
			@Pc(51) Interface69 local51 = this.method26322(arg2, arg11);
			@Pc(56) Class496 local56 = this.method26324(local51);
			if (local56 == null) {
				return null;
			}
			local56.method30112(arg1);
			local56.method30123(arg5);
			if (Class235.aClass235_2 != arg6) {
				local56.method30126();
				local56.method30131(arg9);
				local56.method30143(arg7);
				local56.method30144(arg8);
				if (Class235.aClass235_1 == arg6) {
					local56.method30107(this.anInterface57_3);
				} else if (arg6 == Class235.aClass235_4) {
					local56.method30107(this.anInterface57_2);
				} else if (Class235.aClass235_3 == arg6) {
					local56.method30107(this.anInterface57_1);
				} else if (arg6 == Class235.aClass235_5) {
					local56.method30107(this.anInterface57_4);
				} else {
					local56.method30126();
				}
			}
			local56.method30155(local40, 0);
			local56.method30158(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local56.method30160(local45);
			local56.method30117(arg0);
			return local56;
		}
	}

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "(Lclient!ez;IIIILclient!ev;FFLclient!oo;IIIB)V", line = 690)
	public void method26335(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class235 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class447 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean656) {
			return;
		}
		@Pc(20) Class496 local20 = this.method26331(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30099();
		} else {
			local20.method30148(arg11, false);
		}
		this.method26325(local20);
	}

	@OriginalMember(owner = "client!fw", name = "ci", descriptor = "(Lclient!ez;IIIILclient!ev;FFLclient!oo;III)V", line = 690)
	public void method26336(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class235 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class447 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean656) {
			return;
		}
		@Pc(20) Class496 local20 = this.method26331(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30099();
		} else {
			local20.method30148(arg11, false);
		}
		this.method26325(local20);
	}

	@OriginalMember(owner = "client!fw", name = "aj", descriptor = "(IIB)V", line = 700)
	public void method26337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt3815 * -1966156715) {
			return;
		}
		if (this.aClass496_6 != null) {
			this.aClass496_6.method30100(0);
			this.method26325(this.aClass496_6);
			this.aClass496_6 = null;
		}
		@Pc(41) Class496 local41 = this.method26331(Class239.aClass239_11, this, arg0, 0, arg1, Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local41 != null) {
			local41.method30093();
			this.aClass496_6 = local41;
		}
		this.aBoolean657 = false;
	}

	@OriginalMember(owner = "client!fw", name = "cq", descriptor = "(II)V", line = 700)
	public void method26338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt3815 * -1966156715) {
			return;
		}
		if (this.aClass496_6 != null) {
			this.aClass496_6.method30100(0);
			this.method26325(this.aClass496_6);
			this.aClass496_6 = null;
		}
		@Pc(41) Class496 local41 = this.method26331(Class239.aClass239_11, this, arg0, 0, arg1, Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local41 != null) {
			local41.method30093();
			this.aClass496_6 = local41;
		}
		this.aBoolean657 = false;
	}

	@OriginalMember(owner = "client!fw", name = "co", descriptor = "(II)V", line = 700)
	public void method26339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt3815 * -1966156715) {
			return;
		}
		if (this.aClass496_6 != null) {
			this.aClass496_6.method30100(0);
			this.method26325(this.aClass496_6);
			this.aClass496_6 = null;
		}
		@Pc(41) Class496 local41 = this.method26331(Class239.aClass239_11, this, arg0, 0, arg1, Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local41 != null) {
			local41.method30093();
			this.aClass496_6 = local41;
		}
		this.aBoolean657 = false;
	}

	@OriginalMember(owner = "client!fw", name = "cn", descriptor = "(II)V", line = 700)
	public void method26340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt3815 * -1966156715) {
			return;
		}
		if (this.aClass496_6 != null) {
			this.aClass496_6.method30100(0);
			this.method26325(this.aClass496_6);
			this.aClass496_6 = null;
		}
		@Pc(41) Class496 local41 = this.method26331(Class239.aClass239_11, this, arg0, 0, arg1, Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local41 != null) {
			local41.method30093();
			this.aClass496_6 = local41;
		}
		this.aBoolean657 = false;
	}

	@OriginalMember(owner = "client!fw", name = "ai", descriptor = "(B)I", line = 717)
	public int method26341() {
		return this.anInt3815 * -1966156715;
	}

	@OriginalMember(owner = "client!fw", name = "cy", descriptor = "()I", line = 717)
	public int method26342() {
		return this.anInt3815 * -1966156715;
	}

	@OriginalMember(owner = "client!fw", name = "cs", descriptor = "()I", line = 717)
	public int method26343() {
		return this.anInt3815 * -1966156715;
	}

	@OriginalMember(owner = "client!fw", name = "ag", descriptor = "(IB)V", line = 721)
	public void method26344(@OriginalArg(0) int arg0) {
		this.anInt3819 = arg0 * 244312271;
	}

	@OriginalMember(owner = "client!fw", name = "cj", descriptor = "(I)V", line = 721)
	public void method26345(@OriginalArg(0) int arg0) {
		this.anInt3819 = arg0 * 244312271;
	}

	@OriginalMember(owner = "client!fw", name = "cd", descriptor = "(I)V", line = 721)
	public void method26346(@OriginalArg(0) int arg0) {
		this.anInt3819 = arg0 * 244312271;
	}

	@OriginalMember(owner = "client!fw", name = "ce", descriptor = "()I", line = 725)
	public int method26347() {
		return this.anInt3819 * -1611391441;
	}

	@OriginalMember(owner = "client!fw", name = "al", descriptor = "(I)I", line = 725)
	public int method26348() {
		return this.anInt3819 * -1611391441;
	}

	@OriginalMember(owner = "client!fw", name = "ao", descriptor = "(II)V", line = 729)
	void method26349(@OriginalArg(0) int arg0) {
		if (client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(16) Class77_Sub20 local16 = Class365.method28132(Class414.aClass414_50, client.aClass82_2.aClass16_1);
			local16.aClass77_Sub39_Sub1_2.method22417(arg0);
			client.aClass82_2.method2004(local16);
		}
	}

	@OriginalMember(owner = "client!fw", name = "do", descriptor = "(I)V", line = 729)
	void method26350(@OriginalArg(0) int arg0) {
		if (client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(16) Class77_Sub20 local16 = Class365.method28132(Class414.aClass414_50, client.aClass82_2.aClass16_1);
			local16.aClass77_Sub39_Sub1_2.method22417(arg0);
			client.aClass82_2.method2004(local16);
		}
	}

	@OriginalMember(owner = "client!fw", name = "dt", descriptor = "(I)V", line = 737)
	public void method26351(@OriginalArg(0) int arg0) {
		this.method26354(arg0, 255);
	}

	@OriginalMember(owner = "client!fw", name = "ak", descriptor = "(II)V", line = 737)
	public void method26352(@OriginalArg(0) int arg0) {
		this.method26354(arg0, 255);
	}

	@OriginalMember(owner = "client!fw", name = "dh", descriptor = "(I)V", line = 737)
	public void method26353(@OriginalArg(0) int arg0) {
		this.method26354(arg0, 255);
	}

	@OriginalMember(owner = "client!fw", name = "au", descriptor = "(IIB)V", line = 741)
	public void method26354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26357(arg0, arg1, false, 0, 0, 0, 0, 0);
	}

	@OriginalMember(owner = "client!fw", name = "dq", descriptor = "(II)V", line = 741)
	public void method26355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26357(arg0, arg1, false, 0, 0, 0, 0, 0);
	}

	@OriginalMember(owner = "client!fw", name = "dn", descriptor = "(II)V", line = 741)
	public void method26356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26357(arg0, arg1, false, 0, 0, 0, 0, 0);
	}

	@OriginalMember(owner = "client!fw", name = "ax", descriptor = "(IIZIIIIII)V", line = 745)
	public void method26357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean656 || arg0 == this.anInt3815 * -1966156715) {
			return;
		}
		if (this.aBoolean658 && this.aClass496_5 != null && arg0 != this.anInt3815 * -1966156715) {
			this.aClass496_5.method30105();
			this.aClass496_5.method30092();
			this.aList8.remove(this.aClass496_5);
		}
		@Pc(40) Class496 local40 = this.method26360();
		if (local40 != null && local40.method30129().method32165() == arg0) {
			this.aClass496_5 = local40;
			this.anInt3815 = local40.method30129().method32165() * -794851075;
			return;
		}
		@Pc(64) boolean local64 = false;
		if (this.anInt3815 * -1966156715 >= 0) {
			@Pc(73) Iterator local73 = this.aList8.iterator();
			while (local73.hasNext()) {
				@Pc(80) Class496 local80 = (Class496) local73.next();
				if (local80.method30118() == Class239.aClass239_11) {
					local80.method30100(2000);
					local64 = true;
				}
			}
		}
		this.aClass496_5 = null;
		this.anInt3815 = 794851075;
		@Pc(100) Class496 local100 = null;
		if (this.aClass496_6 != null && this.aClass496_6.method30129() != null && this.aClass496_6.method30129().method32165() == arg0 && this.aClass496_6.method30110() == Class486.aClass486_4) {
			local100 = this.aClass496_6;
			this.aClass496_6 = null;
			this.aBoolean657 = false;
		}
		@Pc(138) float local138;
		if (local100 == null) {
			if (arg2) {
				local138 = arg6;
				@Pc(141) float local141 = (float) arg7;
				@Pc(150) Class447 local150 = new Class447((float) arg4, 0.0F, (float) arg5);
				local100 = this.method26331(Class239.aClass239_11, this, arg0, 0, local64 ? 0 : arg1, this.anInt3819 * -1611391441 == arg0 ? Class228.aClass228_1.method25803() : Class220.aClass220_9.method25727(), Class235.aClass235_5, local138, local141, local150, arg3, 255, true);
			} else {
				local100 = this.method26331(Class239.aClass239_11, this, arg0, 0, local64 ? 0 : arg1, arg0 == this.anInt3819 * -1611391441 ? Class228.aClass228_1.method25803() : Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local100 == null) {
			return;
		}
		if (local64) {
			local138 = (float) arg1 / 255.0F;
			local100.method30155(local138, 2000);
		}
		local100.method30099();
		this.method26325(local100);
		this.aClass496_5 = local100;
		this.anInt3815 = arg0 * -794851075;
		if (this.aBoolean658) {
			this.aClass496_5.method30102();
		}
		if (client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(269) Class77_Sub20 local269 = Class365.method28132(Class414.aClass414_48, client.aClass82_2.aClass16_1);
			local269.aClass77_Sub39_Sub1_2.method22417(this.anInt3815 * -1966156715);
			client.aClass82_2.method2004(local269);
		}
	}

	@OriginalMember(owner = "client!fw", name = "dv", descriptor = "(IIZIIIII)V", line = 745)
	public void method26358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean656 || arg0 == this.anInt3815 * -1966156715) {
			return;
		}
		if (this.aBoolean658 && this.aClass496_5 != null && arg0 != this.anInt3815 * -1966156715) {
			this.aClass496_5.method30105();
			this.aClass496_5.method30092();
			this.aList8.remove(this.aClass496_5);
		}
		@Pc(40) Class496 local40 = this.method26360();
		if (local40 != null && local40.method30129().method32165() == arg0) {
			this.aClass496_5 = local40;
			this.anInt3815 = local40.method30129().method32165() * -794851075;
			return;
		}
		@Pc(64) boolean local64 = false;
		if (this.anInt3815 * -1966156715 >= 0) {
			@Pc(73) Iterator local73 = this.aList8.iterator();
			while (local73.hasNext()) {
				@Pc(80) Class496 local80 = (Class496) local73.next();
				if (local80.method30118() == Class239.aClass239_11) {
					local80.method30100(2000);
					local64 = true;
				}
			}
		}
		this.aClass496_5 = null;
		this.anInt3815 = 794851075;
		@Pc(100) Class496 local100 = null;
		if (this.aClass496_6 != null && this.aClass496_6.method30129() != null && this.aClass496_6.method30129().method32165() == arg0 && this.aClass496_6.method30110() == Class486.aClass486_4) {
			local100 = this.aClass496_6;
			this.aClass496_6 = null;
			this.aBoolean657 = false;
		}
		@Pc(138) float local138;
		if (local100 == null) {
			if (arg2) {
				local138 = arg6;
				@Pc(141) float local141 = (float) arg7;
				@Pc(150) Class447 local150 = new Class447((float) arg4, 0.0F, (float) arg5);
				local100 = this.method26331(Class239.aClass239_11, this, arg0, 0, local64 ? 0 : arg1, this.anInt3819 * -1611391441 == arg0 ? Class228.aClass228_1.method25803() : Class220.aClass220_9.method25727(), Class235.aClass235_5, local138, local141, local150, arg3, 255, true);
			} else {
				local100 = this.method26331(Class239.aClass239_11, this, arg0, 0, local64 ? 0 : arg1, arg0 == this.anInt3819 * -1611391441 ? Class228.aClass228_1.method25803() : Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local100 == null) {
			return;
		}
		if (local64) {
			local138 = (float) arg1 / 255.0F;
			local100.method30155(local138, 2000);
		}
		local100.method30099();
		this.method26325(local100);
		this.aClass496_5 = local100;
		this.anInt3815 = arg0 * -794851075;
		if (this.aBoolean658) {
			this.aClass496_5.method30102();
		}
		if (client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(269) Class77_Sub20 local269 = Class365.method28132(Class414.aClass414_48, client.aClass82_2.aClass16_1);
			local269.aClass77_Sub39_Sub1_2.method22417(this.anInt3815 * -1966156715);
			client.aClass82_2.method2004(local269);
		}
	}

	@OriginalMember(owner = "client!fw", name = "da", descriptor = "(IIZIIIII)V", line = 745)
	public void method26359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean656 || arg0 == this.anInt3815 * -1966156715) {
			return;
		}
		if (this.aBoolean658 && this.aClass496_5 != null && arg0 != this.anInt3815 * -1966156715) {
			this.aClass496_5.method30105();
			this.aClass496_5.method30092();
			this.aList8.remove(this.aClass496_5);
		}
		@Pc(40) Class496 local40 = this.method26360();
		if (local40 != null && local40.method30129().method32165() == arg0) {
			this.aClass496_5 = local40;
			this.anInt3815 = local40.method30129().method32165() * -794851075;
			return;
		}
		@Pc(64) boolean local64 = false;
		if (this.anInt3815 * -1966156715 >= 0) {
			@Pc(73) Iterator local73 = this.aList8.iterator();
			while (local73.hasNext()) {
				@Pc(80) Class496 local80 = (Class496) local73.next();
				if (local80.method30118() == Class239.aClass239_11) {
					local80.method30100(2000);
					local64 = true;
				}
			}
		}
		this.aClass496_5 = null;
		this.anInt3815 = 794851075;
		@Pc(100) Class496 local100 = null;
		if (this.aClass496_6 != null && this.aClass496_6.method30129() != null && this.aClass496_6.method30129().method32165() == arg0 && this.aClass496_6.method30110() == Class486.aClass486_4) {
			local100 = this.aClass496_6;
			this.aClass496_6 = null;
			this.aBoolean657 = false;
		}
		@Pc(138) float local138;
		if (local100 == null) {
			if (arg2) {
				local138 = arg6;
				@Pc(141) float local141 = (float) arg7;
				@Pc(150) Class447 local150 = new Class447((float) arg4, 0.0F, (float) arg5);
				local100 = this.method26331(Class239.aClass239_11, this, arg0, 0, local64 ? 0 : arg1, this.anInt3819 * -1611391441 == arg0 ? Class228.aClass228_1.method25803() : Class220.aClass220_9.method25727(), Class235.aClass235_5, local138, local141, local150, arg3, 255, true);
			} else {
				local100 = this.method26331(Class239.aClass239_11, this, arg0, 0, local64 ? 0 : arg1, arg0 == this.anInt3819 * -1611391441 ? Class228.aClass228_1.method25803() : Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local100 == null) {
			return;
		}
		if (local64) {
			local138 = (float) arg1 / 255.0F;
			local100.method30155(local138, 2000);
		}
		local100.method30099();
		this.method26325(local100);
		this.aClass496_5 = local100;
		this.anInt3815 = arg0 * -794851075;
		if (this.aBoolean658) {
			this.aClass496_5.method30102();
		}
		if (client.aClass82_2.aClass16_1 != null && Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			@Pc(269) Class77_Sub20 local269 = Class365.method28132(Class414.aClass414_48, client.aClass82_2.aClass16_1);
			local269.aClass77_Sub39_Sub1_2.method22417(this.anInt3815 * -1966156715);
			client.aClass82_2.method2004(local269);
		}
	}

	@OriginalMember(owner = "client!fw", name = "ar", descriptor = "(S)Lclient!qs;", line = 811)
	Class496 method26360() {
		@Pc(3) Iterator local3 = this.aList8.iterator();
		@Pc(10) Class496 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class496) local3.next();
		} while (local10.method30118() != Class239.aClass239_11 || local10.method30110() != Class486.aClass486_5);
		return local10;
	}

	@OriginalMember(owner = "client!fw", name = "dy", descriptor = "()Lclient!qs;", line = 811)
	Class496 method26361() {
		@Pc(3) Iterator local3 = this.aList8.iterator();
		@Pc(10) Class496 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class496) local3.next();
		} while (local10.method30118() != Class239.aClass239_11 || local10.method30110() != Class486.aClass486_5);
		return local10;
	}

	@OriginalMember(owner = "client!fw", name = "dg", descriptor = "(I)Lclient!ara;", line = 815)
	public static Class77_Sub1_Sub8 method26362() {
		return Class136_Sub1.aClass77_Sub1_Sub8_2;
	}

	@OriginalMember(owner = "client!fw", name = "ad", descriptor = "(I)V", line = 822)
	public void method26363() {
		@Pc(3) Iterator local3 = this.aList8.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class496 local10 = (Class496) local3.next();
			if (local10.method30118() == Class239.aClass239_11) {
				local10.method30100(500);
				if (local10.method30129().method32165() == this.anInt3815 * -1966156715) {
					this.method26349(this.anInt3815 * -1966156715);
					break;
				}
			}
		}
		this.aClass496_5 = null;
		this.anInt3815 = 794851075;
	}

	@OriginalMember(owner = "client!fw", name = "dz", descriptor = "()V", line = 822)
	public void method26364() {
		@Pc(3) Iterator local3 = this.aList8.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class496 local10 = (Class496) local3.next();
			if (local10.method30118() == Class239.aClass239_11) {
				local10.method30100(500);
				if (local10.method30129().method32165() == this.anInt3815 * -1966156715) {
					this.method26349(this.anInt3815 * -1966156715);
					break;
				}
			}
		}
		this.aClass496_5 = null;
		this.anInt3815 = 794851075;
	}

	@OriginalMember(owner = "client!fw", name = "dm", descriptor = "()V", line = 822)
	public void method26365() {
		@Pc(3) Iterator local3 = this.aList8.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class496 local10 = (Class496) local3.next();
			if (local10.method30118() == Class239.aClass239_11) {
				local10.method30100(500);
				if (local10.method30129().method32165() == this.anInt3815 * -1966156715) {
					this.method26349(this.anInt3815 * -1966156715);
					break;
				}
			}
		}
		this.aClass496_5 = null;
		this.anInt3815 = 794851075;
	}

	@OriginalMember(owner = "client!fw", name = "dr", descriptor = "(II)V", line = 838)
	public void method26366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean656 || this.aBoolean658 && this.anInt3820 * 1867711623 == arg0) {
			return;
		}
		if (this.aBoolean658 && arg0 != this.anInt3820 * 1867711623) {
			@Pc(26) Iterator local26 = this.aList6.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class496 local33 = (Class496) local26.next();
				if (local33.method30118() == Class239.aClass239_1) {
					local33.method30092();
					this.aList8.remove(local33);
					this.aBoolean658 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean658 && this.aClass496_5 != null) {
			this.aClass496_5.method30102();
		}
		@Pc(87) Class496 local87 = this.method26331(Class239.aClass239_1, this, arg0, 0, arg1, Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local87 != null) {
			local87.method30099();
			this.method26325(local87);
			this.aBoolean658 = true;
			this.anInt3820 = arg0 * -1685159625;
		}
	}

	@OriginalMember(owner = "client!fw", name = "dw", descriptor = "(II)V", line = 838)
	public void method26367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean656 || this.aBoolean658 && this.anInt3820 * 1867711623 == arg0) {
			return;
		}
		if (this.aBoolean658 && arg0 != this.anInt3820 * 1867711623) {
			@Pc(26) Iterator local26 = this.aList6.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class496 local33 = (Class496) local26.next();
				if (local33.method30118() == Class239.aClass239_1) {
					local33.method30092();
					this.aList8.remove(local33);
					this.aBoolean658 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean658 && this.aClass496_5 != null) {
			this.aClass496_5.method30102();
		}
		@Pc(87) Class496 local87 = this.method26331(Class239.aClass239_1, this, arg0, 0, arg1, Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local87 != null) {
			local87.method30099();
			this.method26325(local87);
			this.aBoolean658 = true;
			this.anInt3820 = arg0 * -1685159625;
		}
	}

	@OriginalMember(owner = "client!fw", name = "ac", descriptor = "(IIB)V", line = 838)
	public void method26368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean656 || this.aBoolean658 && this.anInt3820 * 1867711623 == arg0) {
			return;
		}
		if (this.aBoolean658 && arg0 != this.anInt3820 * 1867711623) {
			@Pc(26) Iterator local26 = this.aList6.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class496 local33 = (Class496) local26.next();
				if (local33.method30118() == Class239.aClass239_1) {
					local33.method30092();
					this.aList8.remove(local33);
					this.aBoolean658 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean658 && this.aClass496_5 != null) {
			this.aClass496_5.method30102();
		}
		@Pc(87) Class496 local87 = this.method26331(Class239.aClass239_1, this, arg0, 0, arg1, Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local87 != null) {
			local87.method30099();
			this.method26325(local87);
			this.aBoolean658 = true;
			this.anInt3820 = arg0 * -1685159625;
		}
	}

	@OriginalMember(owner = "client!fw", name = "dp", descriptor = "(II)V", line = 838)
	public void method26369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean656 || this.aBoolean658 && this.anInt3820 * 1867711623 == arg0) {
			return;
		}
		if (this.aBoolean658 && arg0 != this.anInt3820 * 1867711623) {
			@Pc(26) Iterator local26 = this.aList6.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class496 local33 = (Class496) local26.next();
				if (local33.method30118() == Class239.aClass239_1) {
					local33.method30092();
					this.aList8.remove(local33);
					this.aBoolean658 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean658 && this.aClass496_5 != null) {
			this.aClass496_5.method30102();
		}
		@Pc(87) Class496 local87 = this.method26331(Class239.aClass239_1, this, arg0, 0, arg1, Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local87 != null) {
			local87.method30099();
			this.method26325(local87);
			this.aBoolean658 = true;
			this.anInt3820 = arg0 * -1685159625;
		}
	}

	@OriginalMember(owner = "client!fw", name = "di", descriptor = "(II)V", line = 838)
	public void method26370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean656 || this.aBoolean658 && this.anInt3820 * 1867711623 == arg0) {
			return;
		}
		if (this.aBoolean658 && arg0 != this.anInt3820 * 1867711623) {
			@Pc(26) Iterator local26 = this.aList6.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class496 local33 = (Class496) local26.next();
				if (local33.method30118() == Class239.aClass239_1) {
					local33.method30092();
					this.aList8.remove(local33);
					this.aBoolean658 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean658 && this.aClass496_5 != null) {
			this.aClass496_5.method30102();
		}
		@Pc(87) Class496 local87 = this.method26331(Class239.aClass239_1, this, arg0, 0, arg1, Class220.aClass220_9.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 255, true);
		if (local87 != null) {
			local87.method30099();
			this.method26325(local87);
			this.aBoolean658 = true;
			this.anInt3820 = arg0 * -1685159625;
		}
	}

	@OriginalMember(owner = "client!fw", name = "av", descriptor = "(Lclient!et;ILclient!alc;I)V", line = 866)
	public void method26371(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray44 == null || arg1 >= arg0.anIntArrayArray44.length || arg0.anIntArrayArray44[arg1] == null || (arg2.aByte100 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 || !arg2.method24123())) {
			return;
		}
		@Pc(35) int local35 = arg0.anIntArrayArray44[arg1][0];
		@Pc(39) int local39 = local35 >> 8;
		@Pc(45) int local45 = local35 >> 5 & 0x7;
		@Pc(49) int local49 = local35 & 0x1F;
		@Pc(66) int local66;
		if (arg0.anIntArrayArray44[arg1].length > 1) {
			local66 = (int) (Math.random() * (double) arg0.anIntArrayArray44[arg1].length);
			if (local66 > 0) {
				local39 = arg0.anIntArrayArray44[arg1][local66];
			}
		}
		local66 = 256;
		if (arg0.anIntArray380 != null && arg0.anIntArray379 != null) {
			local66 = (int) (Math.random() * (double) (arg0.anIntArray379[arg1] - arg0.anIntArray380[arg1])) + arg0.anIntArray380[arg1];
		}
		@Pc(114) int local114 = arg0.anIntArray378 == null ? 255 : arg0.anIntArray378[arg1];
		if (local49 != 0) {
			if (arg2 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3) {
				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_2.method15901() == 0) {
					return;
				}
			} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() == 0) {
				return;
			}
			if (arg0.anInt3776 * 864647291 != -1) {
				@Pc(161) int local161 = 0;
				if (arg2 instanceof Class104_Sub1_Sub1_Sub1) {
					local161 = ((Class104_Sub1_Sub1_Sub1) arg2).method21144();
				} else if (arg2 instanceof Class104_Sub1_Sub1_Sub5) {
					local161 = ((Class104_Sub1_Sub1_Sub5) arg2).method23978();
				} else if (arg2 instanceof Class104_Sub1_Sub1_Sub6) {
					local161 = ((Class104_Sub1_Sub1_Sub6) arg2).method24183();
				}
				if (local161 != 0 && local161 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21144() && local161 != client.anInt3470 * 476125061) {
					local114 = arg0.anInt3776 * 864647291 * local114 / 100;
					if (local114 < 0) {
						local114 = 0;
					} else if (local114 > 255) {
						local114 = 255;
					}
				}
			}
			@Pc(223) Class447 local223 = arg2.method24085().aClass447_61;
			@Pc(231) int local231 = (int) local223.aFloat277 - 256 >> 9;
			@Pc(239) int local239 = (int) local223.aFloat278 - 256 >> 9;
			@Pc(252) Class447 local252 = new Class447((float) (local231 << 9), 0.0F, (float) (local239 << 9));
			@Pc(257) int local257 = arg2.aByte100 << 24;
			this.method26335(Class239.aClass239_7, local39, local45, local114, Class220.aClass220_4.method25727(), arg2 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 ? Class235.aClass235_2 : Class235.aClass235_3, 0.0F, (float) (local49 << 9), local252, local257, local66, 0);
		} else if (arg2 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26335(Class239.aClass239_4, local39, local45, local114, Class220.aClass220_3.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, arg2.aByte100, local66, 0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "du", descriptor = "(Lclient!et;ILclient!alc;)V", line = 866)
	public void method26372(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray44 == null || arg1 >= arg0.anIntArrayArray44.length || arg0.anIntArrayArray44[arg1] == null || (arg2.aByte100 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 || !arg2.method24123())) {
			return;
		}
		@Pc(35) int local35 = arg0.anIntArrayArray44[arg1][0];
		@Pc(39) int local39 = local35 >> 8;
		@Pc(45) int local45 = local35 >> 5 & 0x7;
		@Pc(49) int local49 = local35 & 0x1F;
		@Pc(66) int local66;
		if (arg0.anIntArrayArray44[arg1].length > 1) {
			local66 = (int) (Math.random() * (double) arg0.anIntArrayArray44[arg1].length);
			if (local66 > 0) {
				local39 = arg0.anIntArrayArray44[arg1][local66];
			}
		}
		local66 = 256;
		if (arg0.anIntArray380 != null && arg0.anIntArray379 != null) {
			local66 = (int) (Math.random() * (double) (arg0.anIntArray379[arg1] - arg0.anIntArray380[arg1])) + arg0.anIntArray380[arg1];
		}
		@Pc(114) int local114 = arg0.anIntArray378 == null ? 255 : arg0.anIntArray378[arg1];
		if (local49 != 0) {
			if (arg2 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3) {
				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_2.method15901() == 0) {
					return;
				}
			} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() == 0) {
				return;
			}
			if (arg0.anInt3776 * 864647291 != -1) {
				@Pc(161) int local161 = 0;
				if (arg2 instanceof Class104_Sub1_Sub1_Sub1) {
					local161 = ((Class104_Sub1_Sub1_Sub1) arg2).method21144();
				} else if (arg2 instanceof Class104_Sub1_Sub1_Sub5) {
					local161 = ((Class104_Sub1_Sub1_Sub5) arg2).method23978();
				} else if (arg2 instanceof Class104_Sub1_Sub1_Sub6) {
					local161 = ((Class104_Sub1_Sub1_Sub6) arg2).method24183();
				}
				if (local161 != 0 && local161 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21144() && local161 != client.anInt3470 * 476125061) {
					local114 = arg0.anInt3776 * 864647291 * local114 / 100;
					if (local114 < 0) {
						local114 = 0;
					} else if (local114 > 255) {
						local114 = 255;
					}
				}
			}
			@Pc(223) Class447 local223 = arg2.method24085().aClass447_61;
			@Pc(231) int local231 = (int) local223.aFloat277 - 256 >> 9;
			@Pc(239) int local239 = (int) local223.aFloat278 - 256 >> 9;
			@Pc(252) Class447 local252 = new Class447((float) (local231 << 9), 0.0F, (float) (local239 << 9));
			@Pc(257) int local257 = arg2.aByte100 << 24;
			this.method26335(Class239.aClass239_7, local39, local45, local114, Class220.aClass220_4.method25727(), arg2 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 ? Class235.aClass235_2 : Class235.aClass235_3, 0.0F, (float) (local49 << 9), local252, local257, local66, 0);
		} else if (arg2 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26335(Class239.aClass239_4, local39, local45, local114, Class220.aClass220_3.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, arg2.aByte100, local66, 0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "de", descriptor = "(Lclient!et;ILclient!alc;)V", line = 866)
	public void method26373(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray44 == null || arg1 >= arg0.anIntArrayArray44.length || arg0.anIntArrayArray44[arg1] == null || (arg2.aByte100 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 || !arg2.method24123())) {
			return;
		}
		@Pc(35) int local35 = arg0.anIntArrayArray44[arg1][0];
		@Pc(39) int local39 = local35 >> 8;
		@Pc(45) int local45 = local35 >> 5 & 0x7;
		@Pc(49) int local49 = local35 & 0x1F;
		@Pc(66) int local66;
		if (arg0.anIntArrayArray44[arg1].length > 1) {
			local66 = (int) (Math.random() * (double) arg0.anIntArrayArray44[arg1].length);
			if (local66 > 0) {
				local39 = arg0.anIntArrayArray44[arg1][local66];
			}
		}
		local66 = 256;
		if (arg0.anIntArray380 != null && arg0.anIntArray379 != null) {
			local66 = (int) (Math.random() * (double) (arg0.anIntArray379[arg1] - arg0.anIntArray380[arg1])) + arg0.anIntArray380[arg1];
		}
		@Pc(114) int local114 = arg0.anIntArray378 == null ? 255 : arg0.anIntArray378[arg1];
		if (local49 != 0) {
			if (arg2 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3) {
				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_2.method15901() == 0) {
					return;
				}
			} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() == 0) {
				return;
			}
			if (arg0.anInt3776 * 864647291 != -1) {
				@Pc(161) int local161 = 0;
				if (arg2 instanceof Class104_Sub1_Sub1_Sub1) {
					local161 = ((Class104_Sub1_Sub1_Sub1) arg2).method21144();
				} else if (arg2 instanceof Class104_Sub1_Sub1_Sub5) {
					local161 = ((Class104_Sub1_Sub1_Sub5) arg2).method23978();
				} else if (arg2 instanceof Class104_Sub1_Sub1_Sub6) {
					local161 = ((Class104_Sub1_Sub1_Sub6) arg2).method24183();
				}
				if (local161 != 0 && local161 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21144() && local161 != client.anInt3470 * 476125061) {
					local114 = arg0.anInt3776 * 864647291 * local114 / 100;
					if (local114 < 0) {
						local114 = 0;
					} else if (local114 > 255) {
						local114 = 255;
					}
				}
			}
			@Pc(223) Class447 local223 = arg2.method24085().aClass447_61;
			@Pc(231) int local231 = (int) local223.aFloat277 - 256 >> 9;
			@Pc(239) int local239 = (int) local223.aFloat278 - 256 >> 9;
			@Pc(252) Class447 local252 = new Class447((float) (local231 << 9), 0.0F, (float) (local239 << 9));
			@Pc(257) int local257 = arg2.aByte100 << 24;
			this.method26335(Class239.aClass239_7, local39, local45, local114, Class220.aClass220_4.method25727(), arg2 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 ? Class235.aClass235_2 : Class235.aClass235_3, 0.0F, (float) (local49 << 9), local252, local257, local66, 0);
		} else if (arg2 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26335(Class239.aClass239_4, local39, local45, local114, Class220.aClass220_3.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, arg2.aByte100, local66, 0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "at", descriptor = "(Lclient!et;IB)V", line = 916)
	public void method26374(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray44 == null || arg1 >= arg0.anIntArrayArray44.length || arg0.anIntArrayArray44[arg1] == null) {
			return;
		}
		@Pc(24) int local24 = arg0.anIntArrayArray44[arg1][0];
		@Pc(28) int local28 = local24 >> 8;
		@Pc(34) int local34 = local24 >> 5 & 0x7;
		@Pc(51) int local51;
		if (arg0.anIntArrayArray44[arg1].length > 1) {
			local51 = (int) (Math.random() * (double) arg0.anIntArrayArray44[arg1].length);
			if (local51 > 0) {
				local28 = arg0.anIntArrayArray44[arg1][local51];
			}
		}
		local51 = 256;
		if (arg0.anIntArray380 != null && arg0.anIntArray379 != null) {
			local51 = (int) ((double) arg0.anIntArray380[arg1] + Math.random() * (double) (arg0.anIntArray379[arg1] - arg0.anIntArray380[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray378 == null ? 255 : arg0.anIntArray378[arg1];
		this.method26335(Class239.aClass239_10, local28, local34, local99, Class220.aClass220_4.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local51, 0);
	}

	@OriginalMember(owner = "client!fw", name = "db", descriptor = "(Lclient!et;I)V", line = 916)
	public void method26375(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray44 == null || arg1 >= arg0.anIntArrayArray44.length || arg0.anIntArrayArray44[arg1] == null) {
			return;
		}
		@Pc(24) int local24 = arg0.anIntArrayArray44[arg1][0];
		@Pc(28) int local28 = local24 >> 8;
		@Pc(34) int local34 = local24 >> 5 & 0x7;
		@Pc(51) int local51;
		if (arg0.anIntArrayArray44[arg1].length > 1) {
			local51 = (int) (Math.random() * (double) arg0.anIntArrayArray44[arg1].length);
			if (local51 > 0) {
				local28 = arg0.anIntArrayArray44[arg1][local51];
			}
		}
		local51 = 256;
		if (arg0.anIntArray380 != null && arg0.anIntArray379 != null) {
			local51 = (int) ((double) arg0.anIntArray380[arg1] + Math.random() * (double) (arg0.anIntArray379[arg1] - arg0.anIntArray380[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray378 == null ? 255 : arg0.anIntArray378[arg1];
		this.method26335(Class239.aClass239_10, local28, local34, local99, Class220.aClass220_4.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local51, 0);
	}

	@OriginalMember(owner = "client!fw", name = "dk", descriptor = "(Lclient!et;I)V", line = 916)
	public void method26376(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray44 == null || arg1 >= arg0.anIntArrayArray44.length || arg0.anIntArrayArray44[arg1] == null) {
			return;
		}
		@Pc(24) int local24 = arg0.anIntArrayArray44[arg1][0];
		@Pc(28) int local28 = local24 >> 8;
		@Pc(34) int local34 = local24 >> 5 & 0x7;
		@Pc(51) int local51;
		if (arg0.anIntArrayArray44[arg1].length > 1) {
			local51 = (int) (Math.random() * (double) arg0.anIntArrayArray44[arg1].length);
			if (local51 > 0) {
				local28 = arg0.anIntArrayArray44[arg1][local51];
			}
		}
		local51 = 256;
		if (arg0.anIntArray380 != null && arg0.anIntArray379 != null) {
			local51 = (int) ((double) arg0.anIntArray380[arg1] + Math.random() * (double) (arg0.anIntArray379[arg1] - arg0.anIntArray380[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray378 == null ? 255 : arg0.anIntArray378[arg1];
		this.method26335(Class239.aClass239_10, local28, local34, local99, Class220.aClass220_4.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local51, 0);
	}

	@OriginalMember(owner = "client!fw", name = "ds", descriptor = "(Lclient!et;I)V", line = 916)
	public void method26377(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray44 == null || arg1 >= arg0.anIntArrayArray44.length || arg0.anIntArrayArray44[arg1] == null) {
			return;
		}
		@Pc(24) int local24 = arg0.anIntArrayArray44[arg1][0];
		@Pc(28) int local28 = local24 >> 8;
		@Pc(34) int local34 = local24 >> 5 & 0x7;
		@Pc(51) int local51;
		if (arg0.anIntArrayArray44[arg1].length > 1) {
			local51 = (int) (Math.random() * (double) arg0.anIntArrayArray44[arg1].length);
			if (local51 > 0) {
				local28 = arg0.anIntArrayArray44[arg1][local51];
			}
		}
		local51 = 256;
		if (arg0.anIntArray380 != null && arg0.anIntArray379 != null) {
			local51 = (int) ((double) arg0.anIntArray380[arg1] + Math.random() * (double) (arg0.anIntArray379[arg1] - arg0.anIntArray380[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray378 == null ? 255 : arg0.anIntArray378[arg1];
		this.method26335(Class239.aClass239_10, local28, local34, local99, Class220.aClass220_4.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local51, 0);
	}

	@OriginalMember(owner = "client!fw", name = "df", descriptor = "(Lclient!et;I)V", line = 916)
	public void method26378(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray44 == null || arg1 >= arg0.anIntArrayArray44.length || arg0.anIntArrayArray44[arg1] == null) {
			return;
		}
		@Pc(24) int local24 = arg0.anIntArrayArray44[arg1][0];
		@Pc(28) int local28 = local24 >> 8;
		@Pc(34) int local34 = local24 >> 5 & 0x7;
		@Pc(51) int local51;
		if (arg0.anIntArrayArray44[arg1].length > 1) {
			local51 = (int) (Math.random() * (double) arg0.anIntArrayArray44[arg1].length);
			if (local51 > 0) {
				local28 = arg0.anIntArrayArray44[arg1][local51];
			}
		}
		local51 = 256;
		if (arg0.anIntArray380 != null && arg0.anIntArray379 != null) {
			local51 = (int) ((double) arg0.anIntArray380[arg1] + Math.random() * (double) (arg0.anIntArray379[arg1] - arg0.anIntArray380[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray378 == null ? 255 : arg0.anIntArray378[arg1];
		this.method26335(Class239.aClass239_10, local28, local34, local99, Class220.aClass220_4.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local51, 0);
	}

	@OriginalMember(owner = "client!fw", name = "dx", descriptor = "(Lclient!et;I)V", line = 916)
	public void method26379(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray44 == null || arg1 >= arg0.anIntArrayArray44.length || arg0.anIntArrayArray44[arg1] == null) {
			return;
		}
		@Pc(24) int local24 = arg0.anIntArrayArray44[arg1][0];
		@Pc(28) int local28 = local24 >> 8;
		@Pc(34) int local34 = local24 >> 5 & 0x7;
		@Pc(51) int local51;
		if (arg0.anIntArrayArray44[arg1].length > 1) {
			local51 = (int) (Math.random() * (double) arg0.anIntArrayArray44[arg1].length);
			if (local51 > 0) {
				local28 = arg0.anIntArrayArray44[arg1][local51];
			}
		}
		local51 = 256;
		if (arg0.anIntArray380 != null && arg0.anIntArray379 != null) {
			local51 = (int) ((double) arg0.anIntArray380[arg1] + Math.random() * (double) (arg0.anIntArray379[arg1] - arg0.anIntArray380[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray378 == null ? 255 : arg0.anIntArray378[arg1];
		this.method26335(Class239.aClass239_10, local28, local34, local99, Class220.aClass220_4.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local51, 0);
	}

	@OriginalMember(owner = "client!fw", name = "age", descriptor = "(Lclient!yf;S)V", line = 10598)
	static final void method26380(@OriginalArg(0) Class665 arg0) {
		if (Class662.aClass141_1.method14784(81)) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}
}
