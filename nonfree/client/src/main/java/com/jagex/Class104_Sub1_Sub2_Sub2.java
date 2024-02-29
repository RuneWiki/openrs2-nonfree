package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aie")
public class Class104_Sub1_Sub2_Sub2 extends Class104_Sub1_Sub2 implements Interface61 {

	@OriginalMember(owner = "client!aie", name = "j", descriptor = "[I")
	static final int[] anIntArray139 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!aie", name = "i", descriptor = "[I")
	static final int[] anIntArray138 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!aie", name = "z", descriptor = "Lclient!tu;")
	Class563 aClass563_3;

	@OriginalMember(owner = "client!aie", name = "k", descriptor = "Z")
	boolean aBoolean255 = true;

	@OriginalMember(owner = "client!aie", name = "r", descriptor = "Lclient!sh;")
	public Class534 aClass534_1;

	@OriginalMember(owner = "client!aie", name = "g", descriptor = "Z")
	boolean aBoolean254;

	@OriginalMember(owner = "client!aie", name = "<init>", descriptor = "(Lclient!tk;Lclient!dx;Lclient!anu;Lclient!vm;IIIIIZIIII)V", line = 29)
	public Class104_Sub1_Sub2_Sub2(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class35_Sub12 arg2, @OriginalArg(3) Class599 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, Class424.method28738(arg10, arg11));
		this.aClass534_1 = new Class534(arg1, arg2, arg3, arg10, arg11, arg5, this, arg9, arg12, arg13);
		this.aBoolean254 = arg3.anInt5518 * -2134171963 != 0 && !arg9;
		this.method24135(1);
	}

	@OriginalMember(owner = "client!aie", name = "co", descriptor = "()Z", line = 36)
	@Override
	boolean method24149() {
		return false;
	}

	@OriginalMember(owner = "client!aie", name = "ci", descriptor = "()Z", line = 36)
	@Override
	boolean method24174() {
		return false;
	}

	@OriginalMember(owner = "client!aie", name = "bz", descriptor = "(I)Z", line = 36)
	@Override
	boolean method24139() {
		return false;
	}

	@OriginalMember(owner = "client!aie", name = "bu", descriptor = "(I)Z", line = 40)
	@Override
	boolean method24140() {
		return this.aBoolean255;
	}

	@OriginalMember(owner = "client!aie", name = "cn", descriptor = "()Z", line = 40)
	@Override
	boolean method24162() {
		return this.aBoolean255;
	}

	@OriginalMember(owner = "client!aie", name = "cq", descriptor = "()Z", line = 40)
	@Override
	boolean method24154() {
		return this.aBoolean255;
	}

	@OriginalMember(owner = "client!aie", name = "bp", descriptor = "(II)I", line = 44)
	static int method11744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class593.aClass593_3.anInt5501 * 847393323 || arg0 == Class593.aClass593_5.anInt5501 * 847393323 ? anIntArray138[arg1 & 0x3] : anIntArray139[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!aie", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 49)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_3;
	}

