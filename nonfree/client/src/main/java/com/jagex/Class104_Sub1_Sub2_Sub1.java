package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public class Class104_Sub1_Sub2_Sub1 extends Class104_Sub1_Sub2 implements Interface61 {

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "[I")
	static final int[] anIntArray136 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!aia", name = "g", descriptor = "[I")
	static final int[] anIntArray135 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "Lclient!tu;")
	Class563 aClass563_1;

	@OriginalMember(owner = "client!aia", name = "z", descriptor = "Lclient!anu;")
	Class35_Sub12 aClass35_Sub12_2;

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "I")
	final int anInt1289;

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "Z")
	final boolean aBoolean233;

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "B")
	final byte aByte25;

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "B")
	final byte aByte24;

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "Z")
	boolean aBoolean234;

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "Z")
	boolean aBoolean235;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "Z")
	boolean aBoolean236;

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "Lclient!dv;")
	Class84 aClass84_1;

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "Lclient!arp;")
	Class77_Sub1_Sub16 aClass77_Sub1_Sub16_1;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lclient!tk;Lclient!dx;Lclient!anu;Lclient!vm;IIIIIZIIZ)V", line = 40)
	public Class104_Sub1_Sub2_Sub1(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class35_Sub12 arg2, @OriginalArg(3) Class599 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, Class130_Sub1.method12489(arg10, arg11));
		this.aClass35_Sub12_2 = arg2;
		this.anInt1289 = arg3.anInt5510 * 637362465;
		this.aBoolean233 = arg9;
		this.aByte25 = (byte) arg10;
		this.aByte24 = (byte) arg11;
		this.aBoolean234 = arg3.anInt5518 * -2134171963 != 0 && !arg9;
		this.aBoolean235 = arg12;
		this.aBoolean236 = arg1.method20206() && arg3.aBoolean816 && !this.aBoolean233 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() != 0;
		@Pc(68) int local68 = 2048;
		if (this.aBoolean235) {
			local68 |= 0x10000;
		}
		if (arg3.aBoolean829) {
			local68 |= 0x80000;
		}
		@Pc(90) Class10 local90 = this.method11347(arg1, local68, this.aBoolean236);
		if (local90 != null) {
			this.aClass84_1 = (Class84) local90.anObject1;
			this.aClass77_Sub1_Sub16_1 = (Class77_Sub1_Sub16) local90.anObject2;
			if (this.aBoolean235 || arg3.aBoolean829) {
				this.aClass84_1 = this.aClass84_1.method6794((byte) 0, local68, false);
				if (arg3.aBoolean829) {
					@Pc(123) Class519 local123 = client.aClass517_1.method30422();
					this.aClass84_1.method6837(local123.anInt5123 * -1440569789, local123.anInt5124 * -1149266637, local123.anInt5125 * -469029139, local123.anInt5126 * -2027110357);
				}
			}
		}
		this.method24135(1);
	}

	@OriginalMember(owner = "client!aia", name = "bz", descriptor = "(I)Z", line = 68)
	@Override
	boolean method24139() {
		if (this.aClass84_1 == null) {
			return true;
		} else {
			return !this.aClass84_1.method6840();
		}
	}

	@OriginalMember(owner = "client!aia", name = "ci", descriptor = "()Z", line = 68)
	@Override
	boolean method24174() {
		if (this.aClass84_1 == null) {
			return true;
		} else {
			return !this.aClass84_1.method6840();
		}
	}

	@OriginalMember(owner = "client!aia", name = "co", descriptor = "()Z", line = 68)
	@Override
	boolean method24149() {
		if (this.aClass84_1 == null) {
			return true;
		} else {
			return !this.aClass84_1.method6840();
		}
	}

	@OriginalMember(owner = "client!aia", name = "bu", descriptor = "(I)Z", line = 73)
	@Override
	boolean method24140() {
		return this.aClass84_1 == null ? false : this.aClass84_1.method6809();
	}

	@OriginalMember(owner = "client!aia", name = "cn", descriptor = "()Z", line = 73)
	@Override
	boolean method24162() {
		return this.aClass84_1 == null ? false : this.aClass84_1.method6809();
	}

	@OriginalMember(owner = "client!aia", name = "cq", descriptor = "()Z", line = 73)
	@Override
	boolean method24154() {
		return this.aClass84_1 == null ? false : this.aClass84_1.method6809();
	}

	@OriginalMember(owner = "client!aia", name = "bt", descriptor = "(I)I", line = 78)
	@Override
	public int method24160() {
		return this.aClass84_1 == null ? 0 : this.aClass84_1.method6824();
	}

	@OriginalMember(owner = "client!aia", name = "cs", descriptor = "()I", line = 78)
	@Override
	public int method24151() {
		return this.aClass84_1 == null ? 0 : this.aClass84_1.method6824();
	}

	@OriginalMember(owner = "client!aia", name = "cy", descriptor = "()I", line = 78)
	@Override
	public int method24152() {
		return this.aClass84_1 == null ? 0 : this.aClass84_1.method6824();
	}

	@OriginalMember(owner = "client!aia", name = "bm", descriptor = "(II)I", line = 82)
	static int method11342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class593.aClass593_3.anInt5501 * 847393323 == arg0 || Class593.aClass593_5.anInt5501 * 847393323 == arg0 ? anIntArray135[arg1 & 0x3] : anIntArray136[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!aia", name = "bn", descriptor = "(Lclient!dx;IB)Lclient!dv;", line = 87)
	Class84 method11343(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_1 != null && arg0.method20116(this.aClass84_1.method6875(), arg1) == 0) {
			return this.aClass84_1;
		} else {
			@Pc(20) Class10 local20 = this.method11347(arg0, arg1, false);
			return local20 == null ? null : (Class84) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!aia", name = "bo", descriptor = "(Lclient!dx;I)Lclient!dv;", line = 87)
	Class84 method11344(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_1 != null && arg0.method20116(this.aClass84_1.method6875(), arg1) == 0) {
			return this.aClass84_1;
		} else {
			@Pc(20) Class10 local20 = this.method11347(arg0, arg1, false);
			return local20 == null ? null : (Class84) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!aia", name = "br", descriptor = "(Lclient!dx;I)Lclient!dv;", line = 87)
	Class84 method11345(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_1 != null && arg0.method20116(this.aClass84_1.method6875(), arg1) == 0) {
			return this.aClass84_1;
		} else {
			@Pc(20) Class10 local20 = this.method11347(arg0, arg1, false);
			return local20 == null ? null : (Class84) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!aia", name = "bq", descriptor = "(Lclient!dx;I)Lclient!dv;", line = 87)
	Class84 method11346(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_1 != null && arg0.method20116(this.aClass84_1.method6875(), arg1) == 0) {
			return this.aClass84_1;
		} else {
			@Pc(20) Class10 local20 = this.method11347(arg0, arg1, false);
			return local20 == null ? null : (Class84) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!aia", name = "bp", descriptor = "(Lclient!dx;IZI)Lclient!aai;", line = 94)
	Class10 method11347(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_2.method18319(this.anInt1289 * -1062339383);
		@Pc(19) Class88 local19;
		@Pc(25) Class88 local25;
		if (this.aBoolean233) {
			local19 = this.aClass556_23.aClass88Array3[this.aByte99];
			local25 = this.aClass556_23.aClass88Array2[0];
		} else {
			local19 = this.aClass556_23.aClass88Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass556_23.aClass88Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class447 local53 = this.method24085().aClass447_61;
		return local9.method32000(arg0, arg1, this.aByte25, this.aByte24, local19, local25, (int) local53.aFloat277, (int) local53.aFloat276, (int) local53.aFloat278, arg2, null);
	}

	@OriginalMember(owner = "client!aia", name = "bh", descriptor = "(Lclient!dx;IZ)Lclient!aai;", line = 94)
	Class10 method11348(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_2.method18319(this.anInt1289 * -1062339383);
		@Pc(19) Class88 local19;
		@Pc(25) Class88 local25;
		if (this.aBoolean233) {
			local19 = this.aClass556_23.aClass88Array3[this.aByte99];
			local25 = this.aClass556_23.aClass88Array2[0];
		} else {
			local19 = this.aClass556_23.aClass88Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass556_23.aClass88Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class447 local53 = this.method24085().aClass447_61;
		return local9.method32000(arg0, arg1, this.aByte25, this.aByte24, local19, local25, (int) local53.aFloat277, (int) local53.aFloat276, (int) local53.aFloat278, arg2, null);
	}

	@OriginalMember(owner = "client!aia", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 111)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_1 == null) {
			this.aClass563_1 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method11343(arg0, 0));
		}
		return this.aClass563_1;
	}

	@OriginalMember(owner = "client!aia", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 111)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_1 == null) {
			this.aClass563_1 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method11343(arg0, 0));
		}
		return this.aClass563_1;
	}

	@OriginalMember(owner = "client!aia", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 111)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_1 == null) {
			this.aClass563_1 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method11343(arg0, 0));
		}
		return this.aClass563_1;
	}

	@OriginalMember(owner = "client!aia", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 117)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		if (this.aClass84_1 == null) {
			return null;
		}
		@Pc(8) Class455 local8 = this.method24094();
		@Pc(13) Class551 local13 = Class346.method27844(this.aBoolean234);
		@Pc(24) Class441 local24 = ((Class599) this.aClass35_Sub12_2.method18319(this.anInt1289 * -1062339383)).aClass441_2;
		if (local24 == null) {
			this.aClass84_1.method6813(local8, this.aClass224Array21[0], 0);
		} else {
			this.aClass84_1.method6813(local8, null, 0);
			arg0.method20099(local8, this.aClass224Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!aia", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 117)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		if (this.aClass84_1 == null) {
			return null;
		}
		@Pc(8) Class455 local8 = this.method24094();
		@Pc(13) Class551 local13 = Class346.method27844(this.aBoolean234);
		@Pc(24) Class441 local24 = ((Class599) this.aClass35_Sub12_2.method18319(this.anInt1289 * -1062339383)).aClass441_2;
		if (local24 == null) {
			this.aClass84_1.method6813(local8, this.aClass224Array21[0], 0);
		} else {
			this.aClass84_1.method6813(local8, null, 0);
			arg0.method20099(local8, this.aClass224Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!aia", name = "fs", descriptor = "(Lclient!dx;I)V", line = 129)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!aia", name = "fn", descriptor = "(Lclient!dx;)V", line = 129)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!aia", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 132)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_2.method18319(this.anInt1289 * -1062339383)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method11343(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!aia", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 132)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_2.method18319(this.anInt1289 * -1062339383)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method11343(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!aia", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 132)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_2.method18319(this.anInt1289 * -1062339383)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method11343(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!aia", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 132)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_2.method18319(this.anInt1289 * -1062339383)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method11343(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!aia", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 132)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_2.method18319(this.anInt1289 * -1062339383)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method11343(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!aia", name = "fu", descriptor = "(B)Z", line = 143)
	@Override
	boolean method24138() {
		return this.aBoolean235;
	}

	@OriginalMember(owner = "client!aia", name = "fx", descriptor = "()Z", line = 143)
	@Override
	boolean method24148() {
		return this.aBoolean235;
	}

	@OriginalMember(owner = "client!aia", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 147)
	@Override
	void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class104_Sub1_Sub2_Sub1) {
			@Pc(5) Class104_Sub1_Sub2_Sub1 local5 = (Class104_Sub1_Sub2_Sub1) arg1;
			if (this.aClass84_1 != null && local5.aClass84_1 != null) {
				this.aClass84_1.method6855(local5.aClass84_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class104_Sub1_Sub1_Sub2) {
			@Pc(29) Class104_Sub1_Sub1_Sub2 local29 = (Class104_Sub1_Sub1_Sub2) arg1;
			if (this.aClass84_1 != null && local29.aClass84_2 != null) {
				this.aClass84_1.method6855(local29.aClass84_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!aia", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 147)
	@Override
	void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class104_Sub1_Sub2_Sub1) {
			@Pc(5) Class104_Sub1_Sub2_Sub1 local5 = (Class104_Sub1_Sub2_Sub1) arg1;
			if (this.aClass84_1 != null && local5.aClass84_1 != null) {
				this.aClass84_1.method6855(local5.aClass84_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class104_Sub1_Sub1_Sub2) {
			@Pc(29) Class104_Sub1_Sub1_Sub2 local29 = (Class104_Sub1_Sub1_Sub2) arg1;
			if (this.aClass84_1 != null && local29.aClass84_2 != null) {
				this.aClass84_1.method6855(local29.aClass84_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!aia", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 147)
	@Override
	void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class104_Sub1_Sub2_Sub1) {
			@Pc(5) Class104_Sub1_Sub2_Sub1 local5 = (Class104_Sub1_Sub2_Sub1) arg1;
			if (this.aClass84_1 != null && local5.aClass84_1 != null) {
				this.aClass84_1.method6855(local5.aClass84_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class104_Sub1_Sub1_Sub2) {
			@Pc(29) Class104_Sub1_Sub1_Sub2 local29 = (Class104_Sub1_Sub1_Sub2) arg1;
			if (this.aClass84_1 != null && local29.aClass84_2 != null) {
				this.aClass84_1.method6855(local29.aClass84_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!aia", name = "gr", descriptor = "()V", line = 158)
	@Override
	void method24136() {
		this.aBoolean235 = false;
		if (this.aClass84_1 != null) {
			this.aClass84_1.method6795(this.aClass84_1.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!aia", name = "gj", descriptor = "()V", line = 158)
	@Override
	void method24150() {
		this.aBoolean235 = false;
		if (this.aClass84_1 != null) {
			this.aClass84_1.method6795(this.aClass84_1.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!aia", name = "gi", descriptor = "()V", line = 158)
	@Override
	void method24164() {
		this.aBoolean235 = false;
		if (this.aClass84_1 != null) {
			this.aClass84_1.method6795(this.aClass84_1.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!aia", name = "fd", descriptor = "(I)V", line = 158)
	@Override
	void method24142() {
		this.aBoolean235 = false;
		if (this.aClass84_1 != null) {
			this.aClass84_1.method6795(this.aClass84_1.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "()I", line = 163)
	@Override
	public int method13067() {
		return this.anInt1289 * -1062339383;
	}

	@OriginalMember(owner = "client!aia", name = "p", descriptor = "(I)I", line = 163)
	@Override
	public int method13060() {
		return this.anInt1289 * -1062339383;
	}

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "()I", line = 163)
	@Override
	public int method13076() {
		return this.anInt1289 * -1062339383;
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "()I", line = 163)
	@Override
	public int method13077() {
		return this.anInt1289 * -1062339383;
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(I)I", line = 167)
	@Override
	public int method13057() {
		return this.aByte25;
	}

	@OriginalMember(owner = "client!aia", name = "x", descriptor = "()I", line = 167)
	@Override
	public int method13064() {
		return this.aByte25;
	}

	@OriginalMember(owner = "client!aia", name = "v", descriptor = "(I)I", line = 171)
	@Override
	public int method13058() {
		return this.aByte24;
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "()I", line = 171)
	@Override
	public int method13065() {
		return this.aByte24;
	}

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "()I", line = 171)
	@Override
	public int method13073() {
		return this.aByte24;
	}

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "()V", line = 175)
	@Override
	public void method13079() {
		if (this.aClass84_1 != null) {
			this.aClass84_1.method6796();
		}
	}

	@OriginalMember(owner = "client!aia", name = "g", descriptor = "()V", line = 175)
	@Override
	public void method13068() {
		if (this.aClass84_1 != null) {
			this.aClass84_1.method6796();
		}
	}

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "(I)V", line = 175)
	@Override
	public void method13059() {
		if (this.aClass84_1 != null) {
			this.aClass84_1.method6796();
		}
	}

	@OriginalMember(owner = "client!aia", name = "w", descriptor = "(B)Z", line = 179)
	@Override
	public boolean method13062() {
		return true;
	}

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "()Z", line = 179)
	@Override
	public boolean method13061() {
		return true;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "()Z", line = 179)
	@Override
	public boolean method13066() {
		return true;
	}

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "()Z", line = 179)
	@Override
	public boolean method13080() {
		return true;
	}

	@OriginalMember(owner = "client!aia", name = "h", descriptor = "()Z", line = 179)
	@Override
	public boolean method13081() {
		return true;
	}

	@OriginalMember(owner = "client!aia", name = "z", descriptor = "()Z", line = 183)
	@Override
	public boolean method13069() {
		return this.aBoolean236;
	}

	@OriginalMember(owner = "client!aia", name = "y", descriptor = "(B)Z", line = 183)
	@Override
	public boolean method13072() {
		return this.aBoolean236;
	}

	@OriginalMember(owner = "client!aia", name = "t", descriptor = "(Lclient!dx;B)V", line = 187)
	@Override
	public void method13056(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_1 == null && this.aBoolean236) {
			@Pc(14) Class10 local14 = this.method11347(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_1;
			this.aClass77_Sub1_Sub16_1 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "(Lclient!dx;)V", line = 187)
	@Override
	public void method13070(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_1 == null && this.aBoolean236) {
			@Pc(14) Class10 local14 = this.method11347(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_1;
			this.aClass77_Sub1_Sub16_1 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "(Lclient!dx;)V", line = 187)
	@Override
	public void method13071(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_1 == null && this.aBoolean236) {
			@Pc(14) Class10 local14 = this.method11347(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_1;
			this.aClass77_Sub1_Sub16_1 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "(Lclient!dx;)V", line = 187)
	@Override
	public void method13078(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_1 == null && this.aBoolean236) {
			@Pc(14) Class10 local14 = this.method11347(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_1;
			this.aClass77_Sub1_Sub16_1 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aia", name = "q", descriptor = "(Lclient!dx;I)V", line = 201)
	@Override
	public void method13063(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_1 == null && this.aBoolean236) {
			@Pc(15) Class10 local15 = this.method11347(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_1;
			this.aClass77_Sub1_Sub16_1 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "(Lclient!dx;)V", line = 201)
	@Override
	public void method13075(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_1 == null && this.aBoolean236) {
			@Pc(15) Class10 local15 = this.method11347(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_1;
			this.aClass77_Sub1_Sub16_1 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "(Lclient!dx;)V", line = 201)
	@Override
	public void method13074(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_1 == null && this.aBoolean236) {
			@Pc(15) Class10 local15 = this.method11347(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_1;
			this.aClass77_Sub1_Sub16_1 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aia", name = "lj", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6696)
	static final void method11349(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray6 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!aia", name = "asg", descriptor = "(Lclient!yf;I)V", line = 12543)
	static final void method11350(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
