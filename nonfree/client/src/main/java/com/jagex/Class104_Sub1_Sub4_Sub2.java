package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiu")
public class Class104_Sub1_Sub4_Sub2 extends Class104_Sub1_Sub4 implements Interface61 {

	@OriginalMember(owner = "client!aiu", name = "z", descriptor = "Lclient!tu;")
	Class563 aClass563_8;

	@OriginalMember(owner = "client!aiu", name = "j", descriptor = "Z")
	boolean aBoolean322 = true;

	@OriginalMember(owner = "client!aiu", name = "r", descriptor = "Lclient!sh;")
	public Class534 aClass534_4;

	@OriginalMember(owner = "client!aiu", name = "g", descriptor = "Z")
	boolean aBoolean321;

	@OriginalMember(owner = "client!aiu", name = "<init>", descriptor = "(Lclient!tk;Lclient!dx;Lclient!anu;Lclient!vm;IIIIIZIII)V", line = 28)
	public Class104_Sub1_Sub4_Sub2(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class35_Sub12 arg2, @OriginalArg(3) Class599 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.anInt5539 * -1303202133);
		this.aClass534_4 = new Class534(arg1, arg2, arg3, Class593.aClass593_19.anInt5501 * 847393323, arg10, arg5, this, arg9, arg11, arg12);
		this.aBoolean321 = arg3.anInt5518 * -2134171963 != 0 && !arg9;
		this.method24135(1);
	}

	@OriginalMember(owner = "client!aiu", name = "bz", descriptor = "(I)Z", line = 35)
	@Override
	boolean method24139() {
		return false;
	}

	@OriginalMember(owner = "client!aiu", name = "ci", descriptor = "()Z", line = 35)
	@Override
	boolean method24174() {
		return false;
	}

	@OriginalMember(owner = "client!aiu", name = "co", descriptor = "()Z", line = 35)
	@Override
	boolean method24149() {
		return false;
	}

	@OriginalMember(owner = "client!aiu", name = "cn", descriptor = "()Z", line = 39)
	@Override
	boolean method24162() {
		return this.aBoolean322;
	}

	@OriginalMember(owner = "client!aiu", name = "bu", descriptor = "(I)Z", line = 39)
	@Override
	boolean method24140() {
		return this.aBoolean322;
	}

	@OriginalMember(owner = "client!aiu", name = "cq", descriptor = "()Z", line = 39)
	@Override
	boolean method24154() {
		return this.aBoolean322;
	}

	@OriginalMember(owner = "client!aiu", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 43)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_8;
	}

	@OriginalMember(owner = "client!aiu", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 43)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_8;
	}

	@OriginalMember(owner = "client!aiu", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 43)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_8;
	}

	@OriginalMember(owner = "client!aiu", name = "bt", descriptor = "(I)I", line = 47)
	@Override
	public int method24160() {
		return this.aClass534_4.method30787();
	}

	@OriginalMember(owner = "client!aiu", name = "cy", descriptor = "()I", line = 47)
	@Override
	public int method24152() {
		return this.aClass534_4.method30787();
	}

	@OriginalMember(owner = "client!aiu", name = "cs", descriptor = "()I", line = 47)
	@Override
	public int method24151() {
		return this.aClass534_4.method30787();
	}

	@OriginalMember(owner = "client!aiu", name = "bk", descriptor = "(I)I", line = 51)
	@Override
	public int method24134() {
		return this.aClass534_4.method30791();
	}

	@OriginalMember(owner = "client!aiu", name = "dw", descriptor = "()I", line = 51)
	@Override
	public int method24133() {
		return this.aClass534_4.method30791();
	}

	@OriginalMember(owner = "client!aiu", name = "dz", descriptor = "()I", line = 51)
	@Override
	public int method24132() {
		return this.aClass534_4.method30791();
	}

	@OriginalMember(owner = "client!aiu", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 55)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_4.method30796(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class455 local16 = this.method24094();
		@Pc(19) Class453 local19 = this.method24085();
		@Pc(24) Class551 local24 = Class346.method27844(this.aBoolean321);
		@Pc(31) int local31 = (int) local19.aClass447_61.aFloat277 >> 9;
		@Pc(38) int local38 = (int) local19.aClass447_61.aFloat278 >> 9;
		this.aClass534_4.method30799(arg0, local8, local16, local31, local31, local38, local38, true);
		@Pc(55) Class599 local55 = this.aClass534_4.method30793();
		if (local55.aClass441_2 == null) {
			local8.method6813(local16, this.aClass224Array21[0], 0);
		} else {
			local8.method6813(local16, null, 0);
			arg0.method20099(local16, this.aClass224Array21[0], local55.aClass441_2);
		}
		if (this.aClass534_4.aClass626_7 != null) {
			@Pc(91) Class207 local91 = this.aClass534_4.aClass626_7.method32532();
			arg0.method20120(local91);
		}
		this.aBoolean322 = local8.method6809() || this.aClass534_4.aClass626_7 != null;
		if (this.aClass563_8 == null) {
			this.aClass563_8 = Class534.method30780((int) local19.aClass447_61.aFloat277, (int) local19.aClass447_61.aFloat276, (int) local19.aClass447_61.aFloat278, local8);
		} else {
			Class304.method27224(this.aClass563_8, (int) local19.aClass447_61.aFloat277, (int) local19.aClass447_61.aFloat276, (int) local19.aClass447_61.aFloat278, local8);
		}
		return local24;
	}

	@OriginalMember(owner = "client!aiu", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 55)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_4.method30796(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class455 local16 = this.method24094();
		@Pc(19) Class453 local19 = this.method24085();
		@Pc(24) Class551 local24 = Class346.method27844(this.aBoolean321);
		@Pc(31) int local31 = (int) local19.aClass447_61.aFloat277 >> 9;
		@Pc(38) int local38 = (int) local19.aClass447_61.aFloat278 >> 9;
		this.aClass534_4.method30799(arg0, local8, local16, local31, local31, local38, local38, true);
		@Pc(55) Class599 local55 = this.aClass534_4.method30793();
		if (local55.aClass441_2 == null) {
			local8.method6813(local16, this.aClass224Array21[0], 0);
		} else {
			local8.method6813(local16, null, 0);
			arg0.method20099(local16, this.aClass224Array21[0], local55.aClass441_2);
		}
		if (this.aClass534_4.aClass626_7 != null) {
			@Pc(91) Class207 local91 = this.aClass534_4.aClass626_7.method32532();
			arg0.method20120(local91);
		}
		this.aBoolean322 = local8.method6809() || this.aClass534_4.aClass626_7 != null;
		if (this.aClass563_8 == null) {
			this.aClass563_8 = Class534.method30780((int) local19.aClass447_61.aFloat277, (int) local19.aClass447_61.aFloat276, (int) local19.aClass447_61.aFloat278, local8);
		} else {
			Class304.method27224(this.aClass563_8, (int) local19.aClass447_61.aFloat277, (int) local19.aClass447_61.aFloat276, (int) local19.aClass447_61.aFloat278, local8);
		}
		return local24;
	}

	@OriginalMember(owner = "client!aiu", name = "fs", descriptor = "(Lclient!dx;I)V", line = 80)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_4.method30796(arg0, 262144, true, true);
		if (local8 != null) {
			@Pc(14) Class447 local14 = this.method24085().aClass447_61;
			@Pc(20) int local20 = (int) local14.aFloat277 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat278 >> 9;
			this.aClass534_4.method30799(arg0, local8, this.method24094(), local20, local20, local26, local26, false);
		}
	}

	@OriginalMember(owner = "client!aiu", name = "fn", descriptor = "(Lclient!dx;)V", line = 80)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_4.method30796(arg0, 262144, true, true);
		if (local8 != null) {
			@Pc(14) Class447 local14 = this.method24085().aClass447_61;
			@Pc(20) int local20 = (int) local14.aFloat277 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat278 >> 9;
			this.aClass534_4.method30799(arg0, local8, this.method24094(), local20, local20, local26, local26, false);
		}
	}

	@OriginalMember(owner = "client!aiu", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 90)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_4.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(26) Class84 local26 = this.aClass534_4.method30796(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aiu", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 90)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_4.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(26) Class84 local26 = this.aClass534_4.method30796(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aiu", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 90)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_4.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(26) Class84 local26 = this.aClass534_4.method30796(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aiu", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 90)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_4.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(26) Class84 local26 = this.aClass534_4.method30796(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aiu", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 90)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_4.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(26) Class84 local26 = this.aClass534_4.method30796(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aiu", name = "fx", descriptor = "()Z", line = 98)
	@Override
	final boolean method24148() {
		return false;
	}

	@OriginalMember(owner = "client!aiu", name = "fu", descriptor = "(B)Z", line = 98)
	@Override
	final boolean method24138() {
		return false;
	}

	@OriginalMember(owner = "client!aiu", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 102)
	@Override
	final void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aiu", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 102)
	@Override
	final void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aiu", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 102)
	@Override
	final void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aiu", name = "fd", descriptor = "(I)V", line = 106)
	@Override
	final void method24142() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aiu", name = "gr", descriptor = "()V", line = 106)
	@Override
	final void method24136() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aiu", name = "gj", descriptor = "()V", line = 106)
	@Override
	final void method24150() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aiu", name = "gi", descriptor = "()V", line = 106)
	@Override
	final void method24164() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aiu", name = "f", descriptor = "()I", line = 110)
	@Override
	public int method13067() {
		return this.aClass534_4.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aiu", name = "p", descriptor = "(I)I", line = 110)
	@Override
	public int method13060() {
		return this.aClass534_4.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aiu", name = "o", descriptor = "()I", line = 110)
	@Override
	public int method13076() {
		return this.aClass534_4.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aiu", name = "b", descriptor = "()I", line = 110)
	@Override
	public int method13077() {
		return this.aClass534_4.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aiu", name = "c", descriptor = "(I)I", line = 114)
	@Override
	public int method13057() {
		return this.aClass534_4.anInt5178 * -1932952217;
	}

	@OriginalMember(owner = "client!aiu", name = "x", descriptor = "()I", line = 114)
	@Override
	public int method13064() {
		return this.aClass534_4.anInt5178 * -1932952217;
	}

	@OriginalMember(owner = "client!aiu", name = "v", descriptor = "(I)I", line = 118)
	@Override
	public int method13058() {
		return this.aClass534_4.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aiu", name = "d", descriptor = "()I", line = 118)
	@Override
	public int method13065() {
		return this.aClass534_4.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aiu", name = "s", descriptor = "()I", line = 118)
	@Override
	public int method13073() {
		return this.aClass534_4.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aiu", name = "bn", descriptor = "(Lclient!ve;)V", line = 122)
	public void method13082(@OriginalArg(0) Class594 arg0) {
		this.aClass534_4.method30788(arg0);
	}

	@OriginalMember(owner = "client!aiu", name = "bf", descriptor = "(Lclient!ve;I)V", line = 122)
	public void method13083(@OriginalArg(0) Class594 arg0) {
		this.aClass534_4.method30788(arg0);
	}

	@OriginalMember(owner = "client!aiu", name = "bp", descriptor = "(Lclient!ve;)V", line = 122)
	public void method13084(@OriginalArg(0) Class594 arg0) {
		this.aClass534_4.method30788(arg0);
	}

	@OriginalMember(owner = "client!aiu", name = "l", descriptor = "(I)V", line = 125)
	@Override
	public void method13059() {
	}

	@OriginalMember(owner = "client!aiu", name = "r", descriptor = "()V", line = 125)
	@Override
	public void method13079() {
	}

	@OriginalMember(owner = "client!aiu", name = "g", descriptor = "()V", line = 125)
	@Override
	public void method13068() {
	}

	@OriginalMember(owner = "client!aiu", name = "h", descriptor = "()Z", line = 128)
	@Override
	public boolean method13081() {
		return true;
	}

	@OriginalMember(owner = "client!aiu", name = "w", descriptor = "(B)Z", line = 128)
	@Override
	public boolean method13062() {
		return true;
	}

	@OriginalMember(owner = "client!aiu", name = "n", descriptor = "()Z", line = 128)
	@Override
	public boolean method13061() {
		return true;
	}

	@OriginalMember(owner = "client!aiu", name = "a", descriptor = "()Z", line = 128)
	@Override
	public boolean method13066() {
		return true;
	}

	@OriginalMember(owner = "client!aiu", name = "m", descriptor = "()Z", line = 128)
	@Override
	public boolean method13080() {
		return true;
	}

	@OriginalMember(owner = "client!aiu", name = "y", descriptor = "(B)Z", line = 132)
	@Override
	public boolean method13072() {
		return this.aClass534_4.method30803();
	}

	@OriginalMember(owner = "client!aiu", name = "z", descriptor = "()Z", line = 132)
	@Override
	public boolean method13069() {
		return this.aClass534_4.method30803();
	}

	@OriginalMember(owner = "client!aiu", name = "j", descriptor = "(Lclient!dx;)V", line = 136)
	@Override
	public void method13070(@OriginalArg(0) Class86 arg0) {
		this.aClass534_4.method30806(arg0);
	}

	@OriginalMember(owner = "client!aiu", name = "i", descriptor = "(Lclient!dx;)V", line = 136)
	@Override
	public void method13078(@OriginalArg(0) Class86 arg0) {
		this.aClass534_4.method30806(arg0);
	}

	@OriginalMember(owner = "client!aiu", name = "k", descriptor = "(Lclient!dx;)V", line = 136)
	@Override
	public void method13071(@OriginalArg(0) Class86 arg0) {
		this.aClass534_4.method30806(arg0);
	}

	@OriginalMember(owner = "client!aiu", name = "t", descriptor = "(Lclient!dx;B)V", line = 136)
	@Override
	public void method13056(@OriginalArg(0) Class86 arg0) {
		this.aClass534_4.method30806(arg0);
	}

	@OriginalMember(owner = "client!aiu", name = "q", descriptor = "(Lclient!dx;I)V", line = 140)
	@Override
	public void method13063(@OriginalArg(0) Class86 arg0) {
		this.aClass534_4.method30809(arg0);
	}

	@OriginalMember(owner = "client!aiu", name = "e", descriptor = "(Lclient!dx;)V", line = 140)
	@Override
	public void method13074(@OriginalArg(0) Class86 arg0) {
		this.aClass534_4.method30809(arg0);
	}

	@OriginalMember(owner = "client!aiu", name = "u", descriptor = "(Lclient!dx;)V", line = 140)
	@Override
	public void method13075(@OriginalArg(0) Class86 arg0) {
		this.aClass534_4.method30809(arg0);
	}
}
