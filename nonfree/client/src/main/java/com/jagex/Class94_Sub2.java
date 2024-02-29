package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afj")
public class Class94_Sub2 extends Class94 {

	@OriginalMember(owner = "client!afj", name = "u", descriptor = "[B")
	byte[] aByteArray19 = new byte[512];

	@OriginalMember(owner = "client!afj", name = "j", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_5;

	@OriginalMember(owner = "client!afj", name = "f", descriptor = "I")
	int anInt845;

	@OriginalMember(owner = "client!afj", name = "e", descriptor = "I")
	int anInt846;

	@OriginalMember(owner = "client!afj", name = "i", descriptor = "Lclient!ks;")
	final Interface37 anInterface37_5;

	@OriginalMember(owner = "client!afj", name = "k", descriptor = "Lclient!kp;")
	final Interface36 anInterface36_6;

	@OriginalMember(owner = "client!afj", name = "<init>", descriptor = "(Lclient!aed;Lclient!aar;[Lclient!dg;Z)V", line = 21)
	Class94_Sub2(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class89[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass86_Sub1_5 = arg0;
		this.anInt845 = 0;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) Class89 local22 = arg2[local15];
			if (local22.method6683() > this.anInt845) {
				this.anInt845 = local22.method6683();
			}
			if (local22.method6682() > this.anInt845) {
				this.anInt845 = local22.method6682();
			}
		}
		this.anInt846 = this.anInt845 * 16;
		@Pc(66) Class89 local66;
		@Pc(69) int local69;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(93) int local93;
		@Pc(95) int local95;
		@Pc(182) Class89_Sub1 local182;
		@Pc(186) int[] local186;
		@Pc(111) int local111;
		@Pc(116) int local116;
		@Pc(204) int local204;
		@Pc(59) int local59;
		@Pc(103) Class89_Sub2 local103;
		if (arg3) {
			@Pc(57) byte[] local57 = new byte[this.anInt846 * this.anInt846];
			for (local59 = 0; local59 < 256; local59++) {
				local66 = arg2[local59];
				local69 = local66.method6683();
				local72 = local66.method6682();
				local79 = local59 % 16 * this.anInt845;
				local86 = local59 / 16 * this.anInt845;
				local93 = local86 * this.anInt846 + local79;
				local95 = 0;
				if (local66.method6680()) {
					local103 = (Class89_Sub2) arg2[local59];
					@Pc(109) byte[] local109;
					if (local103.method6693()) {
						local109 = local103.aByteArray15;
						for (local111 = 0; local111 < local69; local111++) {
							for (local116 = 0; local116 < local72; local116++) {
								local57[local93++] = local109[local95++];
							}
							local93 += this.anInt846 - local72;
						}
					} else {
						local109 = local103.aByteArray16;
						for (local111 = 0; local111 < local69; local111++) {
							for (local116 = 0; local116 < local72; local116++) {
								local57[local93++] = (byte) (local109[local95++] == 0 ? 0 : -1);
							}
							local93 += this.anInt846 - local72;
						}
					}
				} else {
					local182 = (Class89_Sub1) arg2[local59];
					local186 = local182.method6686(false);
					if (local182.method6693()) {
						for (local111 = 0; local111 < local69; local111++) {
							for (local116 = 0; local116 < local72; local116++) {
								local57[local93++] = (byte) (local186[local95++] >> 24 & 0xFF);
							}
							local93 += this.anInt846 - local72;
						}
					} else {
						for (local111 = 0; local111 < local69; local111++) {
							for (local116 = 0; local116 < local72; local116++) {
								local204 = local186[local95++];
								@Pc(227) byte local227 = (byte) ((local204 >> 16 & 0xFF) * 3 + (local204 >> 8 & 0xFF) * 4 + (local204 & 0xFF) >> 3);
								local57[local93++] = local227;
							}
							local93 += this.anInt846 - local72;
						}
					}
				}
			}
			@Pc(284) int[] local284 = new int[local57.length];
			for (@Pc(286) int local286 = 0; local286 < local57.length; local286++) {
				local284[local286] = local57[local286] << 24 | 0xFFFFFF;
			}
			this.anInterface37_5 = arg0.method20530(this.anInt846, this.anInt846, false, local284);
		} else {
			@Pc(320) int[] local320 = new int[this.anInt846 * this.anInt846];
			for (local59 = 0; local59 < 256; local59++) {
				local66 = arg2[local59];
				local69 = local66.method6683();
				local72 = local66.method6682();
				local79 = local59 % 16 * this.anInt845;
				local86 = local59 / 16 * this.anInt845;
				local93 = local86 * this.anInt846 + local79;
				local95 = 0;
				if (local66.method6680()) {
					local103 = (Class89_Sub2) arg2[local59];
					local186 = local103.anIntArray69;
					@Pc(372) byte[] local372 = local103.aByteArray15;
					@Pc(375) byte[] local375 = local103.aByteArray16;
					@Pc(384) int local384;
					if (local372 == null) {
						for (local204 = 0; local204 < local69; local204++) {
							for (local384 = 0; local384 < local72; local384++) {
								@Pc(433) byte local433;
								if ((local433 = local375[local95++]) == 0) {
									local93++;
								} else {
									local320[local93++] = local186[local433 & 0xFF] | 0xFF000000;
								}
							}
							local93 += this.anInt846 - local72;
						}
					} else {
						for (local204 = 0; local204 < local69; local204++) {
							for (local384 = 0; local384 < local72; local384++) {
								local320[local93++] = local372[local95] << 24 | local186[local375[local95] & 0xFF];
								local95++;
							}
							local93 += this.anInt846 - local72;
						}
					}
				} else {
					local182 = (Class89_Sub1) arg2[local59];
					local186 = local182.method6686(false);
					if (local182.method6693()) {
						for (local111 = 0; local111 < local69; local111++) {
							for (local116 = 0; local116 < local72; local116++) {
								local320[local93++] = local186[local95++];
							}
							local93 += this.anInt846 - local72;
						}
					} else {
						for (local111 = 0; local111 < local69; local111++) {
							for (local116 = 0; local116 < local72; local116++) {
								local204 = local186[local95] & 0xFFFFFF;
								local320[local93++] = (local204 == 0 ? 0 : 255) << 24 | local204;
								local95++;
							}
							local93 += this.anInt846 - local72;
						}
					}
				}
			}
			this.anInterface37_5 = arg0.method20530(this.anInt846, this.anInt846, false, local320);
		}
		this.anInterface37_5.method10856(Class382.aClass382_6);
		this.anInterface36_6 = arg0.method20656(false);
		this.anInterface36_6.method28760(20480, 20);
		@Pc(573) ByteBuffer local573 = this.aClass86_Sub1_5.aByteBuffer7;
		local573.clear();
		@Pc(587) float local587 = this.anInterface37_5.method10600((float) this.anInt846) / (float) this.anInt846;
		@Pc(598) float local598 = this.anInterface37_5.method10606((float) this.anInt846) / (float) this.anInt846;
		@Pc(607) Class89 local607;
		for (local69 = 0; local69 < 256; local69++) {
			local607 = arg2[local69];
			local79 = local607.method6683();
			local86 = local607.method6682();
			local93 = local607.method6701();
			local95 = local607.method6684();
			@Pc(627) float local627 = (float) (local69 % 16 * this.anInt845);
			@Pc(635) float local635 = (float) (local69 / 16 * this.anInt845);
			@Pc(639) float local639 = local627 * local587;
			@Pc(643) float local643 = local635 * local598;
			@Pc(650) float local650 = (local627 + (float) local86) * local587;
			@Pc(657) float local657 = (local635 + (float) local79) * local598;
			local573.putFloat((float) local95);
			local573.putFloat((float) local93);
			local573.putFloat(0.0F);
			local573.putFloat(local639);
			local573.putFloat(local643);
			local573.putFloat((float) local95);
			local573.putFloat((float) (local93 + local79));
			local573.putFloat(0.0F);
			local573.putFloat(local639);
			local573.putFloat(local657);
			local573.putFloat((float) (local95 + local86));
			local573.putFloat((float) (local93 + local79));
			local573.putFloat(0.0F);
			local573.putFloat(local650);
			local573.putFloat(local657);
			local573.putFloat((float) (local95 + local86));
			local573.putFloat((float) local93);
			local573.putFloat(0.0F);
			local573.putFloat(local650);
			local573.putFloat(local643);
		}
		this.anInterface36_6.method28755(0, local573.position(), this.aClass86_Sub1_5.aLong121);
		for (local69 = 0; local69 < 256; local69++) {
			local607 = arg2[local69];
			this.aByteArray19[local69 * 2] = (byte) local607.method6684();
			this.aByteArray19[local69 * 2 + 1] = (byte) local607.method6701();
		}
	}

