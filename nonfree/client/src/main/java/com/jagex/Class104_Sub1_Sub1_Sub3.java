package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aik")
public class Class104_Sub1_Sub1_Sub3 extends Class104_Sub1_Sub1 implements Interface61 {

	@OriginalMember(owner = "client!aik", name = "z", descriptor = "Lclient!tu;")
	Class563 aClass563_6;

	@OriginalMember(owner = "client!aik", name = "j", descriptor = "Z")
	boolean aBoolean279 = true;

	@OriginalMember(owner = "client!aik", name = "r", descriptor = "Lclient!sh;")
	public Class534 aClass534_3;

	@OriginalMember(owner = "client!aik", name = "g", descriptor = "Z")
	boolean aBoolean278;

	@OriginalMember(owner = "client!aik", name = "i", descriptor = "Z")
	final boolean aBoolean280;

	@OriginalMember(owner = "client!aik", name = "<init>", descriptor = "(Lclient!tk;Lclient!dx;Lclient!anu;Lclient!vm;IIIIIZIIIIIIIIZ)V", line = 27)
	public Class104_Sub1_Sub1_Sub3(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class35_Sub12 arg2, @OriginalArg(3) Class599 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) boolean arg18) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.anInt5538 * 1288889595 == 1, Class75_Sub1.method1128(arg14, arg15));
		this.aClass534_3 = new Class534(arg1, arg2, arg3, arg14, arg15, arg5, this, arg9, arg16, arg17);
		this.aBoolean278 = arg3.anInt5518 * -2134171963 != 0 && !arg9;
		this.aBoolean280 = arg18;
		this.method24135(1);
	}

	@OriginalMember(owner = "client!aik", name = "ci", descriptor = "()Z", line = 35)
	@Override
	boolean method24174() {
		return false;
	}

	@OriginalMember(owner = "client!aik", name = "bz", descriptor = "(I)Z", line = 35)
	@Override
	boolean method24139() {
		return false;
	}

	@OriginalMember(owner = "client!aik", name = "co", descriptor = "()Z", line = 35)
	@Override
	boolean method24149() {
		return false;
	}

	@OriginalMember(owner = "client!aik", name = "bu", descriptor = "(I)Z", line = 39)
	@Override
	boolean method24140() {
		return this.aBoolean279;
	}

	@OriginalMember(owner = "client!aik", name = "cn", descriptor = "()Z", line = 39)
	@Override
	boolean method24162() {
		return this.aBoolean279;
	}

	@OriginalMember(owner = "client!aik", name = "cq", descriptor = "()Z", line = 39)
	@Override
	boolean method24154() {
		return this.aBoolean279;
	}

	@OriginalMember(owner = "client!aik", name = "br", descriptor = "(II)B", line = 43)
	static byte method12348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class593.aClass593_6.anInt5501 * 847393323) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aik", name = "bp", descriptor = "(II)B", line = 43)
	static byte method12349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class593.aClass593_6.anInt5501 * 847393323) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aik", name = "bm", descriptor = "(II)B", line = 43)
	static byte method12350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class593.aClass593_6.anInt5501 * 847393323) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aik", name = "bo", descriptor = "(II)B", line = 43)
	static byte method12351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class593.aClass593_6.anInt5501 * 847393323) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aik", name = "bt", descriptor = "(I)I", line = 49)
	@Override
	public int method24160() {
		return this.aClass534_3.method30787();
	}

	@OriginalMember(owner = "client!aik", name = "cs", descriptor = "()I", line = 49)
	@Override
	public int method24151() {
		return this.aClass534_3.method30787();
	}

	@OriginalMember(owner = "client!aik", name = "cy", descriptor = "()I", line = 49)
	@Override
	public int method24152() {
		return this.aClass534_3.method30787();
	}

	@OriginalMember(owner = "client!aik", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 53)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_6;
	}

	@OriginalMember(owner = "client!aik", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 53)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_6;
	}

	@OriginalMember(owner = "client!aik", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 53)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		return this.aClass563_6;
	}

	@OriginalMember(owner = "client!aik", name = "bk", descriptor = "(I)I", line = 57)
	@Override
	public int method24134() {
		return this.aClass534_3.method30791();
	}

	@OriginalMember(owner = "client!aik", name = "dz", descriptor = "()I", line = 57)
	@Override
	public int method24132() {
		return this.aClass534_3.method30791();
	}

	@OriginalMember(owner = "client!aik", name = "dw", descriptor = "()I", line = 57)
	@Override
	public int method24133() {
		return this.aClass534_3.method30791();
	}

	@OriginalMember(owner = "client!aik", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 61)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_3.method30796(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class455 local15 = this.method24094();
		@Pc(20) Class551 local20 = Class346.method27844(this.aBoolean278);
		this.aClass534_3.method30799(arg0, local8, local15, this.aShort131, this.aShort129, this.aShort132, this.aShort130, true);
		@Pc(41) Class599 local41 = this.aClass534_3.method30793();
		if (local41.aClass441_2 == null) {
			local8.method6813(local15, this.aClass224Array21[0], 0);
		} else {
			local8.method6813(local15, null, 0);
			arg0.method20099(local15, this.aClass224Array21[0], local41.aClass441_2);
		}
		if (this.aClass534_3.aClass626_7 != null) {
			@Pc(77) Class207 local77 = this.aClass534_3.aClass626_7.method32532();
			arg0.method20120(local77);
		}
		this.aBoolean279 = local8.method6809() || this.aClass534_3.aClass626_7 != null;
		@Pc(95) Class453 local95 = this.method24085();
		if (this.aClass563_6 == null) {
			this.aClass563_6 = Class534.method30780((int) local95.aClass447_61.aFloat277, (int) local95.aClass447_61.aFloat276, (int) local95.aClass447_61.aFloat278, local8);
		} else {
			Class304.method27224(this.aClass563_6, (int) local95.aClass447_61.aFloat277, (int) local95.aClass447_61.aFloat276, (int) local95.aClass447_61.aFloat278, local8);
		}
		return local20;
	}

	@OriginalMember(owner = "client!aik", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 61)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_3.method30796(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class455 local15 = this.method24094();
		@Pc(20) Class551 local20 = Class346.method27844(this.aBoolean278);
		this.aClass534_3.method30799(arg0, local8, local15, this.aShort131, this.aShort129, this.aShort132, this.aShort130, true);
		@Pc(41) Class599 local41 = this.aClass534_3.method30793();
		if (local41.aClass441_2 == null) {
			local8.method6813(local15, this.aClass224Array21[0], 0);
		} else {
			local8.method6813(local15, null, 0);
			arg0.method20099(local15, this.aClass224Array21[0], local41.aClass441_2);
		}
		if (this.aClass534_3.aClass626_7 != null) {
			@Pc(77) Class207 local77 = this.aClass534_3.aClass626_7.method32532();
			arg0.method20120(local77);
		}
		this.aBoolean279 = local8.method6809() || this.aClass534_3.aClass626_7 != null;
		@Pc(95) Class453 local95 = this.method24085();
		if (this.aClass563_6 == null) {
			this.aClass563_6 = Class534.method30780((int) local95.aClass447_61.aFloat277, (int) local95.aClass447_61.aFloat276, (int) local95.aClass447_61.aFloat278, local8);
		} else {
			Class304.method27224(this.aClass563_6, (int) local95.aClass447_61.aFloat277, (int) local95.aClass447_61.aFloat276, (int) local95.aClass447_61.aFloat278, local8);
		}
		return local20;
	}

	@OriginalMember(owner = "client!aik", name = "fn", descriptor = "(Lclient!dx;)V", line = 84)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_3.method30796(arg0, 262144, true, true);
		if (local8 != null) {
			this.aClass534_3.method30799(arg0, local8, this.method24094(), this.aShort131, this.aShort129, this.aShort132, this.aShort130, false);
		}
	}

	@OriginalMember(owner = "client!aik", name = "fs", descriptor = "(Lclient!dx;I)V", line = 84)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class84 local8 = this.aClass534_3.method30796(arg0, 262144, true, true);
		if (local8 != null) {
			this.aClass534_3.method30799(arg0, local8, this.method24094(), this.aShort131, this.aShort129, this.aShort132, this.aShort130, false);
		}
	}

	@OriginalMember(owner = "client!aik", name = "bn", descriptor = "(Lclient!ve;B)V", line = 91)
	public void method12352(@OriginalArg(0) Class594 arg0) {
		this.aClass534_3.method30788(arg0);
	}

	@OriginalMember(owner = "client!aik", name = "bq", descriptor = "(Lclient!ve;)V", line = 91)
	public void method12353(@OriginalArg(0) Class594 arg0) {
		this.aClass534_3.method30788(arg0);
	}

	@OriginalMember(owner = "client!aik", name = "be", descriptor = "(Lclient!ve;)V", line = 91)
	public void method12354(@OriginalArg(0) Class594 arg0) {
		this.aClass534_3.method30788(arg0);
	}

	@OriginalMember(owner = "client!aik", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 95)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_3.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(27) Class84 local27 = this.aClass534_3.method30796(arg0, 131072, false, false);
			return local27 == null ? false : local27.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aik", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 95)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_3.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(27) Class84 local27 = this.aClass534_3.method30796(arg0, 131072, false, false);
			return local27 == null ? false : local27.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aik", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 95)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_3.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(27) Class84 local27 = this.aClass534_3.method30796(arg0, 131072, false, false);
			return local27 == null ? false : local27.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aik", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 95)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_3.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(27) Class84 local27 = this.aClass534_3.method30796(arg0, 131072, false, false);
			return local27 == null ? false : local27.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aik", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 95)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class599 local4 = this.aClass534_3.method30793();
		if (local4.aClass441_2 == null) {
			@Pc(27) Class84 local27 = this.aClass534_3.method30796(arg0, 131072, false, false);
			return local27 == null ? false : local27.method6818(arg1, arg2, this.method24094(), false, 0);
		} else {
			return arg0.method20006(arg1, arg2, this.method24094(), local4.aClass441_2);
		}
	}

	@OriginalMember(owner = "client!aik", name = "fx", descriptor = "()Z", line = 103)
	@Override
	final boolean method24148() {
		return false;
	}

	@OriginalMember(owner = "client!aik", name = "fu", descriptor = "(B)Z", line = 103)
	@Override
	final boolean method24138() {
		return false;
	}

	@OriginalMember(owner = "client!aik", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 107)
	@Override
	final void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aik", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 107)
	@Override
	final void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aik", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 107)
	@Override
	final void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aik", name = "fd", descriptor = "(I)V", line = 111)
	@Override
	final void method24142() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aik", name = "gr", descriptor = "()V", line = 111)
	@Override
	final void method24136() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aik", name = "gj", descriptor = "()V", line = 111)
	@Override
	final void method24150() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aik", name = "gi", descriptor = "()V", line = 111)
	@Override
	final void method24164() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aik", name = "b", descriptor = "()I", line = 115)
	@Override
	public int method13077() {
		return this.aClass534_3.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aik", name = "p", descriptor = "(I)I", line = 115)
	@Override
	public int method13060() {
		return this.aClass534_3.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aik", name = "f", descriptor = "()I", line = 115)
	@Override
	public int method13067() {
		return this.aClass534_3.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aik", name = "o", descriptor = "()I", line = 115)
	@Override
	public int method13076() {
		return this.aClass534_3.anInt5177 * 1626333597;
	}

	@OriginalMember(owner = "client!aik", name = "x", descriptor = "()I", line = 119)
	@Override
	public int method13064() {
		return this.aClass534_3.anInt5178 * -1932952217;
	}

	@OriginalMember(owner = "client!aik", name = "c", descriptor = "(I)I", line = 119)
	@Override
	public int method13057() {
		return this.aClass534_3.anInt5178 * -1932952217;
	}

	@OriginalMember(owner = "client!aik", name = "d", descriptor = "()I", line = 123)
	@Override
	public int method13065() {
		return this.aClass534_3.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aik", name = "s", descriptor = "()I", line = 123)
	@Override
	public int method13073() {
		return this.aClass534_3.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aik", name = "v", descriptor = "(I)I", line = 123)
	@Override
	public int method13058() {
		return this.aClass534_3.anInt5180 * -2129482149;
	}

	@OriginalMember(owner = "client!aik", name = "l", descriptor = "(I)V", line = 126)
	@Override
	public void method13059() {
	}

	@OriginalMember(owner = "client!aik", name = "r", descriptor = "()V", line = 126)
	@Override
	public void method13079() {
	}

	@OriginalMember(owner = "client!aik", name = "g", descriptor = "()V", line = 126)
	@Override
	public void method13068() {
	}

	@OriginalMember(owner = "client!aik", name = "w", descriptor = "(B)Z", line = 129)
	@Override
	public boolean method13062() {
		return this.aBoolean280;
	}

	@OriginalMember(owner = "client!aik", name = "m", descriptor = "()Z", line = 129)
	@Override
	public boolean method13080() {
		return this.aBoolean280;
	}

	@OriginalMember(owner = "client!aik", name = "h", descriptor = "()Z", line = 129)
	@Override
	public boolean method13081() {
		return this.aBoolean280;
	}

	@OriginalMember(owner = "client!aik", name = "n", descriptor = "()Z", line = 129)
	@Override
	public boolean method13061() {
		return this.aBoolean280;
	}

	@OriginalMember(owner = "client!aik", name = "a", descriptor = "()Z", line = 129)
	@Override
	public boolean method13066() {
		return this.aBoolean280;
	}

	@OriginalMember(owner = "client!aik", name = "y", descriptor = "(B)Z", line = 133)
	@Override
	public boolean method13072() {
		return this.aClass534_3.method30803();
	}

	@OriginalMember(owner = "client!aik", name = "z", descriptor = "()Z", line = 133)
	@Override
	public boolean method13069() {
		return this.aClass534_3.method30803();
	}

	@OriginalMember(owner = "client!aik", name = "t", descriptor = "(Lclient!dx;B)V", line = 137)
	@Override
	public void method13056(@OriginalArg(0) Class86 arg0) {
		this.aClass534_3.method30806(arg0);
	}

	@OriginalMember(owner = "client!aik", name = "j", descriptor = "(Lclient!dx;)V", line = 137)
	@Override
	public void method13070(@OriginalArg(0) Class86 arg0) {
		this.aClass534_3.method30806(arg0);
	}

	@OriginalMember(owner = "client!aik", name = "i", descriptor = "(Lclient!dx;)V", line = 137)
	@Override
	public void method13078(@OriginalArg(0) Class86 arg0) {
		this.aClass534_3.method30806(arg0);
	}

	@OriginalMember(owner = "client!aik", name = "k", descriptor = "(Lclient!dx;)V", line = 137)
	@Override
	public void method13071(@OriginalArg(0) Class86 arg0) {
		this.aClass534_3.method30806(arg0);
	}

	@OriginalMember(owner = "client!aik", name = "q", descriptor = "(Lclient!dx;I)V", line = 141)
	@Override
	public void method13063(@OriginalArg(0) Class86 arg0) {
		this.aClass534_3.method30809(arg0);
	}

	@OriginalMember(owner = "client!aik", name = "u", descriptor = "(Lclient!dx;)V", line = 141)
	@Override
	public void method13075(@OriginalArg(0) Class86 arg0) {
		this.aClass534_3.method30809(arg0);
	}

	@OriginalMember(owner = "client!aik", name = "e", descriptor = "(Lclient!dx;)V", line = 141)
	@Override
	public void method13074(@OriginalArg(0) Class86 arg0) {
		this.aClass534_3.method30809(arg0);
	}
}
