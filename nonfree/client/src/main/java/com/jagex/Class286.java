package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public class Class286 {

	@OriginalMember(owner = "client!gv", name = "v", descriptor = "[I")
	int[] anIntArray410;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "[I")
	int[] anIntArray411;

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
	int anInt3970;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
	int anInt3971;

	@OriginalMember(owner = "client!gv", name = "y", descriptor = "[I")
	int[] anIntArray412;

	@OriginalMember(owner = "client!gv", name = "q", descriptor = "[[F")
	float[][] aFloatArrayArray23;

	@OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
	int anInt3972 = 0;

	@OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
	int anInt3973 = 0;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V", line = 17)
	Class286() {
	}

	@OriginalMember(owner = "client!gv", name = "t", descriptor = "(II)I", line = 20)
	static int method26729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			@Pc(12) int local12 = local10;
			@Pc(14) int local14 = arg1;
			@Pc(16) int local16 = 1;
			while (local14 > 1) {
				if ((local14 & 0x1) != 0) {
					local16 *= local12;
				}
				local12 *= local12;
				local14 >>= 0x1;
			}
			@Pc(43) int local43;
			if (local14 == 1) {
				local43 = local16 * local12;
			} else {
				local43 = local16;
			}
			if (local43 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!gv", name = "q", descriptor = "(II)I", line = 20)
	static int method26730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			@Pc(12) int local12 = local10;
			@Pc(14) int local14 = arg1;
			@Pc(16) int local16 = 1;
			while (local14 > 1) {
				if ((local14 & 0x1) != 0) {
					local16 *= local12;
				}
				local12 *= local12;
				local14 >>= 0x1;
			}
			@Pc(43) int local43;
			if (local14 == 1) {
				local43 = local16 * local12;
			} else {
				local43 = local16;
			}
			if (local43 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "(II)I", line = 20)
	static int method26731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			@Pc(12) int local12 = local10;
			@Pc(14) int local14 = arg1;
			@Pc(16) int local16 = 1;
			while (local14 > 1) {
				if ((local14 & 0x1) != 0) {
					local16 *= local12;
				}
				local12 *= local12;
				local14 >>= 0x1;
			}
			@Pc(43) int local43;
			if (local14 == 1) {
				local43 = local16 * local12;
			} else {
				local43 = local16;
			}
			if (local43 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(Lclient!gx;)V", line = 45)
	void method26732(@OriginalArg(0) Class288 arg0) {
		arg0.method26923(this.anInt3972 * 8 + this.anInt3973);
	}

	@OriginalMember(owner = "client!gv", name = "v", descriptor = "(Lclient!gx;)V", line = 49)
	void method26733(@OriginalArg(0) Class288 arg0) {
		@Pc(2) int local2 = arg0.method26913();
		@Pc(5) int local5 = arg0.method26912();
		arg0.method26923(24);
		this.anInt3970 = arg0.method26923(16);
		this.anInt3971 = arg0.method26923(24);
		if (this.anIntArray411 == null || this.anIntArray411.length != this.anInt3971) {
			this.anIntArray411 = new int[this.anInt3971];
		}
		@Pc(40) boolean local40 = arg0.method26919() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method26923(5) + 1;
			while (local44 < this.anInt3971) {
				@Pc(63) int local63 = arg0.method26923(Class690.method36319(this.anInt3971 - local44));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray411[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method26919() != 0;
			for (local50 = 0; local50 < this.anInt3971; local50++) {
				if (local86 && arg0.method26919() == 0) {
					this.anIntArray411[local50] = 0;
				} else {
					this.anIntArray411[local50] = arg0.method26923(5) + 1;
				}
			}
		}
		this.method26735();
		local44 = arg0.method26923(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method26906(arg0.method26923(32));
			@Pc(134) float local134 = arg0.method26906(arg0.method26923(32));
			local65 = arg0.method26923(4) + 1;
			@Pc(147) boolean local147 = arg0.method26919() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method26731(this.anInt3971, this.anInt3970);
			} else {
				local156 = this.anInt3971 * this.anInt3970;
			}
			this.anIntArray412 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray412[local169] = arg0.method26923(local65);
			}
			this.aFloatArrayArray23 = new float[this.anInt3971][this.anInt3970];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt3971; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt3970; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray412[local213] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt3971; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt3970;
					for (local203 = 0; local203 < this.anInt3970; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray412[local201] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt3973 = arg0.method26913() - local2;
		this.anInt3972 = arg0.method26912() - local5;
	}

	@OriginalMember(owner = "client!gv", name = "x", descriptor = "(Lclient!gx;)V", line = 49)
	void method26734(@OriginalArg(0) Class288 arg0) {
		@Pc(2) int local2 = arg0.method26913();
		@Pc(5) int local5 = arg0.method26912();
		arg0.method26923(24);
		this.anInt3970 = arg0.method26923(16);
		this.anInt3971 = arg0.method26923(24);
		if (this.anIntArray411 == null || this.anIntArray411.length != this.anInt3971) {
			this.anIntArray411 = new int[this.anInt3971];
		}
		@Pc(40) boolean local40 = arg0.method26919() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method26923(5) + 1;
			while (local44 < this.anInt3971) {
				@Pc(63) int local63 = arg0.method26923(Class690.method36319(this.anInt3971 - local44));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray411[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method26919() != 0;
			for (local50 = 0; local50 < this.anInt3971; local50++) {
				if (local86 && arg0.method26919() == 0) {
					this.anIntArray411[local50] = 0;
				} else {
					this.anIntArray411[local50] = arg0.method26923(5) + 1;
				}
			}
		}
		this.method26735();
		local44 = arg0.method26923(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method26906(arg0.method26923(32));
			@Pc(134) float local134 = arg0.method26906(arg0.method26923(32));
			local65 = arg0.method26923(4) + 1;
			@Pc(147) boolean local147 = arg0.method26919() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method26731(this.anInt3971, this.anInt3970);
			} else {
				local156 = this.anInt3971 * this.anInt3970;
			}
			this.anIntArray412 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray412[local169] = arg0.method26923(local65);
			}
			this.aFloatArrayArray23 = new float[this.anInt3971][this.anInt3970];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt3971; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt3970; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray412[local213] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt3971; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt3970;
					for (local203 = 0; local203 < this.anInt3970; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray412[local201] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt3973 = arg0.method26913() - local2;
		this.anInt3972 = arg0.method26912() - local5;
	}

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "()V", line = 118)
	void method26735() {
		@Pc(3) int[] local3 = new int[this.anInt3971];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt3971; local8++) {
			local17 = this.anIntArray411[local8];
			if (local17 != 0) {
				local26 = 0x1 << 32 - local17;
				local30 = local6[local17];
				local3[local8] = local30;
				@Pc(60) int local60;
				if ((local30 & local26) == 0) {
					local44 = local30 | local26;
					for (local53 = local17 - 1; local53 >= 1; local53--) {
						local60 = local6[local53];
						if (local60 != local30) {
							break;
						}
						local69 = 0x1 << 32 - local53;
						if ((local60 & local69) != 0) {
							local6[local53] = local6[local53 - 1];
							break;
						}
						local6[local53] = local60 | local69;
					}
				} else {
					local44 = local6[local17 - 1];
				}
				local6[local17] = local44;
				for (local53 = local17 + 1; local53 <= 32; local53++) {
					local60 = local6[local53];
					if (local60 == local30) {
						local6[local53] = local44;
					}
				}
			}
		}
		this.anIntArray410 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt3971; local8++) {
			local17 = this.anIntArray411[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray410[local30] == 0) {
							this.anIntArray410[local30] = local122;
						}
						local30 = this.anIntArray410[local30];
					}
					if (local30 >= this.anIntArray410.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray410.length * 2];
						for (local69 = 0; local69 < this.anIntArray410.length; local69++) {
							local184[local69] = this.anIntArray410[local69];
						}
						this.anIntArray410 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray410[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "()V", line = 118)
	void method26736() {
		@Pc(3) int[] local3 = new int[this.anInt3971];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt3971; local8++) {
			local17 = this.anIntArray411[local8];
			if (local17 != 0) {
				local26 = 0x1 << 32 - local17;
				local30 = local6[local17];
				local3[local8] = local30;
				@Pc(60) int local60;
				if ((local30 & local26) == 0) {
					local44 = local30 | local26;
					for (local53 = local17 - 1; local53 >= 1; local53--) {
						local60 = local6[local53];
						if (local60 != local30) {
							break;
						}
						local69 = 0x1 << 32 - local53;
						if ((local60 & local69) != 0) {
							local6[local53] = local6[local53 - 1];
							break;
						}
						local6[local53] = local60 | local69;
					}
				} else {
					local44 = local6[local17 - 1];
				}
				local6[local17] = local44;
				for (local53 = local17 + 1; local53 <= 32; local53++) {
					local60 = local6[local53];
					if (local60 == local30) {
						local6[local53] = local44;
					}
				}
			}
		}
		this.anIntArray410 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt3971; local8++) {
			local17 = this.anIntArray411[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray410[local30] == 0) {
							this.anIntArray410[local30] = local122;
						}
						local30 = this.anIntArray410[local30];
					}
					if (local30 >= this.anIntArray410.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray410.length * 2];
						for (local69 = 0; local69 < this.anIntArray410.length; local69++) {
							local184[local69] = this.anIntArray410[local69];
						}
						this.anIntArray410 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray410[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "r", descriptor = "()V", line = 118)
	void method26737() {
		@Pc(3) int[] local3 = new int[this.anInt3971];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt3971; local8++) {
			local17 = this.anIntArray411[local8];
			if (local17 != 0) {
				local26 = 0x1 << 32 - local17;
				local30 = local6[local17];
				local3[local8] = local30;
				@Pc(60) int local60;
				if ((local30 & local26) == 0) {
					local44 = local30 | local26;
					for (local53 = local17 - 1; local53 >= 1; local53--) {
						local60 = local6[local53];
						if (local60 != local30) {
							break;
						}
						local69 = 0x1 << 32 - local53;
						if ((local60 & local69) != 0) {
							local6[local53] = local6[local53 - 1];
							break;
						}
						local6[local53] = local60 | local69;
					}
				} else {
					local44 = local6[local17 - 1];
				}
				local6[local17] = local44;
				for (local53 = local17 + 1; local53 <= 32; local53++) {
					local60 = local6[local53];
					if (local60 == local30) {
						local6[local53] = local44;
					}
				}
			}
		}
		this.anIntArray410 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt3971; local8++) {
			local17 = this.anIntArray411[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray410[local30] == 0) {
							this.anIntArray410[local30] = local122;
						}
						local30 = this.anIntArray410[local30];
					}
					if (local30 >= this.anIntArray410.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray410.length * 2];
						for (local69 = 0; local69 < this.anIntArray410.length; local69++) {
							local184[local69] = this.anIntArray410[local69];
						}
						this.anIntArray410 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray410[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "()V", line = 118)
	void method26738() {
		@Pc(3) int[] local3 = new int[this.anInt3971];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt3971; local8++) {
			local17 = this.anIntArray411[local8];
			if (local17 != 0) {
				local26 = 0x1 << 32 - local17;
				local30 = local6[local17];
				local3[local8] = local30;
				@Pc(60) int local60;
				if ((local30 & local26) == 0) {
					local44 = local30 | local26;
					for (local53 = local17 - 1; local53 >= 1; local53--) {
						local60 = local6[local53];
						if (local60 != local30) {
							break;
						}
						local69 = 0x1 << 32 - local53;
						if ((local60 & local69) != 0) {
							local6[local53] = local6[local53 - 1];
							break;
						}
						local6[local53] = local60 | local69;
					}
				} else {
					local44 = local6[local17 - 1];
				}
				local6[local17] = local44;
				for (local53 = local17 + 1; local53 <= 32; local53++) {
					local60 = local6[local53];
					if (local60 == local30) {
						local6[local53] = local44;
					}
				}
			}
		}
		this.anIntArray410 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt3971; local8++) {
			local17 = this.anIntArray411[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray410[local30] == 0) {
							this.anIntArray410[local30] = local122;
						}
						local30 = this.anIntArray410[local30];
					}
					if (local30 >= this.anIntArray410.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray410.length * 2];
						for (local69 = 0; local69 < this.anIntArray410.length; local69++) {
							local184[local69] = this.anIntArray410[local69];
						}
						this.anIntArray410 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray410[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "y", descriptor = "(Lclient!gx;)I", line = 184)
	int method26739(@OriginalArg(0) Class288 arg0) {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray410[local1] >= 0; local1 = arg0.method26919() == 0 ? local1 + 1 : this.anIntArray410[local1]) {
		}
		return ~this.anIntArray410[local1];
	}

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "(Lclient!gx;)I", line = 184)
	int method26740(@OriginalArg(0) Class288 arg0) {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray410[local1] >= 0; local1 = arg0.method26919() == 0 ? local1 + 1 : this.anIntArray410[local1]) {
		}
		return ~this.anIntArray410[local1];
	}

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "(Lclient!gx;)[F", line = 190)
	float[] method26741(@OriginalArg(0) Class288 arg0) {
		return this.aFloatArrayArray23[this.method26739(arg0)];
	}

	@OriginalMember(owner = "client!gv", name = "z", descriptor = "(Lclient!gx;)[F", line = 190)
	float[] method26742(@OriginalArg(0) Class288 arg0) {
		return this.aFloatArrayArray23[this.method26739(arg0)];
	}

	@OriginalMember(owner = "client!gv", name = "w", descriptor = "(Lclient!gx;)[F", line = 190)
	float[] method26743(@OriginalArg(0) Class288 arg0) {
		return this.aFloatArrayArray23[this.method26739(arg0)];
	}

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "(Lclient!gx;)[F", line = 190)
	float[] method26744(@OriginalArg(0) Class288 arg0) {
		return this.aFloatArrayArray23[this.method26739(arg0)];
	}
}
