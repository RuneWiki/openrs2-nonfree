package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aex")
public class Class26_Sub1_Sub2_Sub1 extends Class26_Sub1_Sub2 implements Interface43 {

	@OriginalMember(owner = "client!aex", name = "ad", descriptor = "I")
	public static int anInt1093;

	@OriginalMember(owner = "client!aex", name = "n", descriptor = "Lclient!rc;")
	Class426 aClass426_2;

	@OriginalMember(owner = "client!aex", name = "e", descriptor = "Z")
	boolean aBoolean238 = true;

	@OriginalMember(owner = "client!aex", name = "z", descriptor = "Lclient!pe;")
	public Class387 aClass387_2;

	@OriginalMember(owner = "client!aex", name = "j", descriptor = "Z")
	boolean aBoolean239;

	@OriginalMember(owner = "client!aex", name = "<init>", descriptor = "(Lclient!rp;Lclient!de;Lclient!sj;Lclient!su;IIIIIZIII)V", line = 28)
	public Class26_Sub1_Sub2_Sub1(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class457 arg2, @OriginalArg(3) Class467 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.anInt5112 * 404164357);
		this.aClass387_2 = new Class387(arg1, arg2, arg3, Class456.aClass456_23.anInt5061 * 821735799, arg10, arg5, this, arg9, arg11, arg12);
		this.aBoolean239 = arg3.anInt5082 * 1242646151 != 0 && !arg9;
		this.method21480(1);
	}

	@OriginalMember(owner = "client!aex", name = "cp", descriptor = "()Z", line = 35)
	@Override
	boolean method21501() {
		return false;
	}

	@OriginalMember(owner = "client!aex", name = "bs", descriptor = "(B)Z", line = 35)
	@Override
	boolean method21472() {
		return false;
	}

	@OriginalMember(owner = "client!aex", name = "cc", descriptor = "()Z", line = 35)
	@Override
	boolean method21491() {
		return false;
	}

	@OriginalMember(owner = "client!aex", name = "cx", descriptor = "()Z", line = 39)
	@Override
	boolean method21468() {
		return this.aBoolean238;
	}

	@OriginalMember(owner = "client!aex", name = "cs", descriptor = "()Z", line = 39)
	@Override
	boolean method21483() {
		return this.aBoolean238;
	}

	@OriginalMember(owner = "client!aex", name = "bm", descriptor = "(I)Z", line = 39)
	@Override
	boolean method21467() {
		return this.aBoolean238;
	}

	@OriginalMember(owner = "client!aex", name = "ct", descriptor = "()Z", line = 39)
	@Override
	boolean method21484() {
		return this.aBoolean238;
	}

	@OriginalMember(owner = "client!aex", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 43)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_2;
	}

	@OriginalMember(owner = "client!aex", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 43)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_2;
	}

	@OriginalMember(owner = "client!aex", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 43)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_2;
	}

	@OriginalMember(owner = "client!aex", name = "bd", descriptor = "(I)I", line = 47)
	@Override
	public int method21508() {
		return this.aClass387_2.method27367();
	}

	@OriginalMember(owner = "client!aex", name = "cy", descriptor = "()I", line = 47)
	@Override
	public int method21527() {
		return this.aClass387_2.method27367();
	}

	@OriginalMember(owner = "client!aex", name = "cb", descriptor = "()I", line = 47)
	@Override
	public int method21487() {
		return this.aClass387_2.method27367();
	}

	@OriginalMember(owner = "client!aex", name = "bb", descriptor = "(B)I", line = 51)
	@Override
	public int method21479() {
		return this.aClass387_2.method27369();
	}

	@OriginalMember(owner = "client!aex", name = "cn", descriptor = "()I", line = 51)
	@Override
	public int method21473() {
		return this.aClass387_2.method27369();
	}

	@OriginalMember(owner = "client!aex", name = "cz", descriptor = "()I", line = 51)
	@Override
	public int method21463() {
		return this.aClass387_2.method27369();
	}

	@OriginalMember(owner = "client!aex", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 55)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_2.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = this.method21433();
		@Pc(18) Class322 local18 = this.method21431();
		@Pc(23) Class446 local23 = Class508.method29569(this.aBoolean239);
		@Pc(30) int local30 = (int) local18.aClass320_61.aFloat259 >> 9;
		@Pc(37) int local37 = (int) local18.aClass320_61.aFloat261 >> 9;
		this.aClass387_2.method27385(arg0, local8, local15, local30, local30, local37, local37, true);
		@Pc(54) Class467 local54 = this.aClass387_2.method27370();
		if (local54.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local54.aClass323_1);
		}
		if (this.aClass387_2.aClass478_7 != null) {
			@Pc(90) Class128 local90 = this.aClass387_2.aClass478_7.method28843();
			arg0.method17105(local90);
		}
		this.aBoolean238 = local8.method5375() || this.aClass387_2.aClass478_7 != null;
		if (this.aClass426_2 == null) {
			this.aClass426_2 = Class445.method28337((int) local18.aClass320_61.aFloat259, (int) local18.aClass320_61.aFloat260, (int) local18.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_2, (int) local18.aClass320_61.aFloat259, (int) local18.aClass320_61.aFloat260, (int) local18.aClass320_61.aFloat261, local8);
		}
		return local23;
	}

	@OriginalMember(owner = "client!aex", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 55)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_2.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = this.method21433();
		@Pc(18) Class322 local18 = this.method21431();
		@Pc(23) Class446 local23 = Class508.method29569(this.aBoolean239);
		@Pc(30) int local30 = (int) local18.aClass320_61.aFloat259 >> 9;
		@Pc(37) int local37 = (int) local18.aClass320_61.aFloat261 >> 9;
		this.aClass387_2.method27385(arg0, local8, local15, local30, local30, local37, local37, true);
		@Pc(54) Class467 local54 = this.aClass387_2.method27370();
		if (local54.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local54.aClass323_1);
		}
		if (this.aClass387_2.aClass478_7 != null) {
			@Pc(90) Class128 local90 = this.aClass387_2.aClass478_7.method28843();
			arg0.method17105(local90);
		}
		this.aBoolean238 = local8.method5375() || this.aClass387_2.aClass478_7 != null;
		if (this.aClass426_2 == null) {
			this.aClass426_2 = Class445.method28337((int) local18.aClass320_61.aFloat259, (int) local18.aClass320_61.aFloat260, (int) local18.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_2, (int) local18.aClass320_61.aFloat259, (int) local18.aClass320_61.aFloat260, (int) local18.aClass320_61.aFloat261, local8);
		}
		return local23;
	}

	@OriginalMember(owner = "client!aex", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 55)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_2.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = this.method21433();
		@Pc(18) Class322 local18 = this.method21431();
		@Pc(23) Class446 local23 = Class508.method29569(this.aBoolean239);
		@Pc(30) int local30 = (int) local18.aClass320_61.aFloat259 >> 9;
		@Pc(37) int local37 = (int) local18.aClass320_61.aFloat261 >> 9;
		this.aClass387_2.method27385(arg0, local8, local15, local30, local30, local37, local37, true);
		@Pc(54) Class467 local54 = this.aClass387_2.method27370();
		if (local54.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local54.aClass323_1);
		}
		if (this.aClass387_2.aClass478_7 != null) {
			@Pc(90) Class128 local90 = this.aClass387_2.aClass478_7.method28843();
			arg0.method17105(local90);
		}
		this.aBoolean238 = local8.method5375() || this.aClass387_2.aClass478_7 != null;
		if (this.aClass426_2 == null) {
			this.aClass426_2 = Class445.method28337((int) local18.aClass320_61.aFloat259, (int) local18.aClass320_61.aFloat260, (int) local18.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_2, (int) local18.aClass320_61.aFloat259, (int) local18.aClass320_61.aFloat260, (int) local18.aClass320_61.aFloat261, local8);
		}
		return local23;
	}

	@OriginalMember(owner = "client!aex", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 55)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_2.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = this.method21433();
		@Pc(18) Class322 local18 = this.method21431();
		@Pc(23) Class446 local23 = Class508.method29569(this.aBoolean239);
		@Pc(30) int local30 = (int) local18.aClass320_61.aFloat259 >> 9;
		@Pc(37) int local37 = (int) local18.aClass320_61.aFloat261 >> 9;
		this.aClass387_2.method27385(arg0, local8, local15, local30, local30, local37, local37, true);
		@Pc(54) Class467 local54 = this.aClass387_2.method27370();
		if (local54.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local54.aClass323_1);
		}
		if (this.aClass387_2.aClass478_7 != null) {
			@Pc(90) Class128 local90 = this.aClass387_2.aClass478_7.method28843();
			arg0.method17105(local90);
		}
		this.aBoolean238 = local8.method5375() || this.aClass387_2.aClass478_7 != null;
		if (this.aClass426_2 == null) {
			this.aClass426_2 = Class445.method28337((int) local18.aClass320_61.aFloat259, (int) local18.aClass320_61.aFloat260, (int) local18.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_2, (int) local18.aClass320_61.aFloat259, (int) local18.aClass320_61.aFloat260, (int) local18.aClass320_61.aFloat261, local8);
		}
		return local23;
	}

	@OriginalMember(owner = "client!aex", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 55)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_2.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = this.method21433();
		@Pc(18) Class322 local18 = this.method21431();
		@Pc(23) Class446 local23 = Class508.method29569(this.aBoolean239);
		@Pc(30) int local30 = (int) local18.aClass320_61.aFloat259 >> 9;
		@Pc(37) int local37 = (int) local18.aClass320_61.aFloat261 >> 9;
		this.aClass387_2.method27385(arg0, local8, local15, local30, local30, local37, local37, true);
		@Pc(54) Class467 local54 = this.aClass387_2.method27370();
		if (local54.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local54.aClass323_1);
		}
		if (this.aClass387_2.aClass478_7 != null) {
			@Pc(90) Class128 local90 = this.aClass387_2.aClass478_7.method28843();
			arg0.method17105(local90);
		}
		this.aBoolean238 = local8.method5375() || this.aClass387_2.aClass478_7 != null;
		if (this.aClass426_2 == null) {
			this.aClass426_2 = Class445.method28337((int) local18.aClass320_61.aFloat259, (int) local18.aClass320_61.aFloat260, (int) local18.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_2, (int) local18.aClass320_61.aFloat259, (int) local18.aClass320_61.aFloat260, (int) local18.aClass320_61.aFloat261, local8);
		}
		return local23;
	}

	@OriginalMember(owner = "client!aex", name = "fx", descriptor = "(Lclient!de;I)V", line = 80)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_2.method27399(arg0, 262144, true, true);
		if (local8 != null) {
			@Pc(14) Class320 local14 = this.method21431().aClass320_61;
			@Pc(20) int local20 = (int) local14.aFloat259 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat261 >> 9;
			this.aClass387_2.method27385(arg0, local8, this.method21433(), local20, local20, local26, local26, false);
		}
	}

	@OriginalMember(owner = "client!aex", name = "fq", descriptor = "(Lclient!de;)V", line = 80)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_2.method27399(arg0, 262144, true, true);
		if (local8 != null) {
			@Pc(14) Class320 local14 = this.method21431().aClass320_61;
			@Pc(20) int local20 = (int) local14.aFloat259 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat261 >> 9;
			this.aClass387_2.method27385(arg0, local8, this.method21433(), local20, local20, local26, local26, false);
		}
	}

	@OriginalMember(owner = "client!aex", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 90)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_2.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(26) Class20 local26 = this.aClass387_2.method27399(arg0, 131072, false, false);
			return local26 == null ? false : local26.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!aex", name = "fy", descriptor = "(Lclient!de;II)Z", line = 90)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_2.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(26) Class20 local26 = this.aClass387_2.method27399(arg0, 131072, false, false);
			return local26 == null ? false : local26.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!aex", name = "fv", descriptor = "(Lclient!de;II)Z", line = 90)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_2.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(26) Class20 local26 = this.aClass387_2.method27399(arg0, 131072, false, false);
			return local26 == null ? false : local26.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!aex", name = "fu", descriptor = "(B)Z", line = 98)
	@Override
	final boolean method21465() {
		return false;
	}

	@OriginalMember(owner = "client!aex", name = "fw", descriptor = "()Z", line = 98)
	@Override
	final boolean method21495() {
		return false;
	}

	@OriginalMember(owner = "client!aex", name = "fe", descriptor = "()Z", line = 98)
	@Override
	final boolean method21503() {
		return false;
	}

	@OriginalMember(owner = "client!aex", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 102)
	@Override
	final void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aex", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 102)
	@Override
	final void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aex", name = "fb", descriptor = "(I)V", line = 106)
	@Override
	final void method21469() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aex", name = "fo", descriptor = "()V", line = 106)
	@Override
	final void method21481() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aex", name = "fl", descriptor = "()V", line = 106)
	@Override
	final void method21497() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aex", name = "p", descriptor = "(B)I", line = 110)
	@Override
	public int method11163() {
		return this.aClass387_2.anInt4745 * -921030407;
	}

	@OriginalMember(owner = "client!aex", name = "y", descriptor = "()I", line = 110)
	@Override
	public int method11153() {
		return this.aClass387_2.anInt4745 * -921030407;
	}

	@OriginalMember(owner = "client!aex", name = "v", descriptor = "()I", line = 114)
	@Override
	public int method11164() {
		return this.aClass387_2.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!aex", name = "a", descriptor = "(B)I", line = 114)
	@Override
	public int method11146() {
		return this.aClass387_2.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!aex", name = "m", descriptor = "()I", line = 114)
	@Override
	public int method11155() {
		return this.aClass387_2.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!aex", name = "g", descriptor = "(I)I", line = 118)
	@Override
	public int method11147() {
		return this.aClass387_2.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!aex", name = "b", descriptor = "()I", line = 118)
	@Override
	public int method11152() {
		return this.aClass387_2.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!aex", name = "c", descriptor = "()I", line = 118)
	@Override
	public int method11151() {
		return this.aClass387_2.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!aex", name = "bg", descriptor = "(Lclient!sp;)V", line = 122)
	public void method9765(@OriginalArg(0) Class462 arg0) {
		this.aClass387_2.method27389(arg0);
	}

	@OriginalMember(owner = "client!aex", name = "bf", descriptor = "(Lclient!sp;I)V", line = 122)
	public void method9766(@OriginalArg(0) Class462 arg0) {
		this.aClass387_2.method27389(arg0);
	}

	@OriginalMember(owner = "client!aex", name = "bt", descriptor = "(Lclient!sp;)V", line = 122)
	public void method9767(@OriginalArg(0) Class462 arg0) {
		this.aClass387_2.method27389(arg0);
	}

	@OriginalMember(owner = "client!aex", name = "bk", descriptor = "(Lclient!sp;)V", line = 122)
	public void method9768(@OriginalArg(0) Class462 arg0) {
		this.aClass387_2.method27389(arg0);
	}

	@OriginalMember(owner = "client!aex", name = "l", descriptor = "(B)V", line = 125)
	@Override
	public void method11148() {
	}

	@OriginalMember(owner = "client!aex", name = "z", descriptor = "()V", line = 125)
	@Override
	public void method11162() {
	}

	@OriginalMember(owner = "client!aex", name = "j", descriptor = "()V", line = 125)
	@Override
	public void method11157() {
	}

	@OriginalMember(owner = "client!aex", name = "n", descriptor = "()V", line = 125)
	@Override
	public void method11158() {
	}

	@OriginalMember(owner = "client!aex", name = "x", descriptor = "(B)Z", line = 128)
	@Override
	public boolean method11150() {
		return true;
	}

	@OriginalMember(owner = "client!aex", name = "d", descriptor = "()Z", line = 128)
	@Override
	public boolean method11161() {
		return true;
	}

	@OriginalMember(owner = "client!aex", name = "r", descriptor = "()Z", line = 128)
	@Override
	public boolean method11160() {
		return true;
	}

	@OriginalMember(owner = "client!aex", name = "h", descriptor = "(I)Z", line = 132)
	@Override
	public boolean method11149() {
		return this.aClass387_2.method27373();
	}

	@OriginalMember(owner = "client!aex", name = "e", descriptor = "()Z", line = 132)
	@Override
	public boolean method11154() {
		return this.aClass387_2.method27373();
	}

	@OriginalMember(owner = "client!aex", name = "s", descriptor = "(Lclient!de;I)V", line = 136)
	@Override
	public void method11156(@OriginalArg(0) Class21 arg0) {
		this.aClass387_2.method27374(arg0);
	}

	@OriginalMember(owner = "client!aex", name = "t", descriptor = "(Lclient!de;)V", line = 136)
	@Override
	public void method11165(@OriginalArg(0) Class21 arg0) {
		this.aClass387_2.method27374(arg0);
	}

	@OriginalMember(owner = "client!aex", name = "u", descriptor = "(Lclient!de;B)V", line = 140)
	@Override
	public void method11159(@OriginalArg(0) Class21 arg0) {
		this.aClass387_2.method27375(arg0);
	}

	@OriginalMember(owner = "client!aex", name = "q", descriptor = "(Lclient!de;)V", line = 140)
	@Override
	public void method11145(@OriginalArg(0) Class21 arg0) {
		this.aClass387_2.method27375(arg0);
	}

	@OriginalMember(owner = "client!aex", name = "l", descriptor = "(Lclient!and;S)I", line = 199)
	static int method9770(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		@Pc(4) int local4 = arg0.method19825(2);
		@Pc(9) int local9;
		if (local4 == 0) {
			local9 = 0;
		} else if (local4 == 1) {
			local9 = arg0.method19825(5);
		} else if (local4 == 2) {
			local9 = arg0.method19825(8);
		} else {
			local9 = arg0.method19825(11);
		}
		return local9;
	}

	@OriginalMember(owner = "client!aex", name = "gn", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 5185)
	static final void method9769(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		if (arg0.anInt3492 * -107621169 == 4) {
			Class461.method28592(arg0, arg1, arg2);
		}
	}
}
