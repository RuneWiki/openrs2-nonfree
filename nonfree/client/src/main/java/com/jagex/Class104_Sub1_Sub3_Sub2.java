package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aii")
public class Class104_Sub1_Sub3_Sub2 extends Class104_Sub1_Sub3 implements Interface61 {

	@OriginalMember(owner = "client!aii", name = "j", descriptor = "Lclient!tu;")
	Class563 aClass563_5;

	@OriginalMember(owner = "client!aii", name = "r", descriptor = "Lclient!anu;")
	Class35_Sub12 aClass35_Sub12_4;

	@OriginalMember(owner = "client!aii", name = "i", descriptor = "I")
	final int anInt1323;

	@OriginalMember(owner = "client!aii", name = "e", descriptor = "Z")
	final boolean aBoolean270;

	@OriginalMember(owner = "client!aii", name = "u", descriptor = "B")
	final byte aByte43;

	@OriginalMember(owner = "client!aii", name = "k", descriptor = "B")
	final byte aByte42;

	@OriginalMember(owner = "client!aii", name = "f", descriptor = "Z")
	boolean aBoolean271;

	@OriginalMember(owner = "client!aii", name = "o", descriptor = "Z")
	boolean aBoolean272;

	@OriginalMember(owner = "client!aii", name = "g", descriptor = "Lclient!dv;")
	Class84 aClass84_3;

	@OriginalMember(owner = "client!aii", name = "z", descriptor = "Lclient!arp;")
	Class77_Sub1_Sub16 aClass77_Sub1_Sub16_3;

