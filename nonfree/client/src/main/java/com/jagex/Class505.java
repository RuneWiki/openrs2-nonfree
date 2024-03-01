package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public class Class505 {

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_94;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	int anInt5255;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "[Lclient!ui;")
	Class503[] aClass503Array1;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Z)V", line = 16)
	public Class505(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) boolean arg3) {
		this.aClass359_94 = arg2;
		if (this.aClass359_94 == null) {
			this.anInt5255 = 0;
		} else {
			this.anInt5255 = this.aClass359_94.method26682(Class185.aClass185_20.anInt3631 * -1739932335) * -721771451;
		}
		if (arg3) {
			this.aClass503Array1 = new Class503[this.anInt5255 * -1326133619];
			for (@Pc(35) int local35 = 0; local35 < this.anInt5255 * -1326133619; local35++) {
				@Pc(45) Class359 local45 = this.aClass359_94;
				@Pc(56) byte[] local56;
				synchronized (this.aClass359_94) {
					local56 = this.aClass359_94.method26713(Class185.aClass185_20.anInt3631 * -1739932335, local35);
				}
				@Pc(68) Class503 local68 = new Class503();
				if (local56 != null) {
					local68.method29464(new Class3_Sub41(local56));
				}
				local68.method29466();
				this.aClass503Array1[local35] = local68;
				this.aClass503Array1[local35].aClass505_2 = this;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)Lclient!ui;", line = 37)
	public Class503 method29515(@OriginalArg(0) int arg0) {
		return this.aClass503Array1[arg0];
	}

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "(II)Lclient!ui;", line = 37)
	public Class503 method29516(@OriginalArg(0) int arg0) {
		return this.aClass503Array1[arg0];
	}

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "(Lclient!ct;)I", line = 41)
	int method29513(@OriginalArg(0) Interface8 arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5255 * -1326133619; local3++) {
			@Pc(14) Class503 local14 = this.method29516(local3);
			if (local14.method29473(arg0)) {
				local1 += local14.anInt5251 * -1356074829;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ct;I)I", line = 41)
	int method29514(@OriginalArg(0) Interface8 arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5255 * -1326133619; local3++) {
			@Pc(14) Class503 local14 = this.method29516(local3);
			if (local14.method29473(arg0)) {
				local1 += local14.anInt5251 * -1356074829;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "(Lclient!ct;)I", line = 41)
	int method29517(@OriginalArg(0) Interface8 arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5255 * -1326133619; local3++) {
			@Pc(14) Class503 local14 = this.method29516(local3);
			if (local14.method29473(arg0)) {
				local1 += local14.anInt5251 * -1356074829;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ul", name = "ey", descriptor = "(III)V", line = 853)
	public static void method29521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class58_Sub1.anInt1437 = (arg0 - Class58_Sub1.anInt1429) * 481951965;
		Class58_Sub1.anInt1435 = (arg1 - Class58_Sub1.anInt1406) * -1239823265;
	}

	@OriginalMember(owner = "client!ul", name = "go", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5280)
	static final void method29518(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3513 = 1115711630;
		arg0.aClass584_2 = null;
		arg0.anInt3514 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 1702990945;
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class401.method27610(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!ul", name = "us", descriptor = "(Lclient!vs;I)V", line = 7851)
	static final void method29519(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class3_Sub32 local15 = Class156.method23183((Class3_Sub32) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575]);
		arg0.anInt5319 -= 1248498196;
		local15.anInt1342 += arg0.anIntArray496[arg0.anInt5319 * 960738381] * 1041055183;
		local15.anInt1343 += arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] * 856948829;
		local15.anInt1345 += arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2] * -78001219;
		local15.anInt1344 += arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3] * 618120789;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local15;
	}

	@OriginalMember(owner = "client!ul", name = "afv", descriptor = "(Lclient!vs;I)V", line = 9916)
	static final void method29520(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(22) Class3_Sub1_Sub4 local22 = Class58.method12460(local12 >> 14 & 0x3FFF, local12 & 0x3FFF);
		if (local22 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local22.anInt2649 * 75245013;
		}
	}

	@OriginalMember(owner = "client!ul", name = "aoq", descriptor = "(Lclient!vs;I)V", line = 11571)
	static final void method29522(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub33_2.method14179();
	}
}