	@OriginalMember(owner = "client!aie", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 49)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_3;
	}

	@OriginalMember(owner = "client!aie", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 49)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_3;
	}

	@OriginalMember(owner = "client!aie", name = "cs", descriptor = "()I", line = 53)
	@Override
	public int method24151() {
		return this.aClass534_1.method30787();
	}

	@OriginalMember(owner = "client!aie", name = "bt", descriptor = "(I)I", line = 53)
	@Override
	public int method24160() {
		return this.aClass534_1.method30787();
	}

	@OriginalMember(owner = "client!aie", name = "cy", descriptor = "()I", line = 53)
	@Override
	public int method24152() {
		return this.aClass534_1.method30787();
	}

	@OriginalMember(owner = "client!aie", name = "bk", descriptor = "(I)I", line = 57)
	@Override
	public int method24134() {
		return this.aClass534_1.method30791();
	}

	@OriginalMember(owner = "client!aie", name = "dz", descriptor = "()I", line = 57)
	@Override
	public int method24132() {
		return this.aClass534_1.method30791();
	}

	@OriginalMember(owner = "client!aie", name = "dw", descriptor = "()I", line = 57)
	@Override
	public int method24133() {
		return this.aClass534_1.method30791();
	}

	@OriginalMember(owner = "client!aie", name = "bn", descriptor = "(Lclient!ve;B)V", line = 61)
	public void method11745(@OriginalArg(0) Class594 arg0) {
		this.aClass534_1.method30788(arg0);
	}

	@OriginalMember(owner = "client!aie", name = "bm", descriptor = "(Lclient!ve;)V", line = 61)
	public void method11746(@OriginalArg(0) Class594 arg0) {
		this.aClass534_1.method30788(arg0);
	}

	@OriginalMember(owner = "client!aie", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 65)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_1.method30796(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class455 local16 = this.method24094();
		@Pc(19) Class453 local19 = this.method24085();
		@Pc(24) Class551 local24 = Class346.method27844(this.aBoolean254);
		@Pc(31) int local31 = (int) local19.aClass447_61.aFloat277 >> 9;
		@Pc(38) int local38 = (int) local19.aClass447_61.aFloat278 >> 9;
		this.aClass534_1.method30799(arg0, local8, local16, local31, local31, local38, local38, true);
		@Pc(55) Class599 local55 = this.aClass534_1.method30793();
		if (local55.aClass441_2 == null) {
			local8.method6813(local16, this.aClass224Array21[0], 0);
		} else {
			local8.method6813(local16, null, 0);
			arg0.method20099(local16, this.aClass224Array21[0], local55.aClass441_2);
		}
		if (this.aClass534_1.aClass626_7 != null) {
			@Pc(90) Class207 local90 = this.aClass534_1.aClass626_7.method32532();
			arg0.method20120(local90);
		}
		this.aBoolean255 = local8.method6809() || this.aClass534_1.aClass626_7 != null;
		if (this.aClass563_3 == null) {
			this.aClass563_3 = Class534.method30780((int) local19.aClass447_61.aFloat277, (int) local19.aClass447_61.aFloat276, (int) local19.aClass447_61.aFloat278, local8);
		} else {
			Class304.method27224(this.aClass563_3, (int) local19.aClass447_61.aFloat277, (int) local19.aClass447_61.aFloat276, (int) local19.aClass447_61.aFloat278, local8);
		}
		return local24;
	}

	@OriginalMember(owner = "client!aie", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 65)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_1.method30796(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class455 local16 = this.method24094();
		@Pc(19) Class453 local19 = this.method24085();
		@Pc(24) Class551 local24 = Class346.method27844(this.aBoolean254);
		@Pc(31) int local31 = (int) local19.aClass447_61.aFloat277 >> 9;
		@Pc(38) int local38 = (int) local19.aClass447_61.aFloat278 >> 9;
		this.aClass534_1.method30799(arg0, local8, local16, local31, local31, local38, local38, true);
		@Pc(55) Class599 local55 = this.aClass534_1.method30793();
		if (local55.aClass441_2 == null) {
			local8.method6813(local16, this.aClass224Array21[0], 0);
		} else {
			local8.method6813(local16, null, 0);
			arg0.method20099(local16, this.aClass224Array21[0], local55.aClass441_2);
		}
		if (this.aClass534_1.aClass626_7 != null) {
			@Pc(90) Class207 local90 = this.aClass534_1.aClass626_7.method32532();
			arg0.method20120(local90);
		}
		this.aBoolean255 = local8.method6809() || this.aClass534_1.aClass626_7 != null;
		if (this.aClass563_3 == null) {
			this.aClass563_3 = Class534.method30780((int) local19.aClass447_61.aFloat277, (int) local19.aClass447_61.aFloat276, (int) local19.aClass447_61.aFloat278, local8);
		} else {
			Class304.method27224(this.aClass563_3, (int) local19.aClass447_61.aFloat277, (int) local19.aClass447_61.aFloat276, (int) local19.aClass447_61.aFloat278, local8);
		}
		return local24;
	}

	@OriginalMember(owner = "client!aie", name = "fs", descriptor = "(Lclient!dx;I)V", line = 90)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_1.method30796(arg0, 262144, true, true);
		if (local8 == null) {
			return;
		}
		@Pc(14) Class455 local14 = this.method24094();
		@Pc(17) Class453 local17 = this.method24085();
		@Pc(24) int local24 = (int) local17.aClass447_61.aFloat277 >> 9;
		@Pc(31) int local31 = (int) local17.aClass447_61.aFloat278 >> 9;
		this.aClass534_1.method30799(arg0, local8, local14, local24, local24, local31, local31, false);
	}

	@OriginalMember(owner = "client!aie", name = "fn", descriptor = "(Lclient!dx;)V", line = 90)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_1.method30796(arg0, 262144, true, true);
		if (local8 == null) {
			return;
		}
		@Pc(14) Class455 local14 = this.method24094();
		@Pc(17) Class453 local17 = this.method24085();
		@Pc(24) int local24 = (int) local17.aClass447_61.aFloat277 >> 9;
		@Pc(31) int local31 = (int) local17.aClass447_61.aFloat278 >> 9;
		this.aClass534_1.method30799(arg0, local8, local14, local24, local24, local31, local31, false);
	}

	@OriginalMember(owner = "client!aie", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 101)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_1.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(26) Class84 local26 = this.aClass534_1.method30796(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aie", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 101)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_1.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(26) Class84 local26 = this.aClass534_1.method30796(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aie", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 101)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_1.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(26) Class84 local26 = this.aClass534_1.method30796(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aie", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 101)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_1.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(26) Class84 local26 = this.aClass534_1.method30796(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aie", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 101)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_1.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(26) Class84 local26 = this.aClass534_1.method30796(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aie", name = "fu", descriptor = "(B)Z", line = 109)
	@Override
	final boolean method24138() {
		return false;
	}

	@OriginalMember(owner = "client!aie", name = "fx", descriptor = "()Z", line = 109)
	@Override
	final boolean method24148() {
		return false;
	}

	@OriginalMember(owner = "client!aie", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 113)
	@Override
	final void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aie", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 113)
	@Override
	final void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aie", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 113)
	@Override
	final void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aie", name = "fd", descriptor = "(I)V", line = 117)
	@Override
	final void method24142() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aie", name = "gj", descriptor = "()V", line = 117)
	@Override
	final void method24150() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aie", name = "gi", descriptor = "()V", line = 117)
	@Override
	final void method24164() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aie", name = "gr", descriptor = "()V", line = 117)
	@Override
	final void method24136() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aie", name = "p", descriptor = "(I)I", line = 121)
	@Override
	public int method13060() {
		return this.aClass534_1.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aie", name = "f", descriptor = "()I", line = 121)
	@Override
	public int method13067() {
		return this.aClass534_1.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aie", name = "b", descriptor = "()I", line = 121)
	@Override
	public int method13077() {
		return this.aClass534_1.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aie", name = "o", descriptor = "()I", line = 121)
	@Override
	public int method13076() {
		return this.aClass534_1.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aie", name = "c", descriptor = "(I)I", line = 125)
	@Override
	public int method13057() {
		return this.aClass534_1.anInt5178 * -1932952217;
	}

	@OriginalMember(owner = "client!aie", name = "x", descriptor = "()I", line = 125)
	@Override
	public int method13064() {
		return this.aClass534_1.anInt5178 * -1932952217;
	}

	@OriginalMember(owner = "client!aie", name = "v", descriptor = "(I)I", line = 129)
	@Override
	public int method13058() {
		return this.aClass534_1.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aie", name = "d", descriptor = "()I", line = 129)
	@Override
	public int method13065() {
		return this.aClass534_1.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aie", name = "s", descriptor = "()I", line = 129)
	@Override
	public int method13073() {
		return this.aClass534_1.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aie", name = "r", descriptor = "()V", line = 132)
	@Override
	public void method13079() {
	}

	@OriginalMember(owner = "client!aie", name = "g", descriptor = "()V", line = 132)
	@Override
	public void method13068() {
	}

	@OriginalMember(owner = "client!aie", name = "l", descriptor = "(I)V", line = 132)
	@Override
	public void method13059() {
	}

	@OriginalMember(owner = "client!aie", name = "w", descriptor = "(B)Z", line = 135)
	@Override
	public boolean method13062() {
		return true;
	}

	@OriginalMember(owner = "client!aie", name = "h", descriptor = "()Z", line = 135)
	@Override
	public boolean method13081() {
		return true;
	}

	@OriginalMember(owner = "client!aie", name = "m", descriptor = "()Z", line = 135)
	@Override
	public boolean method13080() {
		return true;
	}

	@OriginalMember(owner = "client!aie", name = "n", descriptor = "()Z", line = 135)
	@Override
	public boolean method13061() {
		return true;
	}

	@OriginalMember(owner = "client!aie", name = "a", descriptor = "()Z", line = 135)
	@Override
	public boolean method13066() {
		return true;
	}

	@OriginalMember(owner = "client!aie", name = "y", descriptor = "(B)Z", line = 139)
	@Override
	public boolean method13072() {
		return this.aClass534_1.method30803();
	}

	@OriginalMember(owner = "client!aie", name = "z", descriptor = "()Z", line = 139)
	@Override
	public boolean method13069() {
		return this.aClass534_1.method30803();
	}

	@OriginalMember(owner = "client!aie", name = "j", descriptor = "(Lclient!dx;)V", line = 143)
	@Override
	public void method13070(@OriginalArg(0) Class86 arg0) {
		this.aClass534_1.method30806(arg0);
	}

	@OriginalMember(owner = "client!aie", name = "i", descriptor = "(Lclient!dx;)V", line = 143)
	@Override
	public void method13078(@OriginalArg(0) Class86 arg0) {
		this.aClass534_1.method30806(arg0);
	}

	@OriginalMember(owner = "client!aie", name = "k", descriptor = "(Lclient!dx;)V", line = 143)
	@Override
	public void method13071(@OriginalArg(0) Class86 arg0) {
		this.aClass534_1.method30806(arg0);
	}

	@OriginalMember(owner = "client!aie", name = "t", descriptor = "(Lclient!dx;B)V", line = 143)
	@Override
	public void method13056(@OriginalArg(0) Class86 arg0) {
		this.aClass534_1.method30806(arg0);
	}

	@OriginalMember(owner = "client!aie", name = "q", descriptor = "(Lclient!dx;I)V", line = 147)
	@Override
	public void method13063(@OriginalArg(0) Class86 arg0) {
		this.aClass534_1.method30809(arg0);
	}

	@OriginalMember(owner = "client!aie", name = "u", descriptor = "(Lclient!dx;)V", line = 147)
	@Override
	public void method13075(@OriginalArg(0) Class86 arg0) {
		this.aClass534_1.method30809(arg0);
	}

	@OriginalMember(owner = "client!aie", name = "e", descriptor = "(Lclient!dx;)V", line = 147)
	@Override
	public void method13074(@OriginalArg(0) Class86 arg0) {
		this.aClass534_1.method30809(arg0);
	}

	@OriginalMember(owner = "client!aie", name = "zd", descriptor = "(Lclient!yf;B)V", line = 9063)
	static final void method11747(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass217Array1[local12].aBoolean642 ? 1 : 0;
	}
}
