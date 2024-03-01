package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aen")
public class Class26_Sub1_Sub1_Sub2 extends Class26_Sub1_Sub1 implements Interface43 {

	@OriginalMember(owner = "client!aen", name = "n", descriptor = "Lclient!rc;")
	Class426 aClass426_1;

	@OriginalMember(owner = "client!aen", name = "e", descriptor = "Z")
	boolean aBoolean204 = true;

	@OriginalMember(owner = "client!aen", name = "z", descriptor = "Lclient!pe;")
	public Class387 aClass387_1;

	@OriginalMember(owner = "client!aen", name = "j", descriptor = "Z")
	boolean aBoolean205;

	@OriginalMember(owner = "client!aen", name = "r", descriptor = "Z")
	final boolean aBoolean206;

	@OriginalMember(owner = "client!aen", name = "<init>", descriptor = "(Lclient!rp;Lclient!de;Lclient!sj;Lclient!su;IIIIIZIIIIIIIIZ)V", line = 27)
	public Class26_Sub1_Sub1_Sub2(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class457 arg2, @OriginalArg(3) Class467 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) boolean arg18) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.anInt5087 * 2055542599 == 1, Class126.method22876(arg14, arg15));
		this.aClass387_1 = new Class387(arg1, arg2, arg3, arg14, arg15, arg5, this, arg9, arg16, arg17);
		this.aBoolean205 = arg3.anInt5082 * 1242646151 != 0 && !arg9;
		this.aBoolean206 = arg18;
		this.method21480(1);
	}

	@OriginalMember(owner = "client!aen", name = "bs", descriptor = "(B)Z", line = 35)
	@Override
	boolean method21472() {
		return false;
	}

	@OriginalMember(owner = "client!aen", name = "cc", descriptor = "()Z", line = 35)
	@Override
	boolean method21491() {
		return false;
	}

	@OriginalMember(owner = "client!aen", name = "cp", descriptor = "()Z", line = 35)
	@Override
	boolean method21501() {
		return false;
	}

	@OriginalMember(owner = "client!aen", name = "bm", descriptor = "(I)Z", line = 39)
	@Override
	boolean method21467() {
		return this.aBoolean204;
	}

	@OriginalMember(owner = "client!aen", name = "cx", descriptor = "()Z", line = 39)
	@Override
	boolean method21468() {
		return this.aBoolean204;
	}

	@OriginalMember(owner = "client!aen", name = "cs", descriptor = "()Z", line = 39)
	@Override
	boolean method21483() {
		return this.aBoolean204;
	}

	@OriginalMember(owner = "client!aen", name = "ct", descriptor = "()Z", line = 39)
	@Override
	boolean method21484() {
		return this.aBoolean204;
	}

	@OriginalMember(owner = "client!aen", name = "bk", descriptor = "(II)B", line = 43)
	static byte method9174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class456.aClass456_6.anInt5061 * 821735799 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aen", name = "bd", descriptor = "(I)I", line = 49)
	@Override
	public int method21508() {
		return this.aClass387_1.method27367();
	}

	@OriginalMember(owner = "client!aen", name = "cy", descriptor = "()I", line = 49)
	@Override
	public int method21527() {
		return this.aClass387_1.method27367();
	}

	@OriginalMember(owner = "client!aen", name = "cb", descriptor = "()I", line = 49)
	@Override
	public int method21487() {
		return this.aClass387_1.method27367();
	}

	@OriginalMember(owner = "client!aen", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 53)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_1;
	}

	@OriginalMember(owner = "client!aen", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 53)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_1;
	}

	@OriginalMember(owner = "client!aen", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 53)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_1;
	}

	@OriginalMember(owner = "client!aen", name = "bb", descriptor = "(B)I", line = 57)
	@Override
	public int method21479() {
		return this.aClass387_1.method27369();
	}

	@OriginalMember(owner = "client!aen", name = "cz", descriptor = "()I", line = 57)
	@Override
	public int method21463() {
		return this.aClass387_1.method27369();
	}

	@OriginalMember(owner = "client!aen", name = "cn", descriptor = "()I", line = 57)
	@Override
	public int method21473() {
		return this.aClass387_1.method27369();
	}

	@OriginalMember(owner = "client!aen", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 61)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_1.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = this.method21433();
		@Pc(20) Class446 local20 = Class508.method29569(this.aBoolean205);
		this.aClass387_1.method27385(arg0, local8, local15, this.aShort94, this.aShort92, this.aShort93, this.aShort91, true);
		@Pc(41) Class467 local41 = this.aClass387_1.method27370();
		if (local41.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local41.aClass323_1);
		}
		if (this.aClass387_1.aClass478_7 != null) {
			@Pc(77) Class128 local77 = this.aClass387_1.aClass478_7.method28843();
			arg0.method17105(local77);
		}
		this.aBoolean204 = local8.method5375() || this.aClass387_1.aClass478_7 != null;
		@Pc(96) Class322 local96 = this.method21431();
		if (this.aClass426_1 == null) {
			this.aClass426_1 = Class445.method28337((int) local96.aClass320_61.aFloat259, (int) local96.aClass320_61.aFloat260, (int) local96.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_1, (int) local96.aClass320_61.aFloat259, (int) local96.aClass320_61.aFloat260, (int) local96.aClass320_61.aFloat261, local8);
		}
		return local20;
	}

	@OriginalMember(owner = "client!aen", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 61)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_1.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = this.method21433();
		@Pc(20) Class446 local20 = Class508.method29569(this.aBoolean205);
		this.aClass387_1.method27385(arg0, local8, local15, this.aShort94, this.aShort92, this.aShort93, this.aShort91, true);
		@Pc(41) Class467 local41 = this.aClass387_1.method27370();
		if (local41.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local41.aClass323_1);
		}
		if (this.aClass387_1.aClass478_7 != null) {
			@Pc(77) Class128 local77 = this.aClass387_1.aClass478_7.method28843();
			arg0.method17105(local77);
		}
		this.aBoolean204 = local8.method5375() || this.aClass387_1.aClass478_7 != null;
		@Pc(96) Class322 local96 = this.method21431();
		if (this.aClass426_1 == null) {
			this.aClass426_1 = Class445.method28337((int) local96.aClass320_61.aFloat259, (int) local96.aClass320_61.aFloat260, (int) local96.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_1, (int) local96.aClass320_61.aFloat259, (int) local96.aClass320_61.aFloat260, (int) local96.aClass320_61.aFloat261, local8);
		}
		return local20;
	}

	@OriginalMember(owner = "client!aen", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 61)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_1.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = this.method21433();
		@Pc(20) Class446 local20 = Class508.method29569(this.aBoolean205);
		this.aClass387_1.method27385(arg0, local8, local15, this.aShort94, this.aShort92, this.aShort93, this.aShort91, true);
		@Pc(41) Class467 local41 = this.aClass387_1.method27370();
		if (local41.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local41.aClass323_1);
		}
		if (this.aClass387_1.aClass478_7 != null) {
			@Pc(77) Class128 local77 = this.aClass387_1.aClass478_7.method28843();
			arg0.method17105(local77);
		}
		this.aBoolean204 = local8.method5375() || this.aClass387_1.aClass478_7 != null;
		@Pc(96) Class322 local96 = this.method21431();
		if (this.aClass426_1 == null) {
			this.aClass426_1 = Class445.method28337((int) local96.aClass320_61.aFloat259, (int) local96.aClass320_61.aFloat260, (int) local96.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_1, (int) local96.aClass320_61.aFloat259, (int) local96.aClass320_61.aFloat260, (int) local96.aClass320_61.aFloat261, local8);
		}
		return local20;
	}

	@OriginalMember(owner = "client!aen", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 61)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_1.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = this.method21433();
		@Pc(20) Class446 local20 = Class508.method29569(this.aBoolean205);
		this.aClass387_1.method27385(arg0, local8, local15, this.aShort94, this.aShort92, this.aShort93, this.aShort91, true);
		@Pc(41) Class467 local41 = this.aClass387_1.method27370();
		if (local41.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local41.aClass323_1);
		}
		if (this.aClass387_1.aClass478_7 != null) {
			@Pc(77) Class128 local77 = this.aClass387_1.aClass478_7.method28843();
			arg0.method17105(local77);
		}
		this.aBoolean204 = local8.method5375() || this.aClass387_1.aClass478_7 != null;
		@Pc(96) Class322 local96 = this.method21431();
		if (this.aClass426_1 == null) {
			this.aClass426_1 = Class445.method28337((int) local96.aClass320_61.aFloat259, (int) local96.aClass320_61.aFloat260, (int) local96.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_1, (int) local96.aClass320_61.aFloat259, (int) local96.aClass320_61.aFloat260, (int) local96.aClass320_61.aFloat261, local8);
		}
		return local20;
	}

	@OriginalMember(owner = "client!aen", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 61)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_1.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = this.method21433();
		@Pc(20) Class446 local20 = Class508.method29569(this.aBoolean205);
		this.aClass387_1.method27385(arg0, local8, local15, this.aShort94, this.aShort92, this.aShort93, this.aShort91, true);
		@Pc(41) Class467 local41 = this.aClass387_1.method27370();
		if (local41.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local41.aClass323_1);
		}
		if (this.aClass387_1.aClass478_7 != null) {
			@Pc(77) Class128 local77 = this.aClass387_1.aClass478_7.method28843();
			arg0.method17105(local77);
		}
		this.aBoolean204 = local8.method5375() || this.aClass387_1.aClass478_7 != null;
		@Pc(96) Class322 local96 = this.method21431();
		if (this.aClass426_1 == null) {
			this.aClass426_1 = Class445.method28337((int) local96.aClass320_61.aFloat259, (int) local96.aClass320_61.aFloat260, (int) local96.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_1, (int) local96.aClass320_61.aFloat259, (int) local96.aClass320_61.aFloat260, (int) local96.aClass320_61.aFloat261, local8);
		}
		return local20;
	}

	@OriginalMember(owner = "client!aen", name = "fx", descriptor = "(Lclient!de;I)V", line = 84)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_1.method27399(arg0, 262144, true, true);
		if (local8 != null) {
			this.aClass387_1.method27385(arg0, local8, this.method21433(), this.aShort94, this.aShort92, this.aShort93, this.aShort91, false);
		}
	}

	@OriginalMember(owner = "client!aen", name = "fq", descriptor = "(Lclient!de;)V", line = 84)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_1.method27399(arg0, 262144, true, true);
		if (local8 != null) {
			this.aClass387_1.method27385(arg0, local8, this.method21433(), this.aShort94, this.aShort92, this.aShort93, this.aShort91, false);
		}
	}

	@OriginalMember(owner = "client!aen", name = "bt", descriptor = "(Lclient!sp;B)V", line = 91)
	public void method9172(@OriginalArg(0) Class462 arg0) {
		this.aClass387_1.method27389(arg0);
	}

	@OriginalMember(owner = "client!aen", name = "bg", descriptor = "(Lclient!sp;)V", line = 91)
	public void method9173(@OriginalArg(0) Class462 arg0) {
		this.aClass387_1.method27389(arg0);
	}

	@OriginalMember(owner = "client!aen", name = "br", descriptor = "(Lclient!sp;)V", line = 91)
	public void method9175(@OriginalArg(0) Class462 arg0) {
		this.aClass387_1.method27389(arg0);
	}

	@OriginalMember(owner = "client!aen", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 95)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_1.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(26) Class20 local26 = this.aClass387_1.method27399(arg0, 131072, false, false);
			return local26 == null ? false : local26.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!aen", name = "fy", descriptor = "(Lclient!de;II)Z", line = 95)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_1.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(26) Class20 local26 = this.aClass387_1.method27399(arg0, 131072, false, false);
			return local26 == null ? false : local26.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!aen", name = "fv", descriptor = "(Lclient!de;II)Z", line = 95)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_1.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(26) Class20 local26 = this.aClass387_1.method27399(arg0, 131072, false, false);
			return local26 == null ? false : local26.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!aen", name = "fe", descriptor = "()Z", line = 103)
	@Override
	final boolean method21503() {
		return false;
	}

	@OriginalMember(owner = "client!aen", name = "fu", descriptor = "(B)Z", line = 103)
	@Override
	final boolean method21465() {
		return false;
	}

	@OriginalMember(owner = "client!aen", name = "fw", descriptor = "()Z", line = 103)
	@Override
	final boolean method21495() {
		return false;
	}

	@OriginalMember(owner = "client!aen", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 107)
	@Override
	final void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aen", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 107)
	@Override
	final void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aen", name = "fb", descriptor = "(I)V", line = 111)
	@Override
	final void method21469() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aen", name = "fo", descriptor = "()V", line = 111)
	@Override
	final void method21481() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aen", name = "fl", descriptor = "()V", line = 111)
	@Override
	final void method21497() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aen", name = "p", descriptor = "(B)I", line = 115)
	@Override
	public int method11163() {
		return this.aClass387_1.anInt4745 * -921030407;
	}

	@OriginalMember(owner = "client!aen", name = "y", descriptor = "()I", line = 115)
	@Override
	public int method11153() {
		return this.aClass387_1.anInt4745 * -921030407;
	}

	@OriginalMember(owner = "client!aen", name = "a", descriptor = "(B)I", line = 119)
	@Override
	public int method11146() {
		return this.aClass387_1.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!aen", name = "m", descriptor = "()I", line = 119)
	@Override
	public int method11155() {
		return this.aClass387_1.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!aen", name = "v", descriptor = "()I", line = 119)
	@Override
	public int method11164() {
		return this.aClass387_1.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!aen", name = "g", descriptor = "(I)I", line = 123)
	@Override
	public int method11147() {
		return this.aClass387_1.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!aen", name = "b", descriptor = "()I", line = 123)
	@Override
	public int method11152() {
		return this.aClass387_1.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!aen", name = "c", descriptor = "()I", line = 123)
	@Override
	public int method11151() {
		return this.aClass387_1.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!aen", name = "n", descriptor = "()V", line = 126)
	@Override
	public void method11158() {
	}

	@OriginalMember(owner = "client!aen", name = "z", descriptor = "()V", line = 126)
	@Override
	public void method11162() {
	}

	@OriginalMember(owner = "client!aen", name = "l", descriptor = "(B)V", line = 126)
	@Override
	public void method11148() {
	}

	@OriginalMember(owner = "client!aen", name = "j", descriptor = "()V", line = 126)
	@Override
	public void method11157() {
	}

	@OriginalMember(owner = "client!aen", name = "x", descriptor = "(B)Z", line = 129)
	@Override
	public boolean method11150() {
		return this.aBoolean206;
	}

	@OriginalMember(owner = "client!aen", name = "r", descriptor = "()Z", line = 129)
	@Override
	public boolean method11160() {
		return this.aBoolean206;
	}

	@OriginalMember(owner = "client!aen", name = "d", descriptor = "()Z", line = 129)
	@Override
	public boolean method11161() {
		return this.aBoolean206;
	}

	@OriginalMember(owner = "client!aen", name = "h", descriptor = "(I)Z", line = 133)
	@Override
	public boolean method11149() {
		return this.aClass387_1.method27373();
	}

	@OriginalMember(owner = "client!aen", name = "e", descriptor = "()Z", line = 133)
	@Override
	public boolean method11154() {
		return this.aClass387_1.method27373();
	}

	@OriginalMember(owner = "client!aen", name = "s", descriptor = "(Lclient!de;I)V", line = 137)
	@Override
	public void method11156(@OriginalArg(0) Class21 arg0) {
		this.aClass387_1.method27374(arg0);
	}

	@OriginalMember(owner = "client!aen", name = "t", descriptor = "(Lclient!de;)V", line = 137)
	@Override
	public void method11165(@OriginalArg(0) Class21 arg0) {
		this.aClass387_1.method27374(arg0);
	}

	@OriginalMember(owner = "client!aen", name = "u", descriptor = "(Lclient!de;B)V", line = 141)
	@Override
	public void method11159(@OriginalArg(0) Class21 arg0) {
		this.aClass387_1.method27375(arg0);
	}

	@OriginalMember(owner = "client!aen", name = "q", descriptor = "(Lclient!de;)V", line = 141)
	@Override
	public void method11145(@OriginalArg(0) Class21 arg0) {
		this.aClass387_1.method27375(arg0);
	}

	@OriginalMember(owner = "client!aen", name = "y", descriptor = "(Lclient!zz;IILclient!vo;Lclient!aow;I)V", line = 277)
	public static void method9176(@OriginalArg(0) Class634 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class533 arg3, @OriginalArg(4) Class26_Sub1_Sub5_Sub1 arg4) {
		@Pc(2) Class536 local2 = Class27.method15271();
		local2.aClass26_Sub1_Sub5_Sub1_1 = arg4;
		Class316.method25839(arg0, arg1, arg2, local2);
		local2.aClass26_Sub1_Sub5_Sub1_1 = null;
	}
}