	@OriginalMember(owner = "client!aii", name = "<init>", descriptor = "(Lclient!tk;Lclient!dx;Lclient!anu;Lclient!vm;IIIIIZIIII)V", line = 35)
	public Class104_Sub1_Sub3_Sub2(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class35_Sub12 arg2, @OriginalArg(3) Class599 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11);
		this.aClass35_Sub12_4 = arg2;
		this.anInt1323 = arg3.anInt5510 * -1156878595;
		this.aBoolean270 = arg9;
		this.aByte43 = (byte) arg13;
		this.aByte42 = (byte) arg12;
		this.aBoolean271 = arg3.anInt5518 * -2134171963 != 0 && !arg9;
		this.aBoolean272 = arg1.method20206() && arg3.aBoolean816 && !this.aBoolean270 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() != 0;
		@Pc(63) int local63 = 2048;
		if (arg3.aBoolean829) {
			local63 |= 0x80000;
		}
		@Pc(78) Class10 local78 = this.method12133(arg1, local63, this.aBoolean272);
		if (local78 != null) {
			this.aClass84_3 = (Class84) local78.anObject1;
			this.aClass77_Sub1_Sub16_3 = (Class77_Sub1_Sub16) local78.anObject2;
			if (arg3.aBoolean829) {
				this.aClass84_3 = this.aClass84_3.method6794((byte) 0, local63, false);
				if (arg3.aBoolean829) {
					@Pc(108) Class519 local108 = client.aClass517_1.method30422();
					this.aClass84_3.method6837(local108.anInt5123 * -1440569789, local108.anInt5124 * -1149266637, local108.anInt5125 * -469029139, local108.anInt5126 * -2027110357);
				}
			}
		}
		this.method24135(1);
	}

	@OriginalMember(owner = "client!aii", name = "bz", descriptor = "(I)Z", line = 61)
	@Override
	boolean method24139() {
		if (this.aClass84_3 == null) {
			return true;
		} else {
			return !this.aClass84_3.method6840();
		}
	}

	@OriginalMember(owner = "client!aii", name = "ci", descriptor = "()Z", line = 61)
	@Override
	boolean method24174() {
		if (this.aClass84_3 == null) {
			return true;
		} else {
			return !this.aClass84_3.method6840();
		}
	}

	@OriginalMember(owner = "client!aii", name = "co", descriptor = "()Z", line = 61)
	@Override
	boolean method24149() {
		if (this.aClass84_3 == null) {
			return true;
		} else {
			return !this.aClass84_3.method6840();
		}
	}

	@OriginalMember(owner = "client!aii", name = "cq", descriptor = "()Z", line = 66)
	@Override
	boolean method24154() {
		return this.aClass84_3 == null ? false : this.aClass84_3.method6809();
	}

	@OriginalMember(owner = "client!aii", name = "bu", descriptor = "(I)Z", line = 66)
	@Override
	boolean method24140() {
		return this.aClass84_3 == null ? false : this.aClass84_3.method6809();
	}

	@OriginalMember(owner = "client!aii", name = "cn", descriptor = "()Z", line = 66)
	@Override
	boolean method24162() {
		return this.aClass84_3 == null ? false : this.aClass84_3.method6809();
	}

	@OriginalMember(owner = "client!aii", name = "bt", descriptor = "(I)I", line = 71)
	@Override
	public int method24160() {
		return this.aClass84_3 == null ? 0 : this.aClass84_3.method6824();
	}

	@OriginalMember(owner = "client!aii", name = "cy", descriptor = "()I", line = 71)
	@Override
	public int method24152() {
		return this.aClass84_3 == null ? 0 : this.aClass84_3.method6824();
	}

	@OriginalMember(owner = "client!aii", name = "cs", descriptor = "()I", line = 71)
	@Override
	public int method24151() {
		return this.aClass84_3 == null ? 0 : this.aClass84_3.method6824();
	}

	@OriginalMember(owner = "client!aii", name = "bf", descriptor = "(Lclient!dx;II)Lclient!dv;", line = 75)
	Class84 method12129(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_3 != null && arg0.method20116(this.aClass84_3.method6875(), arg1) == 0) {
			return this.aClass84_3;
		} else {
			@Pc(19) Class10 local19 = this.method12133(arg0, arg1, false);
			return local19 == null ? null : (Class84) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!aii", name = "bo", descriptor = "(Lclient!dx;I)Lclient!dv;", line = 75)
	Class84 method12130(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_3 != null && arg0.method20116(this.aClass84_3.method6875(), arg1) == 0) {
			return this.aClass84_3;
		} else {
			@Pc(19) Class10 local19 = this.method12133(arg0, arg1, false);
			return local19 == null ? null : (Class84) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!aii", name = "bp", descriptor = "(Lclient!dx;I)Lclient!dv;", line = 75)
	Class84 method12131(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_3 != null && arg0.method20116(this.aClass84_3.method6875(), arg1) == 0) {
			return this.aClass84_3;
		} else {
			@Pc(19) Class10 local19 = this.method12133(arg0, arg1, false);
			return local19 == null ? null : (Class84) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!aii", name = "bm", descriptor = "(Lclient!dx;I)Lclient!dv;", line = 75)
	Class84 method12132(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_3 != null && arg0.method20116(this.aClass84_3.method6875(), arg1) == 0) {
			return this.aClass84_3;
		} else {
			@Pc(19) Class10 local19 = this.method12133(arg0, arg1, false);
			return local19 == null ? null : (Class84) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!aii", name = "bn", descriptor = "(Lclient!dx;IZB)Lclient!aai;", line = 82)
	Class10 method12133(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_4.method18319(this.anInt1323 * -2015809187);
		@Pc(19) Class88 local19;
		@Pc(25) Class88 local25;
		if (this.aBoolean270) {
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
		return local9.method32000(arg0, arg1, this.aByte42, this.aByte43, local19, local25, (int) local53.aFloat277, (int) local53.aFloat276, (int) local53.aFloat278, arg2, null);
	}

	@OriginalMember(owner = "client!aii", name = "br", descriptor = "(Lclient!dx;IZ)Lclient!aai;", line = 82)
	Class10 method12134(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_4.method18319(this.anInt1323 * -2015809187);
		@Pc(19) Class88 local19;
		@Pc(25) Class88 local25;
		if (this.aBoolean270) {
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
		return local9.method32000(arg0, arg1, this.aByte42, this.aByte43, local19, local25, (int) local53.aFloat277, (int) local53.aFloat276, (int) local53.aFloat278, arg2, null);
	}

	@OriginalMember(owner = "client!aii", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 99)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_5 == null) {
			this.aClass563_5 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method12129(arg0, 0));
		}
		return this.aClass563_5;
	}

	@OriginalMember(owner = "client!aii", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 99)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_5 == null) {
			this.aClass563_5 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method12129(arg0, 0));
		}
		return this.aClass563_5;
	}

	@OriginalMember(owner = "client!aii", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 99)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_5 == null) {
			this.aClass563_5 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method12129(arg0, 0));
		}
		return this.aClass563_5;
	}

	@OriginalMember(owner = "client!aii", name = "x", descriptor = "(IIB)I", line = 99)
	public static int method12135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aii", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 105)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		if (this.aClass84_3 == null) {
			return null;
		}
		@Pc(8) Class455 local8 = arg0.method20370();
		local8.method29387(this.method24094());
		local8.method29436((float) this.aShort92, 0.0F, (float) this.aShort91);
		@Pc(26) Class551 local26 = Class346.method27844(this.aBoolean271);
		@Pc(37) Class441 local37 = ((Class599) this.aClass35_Sub12_4.method18319(this.anInt1323 * -2015809187)).aClass441_2;
		if (local37 == null) {
			this.aClass84_3.method6813(local8, this.aClass224Array21[0], 0);
		} else {
			this.aClass84_3.method6813(local8, null, 0);
			arg0.method20099(local8, this.aClass224Array21[0], local37);
		}
		return local26;
	}

	@OriginalMember(owner = "client!aii", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 105)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		if (this.aClass84_3 == null) {
			return null;
		}
		@Pc(8) Class455 local8 = arg0.method20370();
		local8.method29387(this.method24094());
		local8.method29436((float) this.aShort92, 0.0F, (float) this.aShort91);
		@Pc(26) Class551 local26 = Class346.method27844(this.aBoolean271);
		@Pc(37) Class441 local37 = ((Class599) this.aClass35_Sub12_4.method18319(this.anInt1323 * -2015809187)).aClass441_2;
		if (local37 == null) {
			this.aClass84_3.method6813(local8, this.aClass224Array21[0], 0);
		} else {
			this.aClass84_3.method6813(local8, null, 0);
			arg0.method20099(local8, this.aClass224Array21[0], local37);
		}
		return local26;
	}

	@OriginalMember(owner = "client!aii", name = "fn", descriptor = "(Lclient!dx;)V", line = 119)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!aii", name = "fs", descriptor = "(Lclient!dx;I)V", line = 119)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!aii", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 122)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_4.method18319(this.anInt1323 * -2015809187)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method12129(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!aii", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 122)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_4.method18319(this.anInt1323 * -2015809187)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method12129(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!aii", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 122)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_4.method18319(this.anInt1323 * -2015809187)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method12129(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!aii", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 122)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_4.method18319(this.anInt1323 * -2015809187)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method12129(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!aii", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 122)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_4.method18319(this.anInt1323 * -2015809187)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method12129(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!aii", name = "f", descriptor = "()I", line = 133)
	@Override
	public int method13067() {
		return this.anInt1323 * -2015809187;
	}

	@OriginalMember(owner = "client!aii", name = "p", descriptor = "(I)I", line = 133)
	@Override
	public int method13060() {
		return this.anInt1323 * -2015809187;
	}

	@OriginalMember(owner = "client!aii", name = "o", descriptor = "()I", line = 133)
	@Override
	public int method13076() {
		return this.anInt1323 * -2015809187;
	}

	@OriginalMember(owner = "client!aii", name = "b", descriptor = "()I", line = 133)
	@Override
	public int method13077() {
		return this.anInt1323 * -2015809187;
	}

	@OriginalMember(owner = "client!aii", name = "c", descriptor = "(I)I", line = 137)
	@Override
	public int method13057() {
		return this.aByte42;
	}

	@OriginalMember(owner = "client!aii", name = "x", descriptor = "()I", line = 137)
	@Override
	public int method13064() {
		return this.aByte42;
	}

	@OriginalMember(owner = "client!aii", name = "d", descriptor = "()I", line = 141)
	@Override
	public int method13065() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!aii", name = "s", descriptor = "()I", line = 141)
	@Override
	public int method13073() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!aii", name = "v", descriptor = "(I)I", line = 141)
	@Override
	public int method13058() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!aii", name = "r", descriptor = "()V", line = 145)
	@Override
	public void method13079() {
		if (this.aClass84_3 != null) {
			this.aClass84_3.method6796();
		}
	}

	@OriginalMember(owner = "client!aii", name = "l", descriptor = "(I)V", line = 145)
	@Override
	public void method13059() {
		if (this.aClass84_3 != null) {
			this.aClass84_3.method6796();
		}
	}

	@OriginalMember(owner = "client!aii", name = "g", descriptor = "()V", line = 145)
	@Override
	public void method13068() {
		if (this.aClass84_3 != null) {
			this.aClass84_3.method6796();
		}
	}

	@OriginalMember(owner = "client!aii", name = "a", descriptor = "()Z", line = 149)
	@Override
	public boolean method13066() {
		return true;
	}

	@OriginalMember(owner = "client!aii", name = "w", descriptor = "(B)Z", line = 149)
	@Override
	public boolean method13062() {
		return true;
	}

	@OriginalMember(owner = "client!aii", name = "n", descriptor = "()Z", line = 149)
	@Override
	public boolean method13061() {
		return true;
	}

	@OriginalMember(owner = "client!aii", name = "m", descriptor = "()Z", line = 149)
	@Override
	public boolean method13080() {
		return true;
	}

	@OriginalMember(owner = "client!aii", name = "h", descriptor = "()Z", line = 149)
	@Override
	public boolean method13081() {
		return true;
	}

	@OriginalMember(owner = "client!aii", name = "y", descriptor = "(B)Z", line = 153)
	@Override
	public boolean method13072() {
		return this.aBoolean272;
	}

	@OriginalMember(owner = "client!aii", name = "z", descriptor = "()Z", line = 153)
	@Override
	public boolean method13069() {
		return this.aBoolean272;
	}

	@OriginalMember(owner = "client!aii", name = "t", descriptor = "(Lclient!dx;B)V", line = 157)
	@Override
	public void method13056(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_3 == null && this.aBoolean272) {
			@Pc(15) Class10 local15 = this.method12133(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_3;
			this.aClass77_Sub1_Sub16_3 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aii", name = "j", descriptor = "(Lclient!dx;)V", line = 157)
	@Override
	public void method13070(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_3 == null && this.aBoolean272) {
			@Pc(15) Class10 local15 = this.method12133(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_3;
			this.aClass77_Sub1_Sub16_3 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aii", name = "k", descriptor = "(Lclient!dx;)V", line = 157)
	@Override
	public void method13071(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_3 == null && this.aBoolean272) {
			@Pc(15) Class10 local15 = this.method12133(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_3;
			this.aClass77_Sub1_Sub16_3 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aii", name = "i", descriptor = "(Lclient!dx;)V", line = 157)
	@Override
	public void method13078(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_3 == null && this.aBoolean272) {
			@Pc(15) Class10 local15 = this.method12133(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_3;
			this.aClass77_Sub1_Sub16_3 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aii", name = "q", descriptor = "(Lclient!dx;I)V", line = 171)
	@Override
	public void method13063(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_3 == null && this.aBoolean272) {
			@Pc(14) Class10 local14 = this.method12133(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_3;
			this.aClass77_Sub1_Sub16_3 = null;
		}
		@Pc(33) Class447 local33 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local33.aFloat277, (int) local33.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aii", name = "u", descriptor = "(Lclient!dx;)V", line = 171)
	@Override
	public void method13075(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_3 == null && this.aBoolean272) {
			@Pc(14) Class10 local14 = this.method12133(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_3;
			this.aClass77_Sub1_Sub16_3 = null;
		}
		@Pc(33) Class447 local33 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local33.aFloat277, (int) local33.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aii", name = "e", descriptor = "(Lclient!dx;)V", line = 171)
	@Override
	public void method13074(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_3 == null && this.aBoolean272) {
			@Pc(14) Class10 local14 = this.method12133(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_3;
			this.aClass77_Sub1_Sub16_3 = null;
		}
		@Pc(33) Class447 local33 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local33.aFloat277, (int) local33.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!aii", name = "aut", descriptor = "(Lclient!yf;I)V", line = 13050)
	static final void method12136(@OriginalArg(0) Class665 arg0) {
		@Pc(2) int local2 = Class616.method32363();
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (Class155.anInt3184 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() * 467217081) * -710165623;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2;
		Class209.method25586();
		client.aClass517_1.method30486();
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
