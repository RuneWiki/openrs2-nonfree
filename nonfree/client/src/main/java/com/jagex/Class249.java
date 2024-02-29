package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public class Class249 implements Interface27 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fj", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
	final int anInt3803;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
	final int anInt3802;

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "(I)V", line = 159)
	static void method26163() {
		@Pc(2) Class232 local2 = Class412.aClass232_81;
		synchronized (Class412.aClass232_81) {
			Class412.aClass232_81.method25857();
		}
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 309)
	Class249(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		@Pc(8) int local8 = arg1.method22483();
		if (local8 == 65535) {
			this.anInt3803 = 1034904937;
			this.anInt3802 = 0;
		} else {
			this.anInt3803 = local8 * -1034904937;
			this.anInt3802 = arg1.method22500() * -1211180855;
		}
	}

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "(Lclient!fd;I)V", line = 322)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		if (this.anInt3803 * 1524139303 != -1) {
			try {
				arg0.method26059().method35948((Class343) this.this$0.anInterface26_2.method25532().method18319(this.anInt3803 * 1524139303), this.anInt3802 * 1902952825);
			} catch (@Pc(28) Exception_Sub6 local28) {
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(Lclient!fd;)V", line = 322)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		if (this.anInt3803 * 1524139303 != -1) {
			try {
				arg0.method26059().method35948((Class343) this.this$0.anInterface26_2.method25532().method18319(this.anInt3803 * 1524139303), this.anInt3802 * 1902952825);
			} catch (@Pc(28) Exception_Sub6 local28) {
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "(Lclient!fd;)V", line = 322)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		if (this.anInt3803 * 1524139303 != -1) {
			try {
				arg0.method26059().method35948((Class343) this.this$0.anInterface26_2.method25532().method18319(this.anInt3803 * 1524139303), this.anInt3802 * 1902952825);
			} catch (@Pc(28) Exception_Sub6 local28) {
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "(Lclient!arc;IB)Z", line = 381)
	static boolean method26164(@OriginalArg(0) Class77_Sub39_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.method22189(2);
		@Pc(21) int local21;
		@Pc(26) int local26;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(132) int local132;
		if (local4 == 0) {
			if (arg0.method22189(1) != 0) {
				method26164(arg0, arg1);
			}
			local21 = arg0.method22189(6);
			local26 = arg0.method22189(6);
			@Pc(36) boolean local36 = arg0.method22189(1) == 1;
			if (local36) {
				Class152.anIntArray223[(Class152.anInt2401 += 375555833) * -1852482743 - 1] = arg1;
			}
			if (client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(62) Class526 local62 = Class152.aClass526Array1[arg1];
			@Pc(73) Class104_Sub1_Sub1_Sub1_Sub2 local73 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class104_Sub1_Sub1_Sub1_Sub2(client.aClass517_1.method30435());
			local73.anInt2867 = arg1 * -2061161143;
			if (Class152.aClass77_Sub39Array2[arg1] != null) {
				local73.method21163(Class152.aClass77_Sub39Array2[arg1]);
			}
			if (Class152.aClass77_Sub39Array1[arg1] != null) {
				local73.method21166(Class152.aClass77_Sub39Array1[arg1]);
			}
			local73.method21070(local62.anInt5164 * -23485487, true);
			local73.anInt2880 = local62.anInt5165 * -767670225;
			local118 = local62.anInt5166 * 1272457665;
			local122 = local118 >> 28;
			local128 = local118 >> 14 & 0xFF;
			local132 = local118 & 0xFF;
			@Pc(136) Class595 local136 = client.aClass517_1.method30409();
			@Pc(147) int local147 = (local128 << 6) + local21 - local136.anInt5504 * -424199969;
			@Pc(158) int local158 = (local132 << 6) + local26 - local136.anInt5506 * -1166289421;
			local73.aClass282_1 = local62.aClass282_5;
			local73.aBoolean486 = local62.aBoolean783;
			local73.aByteArray47[0] = Class152.aByteArray38[arg1];
			local73.aByte100 = local73.aByte99 = (byte) local122;
			if (client.aClass517_1.method30441().method29665(local147, local158)) {
				local73.aByte99++;
			}
			local73.method21186(local147, local158);
			Class152.aClass526Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local21 = arg0.method22189(2);
			local26 = Class152.aClass526Array1[arg1].anInt5166 * 1272457665;
			Class152.aClass526Array1[arg1].anInt5166 = ((((local26 >> 28) + local21 & 0x3) << 28) + (local26 & 0xFFFFFFF)) * 186312257;
			return false;
		} else {
			@Pc(260) int local260;
			@Pc(267) int local267;
			@Pc(290) int local290;
			if (local4 != 2) {
				local21 = arg0.method22189(20);
				local26 = local21 >> 18 & 0x3;
				local260 = local21 >> 16 & 0x3;
				local267 = local21 >> 8 & 0xFF;
				local290 = local21 & 0xFF;
				local118 = Class152.aClass526Array1[arg1].anInt5166 * 1272457665;
				Class152.aByteArray38[arg1] = (byte) (local26 - 1);
				if (!Class152.$assertionsDisabled && (Class152.aByteArray38[arg1] < 0 || Class152.aByteArray38[arg1] > 3)) {
					throw new AssertionError();
				}
				local122 = local260 + (local118 >> 28) & 0x3;
				local128 = (local118 >> 14) + local267 & 0xFF;
				local132 = local118 + local290 & 0xFF;
				Class457.method29479(Class671.method33202(), local26 - 1);
				Class152.aClass526Array1[arg1].anInt5166 = (local132 + (local128 << 14) + (local122 << 28)) * 186312257;
				return false;
			}
			local21 = arg0.method22189(5);
			local26 = local21 >> 3 & 0x3;
			local260 = local21 & 0x7;
			local267 = Class152.aClass526Array1[arg1].anInt5166 * 1272457665;
			if (!Class152.$assertionsDisabled && (Class152.aByteArray38[arg1] < 0 || Class152.aByteArray38[arg1] > 3)) {
				throw new AssertionError();
			}
			local290 = local26 + (local267 >> 28) & 0x3;
			local118 = local267 >> 14 & 0xFF;
			local122 = local267 & 0xFF;
			if (local260 == 0) {
				local118--;
				local122--;
			}
			if (local260 == 1) {
				local122--;
			}
			if (local260 == 2) {
				local118++;
				local122--;
			}
			if (local260 == 3) {
				local118--;
			}
			if (local260 == 4) {
				local118++;
			}
			if (local260 == 5) {
				local118--;
				local122++;
			}
			if (local260 == 6) {
				local122++;
			}
			if (local260 == 7) {
				local118++;
				local122++;
			}
			Class457.method29479(Class671.method33202(), Class152.aByteArray38[arg1]);
			Class152.aClass526Array1[arg1].anInt5166 = ((local118 << 14) + (local290 << 28) + local122) * 186312257;
			return false;
		}
	}

	@OriginalMember(owner = "client!fj", name = "aqu", descriptor = "(Lclient!yf;I)V", line = 12351)
	static final void method26165(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1.method15438();
	}
}
