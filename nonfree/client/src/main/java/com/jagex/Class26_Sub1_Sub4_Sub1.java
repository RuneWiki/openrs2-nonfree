package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afo")
public class Class26_Sub1_Sub4_Sub1 extends Class26_Sub1_Sub4 implements Interface43 {

	@OriginalMember(owner = "client!afo", name = "n", descriptor = "Lclient!rc;")
	Class426 aClass426_6;

	@OriginalMember(owner = "client!afo", name = "e", descriptor = "Z")
	boolean aBoolean281 = true;

	@OriginalMember(owner = "client!afo", name = "z", descriptor = "Lclient!pe;")
	public Class387 aClass387_4;

	@OriginalMember(owner = "client!afo", name = "j", descriptor = "Z")
	boolean aBoolean280;

	@OriginalMember(owner = "client!afo", name = "<init>", descriptor = "(Lclient!rp;Lclient!de;Lclient!sj;Lclient!su;IIIIIZIIIIII)V", line = 25)
	public Class26_Sub1_Sub4_Sub1(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class457 arg2, @OriginalArg(3) Class467 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11);
		this.aClass387_4 = new Class387(arg1, arg2, arg3, arg12, arg13, arg5, this, arg9, arg14, arg15);
		this.aBoolean280 = arg3.anInt5082 * 1242646151 != 0 && !arg9;
		this.method21480(1);
	}

	@OriginalMember(owner = "client!afo", name = "bs", descriptor = "(B)Z", line = 32)
	@Override
	boolean method21472() {
		return false;
	}

	@OriginalMember(owner = "client!afo", name = "cp", descriptor = "()Z", line = 32)
	@Override
	boolean method21501() {
		return false;
	}

	@OriginalMember(owner = "client!afo", name = "cc", descriptor = "()Z", line = 32)
	@Override
	boolean method21491() {
		return false;
	}

	@OriginalMember(owner = "client!afo", name = "ct", descriptor = "()Z", line = 36)
	@Override
	boolean method21484() {
		return this.aBoolean281;
	}

	@OriginalMember(owner = "client!afo", name = "cx", descriptor = "()Z", line = 36)
	@Override
	boolean method21468() {
		return this.aBoolean281;
	}

	@OriginalMember(owner = "client!afo", name = "cs", descriptor = "()Z", line = 36)
	@Override
	boolean method21483() {
		return this.aBoolean281;
	}

	@OriginalMember(owner = "client!afo", name = "bm", descriptor = "(I)Z", line = 36)
	@Override
	boolean method21467() {
		return this.aBoolean281;
	}

	@OriginalMember(owner = "client!afo", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 40)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_6;
	}

	@OriginalMember(owner = "client!afo", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 40)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_6;
	}

	@OriginalMember(owner = "client!afo", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 40)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_6;
	}

	@OriginalMember(owner = "client!afo", name = "cy", descriptor = "()I", line = 44)
	@Override
	public int method21527() {
		return this.aClass387_4.method27367();
	}

	@OriginalMember(owner = "client!afo", name = "bd", descriptor = "(I)I", line = 44)
	@Override
	public int method21508() {
		return this.aClass387_4.method27367();
	}

	@OriginalMember(owner = "client!afo", name = "cb", descriptor = "()I", line = 44)
	@Override
	public int method21487() {
		return this.aClass387_4.method27367();
	}

	@OriginalMember(owner = "client!afo", name = "cz", descriptor = "()I", line = 48)
	@Override
	public int method21463() {
		return this.aClass387_4.method27369();
	}

	@OriginalMember(owner = "client!afo", name = "bb", descriptor = "(B)I", line = 48)
	@Override
	public int method21479() {
		return this.aClass387_4.method27369();
	}

	@OriginalMember(owner = "client!afo", name = "cn", descriptor = "()I", line = 48)
	@Override
	public int method21473() {
		return this.aClass387_4.method27369();
	}

	@OriginalMember(owner = "client!afo", name = "bf", descriptor = "(Lclient!sp;I)V", line = 52)
	public void method10812(@OriginalArg(0) Class462 arg0) {
		this.aClass387_4.method27389(arg0);
	}

	@OriginalMember(owner = "client!afo", name = "bk", descriptor = "(Lclient!sp;)V", line = 52)
	public void method10813(@OriginalArg(0) Class462 arg0) {
		this.aClass387_4.method27389(arg0);
	}

	@OriginalMember(owner = "client!afo", name = "bt", descriptor = "(Lclient!sp;)V", line = 52)
	public void method10814(@OriginalArg(0) Class462 arg0) {
		this.aClass387_4.method27389(arg0);
	}

	@OriginalMember(owner = "client!afo", name = "bg", descriptor = "(Lclient!sp;)V", line = 52)
	public void method10815(@OriginalArg(0) Class462 arg0) {
		this.aClass387_4.method27389(arg0);
	}

	@OriginalMember(owner = "client!afo", name = "br", descriptor = "(Lclient!sp;)V", line = 52)
	public void method10816(@OriginalArg(0) Class462 arg0) {
		this.aClass387_4.method27389(arg0);
	}

	@OriginalMember(owner = "client!afo", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 56)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_4.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = arg0.method17098();
		local15.method26235(this.method21433());
		local15.method26203((float) this.aShort62, 0.0F, (float) this.aShort61);
		@Pc(31) Class322 local31 = this.method21431();
		@Pc(36) Class446 local36 = Class508.method29569(this.aBoolean280);
		@Pc(43) int local43 = (int) local31.aClass320_61.aFloat259 >> 9;
		@Pc(50) int local50 = (int) local31.aClass320_61.aFloat261 >> 9;
		this.aClass387_4.method27385(arg0, local8, local15, local43, local43, local50, local50, true);
		@Pc(67) Class467 local67 = this.aClass387_4.method27370();
		if (local67.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local67.aClass323_1);
		}
		if (this.aClass387_4.aClass478_7 != null) {
			@Pc(103) Class128 local103 = this.aClass387_4.aClass478_7.method28843();
			arg0.method17105(local103);
		}
		this.aBoolean281 = local8.method5375() || this.aClass387_4.aClass478_7 != null;
		if (this.aClass426_6 == null) {
			this.aClass426_6 = Class445.method28337((int) local31.aClass320_61.aFloat259, (int) local31.aClass320_61.aFloat260, (int) local31.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_6, (int) local31.aClass320_61.aFloat259, (int) local31.aClass320_61.aFloat260, (int) local31.aClass320_61.aFloat261, local8);
		}
		return local36;
	}

	@OriginalMember(owner = "client!afo", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 56)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_4.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = arg0.method17098();
		local15.method26235(this.method21433());
		local15.method26203((float) this.aShort62, 0.0F, (float) this.aShort61);
		@Pc(31) Class322 local31 = this.method21431();
		@Pc(36) Class446 local36 = Class508.method29569(this.aBoolean280);
		@Pc(43) int local43 = (int) local31.aClass320_61.aFloat259 >> 9;
		@Pc(50) int local50 = (int) local31.aClass320_61.aFloat261 >> 9;
		this.aClass387_4.method27385(arg0, local8, local15, local43, local43, local50, local50, true);
		@Pc(67) Class467 local67 = this.aClass387_4.method27370();
		if (local67.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local67.aClass323_1);
		}
		if (this.aClass387_4.aClass478_7 != null) {
			@Pc(103) Class128 local103 = this.aClass387_4.aClass478_7.method28843();
			arg0.method17105(local103);
		}
		this.aBoolean281 = local8.method5375() || this.aClass387_4.aClass478_7 != null;
		if (this.aClass426_6 == null) {
			this.aClass426_6 = Class445.method28337((int) local31.aClass320_61.aFloat259, (int) local31.aClass320_61.aFloat260, (int) local31.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_6, (int) local31.aClass320_61.aFloat259, (int) local31.aClass320_61.aFloat260, (int) local31.aClass320_61.aFloat261, local8);
		}
		return local36;
	}

	@OriginalMember(owner = "client!afo", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 56)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_4.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = arg0.method17098();
		local15.method26235(this.method21433());
		local15.method26203((float) this.aShort62, 0.0F, (float) this.aShort61);
		@Pc(31) Class322 local31 = this.method21431();
		@Pc(36) Class446 local36 = Class508.method29569(this.aBoolean280);
		@Pc(43) int local43 = (int) local31.aClass320_61.aFloat259 >> 9;
		@Pc(50) int local50 = (int) local31.aClass320_61.aFloat261 >> 9;
		this.aClass387_4.method27385(arg0, local8, local15, local43, local43, local50, local50, true);
		@Pc(67) Class467 local67 = this.aClass387_4.method27370();
		if (local67.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local67.aClass323_1);
		}
		if (this.aClass387_4.aClass478_7 != null) {
			@Pc(103) Class128 local103 = this.aClass387_4.aClass478_7.method28843();
			arg0.method17105(local103);
		}
		this.aBoolean281 = local8.method5375() || this.aClass387_4.aClass478_7 != null;
		if (this.aClass426_6 == null) {
			this.aClass426_6 = Class445.method28337((int) local31.aClass320_61.aFloat259, (int) local31.aClass320_61.aFloat260, (int) local31.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_6, (int) local31.aClass320_61.aFloat259, (int) local31.aClass320_61.aFloat260, (int) local31.aClass320_61.aFloat261, local8);
		}
		return local36;
	}

	@OriginalMember(owner = "client!afo", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 56)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_4.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = arg0.method17098();
		local15.method26235(this.method21433());
		local15.method26203((float) this.aShort62, 0.0F, (float) this.aShort61);
		@Pc(31) Class322 local31 = this.method21431();
		@Pc(36) Class446 local36 = Class508.method29569(this.aBoolean280);
		@Pc(43) int local43 = (int) local31.aClass320_61.aFloat259 >> 9;
		@Pc(50) int local50 = (int) local31.aClass320_61.aFloat261 >> 9;
		this.aClass387_4.method27385(arg0, local8, local15, local43, local43, local50, local50, true);
		@Pc(67) Class467 local67 = this.aClass387_4.method27370();
		if (local67.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local67.aClass323_1);
		}
		if (this.aClass387_4.aClass478_7 != null) {
			@Pc(103) Class128 local103 = this.aClass387_4.aClass478_7.method28843();
			arg0.method17105(local103);
		}
		this.aBoolean281 = local8.method5375() || this.aClass387_4.aClass478_7 != null;
		if (this.aClass426_6 == null) {
			this.aClass426_6 = Class445.method28337((int) local31.aClass320_61.aFloat259, (int) local31.aClass320_61.aFloat260, (int) local31.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_6, (int) local31.aClass320_61.aFloat259, (int) local31.aClass320_61.aFloat260, (int) local31.aClass320_61.aFloat261, local8);
		}
		return local36;
	}

	@OriginalMember(owner = "client!afo", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 56)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_4.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class332 local15 = arg0.method17098();
		local15.method26235(this.method21433());
		local15.method26203((float) this.aShort62, 0.0F, (float) this.aShort61);
		@Pc(31) Class322 local31 = this.method21431();
		@Pc(36) Class446 local36 = Class508.method29569(this.aBoolean280);
		@Pc(43) int local43 = (int) local31.aClass320_61.aFloat259 >> 9;
		@Pc(50) int local50 = (int) local31.aClass320_61.aFloat261 >> 9;
		this.aClass387_4.method27385(arg0, local8, local15, local43, local43, local50, local50, true);
		@Pc(67) Class467 local67 = this.aClass387_4.method27370();
		if (local67.aClass323_1 == null) {
			local8.method5352(local15, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local15, null, 0);
			arg0.method17082(local15, this.aClass136Array21[0], local67.aClass323_1);
		}
		if (this.aClass387_4.aClass478_7 != null) {
			@Pc(103) Class128 local103 = this.aClass387_4.aClass478_7.method28843();
			arg0.method17105(local103);
		}
		this.aBoolean281 = local8.method5375() || this.aClass387_4.aClass478_7 != null;
		if (this.aClass426_6 == null) {
			this.aClass426_6 = Class445.method28337((int) local31.aClass320_61.aFloat259, (int) local31.aClass320_61.aFloat260, (int) local31.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_6, (int) local31.aClass320_61.aFloat259, (int) local31.aClass320_61.aFloat260, (int) local31.aClass320_61.aFloat261, local8);
		}
		return local36;
	}

	@OriginalMember(owner = "client!afo", name = "fx", descriptor = "(Lclient!de;I)V", line = 83)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_4.method27399(arg0, 262144, false, true);
		if (local8 == null) {
			return;
		}
		@Pc(14) Class332 local14 = this.method21433();
		@Pc(17) Class322 local17 = this.method21431();
		@Pc(24) int local24 = (int) local17.aClass320_61.aFloat259 >> 9;
		@Pc(31) int local31 = (int) local17.aClass320_61.aFloat261 >> 9;
		this.aClass387_4.method27385(arg0, local8, local14, local24, local24, local31, local31, false);
	}

	@OriginalMember(owner = "client!afo", name = "fq", descriptor = "(Lclient!de;)V", line = 83)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_4.method27399(arg0, 262144, false, true);
		if (local8 == null) {
			return;
		}
		@Pc(14) Class332 local14 = this.method21433();
		@Pc(17) Class322 local17 = this.method21431();
		@Pc(24) int local24 = (int) local17.aClass320_61.aFloat259 >> 9;
		@Pc(31) int local31 = (int) local17.aClass320_61.aFloat261 >> 9;
		this.aClass387_4.method27385(arg0, local8, local14, local24, local24, local31, local31, false);
	}

	@OriginalMember(owner = "client!afo", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 94)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_4.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(27) Class20 local27 = this.aClass387_4.method27399(arg0, 131072, false, false);
			return local27 == null ? false : local27.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!afo", name = "fv", descriptor = "(Lclient!de;II)Z", line = 94)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_4.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(27) Class20 local27 = this.aClass387_4.method27399(arg0, 131072, false, false);
			return local27 == null ? false : local27.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!afo", name = "fy", descriptor = "(Lclient!de;II)Z", line = 94)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_4.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(27) Class20 local27 = this.aClass387_4.method27399(arg0, 131072, false, false);
			return local27 == null ? false : local27.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!afo", name = "p", descriptor = "(B)I", line = 102)
	@Override
	public int method11163() {
		return this.aClass387_4.anInt4745 * -921030407;
	}

	@OriginalMember(owner = "client!afo", name = "y", descriptor = "()I", line = 102)
	@Override
	public int method11153() {
		return this.aClass387_4.anInt4745 * -921030407;
	}

	@OriginalMember(owner = "client!afo", name = "a", descriptor = "(B)I", line = 106)
	@Override
	public int method11146() {
		return this.aClass387_4.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!afo", name = "m", descriptor = "()I", line = 106)
	@Override
	public int method11155() {
		return this.aClass387_4.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!afo", name = "v", descriptor = "()I", line = 106)
	@Override
	public int method11164() {
		return this.aClass387_4.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!afo", name = "c", descriptor = "()I", line = 110)
	@Override
	public int method11151() {
		return this.aClass387_4.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!afo", name = "g", descriptor = "(I)I", line = 110)
	@Override
	public int method11147() {
		return this.aClass387_4.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!afo", name = "b", descriptor = "()I", line = 110)
	@Override
	public int method11152() {
		return this.aClass387_4.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!afo", name = "n", descriptor = "()V", line = 113)
	@Override
	public void method11158() {
	}

	@OriginalMember(owner = "client!afo", name = "l", descriptor = "(B)V", line = 113)
	@Override
	public void method11148() {
	}

	@OriginalMember(owner = "client!afo", name = "j", descriptor = "()V", line = 113)
	@Override
	public void method11157() {
	}

	@OriginalMember(owner = "client!afo", name = "z", descriptor = "()V", line = 113)
	@Override
	public void method11162() {
	}

	@OriginalMember(owner = "client!afo", name = "r", descriptor = "()Z", line = 116)
	@Override
	public boolean method11160() {
		return true;
	}

	@OriginalMember(owner = "client!afo", name = "x", descriptor = "(B)Z", line = 116)
	@Override
	public boolean method11150() {
		return true;
	}

	@OriginalMember(owner = "client!afo", name = "d", descriptor = "()Z", line = 116)
	@Override
	public boolean method11161() {
		return true;
	}

	@OriginalMember(owner = "client!afo", name = "h", descriptor = "(I)Z", line = 120)
	@Override
	public boolean method11149() {
		return this.aClass387_4.method27373();
	}

	@OriginalMember(owner = "client!afo", name = "e", descriptor = "()Z", line = 120)
	@Override
	public boolean method11154() {
		return this.aClass387_4.method27373();
	}

	@OriginalMember(owner = "client!afo", name = "s", descriptor = "(Lclient!de;I)V", line = 124)
	@Override
	public void method11156(@OriginalArg(0) Class21 arg0) {
		this.aClass387_4.method27374(arg0);
	}

	@OriginalMember(owner = "client!afo", name = "t", descriptor = "(Lclient!de;)V", line = 124)
	@Override
	public void method11165(@OriginalArg(0) Class21 arg0) {
		this.aClass387_4.method27374(arg0);
	}

	@OriginalMember(owner = "client!afo", name = "u", descriptor = "(Lclient!de;B)V", line = 128)
	@Override
	public void method11159(@OriginalArg(0) Class21 arg0) {
		this.aClass387_4.method27375(arg0);
	}

	@OriginalMember(owner = "client!afo", name = "q", descriptor = "(Lclient!de;)V", line = 128)
	@Override
	public void method11145(@OriginalArg(0) Class21 arg0) {
		this.aClass387_4.method27375(arg0);
	}
}
