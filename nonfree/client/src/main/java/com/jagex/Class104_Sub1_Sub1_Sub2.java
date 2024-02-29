package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aib")
public class Class104_Sub1_Sub1_Sub2 extends Class104_Sub1_Sub1 implements Interface61 {

	@OriginalMember(owner = "client!aib", name = "j", descriptor = "Lclient!tu;")
	Class563 aClass563_2;

	@OriginalMember(owner = "client!aib", name = "r", descriptor = "Lclient!anu;")
	Class35_Sub12 aClass35_Sub12_3;

	@OriginalMember(owner = "client!aib", name = "i", descriptor = "I")
	final int anInt1291;

	@OriginalMember(owner = "client!aib", name = "e", descriptor = "Z")
	final boolean aBoolean241;

	@OriginalMember(owner = "client!aib", name = "k", descriptor = "B")
	final byte aByte29;

	@OriginalMember(owner = "client!aib", name = "u", descriptor = "B")
	final byte aByte30;

	@OriginalMember(owner = "client!aib", name = "f", descriptor = "Z")
	boolean aBoolean242;

	@OriginalMember(owner = "client!aib", name = "o", descriptor = "Z")
	boolean aBoolean243;

	@OriginalMember(owner = "client!aib", name = "b", descriptor = "Z")
	boolean aBoolean244;

	@OriginalMember(owner = "client!aib", name = "n", descriptor = "Z")
	final boolean aBoolean245;

	@OriginalMember(owner = "client!aib", name = "g", descriptor = "Lclient!dv;")
	Class84 aClass84_2;

	@OriginalMember(owner = "client!aib", name = "z", descriptor = "Lclient!arp;")
	Class77_Sub1_Sub16 aClass77_Sub1_Sub16_2;

