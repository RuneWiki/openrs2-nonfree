package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajg")
public class Class132_Sub1_Sub2_Sub1 extends Class132_Sub1_Sub2 implements Interface61 {

	@OriginalMember(owner = "client!ajg", name = "c", descriptor = "[I")
	static final int[] anIntArray169 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ajg", name = "r", descriptor = "[I")
	static final int[] anIntArray168 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ajg", name = "y", descriptor = "Lclient!uq;")
	Class600 aClass600_1;

	@OriginalMember(owner = "client!ajg", name = "v", descriptor = "Lclient!aop;")
	Class32_Sub14 aClass32_Sub14_2;

	@OriginalMember(owner = "client!ajg", name = "q", descriptor = "I")
	final int anInt1425;

	@OriginalMember(owner = "client!ajg", name = "h", descriptor = "Z")
	final boolean aBoolean270;

	@OriginalMember(owner = "client!ajg", name = "b", descriptor = "B")
	final byte aByte29;

	@OriginalMember(owner = "client!ajg", name = "x", descriptor = "B")
	final byte aByte28;

	@OriginalMember(owner = "client!ajg", name = "a", descriptor = "Z")
	boolean aBoolean271;

	@OriginalMember(owner = "client!ajg", name = "g", descriptor = "Z")
	boolean aBoolean272;

	@OriginalMember(owner = "client!ajg", name = "i", descriptor = "Z")
	boolean aBoolean273;

	@OriginalMember(owner = "client!ajg", name = "j", descriptor = "I")
	int anInt1426;

	@OriginalMember(owner = "client!ajg", name = "o", descriptor = "Lclient!do;")
	Class109 aClass109_1;

	@OriginalMember(owner = "client!ajg", name = "s", descriptor = "Lclient!ara;")
	Class93_Sub1_Sub4 aClass93_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ajg", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIIZLclient!oe;)V", line = 42)
	public Class132_Sub1_Sub2_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) Class458 arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, Class212.method25443(arg10, arg11), arg13);
		this.aClass32_Sub14_2 = arg2;
		this.anInt1425 = arg3.anInt5587 * 2106732351;
		this.aBoolean270 = arg9;
		this.aByte29 = (byte) arg10;
		this.aByte28 = (byte) arg11;
		this.aBoolean271 = arg3.anInt5592 * 1067969079 != 0 && !arg9;
		this.aBoolean272 = arg12;
		this.aBoolean273 = arg1.method20424() && arg3.aBoolean828 && !this.aBoolean270 && Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() != 0;
		this.anInt1426 = arg7 * -1838296407;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean272) {
			local74 |= 0x10000;
		}
		if (arg3.aBoolean842) {
			local74 |= 0x80000;
		}
		@Pc(96) Class34 local96 = this.method12070(arg1, local74, this.aBoolean273);
		if (local96 != null) {
			this.aClass109_1 = (Class109) local96.anObject1;
			this.aClass93_Sub1_Sub4_1 = (Class93_Sub1_Sub4) local96.anObject2;
			if (this.aBoolean272 || arg3.aBoolean842) {
				this.aClass109_1 = this.aClass109_1.method6907((byte) 0, local74, false);
				if (arg3.aBoolean842) {
					@Pc(129) Class528 local129 = client.aClass532_1.method30438();
					this.aClass109_1.method6879(local129.anInt5229 * 1660167749, local129.anInt5227 * -831110151, local129.anInt5228 * 1060946059, local129.anInt5226 * -1883995863);
				}
			}
		}
		this.method24276(1);
	}

	@OriginalMember(owner = "client!ajg", name = "bu", descriptor = "(B)Z", line = 71)
	@Override
	boolean method24262() {
		if (this.aClass109_1 == null) {
			return true;
		} else {
			return !this.aClass109_1.method6946();
		}
	}

	@OriginalMember(owner = "client!ajg", name = "co", descriptor = "()Z", line = 71)
	@Override
	boolean method24278() {
		if (this.aClass109_1 == null) {
			return true;
		} else {
			return !this.aClass109_1.method6946();
		}
	}

	@OriginalMember(owner = "client!ajg", name = "cf", descriptor = "()Z", line = 71)
	@Override
	boolean method24299() {
		if (this.aClass109_1 == null) {
			return true;
		} else {
			return !this.aClass109_1.method6946();
		}
	}

	@OriginalMember(owner = "client!ajg", name = "cr", descriptor = "()Z", line = 76)
	@Override
	boolean method24279() {
		return this.aClass109_1 == null ? false : this.aClass109_1.method6865();
	}

	@OriginalMember(owner = "client!ajg", name = "cm", descriptor = "()Z", line = 76)
	@Override
	boolean method24280() {
		return this.aClass109_1 == null ? false : this.aClass109_1.method6865();
	}

	@OriginalMember(owner = "client!ajg", name = "cq", descriptor = "()Z", line = 76)
	@Override
	boolean method24281() {
		return this.aClass109_1 == null ? false : this.aClass109_1.method6865();
	}

	@OriginalMember(owner = "client!ajg", name = "bw", descriptor = "(S)Z", line = 76)
	@Override
	boolean method24263() {
		return this.aClass109_1 == null ? false : this.aClass109_1.method6865();
	}

	@OriginalMember(owner = "client!ajg", name = "by", descriptor = "(B)I", line = 81)
	@Override
	public int method24289() {
		return this.aClass109_1 == null ? 0 : this.aClass109_1.method6882();
	}

	@OriginalMember(owner = "client!ajg", name = "ch", descriptor = "()I", line = 81)
	@Override
	public int method24282() {
		return this.aClass109_1 == null ? 0 : this.aClass109_1.method6882();
	}

	@OriginalMember(owner = "client!ajg", name = "bg", descriptor = "(II)I", line = 85)
	static int method12072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class615.aClass615_10.anInt5628 * 948246811 || Class615.aClass615_5.anInt5628 * 948246811 == arg0 ? anIntArray168[arg1 & 0x3] : anIntArray169[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ajg", name = "bv", descriptor = "(Lclient!dh;II)Lclient!do;", line = 90)
	Class109 method12069(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_1 != null && arg0.method20693(this.aClass109_1.method6825(), arg1) == 0) {
			return this.aClass109_1;
		} else {
			@Pc(20) Class34 local20 = this.method12070(arg0, arg1, false);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajg", name = "bp", descriptor = "(Lclient!dh;I)Lclient!do;", line = 90)
	Class109 method12071(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_1 != null && arg0.method20693(this.aClass109_1.method6825(), arg1) == 0) {
			return this.aClass109_1;
		} else {
			@Pc(20) Class34 local20 = this.method12070(arg0, arg1, false);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajg", name = "ba", descriptor = "(Lclient!dh;I)Lclient!do;", line = 90)
	Class109 method12073(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_1 != null && arg0.method20693(this.aClass109_1.method6825(), arg1) == 0) {
			return this.aClass109_1;
		} else {
			@Pc(20) Class34 local20 = this.method12070(arg0, arg1, false);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajg", name = "br", descriptor = "(Lclient!dh;IZI)Lclient!abg;", line = 97)
	Class34 method12070(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_2.method18261(this.anInt1425 * 1277939167);
		@Pc(19) Class99 local19;
		@Pc(25) Class99 local25;
		if (this.aBoolean270) {
			local19 = this.aClass585_23.aClass99Array3[this.aByte99];
			local25 = this.aClass585_23.aClass99Array2[0];
		} else {
			local19 = this.aClass585_23.aClass99Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass585_23.aClass99Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class472 local53 = this.method24229().aClass472_61;
		return local9.method31980(arg0, arg1, this.aByte29, this.aByte28, local19, local25, (int) local53.aFloat317, this.anInt1426 * 1143796121, (int) local53.aFloat319, arg2, null);
	}

	@OriginalMember(owner = "client!ajg", name = "bj", descriptor = "(Lclient!dh;IZ)Lclient!abg;", line = 97)
	Class34 method12074(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_2.method18261(this.anInt1425 * 1277939167);
		@Pc(19) Class99 local19;
		@Pc(25) Class99 local25;
		if (this.aBoolean270) {
			local19 = this.aClass585_23.aClass99Array3[this.aByte99];
			local25 = this.aClass585_23.aClass99Array2[0];
		} else {
			local19 = this.aClass585_23.aClass99Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass585_23.aClass99Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class472 local53 = this.method24229().aClass472_61;
		return local9.method31980(arg0, arg1, this.aByte29, this.aByte28, local19, local25, (int) local53.aFloat317, this.anInt1426 * 1143796121, (int) local53.aFloat319, arg2, null);
	}

	@OriginalMember(owner = "client!ajg", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;", line = 114)
	@Override
	public Class600 method24298(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		if (this.aClass600_1 == null) {
			this.aClass600_1 = Class62.method1154((int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319, this.method12069(arg0, 0));
		}
		return this.aClass600_1;
	}

	@OriginalMember(owner = "client!ajg", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;", line = 114)
	@Override
	public Class600 method24284(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		if (this.aClass600_1 == null) {
			this.aClass600_1 = Class62.method1154((int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319, this.method12069(arg0, 0));
		}
		return this.aClass600_1;
	}

	@OriginalMember(owner = "client!ajg", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;", line = 114)
	@Override
	public Class600 method24283(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		if (this.aClass600_1 == null) {
			this.aClass600_1 = Class62.method1154((int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319, this.method12069(arg0, 0));
		}
		return this.aClass600_1;
	}

	@OriginalMember(owner = "client!ajg", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;", line = 120)
	@Override
	Class573 method24266(@OriginalArg(0) Class104 arg0) {
		if (this.aClass109_1 == null) {
			return null;
		}
		@Pc(7) Class470 local7 = this.method24226();
		@Pc(12) Class573 local12 = Class125_Sub1.method9214(this.aBoolean271);
		@Pc(23) Class463 local23 = ((Class610) this.aClass32_Sub14_2.method18261(this.anInt1425 * 1277939167)).aClass463_2;
		if (local23 == null) {
			this.aClass109_1.method6947(local7, this.aClass241Array21[0], 0);
		} else {
			this.aClass109_1.method6947(local7, null, 0);
			arg0.method20492(local7, this.aClass241Array21[0], local23);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ajg", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;", line = 120)
	@Override
	Class573 method24271(@OriginalArg(0) Class104 arg0) {
		if (this.aClass109_1 == null) {
			return null;
		}
		@Pc(7) Class470 local7 = this.method24226();
		@Pc(12) Class573 local12 = Class125_Sub1.method9214(this.aBoolean271);
		@Pc(23) Class463 local23 = ((Class610) this.aClass32_Sub14_2.method18261(this.anInt1425 * 1277939167)).aClass463_2;
		if (local23 == null) {
			this.aClass109_1.method6947(local7, this.aClass241Array21[0], 0);
		} else {
			this.aClass109_1.method6947(local7, null, 0);
			arg0.method20492(local7, this.aClass241Array21[0], local23);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ajg", name = "fe", descriptor = "(Lclient!dh;)V", line = 132)
	@Override
	void method24303(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!ajg", name = "fy", descriptor = "(Lclient!dh;)V", line = 132)
	@Override
	void method24294(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!ajg", name = "fw", descriptor = "(Lclient!dh;I)V", line = 132)
	@Override
	void method24267(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!ajg", name = "fa", descriptor = "(Lclient!dh;IIB)Z", line = 135)
	@Override
	boolean method24259(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class463 local10 = ((Class610) this.aClass32_Sub14_2.method18261(this.anInt1425 * 1277939167)).aClass463_2;
		if (local10 != null) {
			return arg0.method20490(arg1, arg2, this.method24226(), local10);
		}
		@Pc(27) Class109 local27 = this.method12069(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class470 local32 = this.method24226();
			return local27.method6859(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "fk", descriptor = "(Lclient!dh;II)Z", line = 135)
	@Override
	boolean method24290(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class463 local10 = ((Class610) this.aClass32_Sub14_2.method18261(this.anInt1425 * 1277939167)).aClass463_2;
		if (local10 != null) {
			return arg0.method20490(arg1, arg2, this.method24226(), local10);
		}
		@Pc(27) Class109 local27 = this.method12069(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class470 local32 = this.method24226();
			return local27.method6859(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "fp", descriptor = "(I)Z", line = 146)
	@Override
	boolean method24261() {
		return this.aBoolean272;
	}

	@OriginalMember(owner = "client!ajg", name = "fr", descriptor = "()Z", line = 146)
	@Override
	boolean method24292() {
		return this.aBoolean272;
	}

	@OriginalMember(owner = "client!ajg", name = "fh", descriptor = "()Z", line = 146)
	@Override
	boolean method24272() {
		return this.aBoolean272;
	}

	@OriginalMember(owner = "client!ajg", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 150)
	@Override
	void method24295(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class132_Sub1_Sub2_Sub1) {
			@Pc(5) Class132_Sub1_Sub2_Sub1 local5 = (Class132_Sub1_Sub2_Sub1) arg1;
			if (this.aClass109_1 != null && local5.aClass109_1 != null) {
				this.aClass109_1.method6820(local5.aClass109_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class132_Sub1_Sub1_Sub2) {
			@Pc(29) Class132_Sub1_Sub1_Sub2 local29 = (Class132_Sub1_Sub1_Sub2) arg1;
			if (this.aClass109_1 != null && local29.aClass109_3 != null) {
				this.aClass109_1.method6820(local29.aClass109_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajg", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V", line = 150)
	@Override
	void method24269(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class132_Sub1_Sub2_Sub1) {
			@Pc(5) Class132_Sub1_Sub2_Sub1 local5 = (Class132_Sub1_Sub2_Sub1) arg1;
			if (this.aClass109_1 != null && local5.aClass109_1 != null) {
				this.aClass109_1.method6820(local5.aClass109_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class132_Sub1_Sub1_Sub2) {
			@Pc(29) Class132_Sub1_Sub1_Sub2 local29 = (Class132_Sub1_Sub1_Sub2) arg1;
			if (this.aClass109_1 != null && local29.aClass109_3 != null) {
				this.aClass109_1.method6820(local29.aClass109_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajg", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 150)
	@Override
	void method24293(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class132_Sub1_Sub2_Sub1) {
			@Pc(5) Class132_Sub1_Sub2_Sub1 local5 = (Class132_Sub1_Sub2_Sub1) arg1;
			if (this.aClass109_1 != null && local5.aClass109_1 != null) {
				this.aClass109_1.method6820(local5.aClass109_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class132_Sub1_Sub1_Sub2) {
			@Pc(29) Class132_Sub1_Sub1_Sub2 local29 = (Class132_Sub1_Sub1_Sub2) arg1;
			if (this.aClass109_1 != null && local29.aClass109_3 != null) {
				this.aClass109_1.method6820(local29.aClass109_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajg", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 150)
	@Override
	void method24296(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class132_Sub1_Sub2_Sub1) {
			@Pc(5) Class132_Sub1_Sub2_Sub1 local5 = (Class132_Sub1_Sub2_Sub1) arg1;
			if (this.aClass109_1 != null && local5.aClass109_1 != null) {
				this.aClass109_1.method6820(local5.aClass109_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class132_Sub1_Sub1_Sub2) {
			@Pc(29) Class132_Sub1_Sub1_Sub2 local29 = (Class132_Sub1_Sub1_Sub2) arg1;
			if (this.aClass109_1 != null && local29.aClass109_3 != null) {
				this.aClass109_1.method6820(local29.aClass109_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajg", name = "ff", descriptor = "(B)V", line = 161)
	@Override
	void method24265() {
		this.aBoolean272 = false;
		if (this.aClass109_1 != null) {
			this.aClass109_1.method6824(this.aClass109_1.method6825() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "go", descriptor = "()V", line = 161)
	@Override
	void method24257() {
		this.aBoolean272 = false;
		if (this.aClass109_1 != null) {
			this.aClass109_1.method6824(this.aClass109_1.method6825() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "gk", descriptor = "()V", line = 161)
	@Override
	void method24297() {
		this.aBoolean272 = false;
		if (this.aClass109_1 != null) {
			this.aClass109_1.method6824(this.aClass109_1.method6825() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "z", descriptor = "()I", line = 166)
	@Override
	public int method13410() {
		return this.anInt1425 * 1277939167;
	}

	@OriginalMember(owner = "client!ajg", name = "p", descriptor = "()I", line = 166)
	@Override
	public int method13411() {
		return this.anInt1425 * 1277939167;
	}

	@OriginalMember(owner = "client!ajg", name = "e", descriptor = "(I)I", line = 166)
	@Override
	public int method13423() {
		return this.anInt1425 * 1277939167;
	}

	@OriginalMember(owner = "client!ajg", name = "n", descriptor = "(I)I", line = 170)
	@Override
	public int method13420() {
		return this.aByte29;
	}

	@OriginalMember(owner = "client!ajg", name = "d", descriptor = "()I", line = 170)
	@Override
	public int method13403() {
		return this.aByte29;
	}

	@OriginalMember(owner = "client!ajg", name = "r", descriptor = "()I", line = 174)
	@Override
	public int method13416() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!ajg", name = "o", descriptor = "()I", line = 174)
	@Override
	public int method13414() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!ajg", name = "m", descriptor = "(I)I", line = 174)
	@Override
	public int method13404() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!ajg", name = "c", descriptor = "()I", line = 174)
	@Override
	public int method13413() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!ajg", name = "v", descriptor = "()I", line = 174)
	@Override
	public int method13412() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!ajg", name = "k", descriptor = "(I)V", line = 178)
	@Override
	public void method13405() {
		if (this.aClass109_1 != null) {
			this.aClass109_1.method6950();
		}
	}

	@OriginalMember(owner = "client!ajg", name = "j", descriptor = "()V", line = 178)
	@Override
	public void method13426() {
		if (this.aClass109_1 != null) {
			this.aClass109_1.method6950();
		}
	}

	@OriginalMember(owner = "client!ajg", name = "i", descriptor = "()V", line = 178)
	@Override
	public void method13425() {
		if (this.aClass109_1 != null) {
			this.aClass109_1.method6950();
		}
	}

	@OriginalMember(owner = "client!ajg", name = "w", descriptor = "(B)Z", line = 182)
	@Override
	public boolean method13407() {
		return true;
	}

	@OriginalMember(owner = "client!ajg", name = "t", descriptor = "()Z", line = 182)
	@Override
	public boolean method13427() {
		return true;
	}

	@OriginalMember(owner = "client!ajg", name = "f", descriptor = "(I)Z", line = 186)
	@Override
	public boolean method13406() {
		return this.aBoolean273;
	}

	@OriginalMember(owner = "client!ajg", name = "s", descriptor = "()Z", line = 186)
	@Override
	public boolean method13415() {
		return this.aBoolean273;
	}

	@OriginalMember(owner = "client!ajg", name = "y", descriptor = "(Lclient!dh;)V", line = 190)
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		@Pc(24) Class93_Sub1_Sub4 local24;
		if (this.aClass93_Sub1_Sub4_1 == null && this.aBoolean273) {
			@Pc(15) Class34 local15 = this.method12070(arg0, 262144, true);
			local24 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local24 = this.aClass93_Sub1_Sub4_1;
			this.aClass93_Sub1_Sub4_1 = null;
		}
		@Pc(35) Class472 local35 = this.method24229().aClass472_61;
		if (local24 != null) {
			this.aClass585_23.method31479(local24, this.aByte99, (int) local35.aFloat317, (int) local35.aFloat319, null);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "b", descriptor = "(Lclient!dh;)V", line = 190)
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		@Pc(24) Class93_Sub1_Sub4 local24;
		if (this.aClass93_Sub1_Sub4_1 == null && this.aBoolean273) {
			@Pc(15) Class34 local15 = this.method12070(arg0, 262144, true);
			local24 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local24 = this.aClass93_Sub1_Sub4_1;
			this.aClass93_Sub1_Sub4_1 = null;
		}
		@Pc(35) Class472 local35 = this.method24229().aClass472_61;
		if (local24 != null) {
			this.aClass585_23.method31479(local24, this.aByte99, (int) local35.aFloat317, (int) local35.aFloat319, null);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "l", descriptor = "(Lclient!dh;B)V", line = 190)
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0) {
		@Pc(24) Class93_Sub1_Sub4 local24;
		if (this.aClass93_Sub1_Sub4_1 == null && this.aBoolean273) {
			@Pc(15) Class34 local15 = this.method12070(arg0, 262144, true);
			local24 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local24 = this.aClass93_Sub1_Sub4_1;
			this.aClass93_Sub1_Sub4_1 = null;
		}
		@Pc(35) Class472 local35 = this.method24229().aClass472_61;
		if (local24 != null) {
			this.aClass585_23.method31479(local24, this.aByte99, (int) local35.aFloat317, (int) local35.aFloat319, null);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "q", descriptor = "(Lclient!dh;)V", line = 190)
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		@Pc(24) Class93_Sub1_Sub4 local24;
		if (this.aClass93_Sub1_Sub4_1 == null && this.aBoolean273) {
			@Pc(15) Class34 local15 = this.method12070(arg0, 262144, true);
			local24 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local24 = this.aClass93_Sub1_Sub4_1;
			this.aClass93_Sub1_Sub4_1 = null;
		}
		@Pc(35) Class472 local35 = this.method24229().aClass472_61;
		if (local24 != null) {
			this.aClass585_23.method31479(local24, this.aByte99, (int) local35.aFloat317, (int) local35.aFloat319, null);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "x", descriptor = "(Lclient!dh;)V", line = 190)
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		@Pc(24) Class93_Sub1_Sub4 local24;
		if (this.aClass93_Sub1_Sub4_1 == null && this.aBoolean273) {
			@Pc(15) Class34 local15 = this.method12070(arg0, 262144, true);
			local24 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local24 = this.aClass93_Sub1_Sub4_1;
			this.aClass93_Sub1_Sub4_1 = null;
		}
		@Pc(35) Class472 local35 = this.method24229().aClass472_61;
		if (local24 != null) {
			this.aClass585_23.method31479(local24, this.aByte99, (int) local35.aFloat317, (int) local35.aFloat319, null);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "u", descriptor = "(Lclient!dh;B)V", line = 204)
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0) {
		@Pc(23) Class93_Sub1_Sub4 local23;
		if (this.aClass93_Sub1_Sub4_1 == null && this.aBoolean273) {
			@Pc(15) Class34 local15 = this.method12070(arg0, 262144, true);
			local23 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local23 = this.aClass93_Sub1_Sub4_1;
			this.aClass93_Sub1_Sub4_1 = null;
		}
		@Pc(34) Class472 local34 = this.method24229().aClass472_61;
		if (local23 != null) {
			this.aClass585_23.method31543(local23, this.aByte99, (int) local34.aFloat317, (int) local34.aFloat319, null);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "h", descriptor = "(Lclient!dh;)V", line = 204)
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		@Pc(23) Class93_Sub1_Sub4 local23;
		if (this.aClass93_Sub1_Sub4_1 == null && this.aBoolean273) {
			@Pc(15) Class34 local15 = this.method12070(arg0, 262144, true);
			local23 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local23 = this.aClass93_Sub1_Sub4_1;
			this.aClass93_Sub1_Sub4_1 = null;
		}
		@Pc(34) Class472 local34 = this.method24229().aClass472_61;
		if (local23 != null) {
			this.aClass585_23.method31543(local23, this.aByte99, (int) local34.aFloat317, (int) local34.aFloat319, null);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "a", descriptor = "(Lclient!dh;)V", line = 204)
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		@Pc(23) Class93_Sub1_Sub4 local23;
		if (this.aClass93_Sub1_Sub4_1 == null && this.aBoolean273) {
			@Pc(15) Class34 local15 = this.method12070(arg0, 262144, true);
			local23 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local23 = this.aClass93_Sub1_Sub4_1;
			this.aClass93_Sub1_Sub4_1 = null;
		}
		@Pc(34) Class472 local34 = this.method24229().aClass472_61;
		if (local23 != null) {
			this.aClass585_23.method31543(local23, this.aByte99, (int) local34.aFloat317, (int) local34.aFloat319, null);
		}
	}

	@OriginalMember(owner = "client!ajg", name = "g", descriptor = "(Lclient!dh;)V", line = 204)
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		@Pc(23) Class93_Sub1_Sub4 local23;
		if (this.aClass93_Sub1_Sub4_1 == null && this.aBoolean273) {
			@Pc(15) Class34 local15 = this.method12070(arg0, 262144, true);
			local23 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local23 = this.aClass93_Sub1_Sub4_1;
			this.aClass93_Sub1_Sub4_1 = null;
		}
		@Pc(34) Class472 local34 = this.method24229().aClass472_61;
		if (local23 != null) {
			this.aClass585_23.method31543(local23, this.aByte99, (int) local34.aFloat317, (int) local34.aFloat319, null);
		}
	}
}