	@OriginalMember(owner = "client!afj", name = "i", descriptor = "(CIIIZ)V", line = 197)
	@Override
	void method7660(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub1_5.method20438() != Class369.aClass369_2) {
			@Pc(13) int local13 = arg1 + this.aByteArray19[arg0 * 2];
			@Pc(24) int local24 = arg2 + this.aByteArray19[arg0 * 2 + 1];
			this.aClass86_Sub1_5.aClass381_3.method28317((float) local13, (float) local24, (float) (local13 + this.anInt845), (float) (local24 + this.anInt845), (float) (arg0 % 16) / 16.0F * this.anInterface37_5.method10611(), (float) (arg0 / 16) / 16.0F * this.anInterface37_5.method10610(), (float) (arg0 % 16 + 1) / 16.0F * this.anInterface37_5.method10611(), (float) (arg0 / 16 + 1) / 16.0F * this.anInterface37_5.method10610(), this.anInterface37_5, arg3);
			return;
		}
		this.aClass86_Sub1_5.method20489();
		this.aClass86_Sub1_5.method20579(1);
		@Pc(101) Class103 local101 = this.aClass86_Sub1_5.aClass103_3;
		local101.anInterface37_19 = this.anInterface37_5;
		local101.method9177(0, arg3);
		@Pc(116) float local116 = (float) this.aClass86_Sub1_5.method19940().method23491();
		@Pc(123) float local123 = (float) this.aClass86_Sub1_5.method19940().method23493();
		local101.aClass442_52.method28979(2.0F / local116, 2.0F / local123, 1.0F, 1.0F);
		local101.aClass442_52.aFloatArray109[12] = ((float) arg1 + this.aClass86_Sub1_5.method20664()) * 2.0F / local116 - 1.0F;
		local101.aClass442_52.aFloatArray109[13] = ((float) arg2 + this.aClass86_Sub1_5.method20664()) * 2.0F / local123 - 1.0F;
		local101.aClass442_52.aFloatArray109[14] = -1.0F;
		local101.aClass442_50.method28951();
		local101.anInterface36_9 = this.anInterface36_6;
		local101.anInt1094 = arg0 * 4;
		local101.aClass113_10 = this.aClass86_Sub1_5.aClass113_21;
		local101.method9179();
	}

	@OriginalMember(owner = "client!afj", name = "e", descriptor = "(CIIIZ)V", line = 197)
	@Override
	void method7657(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub1_5.method20438() != Class369.aClass369_2) {
			@Pc(13) int local13 = arg1 + this.aByteArray19[arg0 * 2];
			@Pc(24) int local24 = arg2 + this.aByteArray19[arg0 * 2 + 1];
			this.aClass86_Sub1_5.aClass381_3.method28317((float) local13, (float) local24, (float) (local13 + this.anInt845), (float) (local24 + this.anInt845), (float) (arg0 % 16) / 16.0F * this.anInterface37_5.method10611(), (float) (arg0 / 16) / 16.0F * this.anInterface37_5.method10610(), (float) (arg0 % 16 + 1) / 16.0F * this.anInterface37_5.method10611(), (float) (arg0 / 16 + 1) / 16.0F * this.anInterface37_5.method10610(), this.anInterface37_5, arg3);
			return;
		}
		this.aClass86_Sub1_5.method20489();
		this.aClass86_Sub1_5.method20579(1);
		@Pc(101) Class103 local101 = this.aClass86_Sub1_5.aClass103_3;
		local101.anInterface37_19 = this.anInterface37_5;
		local101.method9177(0, arg3);
		@Pc(116) float local116 = (float) this.aClass86_Sub1_5.method19940().method23491();
		@Pc(123) float local123 = (float) this.aClass86_Sub1_5.method19940().method23493();
		local101.aClass442_52.method28979(2.0F / local116, 2.0F / local123, 1.0F, 1.0F);
		local101.aClass442_52.aFloatArray109[12] = ((float) arg1 + this.aClass86_Sub1_5.method20664()) * 2.0F / local116 - 1.0F;
		local101.aClass442_52.aFloatArray109[13] = ((float) arg2 + this.aClass86_Sub1_5.method20664()) * 2.0F / local123 - 1.0F;
		local101.aClass442_52.aFloatArray109[14] = -1.0F;
		local101.aClass442_50.method28951();
		local101.anInterface36_9 = this.anInterface36_6;
		local101.anInt1094 = arg0 * 4;
		local101.aClass113_10 = this.aClass86_Sub1_5.aClass113_21;
		local101.method9179();
	}

	@OriginalMember(owner = "client!afj", name = "u", descriptor = "(CIIIZ)V", line = 197)
	@Override
	void method7656(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub1_5.method20438() != Class369.aClass369_2) {
			@Pc(13) int local13 = arg1 + this.aByteArray19[arg0 * 2];
			@Pc(24) int local24 = arg2 + this.aByteArray19[arg0 * 2 + 1];
			this.aClass86_Sub1_5.aClass381_3.method28317((float) local13, (float) local24, (float) (local13 + this.anInt845), (float) (local24 + this.anInt845), (float) (arg0 % 16) / 16.0F * this.anInterface37_5.method10611(), (float) (arg0 / 16) / 16.0F * this.anInterface37_5.method10610(), (float) (arg0 % 16 + 1) / 16.0F * this.anInterface37_5.method10611(), (float) (arg0 / 16 + 1) / 16.0F * this.anInterface37_5.method10610(), this.anInterface37_5, arg3);
			return;
		}
		this.aClass86_Sub1_5.method20489();
		this.aClass86_Sub1_5.method20579(1);
		@Pc(101) Class103 local101 = this.aClass86_Sub1_5.aClass103_3;
		local101.anInterface37_19 = this.anInterface37_5;
		local101.method9177(0, arg3);
		@Pc(116) float local116 = (float) this.aClass86_Sub1_5.method19940().method23491();
		@Pc(123) float local123 = (float) this.aClass86_Sub1_5.method19940().method23493();
		local101.aClass442_52.method28979(2.0F / local116, 2.0F / local123, 1.0F, 1.0F);
		local101.aClass442_52.aFloatArray109[12] = ((float) arg1 + this.aClass86_Sub1_5.method20664()) * 2.0F / local116 - 1.0F;
		local101.aClass442_52.aFloatArray109[13] = ((float) arg2 + this.aClass86_Sub1_5.method20664()) * 2.0F / local123 - 1.0F;
		local101.aClass442_52.aFloatArray109[14] = -1.0F;
		local101.aClass442_50.method28951();
		local101.anInterface36_9 = this.anInterface36_6;
		local101.anInt1094 = arg0 * 4;
		local101.aClass113_10 = this.aClass86_Sub1_5.aClass113_21;
		local101.method9179();
	}

	@OriginalMember(owner = "client!afj", name = "k", descriptor = "(CIIIZLclient!cd;II)V", line = 222)
	@Override
	void method7661(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afj", name = "f", descriptor = "(CIIIZLclient!cd;II)V", line = 222)
	@Override
	void method7658(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afj", name = "o", descriptor = "(CIIIZLclient!cd;II)V", line = 222)
	@Override
	void method7659(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