	@OriginalMember(owner = "client!aib", name = "<init>", descriptor = "(Lclient!tk;Lclient!dx;Lclient!anu;Lclient!vm;IIIIIZIIIIIIZZ)V", line = 39)
	public Class104_Sub1_Sub1_Sub2(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class35_Sub12 arg2, @OriginalArg(3) Class599 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) boolean arg17) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.anInt5538 * 1288889595 == 1, Class108.method9023(arg14, arg15));
		this.aClass35_Sub12_3 = arg2;
		this.anInt1291 = arg3.anInt5510 * 531068291;
		this.aByte99 = (byte) arg5;
		this.aBoolean241 = arg9;
		this.aByte29 = (byte) arg14;
		this.aByte30 = (byte) arg15;
		this.aBoolean242 = arg3.anInt5518 * -2134171963 != 0 && !arg9;
		this.aBoolean243 = arg16;
		this.aBoolean244 = arg1.method20206() && arg3.aBoolean816 && !this.aBoolean241 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() != 0;
		this.aBoolean245 = arg17;
		@Pc(88) int local88 = 2048;
		if (this.aBoolean243) {
			local88 |= 0x10000;
		}
		if (arg3.aBoolean829) {
			local88 |= 0x80000;
		}
		@Pc(110) Class10 local110 = this.method11480(arg1, local88, this.aBoolean244);
		if (local110 != null) {
			this.aClass84_2 = (Class84) local110.anObject1;
			this.aClass77_Sub1_Sub16_2 = (Class77_Sub1_Sub16) local110.anObject2;
			if (this.aBoolean243 || arg3.aBoolean829) {
				this.aClass84_2 = this.aClass84_2.method6794((byte) 0, local88, false);
				if (arg3.aBoolean829) {
					@Pc(143) Class519 local143 = client.aClass517_1.method30422();
					this.aClass84_2.method6837(local143.anInt5123 * -1440569789, local143.anInt5124 * -1149266637, local143.anInt5125 * -469029139, local143.anInt5126 * -2027110357);
				}
			}
		}
		this.method24135(1);
	}

	@OriginalMember(owner = "client!aib", name = "bz", descriptor = "(I)Z", line = 69)
	@Override
	boolean method24139() {
		if (this.aClass84_2 == null) {
			return true;
		} else {
			return !this.aClass84_2.method6840();
		}
	}

	@OriginalMember(owner = "client!aib", name = "co", descriptor = "()Z", line = 69)
	@Override
	boolean method24149() {
		if (this.aClass84_2 == null) {
			return true;
		} else {
			return !this.aClass84_2.method6840();
		}
	}

	@OriginalMember(owner = "client!aib", name = "ci", descriptor = "()Z", line = 69)
	@Override
	boolean method24174() {
		if (this.aClass84_2 == null) {
			return true;
		} else {
			return !this.aClass84_2.method6840();
		}
	}

	@OriginalMember(owner = "client!aib", name = "bu", descriptor = "(I)Z", line = 74)
	@Override
	boolean method24140() {
		return this.aClass84_2 == null ? false : this.aClass84_2.method6809();
	}

	@OriginalMember(owner = "client!aib", name = "cq", descriptor = "()Z", line = 74)
	@Override
	boolean method24154() {
		return this.aClass84_2 == null ? false : this.aClass84_2.method6809();
	}

	@OriginalMember(owner = "client!aib", name = "cn", descriptor = "()Z", line = 74)
	@Override
	boolean method24162() {
		return this.aClass84_2 == null ? false : this.aClass84_2.method6809();
	}

	@OriginalMember(owner = "client!aib", name = "cs", descriptor = "()I", line = 85)
	@Override
	public int method24151() {
		return this.aClass84_2 == null ? 0 : this.aClass84_2.method6824();
	}

	@OriginalMember(owner = "client!aib", name = "cy", descriptor = "()I", line = 85)
	@Override
	public int method24152() {
		return this.aClass84_2 == null ? 0 : this.aClass84_2.method6824();
	}

	@OriginalMember(owner = "client!aib", name = "bt", descriptor = "(I)I", line = 85)
	@Override
	public int method24160() {
		return this.aClass84_2 == null ? 0 : this.aClass84_2.method6824();
	}

	@OriginalMember(owner = "client!aib", name = "bn", descriptor = "(Lclient!dx;II)Lclient!dv;", line = 89)
	Class84 method11477(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_2 != null && arg0.method20116(this.aClass84_2.method6875(), arg1) == 0) {
			return this.aClass84_2;
		} else {
			@Pc(19) Class10 local19 = this.method11480(arg0, arg1, false);
			return local19 == null ? null : (Class84) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!aib", name = "br", descriptor = "(Lclient!dx;I)Lclient!dv;", line = 89)
	Class84 method11478(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_2 != null && arg0.method20116(this.aClass84_2.method6875(), arg1) == 0) {
			return this.aClass84_2;
		} else {
			@Pc(19) Class10 local19 = this.method11480(arg0, arg1, false);
			return local19 == null ? null : (Class84) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!aib", name = "bo", descriptor = "(Lclient!dx;I)Lclient!dv;", line = 89)
	Class84 method11479(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_2 != null && arg0.method20116(this.aClass84_2.method6875(), arg1) == 0) {
			return this.aClass84_2;
		} else {
			@Pc(19) Class10 local19 = this.method11480(arg0, arg1, false);
			return local19 == null ? null : (Class84) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!aib", name = "bp", descriptor = "(Lclient!dx;IZI)Lclient!aai;", line = 96)
	Class10 method11480(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_3.method18319(this.anInt1291 * -1368245725);
		@Pc(19) Class88 local19;
		@Pc(25) Class88 local25;
		if (this.aBoolean241) {
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
		return local9.method32000(arg0, arg1, this.aByte29 == Class593.aClass593_23.anInt5501 * 847393323 ? Class593.aClass593_9.anInt5501 * 847393323 : this.aByte29, this.aByte29 == Class593.aClass593_23.anInt5501 * 847393323 ? this.aByte30 + 4 : this.aByte30, local19, local25, (int) local53.aFloat277, (int) local53.aFloat276, (int) local53.aFloat278, arg2, null);
	}

	@OriginalMember(owner = "client!aib", name = "bq", descriptor = "(Lclient!dx;IZ)Lclient!aai;", line = 96)
	Class10 method11481(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_3.method18319(this.anInt1291 * -1368245725);
		@Pc(19) Class88 local19;
		@Pc(25) Class88 local25;
		if (this.aBoolean241) {
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
		return local9.method32000(arg0, arg1, this.aByte29 == Class593.aClass593_23.anInt5501 * 847393323 ? Class593.aClass593_9.anInt5501 * 847393323 : this.aByte29, this.aByte29 == Class593.aClass593_23.anInt5501 * 847393323 ? this.aByte30 + 4 : this.aByte30, local19, local25, (int) local53.aFloat277, (int) local53.aFloat276, (int) local53.aFloat278, arg2, null);
	}

	@OriginalMember(owner = "client!aib", name = "be", descriptor = "(Lclient!dx;IZ)Lclient!aai;", line = 96)
	Class10 method11482(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_3.method18319(this.anInt1291 * -1368245725);
		@Pc(19) Class88 local19;
		@Pc(25) Class88 local25;
		if (this.aBoolean241) {
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
		return local9.method32000(arg0, arg1, this.aByte29 == Class593.aClass593_23.anInt5501 * 847393323 ? Class593.aClass593_9.anInt5501 * 847393323 : this.aByte29, this.aByte29 == Class593.aClass593_23.anInt5501 * 847393323 ? this.aByte30 + 4 : this.aByte30, local19, local25, (int) local53.aFloat277, (int) local53.aFloat276, (int) local53.aFloat278, arg2, null);
	}

	@OriginalMember(owner = "client!aib", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 113)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_2 == null) {
			this.aClass563_2 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method11477(arg0, 0));
		}
		return this.aClass563_2;
	}

	@OriginalMember(owner = "client!aib", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 113)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_2 == null) {
			this.aClass563_2 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method11477(arg0, 0));
		}
		return this.aClass563_2;
	}

	@OriginalMember(owner = "client!aib", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 113)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_2 == null) {
			this.aClass563_2 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method11477(arg0, 0));
		}
		return this.aClass563_2;
	}

	@OriginalMember(owner = "client!aib", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 119)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		if (this.aClass84_2 == null) {
			return null;
		}
		@Pc(7) Class455 local7 = this.method24094();
		@Pc(12) Class551 local12 = Class346.method27844(this.aBoolean242);
		@Pc(23) Class441 local23 = ((Class599) this.aClass35_Sub12_3.method18319(this.anInt1291 * -1368245725)).aClass441_2;
		if (local23 == null) {
			this.aClass84_2.method6813(local7, this.aClass224Array21[0], 0);
		} else {
			this.aClass84_2.method6813(local7, null, 0);
			arg0.method20099(local7, this.aClass224Array21[0], local23);
		}
		return local12;
	}

	@OriginalMember(owner = "client!aib", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 119)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		if (this.aClass84_2 == null) {
			return null;
		}
		@Pc(7) Class455 local7 = this.method24094();
		@Pc(12) Class551 local12 = Class346.method27844(this.aBoolean242);
		@Pc(23) Class441 local23 = ((Class599) this.aClass35_Sub12_3.method18319(this.anInt1291 * -1368245725)).aClass441_2;
		if (local23 == null) {
			this.aClass84_2.method6813(local7, this.aClass224Array21[0], 0);
		} else {
			this.aClass84_2.method6813(local7, null, 0);
			arg0.method20099(local7, this.aClass224Array21[0], local23);
		}
		return local12;
	}

	@OriginalMember(owner = "client!aib", name = "fs", descriptor = "(Lclient!dx;I)V", line = 131)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!aib", name = "fn", descriptor = "(Lclient!dx;)V", line = 131)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!aib", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 134)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_3.method18319(this.anInt1291 * -1368245725)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(28) Class84 local28 = this.method11477(arg0, 131072);
		if (local28 == null) {
			return false;
		} else {
			@Pc(34) Class455 local34 = this.method24094();
			return local28.method6818(arg1, arg2, local34, false, 0);
		}
	}

	@OriginalMember(owner = "client!aib", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 134)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_3.method18319(this.anInt1291 * -1368245725)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(28) Class84 local28 = this.method11477(arg0, 131072);
		if (local28 == null) {
			return false;
		} else {
			@Pc(34) Class455 local34 = this.method24094();
			return local28.method6818(arg1, arg2, local34, false, 0);
		}
	}

	@OriginalMember(owner = "client!aib", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 134)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_3.method18319(this.anInt1291 * -1368245725)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(28) Class84 local28 = this.method11477(arg0, 131072);
		if (local28 == null) {
			return false;
		} else {
			@Pc(34) Class455 local34 = this.method24094();
			return local28.method6818(arg1, arg2, local34, false, 0);
		}
	}

	@OriginalMember(owner = "client!aib", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 134)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_3.method18319(this.anInt1291 * -1368245725)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(28) Class84 local28 = this.method11477(arg0, 131072);
		if (local28 == null) {
			return false;
		} else {
			@Pc(34) Class455 local34 = this.method24094();
			return local28.method6818(arg1, arg2, local34, false, 0);
		}
	}

	@OriginalMember(owner = "client!aib", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 134)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_3.method18319(this.anInt1291 * -1368245725)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(28) Class84 local28 = this.method11477(arg0, 131072);
		if (local28 == null) {
			return false;
		} else {
			@Pc(34) Class455 local34 = this.method24094();
			return local28.method6818(arg1, arg2, local34, false, 0);
		}
	}

	@OriginalMember(owner = "client!aib", name = "fx", descriptor = "()Z", line = 145)
	@Override
	boolean method24148() {
		return this.aBoolean243;
	}

	@OriginalMember(owner = "client!aib", name = "fu", descriptor = "(B)Z", line = 145)
	@Override
	boolean method24138() {
		return this.aBoolean243;
	}

	@OriginalMember(owner = "client!aib", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 149)
	@Override
	void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class104_Sub1_Sub2_Sub1) {
			@Pc(5) Class104_Sub1_Sub2_Sub1 local5 = (Class104_Sub1_Sub2_Sub1) arg1;
			if (this.aClass84_2 != null && local5.aClass84_1 != null) {
				this.aClass84_2.method6855(local5.aClass84_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class104_Sub1_Sub1_Sub2) {
			@Pc(28) Class104_Sub1_Sub1_Sub2 local28 = (Class104_Sub1_Sub1_Sub2) arg1;
			if (this.aClass84_2 != null && local28.aClass84_2 != null) {
				this.aClass84_2.method6855(local28.aClass84_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!aib", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 149)
	@Override
	void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class104_Sub1_Sub2_Sub1) {
			@Pc(5) Class104_Sub1_Sub2_Sub1 local5 = (Class104_Sub1_Sub2_Sub1) arg1;
			if (this.aClass84_2 != null && local5.aClass84_1 != null) {
				this.aClass84_2.method6855(local5.aClass84_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class104_Sub1_Sub1_Sub2) {
			@Pc(28) Class104_Sub1_Sub1_Sub2 local28 = (Class104_Sub1_Sub1_Sub2) arg1;
			if (this.aClass84_2 != null && local28.aClass84_2 != null) {
				this.aClass84_2.method6855(local28.aClass84_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!aib", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 149)
	@Override
	void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class104_Sub1_Sub2_Sub1) {
			@Pc(5) Class104_Sub1_Sub2_Sub1 local5 = (Class104_Sub1_Sub2_Sub1) arg1;
			if (this.aClass84_2 != null && local5.aClass84_1 != null) {
				this.aClass84_2.method6855(local5.aClass84_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class104_Sub1_Sub1_Sub2) {
			@Pc(28) Class104_Sub1_Sub1_Sub2 local28 = (Class104_Sub1_Sub1_Sub2) arg1;
			if (this.aClass84_2 != null && local28.aClass84_2 != null) {
				this.aClass84_2.method6855(local28.aClass84_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!aib", name = "fd", descriptor = "(I)V", line = 160)
	@Override
	void method24142() {
		this.aBoolean243 = false;
		if (this.aClass84_2 != null) {
			this.aClass84_2.method6795(this.aClass84_2.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!aib", name = "gr", descriptor = "()V", line = 160)
	@Override
	void method24136() {
		this.aBoolean243 = false;
		if (this.aClass84_2 != null) {
			this.aClass84_2.method6795(this.aClass84_2.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!aib", name = "gi", descriptor = "()V", line = 160)
	@Override
	void method24164() {
		this.aBoolean243 = false;
		if (this.aClass84_2 != null) {
			this.aClass84_2.method6795(this.aClass84_2.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!aib", name = "gj", descriptor = "()V", line = 160)
	@Override
	void method24150() {
		this.aBoolean243 = false;
		if (this.aClass84_2 != null) {
			this.aClass84_2.method6795(this.aClass84_2.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!aib", name = "p", descriptor = "(I)I", line = 165)
	@Override
	public int method13060() {
		return this.anInt1291 * -1368245725;
	}

	@OriginalMember(owner = "client!aib", name = "f", descriptor = "()I", line = 165)
	@Override
	public int method13067() {
		return this.anInt1291 * -1368245725;
	}

	@OriginalMember(owner = "client!aib", name = "b", descriptor = "()I", line = 165)
	@Override
	public int method13077() {
		return this.anInt1291 * -1368245725;
	}

	@OriginalMember(owner = "client!aib", name = "o", descriptor = "()I", line = 165)
	@Override
	public int method13076() {
		return this.anInt1291 * -1368245725;
	}

	@OriginalMember(owner = "client!aib", name = "x", descriptor = "()I", line = 169)
	@Override
	public int method13064() {
		return this.aByte29;
	}

	@OriginalMember(owner = "client!aib", name = "c", descriptor = "(I)I", line = 169)
	@Override
	public int method13057() {
		return this.aByte29;
	}

	@OriginalMember(owner = "client!aib", name = "v", descriptor = "(I)I", line = 173)
	@Override
	public int method13058() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!aib", name = "d", descriptor = "()I", line = 173)
	@Override
	public int method13065() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!aib", name = "s", descriptor = "()I", line = 173)
	@Override
	public int method13073() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!aib", name = "r", descriptor = "()V", line = 177)
	@Override
	public void method13079() {
		if (this.aClass84_2 != null) {
			this.aClass84_2.method6796();
		}
	}

	@OriginalMember(owner = "client!aib", name = "l", descriptor = "(I)V", line = 177)
	@Override
	public void method13059() {
		if (this.aClass84_2 != null) {
			this.aClass84_2.method6796();
		}
	}

	@OriginalMember(owner = "client!aib", name = "g", descriptor = "()V", line = 177)
	@Override
	public void method13068() {
		if (this.aClass84_2 != null) {
			this.aClass84_2.method6796();
		}
	}

	@OriginalMember(owner = "client!aib", name = "w", descriptor = "(B)Z", line = 181)
	@Override
	public boolean method13062() {
		return this.aBoolean245;
	}

	@OriginalMember(owner = "client!aib", name = "n", descriptor = "()Z", line = 181)
	@Override
	public boolean method13061() {
		return this.aBoolean245;
	}

	@OriginalMember(owner = "client!aib", name = "a", descriptor = "()Z", line = 181)
	@Override
	public boolean method13066() {
		return this.aBoolean245;
	}

	@OriginalMember(owner = "client!aib", name = "m", descriptor = "()Z", line = 181)
	@Override
	public boolean method13080() {
		return this.aBoolean245;
	}

	@OriginalMember(owner = "client!aib", name = "h", descriptor = "()Z", line = 181)
	@Override
	public boolean method13081() {
		return this.aBoolean245;
	}

	@OriginalMember(owner = "client!aib", name = "y", descriptor = "(B)Z", line = 185)
	@Override
	public boolean method13072() {
		return this.aBoolean244;
	}

	@OriginalMember(owner = "client!aib", name = "z", descriptor = "()Z", line = 185)
	@Override
	public boolean method13069() {
		return this.aBoolean244;
	}

	@OriginalMember(owner = "client!aib", name = "t", descriptor = "(Lclient!dx;B)V", line = 189)
	@Override
	public void method13056(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_2 == null && this.aBoolean244) {
			@Pc(15) Class10 local15 = this.method11480(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_2;
			this.aClass77_Sub1_Sub16_2 = null;
		}
		@Pc(35) Class447 local35 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local35.aFloat277, (int) local35.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aib", name = "j", descriptor = "(Lclient!dx;)V", line = 189)
	@Override
	public void method13070(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_2 == null && this.aBoolean244) {
			@Pc(15) Class10 local15 = this.method11480(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_2;
			this.aClass77_Sub1_Sub16_2 = null;
		}
		@Pc(35) Class447 local35 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local35.aFloat277, (int) local35.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aib", name = "i", descriptor = "(Lclient!dx;)V", line = 189)
	@Override
	public void method13078(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_2 == null && this.aBoolean244) {
			@Pc(15) Class10 local15 = this.method11480(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_2;
			this.aClass77_Sub1_Sub16_2 = null;
		}
		@Pc(35) Class447 local35 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local35.aFloat277, (int) local35.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aib", name = "k", descriptor = "(Lclient!dx;)V", line = 189)
	@Override
	public void method13071(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_2 == null && this.aBoolean244) {
			@Pc(15) Class10 local15 = this.method11480(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_2;
			this.aClass77_Sub1_Sub16_2 = null;
		}
		@Pc(35) Class447 local35 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local35.aFloat277, (int) local35.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aib", name = "q", descriptor = "(Lclient!dx;I)V", line = 203)
	@Override
	public void method13063(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_2 == null && this.aBoolean244) {
			@Pc(15) Class10 local15 = this.method11480(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_2;
			this.aClass77_Sub1_Sub16_2 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aib", name = "u", descriptor = "(Lclient!dx;)V", line = 203)
	@Override
	public void method13075(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_2 == null && this.aBoolean244) {
			@Pc(15) Class10 local15 = this.method11480(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_2;
			this.aClass77_Sub1_Sub16_2 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aib", name = "e", descriptor = "(Lclient!dx;)V", line = 203)
	@Override
	public void method13074(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_2 == null && this.aBoolean244) {
			@Pc(15) Class10 local15 = this.method11480(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_2;
			this.aClass77_Sub1_Sub16_2 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aib", name = "bm", descriptor = "(I)I", line = 217)
	public int method11483() {
		return this.aClass84_2 == null ? 15 : this.aClass84_2.method6820() / 4;
	}

	@OriginalMember(owner = "client!aib", name = "cg", descriptor = "()I", line = 217)
	public int method11484() {
		return this.aClass84_2 == null ? 15 : this.aClass84_2.method6820() / 4;
	}

	@OriginalMember(owner = "client!aib", name = "cb", descriptor = "()I", line = 217)
	public int method11485() {
		return this.aClass84_2 == null ? 15 : this.aClass84_2.method6820() / 4;
	}

	@OriginalMember(owner = "client!aib", name = "d", descriptor = "(Ljava/lang/String;B)V", line = 239)
	public static void method11486(@OriginalArg(0) String arg0) {
		Class157.aString126 = arg0;
		Class157.anInt3244 = Class157.aString126.length() * 399107939;
	}

	@OriginalMember(owner = "client!aib", name = "avf", descriptor = "(Lclient!yf;I)V", line = 13112)
	static final void method11487(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1.method16160();
	}
}
