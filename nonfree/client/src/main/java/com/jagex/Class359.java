package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public class Class359 {

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "[[Lclient!kk;")
	Class363[][] aClass363ArrayArray1;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_35;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!aek;")
	final Class88_Sub2 aClass88_Sub2_3;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
	final int anInt4500;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
	final int anInt4502;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "[B")
	final byte[] aByteArray81;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
	final int anInt4504;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	final int anInt4501;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	final int anInt4503;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!aed;Lclient!aek;)V", line = 19)
	Class359(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class88_Sub2 arg1) {
		this.aClass86_Sub1_35 = arg0;
		this.aClass88_Sub2_3 = arg1;
		this.anInt4500 = (this.aClass88_Sub2_3.anInt607 * -1924295585 * this.aClass88_Sub2_3.anInt608 * 127780559 >> this.aClass86_Sub1_35.anInt2830) + 2;
		this.anInt4502 = (this.aClass88_Sub2_3.anInt606 * -1466328823 * this.aClass88_Sub2_3.anInt608 * 127780559 >> this.aClass86_Sub1_35.anInt2830) + 2;
		this.aByteArray81 = new byte[this.anInt4500 * this.anInt4502];
		this.anInt4504 = this.aClass86_Sub1_35.anInt2830 + 7 - this.aClass88_Sub2_3.anInt609 * -1495101509;
		this.anInt4501 = this.aClass88_Sub2_3.anInt607 * -1924295585 >> this.anInt4504;
		this.anInt4503 = this.aClass88_Sub2_3.anInt606 * -1466328823 >> this.anInt4504;
	}

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "()V", line = 31)
	void method27975() {
		this.aClass363ArrayArray1 = new Class363[this.anInt4501][this.anInt4503];
		for (@Pc(8) int local8 = 0; local8 < this.anInt4503; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt4501; local14++) {
				this.aClass363ArrayArray1[local14][local8] = new Class363(this.aClass86_Sub1_35, this, this.aClass88_Sub2_3, local14, local8, this.anInt4504, local14 * 128 + 1, local8 * 128 + 1);
				if (this.aClass363ArrayArray1[local14][local8].anInt4518 == 0) {
					this.aClass363ArrayArray1[local14][local8] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(Lclient!jo;III[[ZZ)V", line = 41)
	void method27976(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		this.aClass86_Sub1_35.method20230(false);
		@Pc(12) float local12 = 1.0F / (float) (this.aClass86_Sub1_35.anInt2823 * 128);
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(76) int local76;
		if (arg5) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt4503; local16++) {
				@Pc(25) int local25 = local16 << this.anInt4504;
				local32 = local16 + 1 << this.anInt4504;
				label144: for (local34 = 0; local34 < this.anInt4501; local34++) {
					if (this.aClass363ArrayArray1[local34][local16] != null) {
						local51 = local34 << this.anInt4504;
						local58 = local34 + 1 << this.anInt4504;
						for (local60 = local51; local60 < local58; local60++) {
							if (local60 - arg1 >= -arg3 && local60 - arg1 <= arg3) {
								for (local76 = local25; local76 < local32; local76++) {
									if (local76 - arg2 >= -arg3 && local76 - arg2 <= arg3 && arg4[local60 - arg1 + arg3][local76 - arg2 + arg3]) {
										arg0.aClass442_48.method28979(local12, local12, 1.0F, 1.0F);
										arg0.aClass442_48.aFloatArray109[12] = -local34;
										arg0.aClass442_48.aFloatArray109[13] = -local16;
										this.aClass363ArrayArray1[local34][local16].method28119(arg0);
										continue label144;
									}
								}
							}
						}
					}
				}
			}
		} else {
			@Pc(152) int[] local152 = new int[this.anInt4503 * this.anInt4501];
			@Pc(156) ByteBuffer local156 = this.aClass86_Sub1_35.aByteBuffer7;
			local156.clear();
			local32 = 0;
			for (local34 = 0; local34 < this.anInt4503; local34++) {
				local51 = local34 << this.anInt4504;
				local58 = local34 + 1 << this.anInt4504;
				for (local60 = 0; local60 < this.anInt4501; local60++) {
					@Pc(192) Class363 local192 = this.aClass363ArrayArray1[local60][local34];
					@Pc(194) int local194 = 0;
					if (local192 != null) {
						@Pc(201) int local201 = local60 << this.anInt4504;
						@Pc(208) int local208 = local60 + 1 << this.anInt4504;
						for (@Pc(210) int local210 = local51; local210 < local58; local210++) {
							if (local210 - arg2 >= -arg3 && local210 - arg2 <= arg3) {
								@Pc(234) int local234 = local210 * this.aClass88_Sub2_3.anInt607 * -1924295585 + local201;
								for (@Pc(236) int local236 = local201; local236 < local208; local236++) {
									if (local236 - arg1 >= -arg3 && local236 - arg1 <= arg3 && arg4[local236 - arg1 + arg3][local210 - arg2 + arg3]) {
										@Pc(270) short[] local270 = this.aClass88_Sub2_3.aShortArrayArray2[local234];
										if (local270 != null) {
											for (@Pc(274) int local274 = 0; local274 < local270.length; local274++) {
												local156.putShort(local270[local274]);
												local194++;
											}
										}
									}
									local234++;
								}
							}
						}
					}
					local152[local32] = local194;
					local32++;
				}
			}
			if (local156.position() != 0) {
				local34 = local156.position();
				@Pc(314) Interface38 local314 = this.aClass86_Sub1_35.method20454(local34 / 2);
				local314.method28755(0, local34, this.aClass86_Sub1_35.aLong121);
				local58 = 0;
				local32 = 0;
				for (local60 = 0; local60 < this.anInt4503; local60++) {
					for (local76 = 0; local76 < this.anInt4501; local76++) {
						if (local152[local32] != 0) {
							arg0.aClass442_48.method28979(local12, local12, 1.0F, 1.0F);
							arg0.aClass442_48.aFloatArray109[12] = -local76;
							arg0.aClass442_48.aFloatArray109[13] = -local60;
							this.aClass363ArrayArray1[local76][local60].method28122(arg0, local314, local58, local152[local32] / 3);
							local58 += local152[local32];
						}
						local32++;
					}
				}
			}
		}
		this.aClass86_Sub1_35.method20230(true);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(Lclient!jo;III[[ZZ)V", line = 41)
	void method27977(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		this.aClass86_Sub1_35.method20230(false);
		@Pc(12) float local12 = 1.0F / (float) (this.aClass86_Sub1_35.anInt2823 * 128);
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(76) int local76;
		if (arg5) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt4503; local16++) {
				@Pc(25) int local25 = local16 << this.anInt4504;
				local32 = local16 + 1 << this.anInt4504;
				label144: for (local34 = 0; local34 < this.anInt4501; local34++) {
					if (this.aClass363ArrayArray1[local34][local16] != null) {
						local51 = local34 << this.anInt4504;
						local58 = local34 + 1 << this.anInt4504;
						for (local60 = local51; local60 < local58; local60++) {
							if (local60 - arg1 >= -arg3 && local60 - arg1 <= arg3) {
								for (local76 = local25; local76 < local32; local76++) {
									if (local76 - arg2 >= -arg3 && local76 - arg2 <= arg3 && arg4[local60 - arg1 + arg3][local76 - arg2 + arg3]) {
										arg0.aClass442_48.method28979(local12, local12, 1.0F, 1.0F);
										arg0.aClass442_48.aFloatArray109[12] = -local34;
										arg0.aClass442_48.aFloatArray109[13] = -local16;
										this.aClass363ArrayArray1[local34][local16].method28119(arg0);
										continue label144;
									}
								}
							}
						}
					}
				}
			}
		} else {
			@Pc(152) int[] local152 = new int[this.anInt4503 * this.anInt4501];
			@Pc(156) ByteBuffer local156 = this.aClass86_Sub1_35.aByteBuffer7;
			local156.clear();
			local32 = 0;
			for (local34 = 0; local34 < this.anInt4503; local34++) {
				local51 = local34 << this.anInt4504;
				local58 = local34 + 1 << this.anInt4504;
				for (local60 = 0; local60 < this.anInt4501; local60++) {
					@Pc(192) Class363 local192 = this.aClass363ArrayArray1[local60][local34];
					@Pc(194) int local194 = 0;
					if (local192 != null) {
						@Pc(201) int local201 = local60 << this.anInt4504;
						@Pc(208) int local208 = local60 + 1 << this.anInt4504;
						for (@Pc(210) int local210 = local51; local210 < local58; local210++) {
							if (local210 - arg2 >= -arg3 && local210 - arg2 <= arg3) {
								@Pc(234) int local234 = local210 * this.aClass88_Sub2_3.anInt607 * -1924295585 + local201;
								for (@Pc(236) int local236 = local201; local236 < local208; local236++) {
									if (local236 - arg1 >= -arg3 && local236 - arg1 <= arg3 && arg4[local236 - arg1 + arg3][local210 - arg2 + arg3]) {
										@Pc(270) short[] local270 = this.aClass88_Sub2_3.aShortArrayArray2[local234];
										if (local270 != null) {
											for (@Pc(274) int local274 = 0; local274 < local270.length; local274++) {
												local156.putShort(local270[local274]);
												local194++;
											}
										}
									}
									local234++;
								}
							}
						}
					}
					local152[local32] = local194;
					local32++;
				}
			}
			if (local156.position() != 0) {
				local34 = local156.position();
				@Pc(314) Interface38 local314 = this.aClass86_Sub1_35.method20454(local34 / 2);
				local314.method28755(0, local34, this.aClass86_Sub1_35.aLong121);
				local58 = 0;
				local32 = 0;
				for (local60 = 0; local60 < this.anInt4503; local60++) {
					for (local76 = 0; local76 < this.anInt4501; local76++) {
						if (local152[local32] != 0) {
							arg0.aClass442_48.method28979(local12, local12, 1.0F, 1.0F);
							arg0.aClass442_48.aFloatArray109[12] = -local76;
							arg0.aClass442_48.aFloatArray109[13] = -local60;
							this.aClass363ArrayArray1[local76][local60].method28122(arg0, local314, local58, local152[local32] / 3);
							local58 += local152[local32];
						}
						local32++;
					}
				}
			}
		}
		this.aClass86_Sub1_35.method20230(true);
	}

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "(Lclient!arp;II)V", line = 127)
	void method27978(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3177;
		@Pc(31) int local31 = local2.anInt3180;
		@Pc(36) int local36 = this.anInt4500 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4502) {
			local44 = arg2 + local28 + 1 - this.anInt4502;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4500) {
			local44 = arg1 + local31 + 1 - this.anInt4500;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method27994(this.aByteArray81, local2.aByteArray55, local25, local23, local31, local28, local36, local38);
			this.method27989(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "(Lclient!arp;II)V", line = 127)
	void method27979(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3177;
		@Pc(31) int local31 = local2.anInt3180;
		@Pc(36) int local36 = this.anInt4500 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4502) {
			local44 = arg2 + local28 + 1 - this.anInt4502;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4500) {
			local44 = arg1 + local31 + 1 - this.anInt4500;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method27994(this.aByteArray81, local2.aByteArray55, local25, local23, local31, local28, local36, local38);
			this.method27989(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "(Lclient!arp;II)V", line = 127)
	void method27980(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3177;
		@Pc(31) int local31 = local2.anInt3180;
		@Pc(36) int local36 = this.anInt4500 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4502) {
			local44 = arg2 + local28 + 1 - this.anInt4502;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4500) {
			local44 = arg1 + local31 + 1 - this.anInt4500;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method27994(this.aByteArray81, local2.aByteArray55, local25, local23, local31, local28, local36, local38);
			this.method27989(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(Lclient!arp;II)V", line = 127)
	void method27981(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3177;
		@Pc(31) int local31 = local2.anInt3180;
		@Pc(36) int local36 = this.anInt4500 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4502) {
			local44 = arg2 + local28 + 1 - this.anInt4502;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4500) {
			local44 = arg1 + local31 + 1 - this.anInt4500;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method27994(this.aByteArray81, local2.aByteArray55, local25, local23, local31, local28, local36, local38);
			this.method27989(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "(Lclient!arp;II)V", line = 127)
	void method27982(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3177;
		@Pc(31) int local31 = local2.anInt3180;
		@Pc(36) int local36 = this.anInt4500 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4502) {
			local44 = arg2 + local28 + 1 - this.anInt4502;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4500) {
			local44 = arg1 + local31 + 1 - this.anInt4500;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method27994(this.aByteArray81, local2.aByteArray55, local25, local23, local31, local28, local36, local38);
			this.method27989(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(Lclient!arp;II)V", line = 168)
	void method27983(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3177;
		@Pc(31) int local31 = local2.anInt3180;
		@Pc(36) int local36 = this.anInt4500 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4502) {
			local44 = arg2 + local28 + 1 - this.anInt4502;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4500) {
			local44 = arg1 + local31 + 1 - this.anInt4500;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method27998(this.aByteArray81, local2.aByteArray55, local25, local23, local31, local28, local36, local38);
			this.method27989(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(Lclient!arp;II)V", line = 168)
	void method27984(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3177;
		@Pc(31) int local31 = local2.anInt3180;
		@Pc(36) int local36 = this.anInt4500 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4502) {
			local44 = arg2 + local28 + 1 - this.anInt4502;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4500) {
			local44 = arg1 + local31 + 1 - this.anInt4500;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method27998(this.aByteArray81, local2.aByteArray55, local25, local23, local31, local28, local36, local38);
			this.method27989(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(Lclient!arp;II)V", line = 168)
	void method27985(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3177;
		@Pc(31) int local31 = local2.anInt3180;
		@Pc(36) int local36 = this.anInt4500 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4502) {
			local44 = arg2 + local28 + 1 - this.anInt4502;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4500) {
			local44 = arg1 + local31 + 1 - this.anInt4500;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method27998(this.aByteArray81, local2.aByteArray55, local25, local23, local31, local28, local36, local38);
			this.method27989(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "(Lclient!arp;II)Z", line = 209)
	boolean method27986(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(26) int local26 = local2.anInt3177;
		@Pc(29) int local29 = local2.anInt3180;
		@Pc(34) int local34 = this.anInt4500 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4502) {
			local40 = arg2 + local26 + 1 - this.anInt4502;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4500) {
			local40 = arg1 + local29 + 1 - this.anInt4500;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4500;
			return method28000(this.aByteArray81, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(Lclient!arp;II)Z", line = 209)
	boolean method27987(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(26) int local26 = local2.anInt3177;
		@Pc(29) int local29 = local2.anInt3180;
		@Pc(34) int local34 = this.anInt4500 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4502) {
			local40 = arg2 + local26 + 1 - this.anInt4502;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4500) {
			local40 = arg1 + local29 + 1 - this.anInt4500;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4500;
			return method28000(this.aByteArray81, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "(Lclient!arp;II)Z", line = 209)
	boolean method27988(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub2 local2 = (Class77_Sub1_Sub16_Sub2) arg0;
		arg1 += local2.anInt3178 + 1;
		arg2 += local2.anInt3176 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4500;
		@Pc(26) int local26 = local2.anInt3177;
		@Pc(29) int local29 = local2.anInt3180;
		@Pc(34) int local34 = this.anInt4500 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4500;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4502) {
			local40 = arg2 + local26 + 1 - this.anInt4502;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4500) {
			local40 = arg1 + local29 + 1 - this.anInt4500;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4500;
			return method28000(this.aByteArray81, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "(IIII)V", line = 245)
	void method27989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass363ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class363[] local45 = this.aClass363ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean723 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(IIII)V", line = 245)
	void method27990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass363ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class363[] local45 = this.aClass363ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean723 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(IIII)V", line = 245)
	void method27991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass363ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class363[] local45 = this.aClass363ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean723 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "(IIII)V", line = 245)
	void method27992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass363ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class363[] local45 = this.aClass363ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean723 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIII)V", line = 245)
	void method27993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass363ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class363[] local45 = this.aClass363ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean723 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "([B[BIIIIII)V", line = 259)
	static final void method27994(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([B[BIIIIII)V", line = 259)
	static final void method27995(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "([B[BIIIIII)V", line = 259)
	static final void method27996(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "([B[BIIIIII)V", line = 259)
	static final void method27997(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "([B[BIIIIII)V", line = 277)
	static final void method27998(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "([B[BIIIIII)V", line = 277)
	static final void method27999(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "([BIIIII)Z", line = 295)
	static final boolean method28000(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}
}
