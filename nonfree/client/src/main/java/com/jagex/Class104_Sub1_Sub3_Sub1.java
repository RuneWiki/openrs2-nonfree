package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aih")
public class Class104_Sub1_Sub3_Sub1 extends Class104_Sub1_Sub3 implements Interface61 {

	@OriginalMember(owner = "client!aih", name = "z", descriptor = "Lclient!tu;")
	Class563 aClass563_4;

	@OriginalMember(owner = "client!aih", name = "j", descriptor = "Z")
	boolean aBoolean264 = true;

	@OriginalMember(owner = "client!aih", name = "r", descriptor = "Lclient!sh;")
	public Class534 aClass534_2;

	@OriginalMember(owner = "client!aih", name = "g", descriptor = "Z")
	boolean aBoolean265;

	@OriginalMember(owner = "client!aih", name = "<init>", descriptor = "(Lclient!tk;Lclient!dx;Lclient!anu;Lclient!vm;IIIIIZIIIIII)V", line = 25)
	public Class104_Sub1_Sub3_Sub1(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class35_Sub12 arg2, @OriginalArg(3) Class599 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11);
		this.aClass534_2 = new Class534(arg1, arg2, arg3, arg12, arg13, arg5, this, arg9, arg14, arg15);
		this.aBoolean265 = arg3.anInt5518 * -2134171963 != 0 && !arg9;
		this.method24135(1);
	}

	@OriginalMember(owner = "client!aih", name = "bz", descriptor = "(I)Z", line = 32)
	@Override
	boolean method24139() {
		return false;
	}

	@OriginalMember(owner = "client!aih", name = "co", descriptor = "()Z", line = 32)
	@Override
	boolean method24149() {
		return false;
	}

	@OriginalMember(owner = "client!aih", name = "ci", descriptor = "()Z", line = 32)
	@Override
	boolean method24174() {
		return false;
	}

	@OriginalMember(owner = "client!aih", name = "bu", descriptor = "(I)Z", line = 36)
	@Override
	boolean method24140() {
		return this.aBoolean264;
	}

	@OriginalMember(owner = "client!aih", name = "cn", descriptor = "()Z", line = 36)
	@Override
	boolean method24162() {
		return this.aBoolean264;
	}

	@OriginalMember(owner = "client!aih", name = "cq", descriptor = "()Z", line = 36)
	@Override
	boolean method24154() {
		return this.aBoolean264;
	}

	@OriginalMember(owner = "client!aih", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 40)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_4;
	}

	@OriginalMember(owner = "client!aih", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 40)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_4;
	}

	@OriginalMember(owner = "client!aih", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 40)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_4;
	}

	@OriginalMember(owner = "client!aih", name = "bt", descriptor = "(I)I", line = 44)
	@Override
	public int method24160() {
		return this.aClass534_2.method30787();
	}

	@OriginalMember(owner = "client!aih", name = "cs", descriptor = "()I", line = 44)
	@Override
	public int method24151() {
		return this.aClass534_2.method30787();
	}

	@OriginalMember(owner = "client!aih", name = "cy", descriptor = "()I", line = 44)
	@Override
	public int method24152() {
		return this.aClass534_2.method30787();
	}

	@OriginalMember(owner = "client!aih", name = "dw", descriptor = "()I", line = 48)
	@Override
	public int method24133() {
		return this.aClass534_2.method30791();
	}

	@OriginalMember(owner = "client!aih", name = "bk", descriptor = "(I)I", line = 48)
	@Override
	public int method24134() {
		return this.aClass534_2.method30791();
	}

	@OriginalMember(owner = "client!aih", name = "dz", descriptor = "()I", line = 48)
	@Override
	public int method24132() {
		return this.aClass534_2.method30791();
	}

	@OriginalMember(owner = "client!aih", name = "bf", descriptor = "(Lclient!ve;B)V", line = 52)
	public void method12008(@OriginalArg(0) Class594 arg0) {
		this.aClass534_2.method30788(arg0);
	}

	@OriginalMember(owner = "client!aih", name = "bn", descriptor = "(Lclient!ve;)V", line = 52)
	public void method12009(@OriginalArg(0) Class594 arg0) {
		this.aClass534_2.method30788(arg0);
	}

	@OriginalMember(owner = "client!aih", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 56)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_2.method30796(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class455 local15 = arg0.method20370();
		local15.method29387(this.method24094());
		local15.method29436((float) this.aShort92, 0.0F, (float) this.aShort91);
		@Pc(31) Class453 local31 = this.method24085();
		@Pc(36) Class551 local36 = Class346.method27844(this.aBoolean265);
		@Pc(43) int local43 = (int) local31.aClass447_61.aFloat277 >> 9;
		@Pc(50) int local50 = (int) local31.aClass447_61.aFloat278 >> 9;
		this.aClass534_2.method30799(arg0, local8, local15, local43, local43, local50, local50, true);
		@Pc(67) Class599 local67 = this.aClass534_2.method30793();
		if (local67.aClass441_2 == null) {
			local8.method6813(local15, this.aClass224Array21[0], 0);
		} else {
			local8.method6813(local15, null, 0);
			arg0.method20099(local15, this.aClass224Array21[0], local67.aClass441_2);
		}
		if (this.aClass534_2.aClass626_7 != null) {
			@Pc(103) Class207 local103 = this.aClass534_2.aClass626_7.method32532();
			arg0.method20120(local103);
		}
		this.aBoolean264 = local8.method6809() || this.aClass534_2.aClass626_7 != null;
		if (this.aClass563_4 == null) {
			this.aClass563_4 = Class534.method30780((int) local31.aClass447_61.aFloat277, (int) local31.aClass447_61.aFloat276, (int) local31.aClass447_61.aFloat278, local8);
		} else {
			Class304.method27224(this.aClass563_4, (int) local31.aClass447_61.aFloat277, (int) local31.aClass447_61.aFloat276, (int) local31.aClass447_61.aFloat278, local8);
		}
		return local36;
	}

	@OriginalMember(owner = "client!aih", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 56)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_2.method30796(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class455 local15 = arg0.method20370();
		local15.method29387(this.method24094());
		local15.method29436((float) this.aShort92, 0.0F, (float) this.aShort91);
		@Pc(31) Class453 local31 = this.method24085();
		@Pc(36) Class551 local36 = Class346.method27844(this.aBoolean265);
		@Pc(43) int local43 = (int) local31.aClass447_61.aFloat277 >> 9;
		@Pc(50) int local50 = (int) local31.aClass447_61.aFloat278 >> 9;
		this.aClass534_2.method30799(arg0, local8, local15, local43, local43, local50, local50, true);
		@Pc(67) Class599 local67 = this.aClass534_2.method30793();
		if (local67.aClass441_2 == null) {
			local8.method6813(local15, this.aClass224Array21[0], 0);
		} else {
			local8.method6813(local15, null, 0);
			arg0.method20099(local15, this.aClass224Array21[0], local67.aClass441_2);
		}
		if (this.aClass534_2.aClass626_7 != null) {
			@Pc(103) Class207 local103 = this.aClass534_2.aClass626_7.method32532();
			arg0.method20120(local103);
		}
		this.aBoolean264 = local8.method6809() || this.aClass534_2.aClass626_7 != null;
		if (this.aClass563_4 == null) {
			this.aClass563_4 = Class534.method30780((int) local31.aClass447_61.aFloat277, (int) local31.aClass447_61.aFloat276, (int) local31.aClass447_61.aFloat278, local8);
		} else {
			Class304.method27224(this.aClass563_4, (int) local31.aClass447_61.aFloat277, (int) local31.aClass447_61.aFloat276, (int) local31.aClass447_61.aFloat278, local8);
		}
		return local36;
	}

	@OriginalMember(owner = "client!aih", name = "fs", descriptor = "(Lclient!dx;I)V", line = 83)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_2.method30796(arg0, 262144, false, true);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class455 local13 = this.method24094();
		@Pc(16) Class453 local16 = this.method24085();
		@Pc(23) int local23 = (int) local16.aClass447_61.aFloat277 >> 9;
		@Pc(30) int local30 = (int) local16.aClass447_61.aFloat278 >> 9;
		this.aClass534_2.method30799(arg0, local8, local13, local23, local23, local30, local30, false);
	}

	@OriginalMember(owner = "client!aih", name = "fn", descriptor = "(Lclient!dx;)V", line = 83)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_2.method30796(arg0, 262144, false, true);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class455 local13 = this.method24094();
		@Pc(16) Class453 local16 = this.method24085();
		@Pc(23) int local23 = (int) local16.aClass447_61.aFloat277 >> 9;
		@Pc(30) int local30 = (int) local16.aClass447_61.aFloat278 >> 9;
		this.aClass534_2.method30799(arg0, local8, local13, local23, local23, local30, local30, false);
	}

	@OriginalMember(owner = "client!aih", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 94)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_2.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(27) Class84 local27 = this.aClass534_2.method30796(arg0, 131072, false, false);
			return local27 == null ? false : local27.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aih", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 94)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_2.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(27) Class84 local27 = this.aClass534_2.method30796(arg0, 131072, false, false);
			return local27 == null ? false : local27.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aih", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 94)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_2.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(27) Class84 local27 = this.aClass534_2.method30796(arg0, 131072, false, false);
			return local27 == null ? false : local27.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aih", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 94)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_2.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(27) Class84 local27 = this.aClass534_2.method30796(arg0, 131072, false, false);
			return local27 == null ? false : local27.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aih", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 94)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_2.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(27) Class84 local27 = this.aClass534_2.method30796(arg0, 131072, false, false);
			return local27 == null ? false : local27.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aih", name = "p", descriptor = "(I)I", line = 102)
	@Override
	public int method13060() {
		return this.aClass534_2.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aih", name = "o", descriptor = "()I", line = 102)
	@Override
	public int method13076() {
		return this.aClass534_2.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aih", name = "f", descriptor = "()I", line = 102)
	@Override
	public int method13067() {
		return this.aClass534_2.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aih", name = "b", descriptor = "()I", line = 102)
	@Override
	public int method13077() {
		return this.aClass534_2.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aih", name = "c", descriptor = "(I)I", line = 106)
	@Override
	public int method13057() {
		return this.aClass534_2.anInt5178 * -1932952217;
	}

	@OriginalMember(owner = "client!aih", name = "x", descriptor = "()I", line = 106)
	@Override
	public int method13064() {
		return this.aClass534_2.anInt5178 * -1932952217;
	}

	@OriginalMember(owner = "client!aih", name = "d", descriptor = "()I", line = 110)
	@Override
	public int method13065() {
		return this.aClass534_2.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aih", name = "v", descriptor = "(I)I", line = 110)
	@Override
	public int method13058() {
		return this.aClass534_2.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aih", name = "s", descriptor = "()I", line = 110)
	@Override
	public int method13073() {
		return this.aClass534_2.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aih", name = "l", descriptor = "(I)V", line = 113)
	@Override
	public void method13059() {
	}

	@OriginalMember(owner = "client!aih", name = "g", descriptor = "()V", line = 113)
	@Override
	public void method13068() {
	}

	@OriginalMember(owner = "client!aih", name = "r", descriptor = "()V", line = 113)
	@Override
	public void method13079() {
	}

	@OriginalMember(owner = "client!aih", name = "w", descriptor = "(B)Z", line = 116)
	@Override
	public boolean method13062() {
		return true;
	}

	@OriginalMember(owner = "client!aih", name = "n", descriptor = "()Z", line = 116)
	@Override
	public boolean method13061() {
		return true;
	}

	@OriginalMember(owner = "client!aih", name = "a", descriptor = "()Z", line = 116)
	@Override
	public boolean method13066() {
		return true;
	}

	@OriginalMember(owner = "client!aih", name = "h", descriptor = "()Z", line = 116)
	@Override
	public boolean method13081() {
		return true;
	}

	@OriginalMember(owner = "client!aih", name = "m", descriptor = "()Z", line = 116)
	@Override
	public boolean method13080() {
		return true;
	}

	@OriginalMember(owner = "client!aih", name = "z", descriptor = "()Z", line = 120)
	@Override
	public boolean method13069() {
		return this.aClass534_2.method30803();
	}

	@OriginalMember(owner = "client!aih", name = "y", descriptor = "(B)Z", line = 120)
	@Override
	public boolean method13072() {
		return this.aClass534_2.method30803();
	}

	@OriginalMember(owner = "client!aih", name = "t", descriptor = "(Lclient!dx;B)V", line = 124)
	@Override
	public void method13056(@OriginalArg(0) Class86 arg0) {
		this.aClass534_2.method30806(arg0);
	}

	@OriginalMember(owner = "client!aih", name = "j", descriptor = "(Lclient!dx;)V", line = 124)
	@Override
	public void method13070(@OriginalArg(0) Class86 arg0) {
		this.aClass534_2.method30806(arg0);
	}

	@OriginalMember(owner = "client!aih", name = "i", descriptor = "(Lclient!dx;)V", line = 124)
	@Override
	public void method13078(@OriginalArg(0) Class86 arg0) {
		this.aClass534_2.method30806(arg0);
	}

	@OriginalMember(owner = "client!aih", name = "k", descriptor = "(Lclient!dx;)V", line = 124)
	@Override
	public void method13071(@OriginalArg(0) Class86 arg0) {
		this.aClass534_2.method30806(arg0);
	}

	@OriginalMember(owner = "client!aih", name = "q", descriptor = "(Lclient!dx;I)V", line = 128)
	@Override
	public void method13063(@OriginalArg(0) Class86 arg0) {
		this.aClass534_2.method30809(arg0);
	}

	@OriginalMember(owner = "client!aih", name = "u", descriptor = "(Lclient!dx;)V", line = 128)
	@Override
	public void method13075(@OriginalArg(0) Class86 arg0) {
		this.aClass534_2.method30809(arg0);
	}

	@OriginalMember(owner = "client!aih", name = "e", descriptor = "(Lclient!dx;)V", line = 128)
	@Override
	public void method13074(@OriginalArg(0) Class86 arg0) {
		this.aClass534_2.method30809(arg0);
	}
}
