package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public class Class246 {

	@OriginalMember(owner = "client!iv", name = "y", descriptor = "[[Lclient!ii;")
	Class235[][] aClass235ArrayArray1;

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_38;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "Lclient!abs;")
	final Class17_Sub3 aClass17_Sub3_3;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
	final int anInt3792;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
	final int anInt3793;

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "[B")
	final byte[] aByteArray76;

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
	final int anInt3796;

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
	final int anInt3794;

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
	final int anInt3795;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!abv;Lclient!abs;)V", line = 19)
	Class246(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class17_Sub3 arg1) {
		this.aClass21_Sub3_38 = arg0;
		this.aClass17_Sub3_3 = arg1;
		this.anInt3792 = (this.aClass17_Sub3_3.anInt339 * -1007974723 * this.aClass17_Sub3_3.anInt338 * 76934957 >> this.aClass21_Sub3_38.anInt2511) + 2;
		this.anInt3793 = (this.aClass17_Sub3_3.anInt337 * -207323189 * this.aClass17_Sub3_3.anInt338 * 76934957 >> this.aClass21_Sub3_38.anInt2511) + 2;
		this.aByteArray76 = new byte[this.anInt3792 * this.anInt3793];
		this.anInt3796 = this.aClass21_Sub3_38.anInt2511 + 7 - this.aClass17_Sub3_3.anInt336 * 1371852633;
		this.anInt3794 = this.aClass17_Sub3_3.anInt339 * -1007974723 >> this.anInt3796;
		this.anInt3795 = this.aClass17_Sub3_3.anInt337 * -207323189 >> this.anInt3796;
	}

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "()V", line = 31)
	void method24873() {
		this.aClass235ArrayArray1 = new Class235[this.anInt3794][this.anInt3795];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3795; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3794; local14++) {
				this.aClass235ArrayArray1[local14][local8] = new Class235(this.aClass21_Sub3_38, this, this.aClass17_Sub3_3, local14, local8, this.anInt3796, local14 * 128 + 1, local8 * 128 + 1);
				if (this.aClass235ArrayArray1[local14][local8].anInt3746 == 0) {
					this.aClass235ArrayArray1[local14][local8] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(Lclient!hn;III[[ZZ)V", line = 41)
	void method24872(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		this.aClass21_Sub3_38.method17108(false);
		@Pc(12) float local12 = 1.0F / (float) (this.aClass21_Sub3_38.anInt2510 * 128);
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(76) int local76;
		if (arg5) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3795; local16++) {
				@Pc(25) int local25 = local16 << this.anInt3796;
				local32 = local16 + 1 << this.anInt3796;
				label144: for (local34 = 0; local34 < this.anInt3794; local34++) {
					if (this.aClass235ArrayArray1[local34][local16] != null) {
						local51 = local34 << this.anInt3796;
						local58 = local34 + 1 << this.anInt3796;
						for (local60 = local51; local60 < local58; local60++) {
							if (local60 - arg1 >= -arg3 && local60 - arg1 <= arg3) {
								for (local76 = local25; local76 < local32; local76++) {
									if (local76 - arg2 >= -arg3 && local76 - arg2 <= arg3 && arg4[local60 - arg1 + arg3][local76 - arg2 + arg3]) {
										arg0.aClass328_44.method26050(local12, local12, 1.0F, 1.0F);
										arg0.aClass328_44.aFloatArray106[12] = -local34;
										arg0.aClass328_44.aFloatArray106[13] = -local16;
										this.aClass235ArrayArray1[local34][local16].method24594(arg0);
										continue label144;
									}
								}
							}
						}
					}
				}
			}
		} else {
			@Pc(152) int[] local152 = new int[this.anInt3795 * this.anInt3794];
			@Pc(156) ByteBuffer local156 = this.aClass21_Sub3_38.aByteBuffer4;
			local156.clear();
			local32 = 0;
			for (local34 = 0; local34 < this.anInt3795; local34++) {
				local51 = local34 << this.anInt3796;
				local58 = local34 + 1 << this.anInt3796;
				for (local60 = 0; local60 < this.anInt3794; local60++) {
					@Pc(192) Class235 local192 = this.aClass235ArrayArray1[local60][local34];
					@Pc(194) int local194 = 0;
					if (local192 != null) {
						@Pc(201) int local201 = local60 << this.anInt3796;
						@Pc(208) int local208 = local60 + 1 << this.anInt3796;
						for (@Pc(210) int local210 = local51; local210 < local58; local210++) {
							if (local210 - arg2 >= -arg3 && local210 - arg2 <= arg3) {
								@Pc(234) int local234 = local210 * this.aClass17_Sub3_3.anInt339 * -1007974723 + local201;
								for (@Pc(236) int local236 = local201; local236 < local208; local236++) {
									if (local236 - arg1 >= -arg3 && local236 - arg1 <= arg3 && arg4[local236 - arg1 + arg3][local210 - arg2 + arg3]) {
										@Pc(270) short[] local270 = this.aClass17_Sub3_3.aShortArrayArray2[local234];
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
				@Pc(314) Interface30 local314 = this.aClass21_Sub3_38.method17464(local34 / 2);
				local314.method25705(0, local34, this.aClass21_Sub3_38.aLong101);
				local58 = 0;
				local32 = 0;
				for (local60 = 0; local60 < this.anInt3795; local60++) {
					for (local76 = 0; local76 < this.anInt3794; local76++) {
						if (local152[local32] != 0) {
							arg0.aClass328_44.method26050(local12, local12, 1.0F, 1.0F);
							arg0.aClass328_44.aFloatArray106[12] = -local76;
							arg0.aClass328_44.aFloatArray106[13] = -local60;
							this.aClass235ArrayArray1[local76][local60].method24593(arg0, local314, local58, local152[local32] / 3);
							local58 += local152[local32];
						}
						local32++;
					}
				}
			}
		}
		this.aClass21_Sub3_38.method17108(true);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!hn;III[[ZZ)V", line = 41)
	void method24874(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		this.aClass21_Sub3_38.method17108(false);
		@Pc(12) float local12 = 1.0F / (float) (this.aClass21_Sub3_38.anInt2510 * 128);
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(76) int local76;
		if (arg5) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3795; local16++) {
				@Pc(25) int local25 = local16 << this.anInt3796;
				local32 = local16 + 1 << this.anInt3796;
				label144: for (local34 = 0; local34 < this.anInt3794; local34++) {
					if (this.aClass235ArrayArray1[local34][local16] != null) {
						local51 = local34 << this.anInt3796;
						local58 = local34 + 1 << this.anInt3796;
						for (local60 = local51; local60 < local58; local60++) {
							if (local60 - arg1 >= -arg3 && local60 - arg1 <= arg3) {
								for (local76 = local25; local76 < local32; local76++) {
									if (local76 - arg2 >= -arg3 && local76 - arg2 <= arg3 && arg4[local60 - arg1 + arg3][local76 - arg2 + arg3]) {
										arg0.aClass328_44.method26050(local12, local12, 1.0F, 1.0F);
										arg0.aClass328_44.aFloatArray106[12] = -local34;
										arg0.aClass328_44.aFloatArray106[13] = -local16;
										this.aClass235ArrayArray1[local34][local16].method24594(arg0);
										continue label144;
									}
								}
							}
						}
					}
				}
			}
		} else {
			@Pc(152) int[] local152 = new int[this.anInt3795 * this.anInt3794];
			@Pc(156) ByteBuffer local156 = this.aClass21_Sub3_38.aByteBuffer4;
			local156.clear();
			local32 = 0;
			for (local34 = 0; local34 < this.anInt3795; local34++) {
				local51 = local34 << this.anInt3796;
				local58 = local34 + 1 << this.anInt3796;
				for (local60 = 0; local60 < this.anInt3794; local60++) {
					@Pc(192) Class235 local192 = this.aClass235ArrayArray1[local60][local34];
					@Pc(194) int local194 = 0;
					if (local192 != null) {
						@Pc(201) int local201 = local60 << this.anInt3796;
						@Pc(208) int local208 = local60 + 1 << this.anInt3796;
						for (@Pc(210) int local210 = local51; local210 < local58; local210++) {
							if (local210 - arg2 >= -arg3 && local210 - arg2 <= arg3) {
								@Pc(234) int local234 = local210 * this.aClass17_Sub3_3.anInt339 * -1007974723 + local201;
								for (@Pc(236) int local236 = local201; local236 < local208; local236++) {
									if (local236 - arg1 >= -arg3 && local236 - arg1 <= arg3 && arg4[local236 - arg1 + arg3][local210 - arg2 + arg3]) {
										@Pc(270) short[] local270 = this.aClass17_Sub3_3.aShortArrayArray2[local234];
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
				@Pc(314) Interface30 local314 = this.aClass21_Sub3_38.method17464(local34 / 2);
				local314.method25705(0, local34, this.aClass21_Sub3_38.aLong101);
				local58 = 0;
				local32 = 0;
				for (local60 = 0; local60 < this.anInt3795; local60++) {
					for (local76 = 0; local76 < this.anInt3794; local76++) {
						if (local152[local32] != 0) {
							arg0.aClass328_44.method26050(local12, local12, 1.0F, 1.0F);
							arg0.aClass328_44.aFloatArray106[12] = -local76;
							arg0.aClass328_44.aFloatArray106[13] = -local60;
							this.aClass235ArrayArray1[local76][local60].method24593(arg0, local314, local58, local152[local32] / 3);
							local58 += local152[local32];
						}
						local32++;
					}
				}
			}
		}
		this.aClass21_Sub3_38.method17108(true);
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(Lclient!hn;III[[ZZ)V", line = 41)
	void method24882(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		this.aClass21_Sub3_38.method17108(false);
		@Pc(12) float local12 = 1.0F / (float) (this.aClass21_Sub3_38.anInt2510 * 128);
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(76) int local76;
		if (arg5) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3795; local16++) {
				@Pc(25) int local25 = local16 << this.anInt3796;
				local32 = local16 + 1 << this.anInt3796;
				label144: for (local34 = 0; local34 < this.anInt3794; local34++) {
					if (this.aClass235ArrayArray1[local34][local16] != null) {
						local51 = local34 << this.anInt3796;
						local58 = local34 + 1 << this.anInt3796;
						for (local60 = local51; local60 < local58; local60++) {
							if (local60 - arg1 >= -arg3 && local60 - arg1 <= arg3) {
								for (local76 = local25; local76 < local32; local76++) {
									if (local76 - arg2 >= -arg3 && local76 - arg2 <= arg3 && arg4[local60 - arg1 + arg3][local76 - arg2 + arg3]) {
										arg0.aClass328_44.method26050(local12, local12, 1.0F, 1.0F);
										arg0.aClass328_44.aFloatArray106[12] = -local34;
										arg0.aClass328_44.aFloatArray106[13] = -local16;
										this.aClass235ArrayArray1[local34][local16].method24594(arg0);
										continue label144;
									}
								}
							}
						}
					}
				}
			}
		} else {
			@Pc(152) int[] local152 = new int[this.anInt3795 * this.anInt3794];
			@Pc(156) ByteBuffer local156 = this.aClass21_Sub3_38.aByteBuffer4;
			local156.clear();
			local32 = 0;
			for (local34 = 0; local34 < this.anInt3795; local34++) {
				local51 = local34 << this.anInt3796;
				local58 = local34 + 1 << this.anInt3796;
				for (local60 = 0; local60 < this.anInt3794; local60++) {
					@Pc(192) Class235 local192 = this.aClass235ArrayArray1[local60][local34];
					@Pc(194) int local194 = 0;
					if (local192 != null) {
						@Pc(201) int local201 = local60 << this.anInt3796;
						@Pc(208) int local208 = local60 + 1 << this.anInt3796;
						for (@Pc(210) int local210 = local51; local210 < local58; local210++) {
							if (local210 - arg2 >= -arg3 && local210 - arg2 <= arg3) {
								@Pc(234) int local234 = local210 * this.aClass17_Sub3_3.anInt339 * -1007974723 + local201;
								for (@Pc(236) int local236 = local201; local236 < local208; local236++) {
									if (local236 - arg1 >= -arg3 && local236 - arg1 <= arg3 && arg4[local236 - arg1 + arg3][local210 - arg2 + arg3]) {
										@Pc(270) short[] local270 = this.aClass17_Sub3_3.aShortArrayArray2[local234];
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
				@Pc(314) Interface30 local314 = this.aClass21_Sub3_38.method17464(local34 / 2);
				local314.method25705(0, local34, this.aClass21_Sub3_38.aLong101);
				local58 = 0;
				local32 = 0;
				for (local60 = 0; local60 < this.anInt3795; local60++) {
					for (local76 = 0; local76 < this.anInt3794; local76++) {
						if (local152[local32] != 0) {
							arg0.aClass328_44.method26050(local12, local12, 1.0F, 1.0F);
							arg0.aClass328_44.aFloatArray106[12] = -local76;
							arg0.aClass328_44.aFloatArray106[13] = -local60;
							this.aClass235ArrayArray1[local76][local60].method24593(arg0, local314, local58, local152[local32] / 3);
							local58 += local152[local32];
						}
						local32++;
					}
				}
			}
		}
		this.aClass21_Sub3_38.method17108(true);
	}

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "(Lclient!amd;II)V", line = 127)
	void method24875(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub2 local2 = (Class3_Sub1_Sub3_Sub2) arg0;
		arg1 += local2.anInt2873 + 1;
		arg2 += local2.anInt2874 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3792;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2875;
		@Pc(31) int local31 = local2.anInt2872;
		@Pc(36) int local36 = this.anInt3792 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3792;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3793) {
			local44 = arg2 + local28 + 1 - this.anInt3793;
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
		if (arg1 + local31 >= this.anInt3792) {
			local44 = arg1 + local31 + 1 - this.anInt3792;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24878(this.aByteArray76, local2.aByteArray54, local25, local23, local31, local28, local36, local38);
			this.method24877(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!iv", name = "z", descriptor = "(Lclient!amd;II)V", line = 127)
	void method24883(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub2 local2 = (Class3_Sub1_Sub3_Sub2) arg0;
		arg1 += local2.anInt2873 + 1;
		arg2 += local2.anInt2874 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3792;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2875;
		@Pc(31) int local31 = local2.anInt2872;
		@Pc(36) int local36 = this.anInt3792 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3792;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3793) {
			local44 = arg2 + local28 + 1 - this.anInt3793;
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
		if (arg1 + local31 >= this.anInt3792) {
			local44 = arg1 + local31 + 1 - this.anInt3792;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24878(this.aByteArray76, local2.aByteArray54, local25, local23, local31, local28, local36, local38);
			this.method24877(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "(Lclient!amd;II)V", line = 127)
	void method24884(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub2 local2 = (Class3_Sub1_Sub3_Sub2) arg0;
		arg1 += local2.anInt2873 + 1;
		arg2 += local2.anInt2874 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3792;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2875;
		@Pc(31) int local31 = local2.anInt2872;
		@Pc(36) int local36 = this.anInt3792 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3792;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3793) {
			local44 = arg2 + local28 + 1 - this.anInt3793;
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
		if (arg1 + local31 >= this.anInt3792) {
			local44 = arg1 + local31 + 1 - this.anInt3792;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24878(this.aByteArray76, local2.aByteArray54, local25, local23, local31, local28, local36, local38);
			this.method24877(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "(Lclient!amd;II)V", line = 168)
	void method24876(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub2 local2 = (Class3_Sub1_Sub3_Sub2) arg0;
		arg1 += local2.anInt2873 + 1;
		arg2 += local2.anInt2874 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3792;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2875;
		@Pc(31) int local31 = local2.anInt2872;
		@Pc(36) int local36 = this.anInt3792 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3792;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3793) {
			local44 = arg2 + local28 + 1 - this.anInt3793;
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
		if (arg1 + local31 >= this.anInt3792) {
			local44 = arg1 + local31 + 1 - this.anInt3792;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24879(this.aByteArray76, local2.aByteArray54, local25, local23, local31, local28, local36, local38);
			this.method24877(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "(Lclient!amd;II)V", line = 168)
	void method24885(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub2 local2 = (Class3_Sub1_Sub3_Sub2) arg0;
		arg1 += local2.anInt2873 + 1;
		arg2 += local2.anInt2874 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3792;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2875;
		@Pc(31) int local31 = local2.anInt2872;
		@Pc(36) int local36 = this.anInt3792 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3792;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3793) {
			local44 = arg2 + local28 + 1 - this.anInt3793;
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
		if (arg1 + local31 >= this.anInt3792) {
			local44 = arg1 + local31 + 1 - this.anInt3792;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24879(this.aByteArray76, local2.aByteArray54, local25, local23, local31, local28, local36, local38);
			this.method24877(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(Lclient!amd;II)V", line = 168)
	void method24886(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub2 local2 = (Class3_Sub1_Sub3_Sub2) arg0;
		arg1 += local2.anInt2873 + 1;
		arg2 += local2.anInt2874 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3792;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2875;
		@Pc(31) int local31 = local2.anInt2872;
		@Pc(36) int local36 = this.anInt3792 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3792;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3793) {
			local44 = arg2 + local28 + 1 - this.anInt3793;
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
		if (arg1 + local31 >= this.anInt3792) {
			local44 = arg1 + local31 + 1 - this.anInt3792;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24879(this.aByteArray76, local2.aByteArray54, local25, local23, local31, local28, local36, local38);
			this.method24877(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "(Lclient!amd;II)V", line = 168)
	void method24887(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub2 local2 = (Class3_Sub1_Sub3_Sub2) arg0;
		arg1 += local2.anInt2873 + 1;
		arg2 += local2.anInt2874 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3792;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2875;
		@Pc(31) int local31 = local2.anInt2872;
		@Pc(36) int local36 = this.anInt3792 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3792;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3793) {
			local44 = arg2 + local28 + 1 - this.anInt3793;
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
		if (arg1 + local31 >= this.anInt3792) {
			local44 = arg1 + local31 + 1 - this.anInt3792;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24879(this.aByteArray76, local2.aByteArray54, local25, local23, local31, local28, local36, local38);
			this.method24877(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(Lclient!amd;II)Z", line = 209)
	boolean method24888(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub2 local2 = (Class3_Sub1_Sub3_Sub2) arg0;
		arg1 += local2.anInt2873 + 1;
		arg2 += local2.anInt2874 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3792;
		@Pc(26) int local26 = local2.anInt2875;
		@Pc(29) int local29 = local2.anInt2872;
		@Pc(34) int local34 = this.anInt3792 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt3792;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt3793) {
			local40 = arg2 + local26 + 1 - this.anInt3793;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt3792) {
			local40 = arg1 + local29 + 1 - this.anInt3792;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt3792;
			return method24896(this.aByteArray76, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iv", name = "q", descriptor = "(Lclient!amd;II)Z", line = 209)
	boolean method24889(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub2 local2 = (Class3_Sub1_Sub3_Sub2) arg0;
		arg1 += local2.anInt2873 + 1;
		arg2 += local2.anInt2874 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3792;
		@Pc(26) int local26 = local2.anInt2875;
		@Pc(29) int local29 = local2.anInt2872;
		@Pc(34) int local34 = this.anInt3792 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt3792;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt3793) {
			local40 = arg2 + local26 + 1 - this.anInt3793;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt3792) {
			local40 = arg1 + local29 + 1 - this.anInt3792;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt3792;
			return method24896(this.aByteArray76, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "(Lclient!amd;II)Z", line = 209)
	boolean method24894(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub2 local2 = (Class3_Sub1_Sub3_Sub2) arg0;
		arg1 += local2.anInt2873 + 1;
		arg2 += local2.anInt2874 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3792;
		@Pc(26) int local26 = local2.anInt2875;
		@Pc(29) int local29 = local2.anInt2872;
		@Pc(34) int local34 = this.anInt3792 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt3792;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt3793) {
			local40 = arg2 + local26 + 1 - this.anInt3793;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt3792) {
			local40 = arg1 + local29 + 1 - this.anInt3792;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt3792;
			return method24896(this.aByteArray76, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "(IIII)V", line = 245)
	void method24877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass235ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class235[] local45 = this.aClass235ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean681 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "v", descriptor = "(IIII)V", line = 245)
	void method24891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass235ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class235[] local45 = this.aClass235ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean681 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "(IIII)V", line = 245)
	void method24892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass235ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class235[] local45 = this.aClass235ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean681 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "(IIII)V", line = 245)
	void method24895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass235ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class235[] local45 = this.aClass235ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean681 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "(IIII)V", line = 245)
	void method24898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass235ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class235[] local45 = this.aClass235ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean681 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "([B[BIIIIII)V", line = 259)
	static final void method24878(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "([B[BIIIIII)V", line = 259)
	static final void method24880(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "([B[BIIIIII)V", line = 259)
	static final void method24881(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "([B[BIIIIII)V", line = 259)
	static final void method24890(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "([B[BIIIIII)V", line = 277)
	static final void method24879(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "([B[BIIIIII)V", line = 277)
	static final void method24897(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!iv", name = "at", descriptor = "([BIIIII)Z", line = 295)
	static final boolean method24893(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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

	@OriginalMember(owner = "client!iv", name = "y", descriptor = "([BIIIII)Z", line = 295)
	static final boolean method24896(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
