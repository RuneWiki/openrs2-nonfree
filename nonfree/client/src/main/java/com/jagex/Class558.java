package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public class Class558 {

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
	int anInt5323;

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "Lclient!do;")
	Class109 aClass109_5;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Lclient!aaq;")
	Class19 aClass19_9;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "Lclient!ara;")
	Class93_Sub1_Sub4 aClass93_Sub1_Sub4_5;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!vp;")
	Class620 aClass620_2;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "[Z")
	boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!sp", name = "x", descriptor = "Lclient!xy;")
	Class674 aClass674_7;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "Z")
	boolean aBoolean805 = false;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
	int anInt5327 = -1084281727;

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
	int anInt5328 = 0;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "Z")
	boolean aBoolean807 = false;

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "Z")
	boolean aBoolean806 = false;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!aop;")
	Class32_Sub14 aClass32_Sub14_10;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
	int anInt5324;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
	int anInt5325;

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
	int anInt5326;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!alh;")
	Class132_Sub1 aClass132_Sub1_24;

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "B")
	byte aByte162;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "Z")
	boolean aBoolean808;

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "Lclient!aaq;")
	Class19 aClass19_8;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!dh;Lclient!aop;Lclient!vd;IIILclient!alh;ZII)V", line = 47)
	Class558(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class32_Sub14 arg1, @OriginalArg(2) Class610 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class132_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass32_Sub14_10 = arg1;
		this.anInt5324 = arg2.anInt5587 * 828073793;
		this.anInt5325 = arg3 * 1749100181;
		this.anInt5326 = arg4 * 2002192673;
		this.aClass132_Sub1_24 = arg6;
		this.aBoolean807 = arg8 != -1;
		this.aByte162 = (byte) arg5;
		this.aBoolean805 = arg7;
		this.aBoolean808 = arg0.method20424() && arg2.aBoolean828 && !this.aBoolean805;
		this.aClass19_8 = new Class19_Sub1(arg6, false);
		this.method31078(false, arg8, 1, this.aBoolean807 ? arg9 : 0);
	}

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "(II)V", line = 62)
	public void method31080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass19_9 = null;
		if (arg1 > 0) {
			this.aClass19_9 = new Class19_Sub1(this.aClass132_Sub1_24, false);
			this.aClass19_9.method23559(arg0, arg1, 1, false);
		} else {
			this.aBoolean807 = true;
			this.method31078(false, arg0, 1, 0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "(II)V", line = 62)
	public void method31087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass19_9 = null;
		if (arg1 > 0) {
			this.aClass19_9 = new Class19_Sub1(this.aClass132_Sub1_24, false);
			this.aClass19_9.method23559(arg0, arg1, 1, false);
		} else {
			this.aBoolean807 = true;
			this.method31078(false, arg0, 1, 0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "(III)V", line = 62)
	public void method31094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass19_9 = null;
		if (arg1 > 0) {
			this.aClass19_9 = new Class19_Sub1(this.aClass132_Sub1_24, false);
			this.aClass19_9.method23559(arg0, arg1, 1, false);
		} else {
			this.aBoolean807 = true;
			this.method31078(false, arg0, 1, 0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "()I", line = 74)
	int method31081() {
		return this.anInt5328 * -809773691;
	}

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "(I)I", line = 74)
	int method31096() {
		return this.anInt5328 * -809773691;
	}

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "()I", line = 74)
	int method31103() {
		return this.anInt5328 * -809773691;
	}

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "(Lclient!vp;)V", line = 78)
	void method31083(@OriginalArg(0) Class620 arg0) {
		this.aClass620_2 = arg0;
		this.aClass109_5 = null;
	}

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "(Lclient!vp;)V", line = 78)
	void method31084(@OriginalArg(0) Class620 arg0) {
		this.aClass620_2 = arg0;
		this.aClass109_5 = null;
	}

	@OriginalMember(owner = "client!sp", name = "x", descriptor = "(Lclient!vp;)V", line = 78)
	void method31085(@OriginalArg(0) Class620 arg0) {
		this.aClass620_2 = arg0;
		this.aClass109_5 = null;
	}

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "(Lclient!vp;I)V", line = 78)
	void method31099(@OriginalArg(0) Class620 arg0) {
		this.aClass620_2 = arg0;
		this.aClass109_5 = null;
	}

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "()I", line = 83)
	int method31067() {
		return -this.method31096();
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "()I", line = 83)
	int method31068() {
		return -this.method31096();
	}

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "(I)I", line = 83)
	int method31070() {
		return -this.method31096();
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(S)Lclient!vd;", line = 87)
	Class610 method31071() {
		return (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "()Lclient!vd;", line = 87)
	Class610 method31088() {
		return (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
	}

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "(Lclient!dh;IZZI)Lclient!do;", line = 91)
	final Class109 method31072(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
		if (local9.anIntArray492 != null) {
			local9 = local9.method31982(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1);
		}
		if (local9 == null) {
			this.method31076(arg0);
			this.anInt5327 = -1084281727;
			return null;
		}
		if (!this.aBoolean807 && local9.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
			this.method31078(true, -1, 0, 0);
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
		this.method31077(this.aClass132_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean808 & !this.aBoolean806 & Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5327 = local9.anInt5587 * 1783842975;
			return null;
		}
		@Pc(106) Class472 local106 = this.aClass132_Sub1_24.method24229().aClass472_61;
		@Pc(110) Class585 local110 = client.aClass532_1.method30459();
		if (arg3) {
			local110.method31543(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31);
			this.aBoolean806 = false;
		}
		@Pc(136) Class99 local136 = local110.aClass99Array1[this.aByte162];
		@Pc(144) Class99 local144;
		if (this.aBoolean805) {
			local144 = local110.aClass99Array2[0];
		} else {
			local144 = this.aByte162 < 3 ? local110.aClass99Array1[this.aByte162 + 1] : null;
		}
		@Pc(161) Class109 local161 = null;
		if (this.aClass19_8.method23552()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local9.method31975(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2480((int) local106.aFloat317, (int) local106.aFloat319), (int) local106.aFloat319, this.aClass19_8, this.aClass620_2);
			if (local161 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.anInt5328 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass93_Sub1_Sub4_5 = local161.method6860(this.aClass93_Sub1_Sub4_5);
					local110.method31479(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6882() * -856106163;
				local161.method6862();
			}
			this.aClass109_5 = null;
		} else if (this.aClass109_5 != null && (this.aClass109_5.method6825() & arg1) == arg1 && local9.anInt5587 * 365009633 == this.anInt5327 * 432204927) {
			local161 = this.aClass109_5;
		} else {
			if (this.aClass109_5 != null) {
				arg1 |= this.aClass109_5.method6825();
			}
			@Pc(373) Class34 local373 = local9.method31980(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2480((int) local106.aFloat317, (int) local106.aFloat319), (int) local106.aFloat319, arg3, this.aClass620_2);
			if (local373 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.aClass109_5 = null;
				this.anInt5328 = 0;
			} else {
				this.aClass109_5 = local161 = (Class109) local373.anObject1;
				if (arg3) {
					this.aClass93_Sub1_Sub4_5 = (Class93_Sub1_Sub4) local373.anObject2;
					this.aBooleanArray31 = null;
					local110.method31479(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, null);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6882() * -856106163;
				local161.method6862();
			}
		}
		this.anInt5327 = local9.anInt5587 * 1783842975;
		return local161;
	}

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "(Lclient!dh;IZZ)Lclient!do;", line = 91)
	final Class109 method31089(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
		if (local9.anIntArray492 != null) {
			local9 = local9.method31982(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1);
		}
		if (local9 == null) {
			this.method31076(arg0);
			this.anInt5327 = -1084281727;
			return null;
		}
		if (!this.aBoolean807 && local9.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
			this.method31078(true, -1, 0, 0);
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
		this.method31077(this.aClass132_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean808 & !this.aBoolean806 & Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5327 = local9.anInt5587 * 1783842975;
			return null;
		}
		@Pc(106) Class472 local106 = this.aClass132_Sub1_24.method24229().aClass472_61;
		@Pc(110) Class585 local110 = client.aClass532_1.method30459();
		if (arg3) {
			local110.method31543(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31);
			this.aBoolean806 = false;
		}
		@Pc(136) Class99 local136 = local110.aClass99Array1[this.aByte162];
		@Pc(144) Class99 local144;
		if (this.aBoolean805) {
			local144 = local110.aClass99Array2[0];
		} else {
			local144 = this.aByte162 < 3 ? local110.aClass99Array1[this.aByte162 + 1] : null;
		}
		@Pc(161) Class109 local161 = null;
		if (this.aClass19_8.method23552()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local9.method31975(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2480((int) local106.aFloat317, (int) local106.aFloat319), (int) local106.aFloat319, this.aClass19_8, this.aClass620_2);
			if (local161 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.anInt5328 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass93_Sub1_Sub4_5 = local161.method6860(this.aClass93_Sub1_Sub4_5);
					local110.method31479(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6882() * -856106163;
				local161.method6862();
			}
			this.aClass109_5 = null;
		} else if (this.aClass109_5 != null && (this.aClass109_5.method6825() & arg1) == arg1 && local9.anInt5587 * 365009633 == this.anInt5327 * 432204927) {
			local161 = this.aClass109_5;
		} else {
			if (this.aClass109_5 != null) {
				arg1 |= this.aClass109_5.method6825();
			}
			@Pc(373) Class34 local373 = local9.method31980(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2480((int) local106.aFloat317, (int) local106.aFloat319), (int) local106.aFloat319, arg3, this.aClass620_2);
			if (local373 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.aClass109_5 = null;
				this.anInt5328 = 0;
			} else {
				this.aClass109_5 = local161 = (Class109) local373.anObject1;
				if (arg3) {
					this.aClass93_Sub1_Sub4_5 = (Class93_Sub1_Sub4) local373.anObject2;
					this.aBooleanArray31 = null;
					local110.method31479(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, null);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6882() * -856106163;
				local161.method6862();
			}
		}
		this.anInt5327 = local9.anInt5587 * 1783842975;
		return local161;
	}

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "(Lclient!dh;IZZ)Lclient!do;", line = 91)
	final Class109 method31090(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
		if (local9.anIntArray492 != null) {
			local9 = local9.method31982(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1);
		}
		if (local9 == null) {
			this.method31076(arg0);
			this.anInt5327 = -1084281727;
			return null;
		}
		if (!this.aBoolean807 && local9.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
			this.method31078(true, -1, 0, 0);
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
		this.method31077(this.aClass132_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean808 & !this.aBoolean806 & Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5327 = local9.anInt5587 * 1783842975;
			return null;
		}
		@Pc(106) Class472 local106 = this.aClass132_Sub1_24.method24229().aClass472_61;
		@Pc(110) Class585 local110 = client.aClass532_1.method30459();
		if (arg3) {
			local110.method31543(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31);
			this.aBoolean806 = false;
		}
		@Pc(136) Class99 local136 = local110.aClass99Array1[this.aByte162];
		@Pc(144) Class99 local144;
		if (this.aBoolean805) {
			local144 = local110.aClass99Array2[0];
		} else {
			local144 = this.aByte162 < 3 ? local110.aClass99Array1[this.aByte162 + 1] : null;
		}
		@Pc(161) Class109 local161 = null;
		if (this.aClass19_8.method23552()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local9.method31975(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2480((int) local106.aFloat317, (int) local106.aFloat319), (int) local106.aFloat319, this.aClass19_8, this.aClass620_2);
			if (local161 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.anInt5328 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass93_Sub1_Sub4_5 = local161.method6860(this.aClass93_Sub1_Sub4_5);
					local110.method31479(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6882() * -856106163;
				local161.method6862();
			}
			this.aClass109_5 = null;
		} else if (this.aClass109_5 != null && (this.aClass109_5.method6825() & arg1) == arg1 && local9.anInt5587 * 365009633 == this.anInt5327 * 432204927) {
			local161 = this.aClass109_5;
		} else {
			if (this.aClass109_5 != null) {
				arg1 |= this.aClass109_5.method6825();
			}
			@Pc(373) Class34 local373 = local9.method31980(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2480((int) local106.aFloat317, (int) local106.aFloat319), (int) local106.aFloat319, arg3, this.aClass620_2);
			if (local373 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.aClass109_5 = null;
				this.anInt5328 = 0;
			} else {
				this.aClass109_5 = local161 = (Class109) local373.anObject1;
				if (arg3) {
					this.aClass93_Sub1_Sub4_5 = (Class93_Sub1_Sub4) local373.anObject2;
					this.aBooleanArray31 = null;
					local110.method31479(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, null);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6882() * -856106163;
				local161.method6862();
			}
		}
		this.anInt5327 = local9.anInt5587 * 1783842975;
		return local161;
	}

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "(Lclient!dh;IZZ)Lclient!do;", line = 91)
	final Class109 method31091(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
		if (local9.anIntArray492 != null) {
			local9 = local9.method31982(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1);
		}
		if (local9 == null) {
			this.method31076(arg0);
			this.anInt5327 = -1084281727;
			return null;
		}
		if (!this.aBoolean807 && local9.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
			this.method31078(true, -1, 0, 0);
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
		this.method31077(this.aClass132_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean808 & !this.aBoolean806 & Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5327 = local9.anInt5587 * 1783842975;
			return null;
		}
		@Pc(106) Class472 local106 = this.aClass132_Sub1_24.method24229().aClass472_61;
		@Pc(110) Class585 local110 = client.aClass532_1.method30459();
		if (arg3) {
			local110.method31543(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31);
			this.aBoolean806 = false;
		}
		@Pc(136) Class99 local136 = local110.aClass99Array1[this.aByte162];
		@Pc(144) Class99 local144;
		if (this.aBoolean805) {
			local144 = local110.aClass99Array2[0];
		} else {
			local144 = this.aByte162 < 3 ? local110.aClass99Array1[this.aByte162 + 1] : null;
		}
		@Pc(161) Class109 local161 = null;
		if (this.aClass19_8.method23552()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local9.method31975(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2480((int) local106.aFloat317, (int) local106.aFloat319), (int) local106.aFloat319, this.aClass19_8, this.aClass620_2);
			if (local161 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.anInt5328 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass93_Sub1_Sub4_5 = local161.method6860(this.aClass93_Sub1_Sub4_5);
					local110.method31479(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6882() * -856106163;
				local161.method6862();
			}
			this.aClass109_5 = null;
		} else if (this.aClass109_5 != null && (this.aClass109_5.method6825() & arg1) == arg1 && local9.anInt5587 * 365009633 == this.anInt5327 * 432204927) {
			local161 = this.aClass109_5;
		} else {
			if (this.aClass109_5 != null) {
				arg1 |= this.aClass109_5.method6825();
			}
			@Pc(373) Class34 local373 = local9.method31980(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2480((int) local106.aFloat317, (int) local106.aFloat319), (int) local106.aFloat319, arg3, this.aClass620_2);
			if (local373 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.aClass109_5 = null;
				this.anInt5328 = 0;
			} else {
				this.aClass109_5 = local161 = (Class109) local373.anObject1;
				if (arg3) {
					this.aClass93_Sub1_Sub4_5 = (Class93_Sub1_Sub4) local373.anObject2;
					this.aBooleanArray31 = null;
					local110.method31479(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, null);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6882() * -856106163;
				local161.method6862();
			}
		}
		this.anInt5327 = local9.anInt5587 * 1783842975;
		return local161;
	}

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "(Lclient!dh;Lclient!do;Lclient!ou;IIIIZB)V", line = 171)
	void method31073(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class234[] local2 = arg1.method6884();
		@Pc(5) Class210[] local5 = arg1.method6899();
		if ((this.aClass674_7 == null || this.aClass674_7.aBoolean870) && (local2 != null || local5 != null)) {
			@Pc(26) Class610 local26 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
			if (local26.anIntArray492 != null) {
				local26 = local26.method31982(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1);
			}
			if (local26 != null) {
				this.aClass674_7 = Class674.method33124(client.anInt3485, true);
			}
		}
		if (this.aClass674_7 == null) {
			return;
		}
		arg1.method6823(arg2);
		if (arg7) {
			this.aClass674_7.method33098(arg0, (long) client.anInt3485, local2, local5, false);
		} else {
			this.aClass674_7.method33097((long) client.anInt3485);
		}
		this.aClass674_7.method33125(this.aByte162, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "(Lclient!dh;Lclient!do;Lclient!ou;IIIIZ)V", line = 171)
	void method31092(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class234[] local2 = arg1.method6884();
		@Pc(5) Class210[] local5 = arg1.method6899();
		if ((this.aClass674_7 == null || this.aClass674_7.aBoolean870) && (local2 != null || local5 != null)) {
			@Pc(26) Class610 local26 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
			if (local26.anIntArray492 != null) {
				local26 = local26.method31982(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1);
			}
			if (local26 != null) {
				this.aClass674_7 = Class674.method33124(client.anInt3485, true);
			}
		}
		if (this.aClass674_7 == null) {
			return;
		}
		arg1.method6823(arg2);
		if (arg7) {
			this.aClass674_7.method33098(arg0, (long) client.anInt3485, local2, local5, false);
		} else {
			this.aClass674_7.method33097((long) client.anInt3485);
		}
		this.aClass674_7.method33125(this.aByte162, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sp", name = "ah", descriptor = "()Z", line = 187)
	boolean method31066() {
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "(B)Z", line = 187)
	boolean method31074() {
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!sp", name = "ag", descriptor = "()Z", line = 187)
	boolean method31079() {
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!sp", name = "al", descriptor = "()Z", line = 187)
	boolean method31082() {
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!sp", name = "ae", descriptor = "()Z", line = 187)
	boolean method31093() {
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!sp", name = "ai", descriptor = "(Lclient!dh;)V", line = 191)
	void method31069(@OriginalArg(0) Class104 arg0) {
		this.method31072(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "(Lclient!dh;I)V", line = 191)
	void method31075(@OriginalArg(0) Class104 arg0) {
		this.method31072(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!sp", name = "as", descriptor = "(Lclient!dh;)V", line = 191)
	void method31095(@OriginalArg(0) Class104 arg0) {
		this.method31072(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!sp", name = "aw", descriptor = "(Lclient!dh;)V", line = 191)
	void method31098(@OriginalArg(0) Class104 arg0) {
		this.method31072(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!sp", name = "ac", descriptor = "(Lclient!dh;)V", line = 191)
	void method31100(@OriginalArg(0) Class104 arg0) {
		this.method31072(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "(Lclient!dh;B)V", line = 195)
	void method31076(@OriginalArg(0) Class104 arg0) {
		if (this.aClass93_Sub1_Sub4_5 != null) {
			@Pc(7) Class472 local7 = this.aClass132_Sub1_24.method24229().aClass472_61;
			client.aClass532_1.method30459().method31543(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local7.aFloat317, (int) local7.aFloat319, this.aBooleanArray31);
			this.aBooleanArray31 = null;
			this.aClass93_Sub1_Sub4_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "at", descriptor = "(Lclient!dh;)V", line = 195)
	void method31086(@OriginalArg(0) Class104 arg0) {
		if (this.aClass93_Sub1_Sub4_5 != null) {
			@Pc(7) Class472 local7 = this.aClass132_Sub1_24.method24229().aClass472_61;
			client.aClass532_1.method30459().method31543(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local7.aFloat317, (int) local7.aFloat319, this.aBooleanArray31);
			this.aBooleanArray31 = null;
			this.aClass93_Sub1_Sub4_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "ad", descriptor = "(Lclient!dh;)V", line = 195)
	void method31101(@OriginalArg(0) Class104 arg0) {
		if (this.aClass93_Sub1_Sub4_5 != null) {
			@Pc(7) Class472 local7 = this.aClass132_Sub1_24.method24229().aClass472_61;
			client.aClass532_1.method30459().method31543(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local7.aFloat317, (int) local7.aFloat319, this.aBooleanArray31);
			this.aBooleanArray31 = null;
			this.aClass93_Sub1_Sub4_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "am", descriptor = "(Lclient!dh;)V", line = 195)
	void method31102(@OriginalArg(0) Class104 arg0) {
		if (this.aClass93_Sub1_Sub4_5 != null) {
			@Pc(7) Class472 local7 = this.aClass132_Sub1_24.method24229().aClass472_61;
			client.aClass532_1.method30459().method31543(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local7.aFloat317, (int) local7.aFloat319, this.aBooleanArray31);
			this.aBooleanArray31 = null;
			this.aClass93_Sub1_Sub4_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(Lclient!alh;I)V", line = 204)
	void method31077(@OriginalArg(0) Class132_Sub1 arg0) {
		if (this.aClass19_9 != null && this.aClass19_9.method23552()) {
			this.aClass19_9.method23573(client.anInt3485 - this.anInt5323 * -1364674031);
			if (this.aClass19_9.method23581()) {
				this.aClass19_9.method23568(-1);
			}
			if (!this.aClass19_9.method23561()) {
				this.aClass19_8 = this.aClass19_9;
				this.aBoolean807 = true;
				this.anInt5323 = client.anInt3485 * -367692047;
				return;
			}
		}
		if (!this.aClass19_8.method23552()) {
			this.method31078(false, -1, 0, 0);
		} else if (this.aClass19_8.method23573(client.anInt3485 - this.anInt5323 * -1364674031)) {
			if (Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() == 2) {
				this.aBoolean806 = false;
			}
			if (this.aClass19_8.method23581()) {
				this.aClass19_8.method23568(-1);
				this.aBoolean807 = false;
				this.method31078(false, -1, 0, 0);
			}
		}
		this.anInt5323 = client.anInt3485 * -367692047;
	}

	@OriginalMember(owner = "client!sp", name = "au", descriptor = "(Lclient!alh;)V", line = 204)
	void method31097(@OriginalArg(0) Class132_Sub1 arg0) {
		if (this.aClass19_9 != null && this.aClass19_9.method23552()) {
			this.aClass19_9.method23573(client.anInt3485 - this.anInt5323 * -1364674031);
			if (this.aClass19_9.method23581()) {
				this.aClass19_9.method23568(-1);
			}
			if (!this.aClass19_9.method23561()) {
				this.aClass19_8 = this.aClass19_9;
				this.aBoolean807 = true;
				this.anInt5323 = client.anInt3485 * -367692047;
				return;
			}
		}
		if (!this.aClass19_8.method23552()) {
			this.method31078(false, -1, 0, 0);
		} else if (this.aClass19_8.method23573(client.anInt3485 - this.anInt5323 * -1364674031)) {
			if (Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() == 2) {
				this.aBoolean806 = false;
			}
			if (this.aClass19_8.method23581()) {
				this.aClass19_8.method23568(-1);
				this.aBoolean807 = false;
				this.method31078(false, -1, 0, 0);
			}
		}
		this.anInt5323 = client.anInt3485 * -367692047;
	}

	@OriginalMember(owner = "client!sp", name = "ar", descriptor = "(Lclient!alh;)V", line = 204)
	void method31104(@OriginalArg(0) Class132_Sub1 arg0) {
		if (this.aClass19_9 != null && this.aClass19_9.method23552()) {
			this.aClass19_9.method23573(client.anInt3485 - this.anInt5323 * -1364674031);
			if (this.aClass19_9.method23581()) {
				this.aClass19_9.method23568(-1);
			}
			if (!this.aClass19_9.method23561()) {
				this.aClass19_8 = this.aClass19_9;
				this.aBoolean807 = true;
				this.anInt5323 = client.anInt3485 * -367692047;
				return;
			}
		}
		if (!this.aClass19_8.method23552()) {
			this.method31078(false, -1, 0, 0);
		} else if (this.aClass19_8.method23573(client.anInt3485 - this.anInt5323 * -1364674031)) {
			if (Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() == 2) {
				this.aBoolean806 = false;
			}
			if (this.aClass19_8.method23581()) {
				this.aClass19_8.method23568(-1);
				this.aBoolean807 = false;
				this.method31078(false, -1, 0, 0);
			}
		}
		this.anInt5323 = client.anInt3485 * -367692047;
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(ZIIII)V", line = 231)
	void method31078(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class610 local16 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
			@Pc(18) Class610 local18 = local16;
			if (local16.anIntArray492 != null) {
				local16 = local16.method31982(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1);
			}
			if (local16 == null) {
				return;
			}
			if (local18 == local16) {
				local18 = null;
			}
			if (local16.method32009()) {
				if (!local16.aBoolean831 || Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16108() == 1) {
					if (arg0 && this.aClass19_8.method23552() && local16.method31998(this.aClass19_8.method23554())) {
						return;
					}
					if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
						local3 = local16.aBoolean837;
					}
					local1 = local16.method31988();
					if (local16.method32019()) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32009() && (!local18.aBoolean831 || Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16108() == 1)) {
				if (arg0 && this.aClass19_8.method23552() && local18.method31998(this.aClass19_8.method23554())) {
					return;
				}
				if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
					local3 = local18.aBoolean837;
				}
				local1 = local18.method31988();
				if (local18.method32019()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass19_8.method23557(-1, false);
		} else {
			this.aClass19_8.method23559(local1, arg3, arg2, local3);
			this.anInt5323 = client.anInt3485 * -367692047;
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "ap", descriptor = "(ZIII)V", line = 231)
	void method31105(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class610 local16 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
			@Pc(18) Class610 local18 = local16;
			if (local16.anIntArray492 != null) {
				local16 = local16.method31982(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1);
			}
			if (local16 == null) {
				return;
			}
			if (local18 == local16) {
				local18 = null;
			}
			if (local16.method32009()) {
				if (!local16.aBoolean831 || Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16108() == 1) {
					if (arg0 && this.aClass19_8.method23552() && local16.method31998(this.aClass19_8.method23554())) {
						return;
					}
					if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
						local3 = local16.aBoolean837;
					}
					local1 = local16.method31988();
					if (local16.method32019()) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32009() && (!local18.aBoolean831 || Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16108() == 1)) {
				if (arg0 && this.aClass19_8.method23552() && local18.method31998(this.aClass19_8.method23554())) {
					return;
				}
				if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
					local3 = local18.aBoolean837;
				}
				local1 = local18.method31988();
				if (local18.method32019()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass19_8.method23557(-1, false);
		} else {
			this.aClass19_8.method23559(local1, arg3, arg2, local3);
			this.anInt5323 = client.anInt3485 * -367692047;
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "aq", descriptor = "(ZIII)V", line = 231)
	void method31106(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class610 local16 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
			@Pc(18) Class610 local18 = local16;
			if (local16.anIntArray492 != null) {
				local16 = local16.method31982(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1);
			}
			if (local16 == null) {
				return;
			}
			if (local18 == local16) {
				local18 = null;
			}
			if (local16.method32009()) {
				if (!local16.aBoolean831 || Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16108() == 1) {
					if (arg0 && this.aClass19_8.method23552() && local16.method31998(this.aClass19_8.method23554())) {
						return;
					}
					if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
						local3 = local16.aBoolean837;
					}
					local1 = local16.method31988();
					if (local16.method32019()) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32009() && (!local18.aBoolean831 || Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16108() == 1)) {
				if (arg0 && this.aClass19_8.method23552() && local18.method31998(this.aClass19_8.method23554())) {
					return;
				}
				if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
					local3 = local18.aBoolean837;
				}
				local1 = local18.method31988();
				if (local18.method32019()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass19_8.method23557(-1, false);
		} else {
			this.aClass19_8.method23559(local1, arg3, arg2, local3);
			this.anInt5323 = client.anInt3485 * -367692047;
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "ax", descriptor = "(ZIII)V", line = 231)
	void method31107(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class610 local16 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785);
			@Pc(18) Class610 local18 = local16;
			if (local16.anIntArray492 != null) {
				local16 = local16.method31982(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1);
			}
			if (local16 == null) {
				return;
			}
			if (local18 == local16) {
				local18 = null;
			}
			if (local16.method32009()) {
				if (!local16.aBoolean831 || Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16108() == 1) {
					if (arg0 && this.aClass19_8.method23552() && local16.method31998(this.aClass19_8.method23554())) {
						return;
					}
					if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
						local3 = local16.aBoolean837;
					}
					local1 = local16.method31988();
					if (local16.method32019()) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32009() && (!local18.aBoolean831 || Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16108() == 1)) {
				if (arg0 && this.aClass19_8.method23552() && local18.method31998(this.aClass19_8.method23554())) {
					return;
				}
				if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
					local3 = local18.aBoolean837;
				}
				local1 = local18.method31988();
				if (local18.method32019()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass19_8.method23557(-1, false);
		} else {
			this.aClass19_8.method23559(local1, arg3, arg2, local3);
			this.anInt5323 = client.anInt3485 * -367692047;
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "aj", descriptor = "(IZB)V", line = 293)
	static void method31113(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28006(22, (long) arg0);
		local4.method21801();
		local4.anInt3020 = (arg1 ? 1 : 0) * 1415359557;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)V", line = 720)
	public static void method31108(@OriginalArg(0) int arg0) {
		Class312.aClass240_74.method25832(arg0);
		Class312.aClass240_77.method25832(arg0);
		Class312.aClass240_75.method25832(arg0);
		Class312.aClass240_76.method25832(arg0);
	}

	@OriginalMember(owner = "client!sp", name = "ig", descriptor = "(IIIII)V", line = 5605)
	static final void method31109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class448.method28919(Class694.aClass104_14);
		Class125_Sub3.method10063(arg0, arg1, arg2, arg3);
		Class522.method30359(arg0, arg1, arg2, arg3, 256, 256);
		Class487.method29817(arg0, arg1, arg2, arg3);
		Class271.method26307(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sp", name = "km", descriptor = "(ZI)V", line = 11903)
	public static final void method31110(@OriginalArg(0) boolean arg0) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_59, client.aClass175_2.aClass24_2);
		client.aClass175_2.method24351(local5);
		for (@Pc(14) Class93_Sub40 local14 = (Class93_Sub40) client.aClass16_22.method220(); local14 != null; local14 = (Class93_Sub40) client.aClass16_22.method222()) {
			if (!local14.method23970()) {
				local14 = (Class93_Sub40) client.aClass16_22.method220();
				if (local14 == null) {
					break;
				}
			}
			if (local14.anInt3171 * -256237711 == 0) {
				Class372.method28019(local14, true, arg0);
			}
		}
		if (client.aClass312_7 != null) {
			Class354.method27696(client.aClass312_7);
			client.aClass312_7 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "aph", descriptor = "(Lclient!yf;I)V", line = 12750)
	static final void method31112(@OriginalArg(0) Class681 arg0) {
		Class113_Sub1.method7427(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
	}

	@OriginalMember(owner = "client!sp", name = "axe", descriptor = "(Lclient!yf;I)V", line = 13928)
	static final void method31111(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class322 local18 = (Class322) Class542.aClass32_Sub2_3.method18261(local12);
		if (local18.aString174 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local18.aString174;
		}
	}
}
