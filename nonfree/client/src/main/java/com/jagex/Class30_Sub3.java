package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adl")
public class Class30_Sub3 extends Class30 {

	@OriginalMember(owner = "client!adl", name = "oo", descriptor = "I")
	public static int anInt848;

	@OriginalMember(owner = "client!adl", name = "h", descriptor = "Z")
	boolean aBoolean174;

	@OriginalMember(owner = "client!adl", name = "s", descriptor = "I")
	int anInt847;

	@OriginalMember(owner = "client!adl", name = "a", descriptor = "Lclient!hk;")
	Interface17 anInterface17_1;

	@OriginalMember(owner = "client!adl", name = "g", descriptor = "Lclient!mh;")
	final Class320 aClass320_40 = new Class320();

	@OriginalMember(owner = "client!adl", name = "l", descriptor = "Lclient!mx;")
	public final Class335 aClass335_2 = new Class335();

	@OriginalMember(owner = "client!adl", name = "x", descriptor = "I")
	int anInt846 = 942765112;

	@OriginalMember(owner = "client!adl", name = "u", descriptor = "Lclient!mh;")
	final Class320 aClass320_39 = new Class320(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!adl", name = "y", descriptor = "Lclient!mh;")
	final Class320 aClass320_38 = new Class320(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!adl", name = "b", descriptor = "Lclient!mh;")
	final Class320 aClass320_41 = new Class320();

	@OriginalMember(owner = "client!adl", name = "c", descriptor = "Lclient!mx;")
	final Class335 aClass335_1 = new Class335();

	@OriginalMember(owner = "client!adl", name = "<init>", descriptor = "(Lclient!ha;)V", line = 28)
	public Class30_Sub3(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!adl", name = "k", descriptor = "(Lclient!hk;Lclient!mh;Lclient!mx;ZI[[[ILclient!ni;III)V", line = 32)
	public void method7823(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class346 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface17_1 = arg0;
		this.aClass320_40.method25893(arg1);
		this.aClass335_2.method26315(arg2);
		this.aBoolean174 = arg3;
		this.anInt846 = arg4 * -2078345313;
		this.anInt847 = this.anInterface17_1.method16617().anInt1342 * -1975044527;
		this.method7828(arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!adl", name = "aq", descriptor = "(Lclient!hk;Lclient!mh;Lclient!mx;ZI[[[ILclient!ni;II)V", line = 32)
	public void method7835(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class346 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface17_1 = arg0;
		this.aClass320_40.method25893(arg1);
		this.aClass335_2.method26315(arg2);
		this.aBoolean174 = arg3;
		this.anInt846 = arg4 * -2078345313;
		this.anInt847 = this.anInterface17_1.method16617().anInt1342 * -1975044527;
		this.method7828(arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!adl", name = "av", descriptor = "(Lclient!hk;Lclient!mh;Lclient!mx;ZI[[[ILclient!ni;II)V", line = 32)
	public void method7836(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class346 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface17_1 = arg0;
		this.aClass320_40.method25893(arg1);
		this.aClass335_2.method26315(arg2);
		this.aBoolean174 = arg3;
		this.anInt846 = arg4 * -2078345313;
		this.anInt847 = this.anInterface17_1.method16617().anInt1342 * -1975044527;
		this.method7828(arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!adl", name = "ax", descriptor = "()V", line = 42)
	public void method7837() {
		if (this.anInterface17_1 != null) {
			this.anInterface17_1 = this.aClass23_13.method5859().method29331(this.anInterface17_1.method16615(), this.anInterface17_1.method16622());
		}
	}

	@OriginalMember(owner = "client!adl", name = "az", descriptor = "()V", line = 42)
	public void method7838() {
		if (this.anInterface17_1 != null) {
			this.anInterface17_1 = this.aClass23_13.method5859().method29331(this.anInterface17_1.method16615(), this.anInterface17_1.method16622());
		}
	}

	@OriginalMember(owner = "client!adl", name = "at", descriptor = "(I)V", line = 42)
	public void method7844() {
		if (this.anInterface17_1 != null) {
			this.anInterface17_1 = this.aClass23_13.method5859().method29331(this.anInterface17_1.method16615(), this.anInterface17_1.method16622());
		}
	}

	@OriginalMember(owner = "client!adl", name = "p", descriptor = "(F[[[ILclient!ni;III)V", line = 48)
	@Override
	public void method16447(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface17_1 == null) {
			return;
		}
		this.method7828(arg1, arg2, arg3, arg4);
		@Pc(14) Class335 local14 = this.method7847();
		this.aClass335_1.method26316(local14, this.aClass23_13.method5841());
		if (Float.isNaN(this.aClass335_1.aFloat287)) {
			this.aClass335_1.method26315(local14);
		}
		local14.method26293();
		this.aClass320_38.method25893(this.anInterface17_1.method16617().method11706());
		this.aClass23_13.method5800(true, arg0, this.aClass320_39, this.aClass23_13.method5838(), this.aClass320_38, this.aClass320_41);
	}

	@OriginalMember(owner = "client!adl", name = "y", descriptor = "(F[[[ILclient!ni;II)V", line = 48)
	@Override
	public void method16432(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface17_1 == null) {
			return;
		}
		this.method7828(arg1, arg2, arg3, arg4);
		@Pc(14) Class335 local14 = this.method7847();
		this.aClass335_1.method26316(local14, this.aClass23_13.method5841());
		if (Float.isNaN(this.aClass335_1.aFloat287)) {
			this.aClass335_1.method26315(local14);
		}
		local14.method26293();
		this.aClass320_38.method25893(this.anInterface17_1.method16617().method11706());
		this.aClass23_13.method5800(true, arg0, this.aClass320_39, this.aClass23_13.method5838(), this.aClass320_38, this.aClass320_41);
	}

	@OriginalMember(owner = "client!adl", name = "c", descriptor = "(F[[[ILclient!ni;II)V", line = 48)
	@Override
	public void method16439(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface17_1 == null) {
			return;
		}
		this.method7828(arg1, arg2, arg3, arg4);
		@Pc(14) Class335 local14 = this.method7847();
		this.aClass335_1.method26316(local14, this.aClass23_13.method5841());
		if (Float.isNaN(this.aClass335_1.aFloat287)) {
			this.aClass335_1.method26315(local14);
		}
		local14.method26293();
		this.aClass320_38.method25893(this.anInterface17_1.method16617().method11706());
		this.aClass23_13.method5800(true, arg0, this.aClass320_39, this.aClass23_13.method5838(), this.aClass320_38, this.aClass320_41);
	}

	@OriginalMember(owner = "client!adl", name = "z", descriptor = "(F[[[ILclient!ni;II)V", line = 48)
	@Override
	public void method16435(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface17_1 == null) {
			return;
		}
		this.method7828(arg1, arg2, arg3, arg4);
		@Pc(14) Class335 local14 = this.method7847();
		this.aClass335_1.method26316(local14, this.aClass23_13.method5841());
		if (Float.isNaN(this.aClass335_1.aFloat287)) {
			this.aClass335_1.method26315(local14);
		}
		local14.method26293();
		this.aClass320_38.method25893(this.anInterface17_1.method16617().method11706());
		this.aClass23_13.method5800(true, arg0, this.aClass320_39, this.aClass23_13.method5838(), this.aClass320_38, this.aClass320_41);
	}

	@OriginalMember(owner = "client!adl", name = "b", descriptor = "(F[[[ILclient!ni;II)V", line = 48)
	@Override
	public void method16440(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface17_1 == null) {
			return;
		}
		this.method7828(arg1, arg2, arg3, arg4);
		@Pc(14) Class335 local14 = this.method7847();
		this.aClass335_1.method26316(local14, this.aClass23_13.method5841());
		if (Float.isNaN(this.aClass335_1.aFloat287)) {
			this.aClass335_1.method26315(local14);
		}
		local14.method26293();
		this.aClass320_38.method25893(this.anInterface17_1.method16617().method11706());
		this.aClass23_13.method5800(true, arg0, this.aClass320_39, this.aClass23_13.method5838(), this.aClass320_38, this.aClass320_41);
	}

	@OriginalMember(owner = "client!adl", name = "af", descriptor = "(I)Lclient!mx;", line = 61)
	Class335 method7847() {
		@Pc(3) Class335 local3 = Class335.method26295(this.aClass335_2);
		if (this.aBoolean174) {
			@Pc(11) Class320 local11 = this.anInterface17_1.method16619();
			if (local11.method25861() < (float) (this.anInt846 * 725115999)) {
				local11 = Class320.method25891(0.0F, 0.0F, 1.0F);
				@Pc(30) Class335 local30 = this.anInterface17_1.method16618();
				local11.method25889(local30);
			}
			local11.aFloat260 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat259, (double) local11.aFloat261);
			local11.method25874();
			@Pc(51) Class335 local51 = new Class335();
			local51.method26365(0.0F, 1.0F, 0.0F, local45);
			local3.method26312(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!adl", name = "ap", descriptor = "([[[ILclient!ni;II)V", line = 80)
	void method7825(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method16425() || !this.aClass23_13.method5914() && !this.aClass23_13.method5854()) {
			return;
		}
		@Pc(18) Class3_Sub32 local18 = this.anInterface17_1.method16617();
		this.anInt847 = local18.anInt1342 * -1975044527;
		@Pc(29) int local29 = this.anInt847 * -20674689;
		@Pc(31) boolean local31 = true;
		if (this.anInt847 * -20674689 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method26504(local18.anInt1343 * 2061226997 - arg2 >> 9, local18.anInt1344 * 615450365 - arg3 >> 9)) {
			local29 = this.anInt847 * -20674689 + 1;
			local31 = false;
		}
		if (!this.aClass23_13.method5854() || arg0 == null) {
			return;
		}
		@Pc(90) float local90 = this.method7826(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local90)) {
			return;
		}
		if (local90 <= 0.0F) {
			return;
		}
		@Pc(100) float local100 = 3.1415927F;
		@Pc(105) Class320 local105 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local105.method25889(this.aClass335_2);
		@Pc(116) Class320 local116 = Class320.method25891(local105.aFloat259, 0.0F, local105.aFloat261);
		local116.method25890();
		@Pc(122) float local122 = Class320.method25962(local105, local116);
		for (@Pc(124) int local124 = 0; local124 < 10; local124++) {
			@Pc(135) float local135 = (local100 + local122) / 2.0F - local122;
			@Pc(137) float local137 = local135;
			if (local90 > 0.0F) {
				local137 = local135 * -1.0F;
			}
			@Pc(150) Class320 local150 = Class320.method25891(1.0F, 0.0F, 0.0F);
			local150.method25889(this.aClass335_2);
			@Pc(156) Class335 local156 = Class335.method26300();
			local156.method26301(local150, local137);
			this.aClass335_2.method26312(local156);
			this.aClass335_2.method26298();
			local150.method25874();
			local156.method26293();
			local90 = this.method7826(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local90)) {
				return;
			}
			if (local90 > 0.0F) {
				local122 += local135;
			} else {
				local100 -= local135;
			}
		}
	}

	@OriginalMember(owner = "client!adl", name = "ak", descriptor = "([[[ILclient!ni;III)V", line = 80)
	void method7828(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method16425() || !this.aClass23_13.method5914() && !this.aClass23_13.method5854()) {
			return;
		}
		@Pc(18) Class3_Sub32 local18 = this.anInterface17_1.method16617();
		this.anInt847 = local18.anInt1342 * -1975044527;
		@Pc(29) int local29 = this.anInt847 * -20674689;
		@Pc(31) boolean local31 = true;
		if (this.anInt847 * -20674689 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method26504(local18.anInt1343 * 2061226997 - arg2 >> 9, local18.anInt1344 * 615450365 - arg3 >> 9)) {
			local29 = this.anInt847 * -20674689 + 1;
			local31 = false;
		}
		if (!this.aClass23_13.method5854() || arg0 == null) {
			return;
		}
		@Pc(90) float local90 = this.method7826(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local90)) {
			return;
		}
		if (local90 <= 0.0F) {
			return;
		}
		@Pc(100) float local100 = 3.1415927F;
		@Pc(105) Class320 local105 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local105.method25889(this.aClass335_2);
		@Pc(116) Class320 local116 = Class320.method25891(local105.aFloat259, 0.0F, local105.aFloat261);
		local116.method25890();
		@Pc(122) float local122 = Class320.method25962(local105, local116);
		for (@Pc(124) int local124 = 0; local124 < 10; local124++) {
			@Pc(135) float local135 = (local100 + local122) / 2.0F - local122;
			@Pc(137) float local137 = local135;
			if (local90 > 0.0F) {
				local137 = local135 * -1.0F;
			}
			@Pc(150) Class320 local150 = Class320.method25891(1.0F, 0.0F, 0.0F);
			local150.method25889(this.aClass335_2);
			@Pc(156) Class335 local156 = Class335.method26300();
			local156.method26301(local150, local137);
			this.aClass335_2.method26312(local156);
			this.aClass335_2.method26298();
			local150.method25874();
			local156.method26293();
			local90 = this.method7826(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local90)) {
				return;
			}
			if (local90 > 0.0F) {
				local122 += local135;
			} else {
				local100 -= local135;
			}
		}
	}

	@OriginalMember(owner = "client!adl", name = "al", descriptor = "([[[ILclient!ni;II)V", line = 80)
	void method7831(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method16425() || !this.aClass23_13.method5914() && !this.aClass23_13.method5854()) {
			return;
		}
		@Pc(18) Class3_Sub32 local18 = this.anInterface17_1.method16617();
		this.anInt847 = local18.anInt1342 * -1975044527;
		@Pc(29) int local29 = this.anInt847 * -20674689;
		@Pc(31) boolean local31 = true;
		if (this.anInt847 * -20674689 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method26504(local18.anInt1343 * 2061226997 - arg2 >> 9, local18.anInt1344 * 615450365 - arg3 >> 9)) {
			local29 = this.anInt847 * -20674689 + 1;
			local31 = false;
		}
		if (!this.aClass23_13.method5854() || arg0 == null) {
			return;
		}
		@Pc(90) float local90 = this.method7826(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local90)) {
			return;
		}
		if (local90 <= 0.0F) {
			return;
		}
		@Pc(100) float local100 = 3.1415927F;
		@Pc(105) Class320 local105 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local105.method25889(this.aClass335_2);
		@Pc(116) Class320 local116 = Class320.method25891(local105.aFloat259, 0.0F, local105.aFloat261);
		local116.method25890();
		@Pc(122) float local122 = Class320.method25962(local105, local116);
		for (@Pc(124) int local124 = 0; local124 < 10; local124++) {
			@Pc(135) float local135 = (local100 + local122) / 2.0F - local122;
			@Pc(137) float local137 = local135;
			if (local90 > 0.0F) {
				local137 = local135 * -1.0F;
			}
			@Pc(150) Class320 local150 = Class320.method25891(1.0F, 0.0F, 0.0F);
			local150.method25889(this.aClass335_2);
			@Pc(156) Class335 local156 = Class335.method26300();
			local156.method26301(local150, local137);
			this.aClass335_2.method26312(local156);
			this.aClass335_2.method26298();
			local150.method25874();
			local156.method26293();
			local90 = this.method7826(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local90)) {
				return;
			}
			if (local90 > 0.0F) {
				local122 += local135;
			} else {
				local100 -= local135;
			}
		}
	}

	@OriginalMember(owner = "client!adl", name = "ao", descriptor = "([[[ILclient!ni;II)V", line = 80)
	void method7840(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method16425() || !this.aClass23_13.method5914() && !this.aClass23_13.method5854()) {
			return;
		}
		@Pc(18) Class3_Sub32 local18 = this.anInterface17_1.method16617();
		this.anInt847 = local18.anInt1342 * -1975044527;
		@Pc(29) int local29 = this.anInt847 * -20674689;
		@Pc(31) boolean local31 = true;
		if (this.anInt847 * -20674689 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method26504(local18.anInt1343 * 2061226997 - arg2 >> 9, local18.anInt1344 * 615450365 - arg3 >> 9)) {
			local29 = this.anInt847 * -20674689 + 1;
			local31 = false;
		}
		if (!this.aClass23_13.method5854() || arg0 == null) {
			return;
		}
		@Pc(90) float local90 = this.method7826(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local90)) {
			return;
		}
		if (local90 <= 0.0F) {
			return;
		}
		@Pc(100) float local100 = 3.1415927F;
		@Pc(105) Class320 local105 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local105.method25889(this.aClass335_2);
		@Pc(116) Class320 local116 = Class320.method25891(local105.aFloat259, 0.0F, local105.aFloat261);
		local116.method25890();
		@Pc(122) float local122 = Class320.method25962(local105, local116);
		for (@Pc(124) int local124 = 0; local124 < 10; local124++) {
			@Pc(135) float local135 = (local100 + local122) / 2.0F - local122;
			@Pc(137) float local137 = local135;
			if (local90 > 0.0F) {
				local137 = local135 * -1.0F;
			}
			@Pc(150) Class320 local150 = Class320.method25891(1.0F, 0.0F, 0.0F);
			local150.method25889(this.aClass335_2);
			@Pc(156) Class335 local156 = Class335.method26300();
			local156.method26301(local150, local137);
			this.aClass335_2.method26312(local156);
			this.aClass335_2.method26298();
			local150.method25874();
			local156.method26293();
			local90 = this.method7826(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local90)) {
				return;
			}
			if (local90 > 0.0F) {
				local122 += local135;
			} else {
				local100 -= local135;
			}
		}
	}

	@OriginalMember(owner = "client!adl", name = "aa", descriptor = "([[[ILclient!ni;IIIZS)F", line = 129)
	float method7826(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class335 local3 = this.method7847();
		@Pc(8) Class320 local8 = this.method7827(local3);
		local3.method26293();
		@Pc(18) int local18 = (int) local8.aFloat259 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat261 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method25874();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method26504(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat259 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat261 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + local68 * (long) arg0[local50][local18 + 1][local26] * (512L - local74);
		@Pc(129) long local129 = local110 + local74 * (long) arg0[local50][local18][local26 + 1] * (512L - local68);
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat260;
		local8.method25874();
		return local163;
	}

	@OriginalMember(owner = "client!adl", name = "am", descriptor = "([[[ILclient!ni;IIIZ)F", line = 129)
	float method7834(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class335 local3 = this.method7847();
		@Pc(8) Class320 local8 = this.method7827(local3);
		local3.method26293();
		@Pc(18) int local18 = (int) local8.aFloat259 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat261 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method25874();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method26504(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat259 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat261 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + local68 * (long) arg0[local50][local18 + 1][local26] * (512L - local74);
		@Pc(129) long local129 = local110 + local74 * (long) arg0[local50][local18][local26 + 1] * (512L - local68);
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat260;
		local8.method25874();
		return local163;
	}

	@OriginalMember(owner = "client!adl", name = "ab", descriptor = "([[[ILclient!ni;IIIZ)F", line = 129)
	float method7842(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class335 local3 = this.method7847();
		@Pc(8) Class320 local8 = this.method7827(local3);
		local3.method26293();
		@Pc(18) int local18 = (int) local8.aFloat259 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat261 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method25874();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method26504(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat259 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat261 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + local68 * (long) arg0[local50][local18 + 1][local26] * (512L - local74);
		@Pc(129) long local129 = local110 + local74 * (long) arg0[local50][local18][local26 + 1] * (512L - local68);
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat260;
		local8.method25874();
		return local163;
	}

	@OriginalMember(owner = "client!adl", name = "ay", descriptor = "([[[ILclient!ni;IIIZ)F", line = 129)
	float method7843(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class335 local3 = this.method7847();
		@Pc(8) Class320 local8 = this.method7827(local3);
		local3.method26293();
		@Pc(18) int local18 = (int) local8.aFloat259 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat261 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method25874();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method26504(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat259 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat261 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + local68 * (long) arg0[local50][local18 + 1][local26] * (512L - local74);
		@Pc(129) long local129 = local110 + local74 * (long) arg0[local50][local18][local26 + 1] * (512L - local68);
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat260;
		local8.method25874();
		return local163;
	}

	@OriginalMember(owner = "client!adl", name = "ag", descriptor = "([[[ILclient!ni;IIIZ)F", line = 129)
	float method7846(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class335 local3 = this.method7847();
		@Pc(8) Class320 local8 = this.method7827(local3);
		local3.method26293();
		@Pc(18) int local18 = (int) local8.aFloat259 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat261 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method25874();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method26504(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat259 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat261 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + local68 * (long) arg0[local50][local18 + 1][local26] * (512L - local74);
		@Pc(129) long local129 = local110 + local74 * (long) arg0[local50][local18][local26 + 1] * (512L - local68);
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat260;
		local8.method25874();
		return local163;
	}

	@OriginalMember(owner = "client!adl", name = "au", descriptor = "([[[ILclient!ni;IIIZ)F", line = 129)
	float method7849(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class335 local3 = this.method7847();
		@Pc(8) Class320 local8 = this.method7827(local3);
		local3.method26293();
		@Pc(18) int local18 = (int) local8.aFloat259 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat261 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method25874();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method26504(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat259 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat261 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + local68 * (long) arg0[local50][local18 + 1][local26] * (512L - local74);
		@Pc(129) long local129 = local110 + local74 * (long) arg0[local50][local18][local26 + 1] * (512L - local68);
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat260;
		local8.method25874();
		return local163;
	}

	@OriginalMember(owner = "client!adl", name = "ah", descriptor = "(Lclient!mx;I)Lclient!mh;", line = 158)
	Class320 method7827(@OriginalArg(0) Class335 arg0) {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_40);
		local3.method25889(arg0);
		@Pc(11) Class320 local11 = Class320.method25903(this.aClass320_38, local3);
		local3.method25874();
		return local11;
	}

	@OriginalMember(owner = "client!adl", name = "ae", descriptor = "(Lclient!mx;)Lclient!mh;", line = 158)
	Class320 method7832(@OriginalArg(0) Class335 arg0) {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_40);
		local3.method25889(arg0);
		@Pc(11) Class320 local11 = Class320.method25903(this.aClass320_38, local3);
		local3.method25874();
		return local11;
	}

	@OriginalMember(owner = "client!adl", name = "ar", descriptor = "(Lclient!mx;)Lclient!mh;", line = 158)
	Class320 method7845(@OriginalArg(0) Class335 arg0) {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_40);
		local3.method25889(arg0);
		@Pc(11) Class320 local11 = Class320.method25903(this.aClass320_38, local3);
		local3.method25874();
		return local11;
	}

	@OriginalMember(owner = "client!adl", name = "a", descriptor = "(I)Z", line = 166)
	@Override
	public boolean method16425() {
		return !Float.isNaN(this.aClass320_39.aFloat259);
	}

	@OriginalMember(owner = "client!adl", name = "j", descriptor = "()Z", line = 166)
	@Override
	public boolean method16434() {
		return !Float.isNaN(this.aClass320_39.aFloat259);
	}

	@OriginalMember(owner = "client!adl", name = "g", descriptor = "(I)Lclient!mh;", line = 170)
	@Override
	public Class320 method16426() {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_40);
		local3.method25889(this.aClass335_1);
		@Pc(12) Class320 local12 = Class320.method25903(this.aClass320_39, local3);
		local3.method25874();
		return local12;
	}

	@OriginalMember(owner = "client!adl", name = "n", descriptor = "()Lclient!mh;", line = 170)
	@Override
	public Class320 method16437() {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_40);
		local3.method25889(this.aClass335_1);
		@Pc(12) Class320 local12 = Class320.method25903(this.aClass320_39, local3);
		local3.method25874();
		return local12;
	}

	@OriginalMember(owner = "client!adl", name = "e", descriptor = "()Lclient!mh;", line = 170)
	@Override
	public Class320 method16424() {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_40);
		local3.method25889(this.aClass335_1);
		@Pc(12) Class320 local12 = Class320.method25903(this.aClass320_39, local3);
		local3.method25874();
		return local12;
	}

	@OriginalMember(owner = "client!adl", name = "q", descriptor = "()[D", line = 178)
	@Override
	public double[] method16438() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class320 local6 = this.method16426();
		local2[0] = local6.aFloat259;
		local2[1] = local6.aFloat260;
		local2[2] = local6.aFloat261;
		return local2;
	}

	@OriginalMember(owner = "client!adl", name = "l", descriptor = "(I)[D", line = 178)
	@Override
	public double[] method16427() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class320 local6 = this.method16426();
		local2[0] = local6.aFloat259;
		local2[1] = local6.aFloat260;
		local2[2] = local6.aFloat261;
		return local2;
	}

	@OriginalMember(owner = "client!adl", name = "r", descriptor = "()[D", line = 178)
	@Override
	public double[] method16446() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class320 local6 = this.method16426();
		local2[0] = local6.aFloat259;
		local2[1] = local6.aFloat260;
		local2[2] = local6.aFloat261;
		return local2;
	}

	@OriginalMember(owner = "client!adl", name = "d", descriptor = "()[D", line = 178)
	@Override
	public double[] method16423() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class320 local6 = this.method16426();
		local2[0] = local6.aFloat259;
		local2[1] = local6.aFloat260;
		local2[2] = local6.aFloat261;
		return local2;
	}

	@OriginalMember(owner = "client!adl", name = "h", descriptor = "(I)Lclient!agq;", line = 187)
	@Override
	public Class3_Sub32 method16428() {
		@Pc(3) Class320 local3 = this.method16426();
		@Pc(20) Class3_Sub32 local20 = new Class3_Sub32(this.anInt847 * -20674689, (int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261);
		local3.method25874();
		return local20;
	}

	@OriginalMember(owner = "client!adl", name = "m", descriptor = "()Lclient!agq;", line = 187)
	@Override
	public Class3_Sub32 method16441() {
		@Pc(3) Class320 local3 = this.method16426();
		@Pc(20) Class3_Sub32 local20 = new Class3_Sub32(this.anInt847 * -20674689, (int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261);
		local3.method25874();
		return local20;
	}

	@OriginalMember(owner = "client!adl", name = "aw", descriptor = "()Lclient!mh;", line = 194)
	public Class320 method7829() {
		return this.aClass320_39;
	}

	@OriginalMember(owner = "client!adl", name = "ad", descriptor = "()Lclient!mh;", line = 194)
	public Class320 method7839() {
		return this.aClass320_39;
	}

	@OriginalMember(owner = "client!adl", name = "an", descriptor = "(I)Lclient!mh;", line = 194)
	public Class320 method7841() {
		return this.aClass320_39;
	}

	@OriginalMember(owner = "client!adl", name = "aj", descriptor = "(I)Lclient!mh;", line = 198)
	public Class320 method7824() {
		return this.aClass320_40;
	}

	@OriginalMember(owner = "client!adl", name = "ac", descriptor = "()Lclient!mh;", line = 198)
	public Class320 method7833() {
		return this.aClass320_40;
	}

	@OriginalMember(owner = "client!adl", name = "bw", descriptor = "()Lclient!mh;", line = 198)
	public Class320 method7850() {
		return this.aClass320_40;
	}

	@OriginalMember(owner = "client!adl", name = "as", descriptor = "(B)F", line = 202)
	public float method7830() {
		return Class569.method33007(this.aClass335_2);
	}

	@OriginalMember(owner = "client!adl", name = "bp", descriptor = "()F", line = 202)
	public float method7851() {
		return Class569.method33007(this.aClass335_2);
	}

	@OriginalMember(owner = "client!adl", name = "ai", descriptor = "(I)F", line = 206)
	public float method7848() {
		return Class204.method24178(this.aClass335_2);
	}

	@OriginalMember(owner = "client!adl", name = "bd", descriptor = "()F", line = 206)
	public float method7852() {
		return Class204.method24178(this.aClass335_2);
	}

	@OriginalMember(owner = "client!adl", name = "x", descriptor = "(I)F", line = 210)
	@Override
	public float method16429() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!adl", name = "v", descriptor = "()F", line = 210)
	@Override
	public float method16442() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!adl", name = "t", descriptor = "()F", line = 210)
	@Override
	public float method16443() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!adl", name = "s", descriptor = "(Lclient!gu;III)V", line = 214)
	@Override
	public void method16430(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class320 local3 = this.method16426();
		arg0.anInt3702 = ((int) local3.aFloat259 - arg1) * 1932748257;
		arg0.anInt3700 = (int) -local3.aFloat260 * -2071105737;
		arg0.anInt3701 = ((int) local3.aFloat261 - arg2) * -2066707267;
		local3.method25874();
	}

	@OriginalMember(owner = "client!adl", name = "w", descriptor = "(Lclient!gu;II)V", line = 214)
	@Override
	public void method16444(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class320 local3 = this.method16426();
		arg0.anInt3702 = ((int) local3.aFloat259 - arg1) * 1932748257;
		arg0.anInt3700 = (int) -local3.aFloat260 * -2071105737;
		arg0.anInt3701 = ((int) local3.aFloat261 - arg2) * -2066707267;
		local3.method25874();
	}

	@OriginalMember(owner = "client!adl", name = "o", descriptor = "(Lclient!ahb;)V", line = 222)
	@Override
	public void method16445(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) Class223 local5 = Class566.method32919(arg0.method20269());
		@Pc(9) int local9 = arg0.method20271();
		this.aClass320_40.method25866(arg0);
		this.aClass335_2.method26296(arg0);
		if (arg0.method20269() == 1) {
			this.aBoolean174 = true;
		} else {
			this.aBoolean174 = false;
		}
		this.anInt846 = arg0.method20271() * -2078345313;
		this.anInterface17_1 = this.aClass23_13.method5859().method29331(local5, local9);
	}

	@OriginalMember(owner = "client!adl", name = "f", descriptor = "(Lclient!ahb;)V", line = 222)
	@Override
	public void method16433(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) Class223 local5 = Class566.method32919(arg0.method20269());
		@Pc(9) int local9 = arg0.method20271();
		this.aClass320_40.method25866(arg0);
		this.aClass335_2.method26296(arg0);
		if (arg0.method20269() == 1) {
			this.aBoolean174 = true;
		} else {
			this.aBoolean174 = false;
		}
		this.anInt846 = arg0.method20271() * -2078345313;
		this.anInterface17_1 = this.aClass23_13.method5859().method29331(local5, local9);
	}

	@OriginalMember(owner = "client!adl", name = "u", descriptor = "(Lclient!ahb;I)V", line = 222)
	@Override
	public void method16431(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) Class223 local5 = Class566.method32919(arg0.method20269());
		@Pc(9) int local9 = arg0.method20271();
		this.aClass320_40.method25866(arg0);
		this.aClass335_2.method26296(arg0);
		if (arg0.method20269() == 1) {
			this.aBoolean174 = true;
		} else {
			this.aBoolean174 = false;
		}
		this.anInt846 = arg0.method20271() * -2078345313;
		this.anInterface17_1 = this.aClass23_13.method5859().method29331(local5, local9);
	}

	@OriginalMember(owner = "client!adl", name = "i", descriptor = "(Lclient!ahb;)V", line = 222)
	@Override
	public void method16436(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) Class223 local5 = Class566.method32919(arg0.method20269());
		@Pc(9) int local9 = arg0.method20271();
		this.aClass320_40.method25866(arg0);
		this.aClass335_2.method26296(arg0);
		if (arg0.method20269() == 1) {
			this.aBoolean174 = true;
		} else {
			this.aBoolean174 = false;
		}
		this.anInt846 = arg0.method20271() * -2078345313;
		this.anInterface17_1 = this.aClass23_13.method5859().method29331(local5, local9);
	}

	@OriginalMember(owner = "client!adl", name = "gu", descriptor = "(ZI)V", line = 3556)
	static void method7853(@OriginalArg(0) boolean arg0) {
		client.aBoolean587 = arg0;
	}

	@OriginalMember(owner = "client!adl", name = "agd", descriptor = "(Lclient!vs;B)V", line = 9993)
	static final void method7854(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class3_Sub26 local2 = Class340.method26441();
		if (local2 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local2.anInt1304 * 1865552421;
			@Pc(76) int local76 = local2.anInt1307 * 940032479 << 28 | Class58.anInt1429 + local2.anInt1303 * -582755297 << 14 | Class58.anInt1406 + local2.anInt1306 * 1667122095;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local76;
		}
	}
}
