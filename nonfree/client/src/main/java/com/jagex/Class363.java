package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public class Class363 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	static final int anInt4514 = 128;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
	static final int anInt4519 = 7;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "[B")
	byte[] aByteArray82;

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "[I")
	int[] anIntArray447;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "Z")
	boolean aBoolean723 = true;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
	int anInt4517 = -1;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_37;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Lclient!kd;")
	final Class359 aClass359_2;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
	final int anInt4515;

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
	final int anInt4516;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
	int anInt4521;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	int anInt4520;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "Lclient!lc;")
	Interface38 anInterface38_7;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
	final int anInt4518;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "Lclient!ks;")
	Interface37 anInterface37_25;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!aed;Lclient!kd;Lclient!aek;IIIII)V", line = 25)
	Class363(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_Sub1_37 = arg0;
		this.aClass359_2 = arg1;
		this.anInt4515 = arg6;
		this.anInt4516 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(49) int local49;
		@Pc(51) int local51;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local49 = (local33 + local35) * arg2.anInt607 * -1924295585 + local29;
			for (local51 = 0; local51 < local23; local51++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray2[local49++];
				if (local60 != null) {
					local25 += local60.length;
				}
			}
		}
		if (local25 > 0) {
			this.anInt4521 = Integer.MIN_VALUE;
			this.anInt4520 = Integer.MAX_VALUE;
			this.anInterface38_7 = this.aClass86_Sub1_37.method20772(false);
			this.anInterface38_7.method28728(local25);
			@Pc(93) ByteBuffer local93 = this.aClass86_Sub1_37.aByteBuffer7;
			local93.clear();
			for (local49 = 0; local49 < local23; local49++) {
				local51 = (local33 + local49) * arg2.anInt607 * -1924295585 + local29;
				for (@Pc(114) int local114 = 0; local114 < local23; local114++) {
					@Pc(123) short[] local123 = arg2.aShortArrayArray2[local51++];
					if (local123 != null) {
						for (@Pc(127) int local127 = 0; local127 < local123.length; local127++) {
							@Pc(137) int local137 = local123[local127] & 0xFFFF;
							if (local137 < this.anInt4520) {
								this.anInt4520 = local137;
							}
							if (local137 > this.anInt4521) {
								this.anInt4521 = local137;
							}
							local93.putShort((short) local137);
						}
					}
				}
			}
			this.anInterface38_7.method28755(0, local93.position(), this.aClass86_Sub1_37.aLong121);
			this.anInt4518 = local25 / 3;
		} else {
			this.anInt4518 = 0;
			this.anInterface37_25 = null;
		}
	}

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "(Lclient!jo;)V", line = 72)
	void method28119(@OriginalArg(0) Class109 arg0) {
		this.method28122(arg0, this.anInterface38_7, 0, this.anInt4518);
	}

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "(Lclient!jo;)V", line = 72)
	void method28120(@OriginalArg(0) Class109 arg0) {
		this.method28122(arg0, this.anInterface38_7, 0, this.anInt4518);
	}

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "(Lclient!jo;)V", line = 72)
	void method28121(@OriginalArg(0) Class109 arg0) {
		this.method28122(arg0, this.anInterface38_7, 0, this.anInt4518);
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(Lclient!jo;Lclient!lc;II)V", line = 76)
	void method28122(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Interface38 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28126();
		this.aClass86_Sub1_37.method20659(arg1);
		arg0.anInterface37_18 = this.anInterface37_25;
		arg0.anInt1089 = this.anInt4520;
		arg0.anInt1087 = this.anInt4521 - this.anInt4520 + 1;
		arg0.anInt1090 = arg2;
		arg0.anInt1091 = arg3;
		arg0.method9117(false);
	}

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "(Lclient!jo;Lclient!lc;II)V", line = 76)
	void method28123(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Interface38 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28126();
		this.aClass86_Sub1_37.method20659(arg1);
		arg0.anInterface37_18 = this.anInterface37_25;
		arg0.anInt1089 = this.anInt4520;
		arg0.anInt1087 = this.anInt4521 - this.anInt4520 + 1;
		arg0.anInt1090 = arg2;
		arg0.anInt1091 = arg3;
		arg0.method9117(false);
	}

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "(Lclient!jo;Lclient!lc;II)V", line = 76)
	void method28124(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Interface38 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28126();
		this.aClass86_Sub1_37.method20659(arg1);
		arg0.anInterface37_18 = this.anInterface37_25;
		arg0.anInt1089 = this.anInt4520;
		arg0.anInt1087 = this.anInt4521 - this.anInt4520 + 1;
		arg0.anInt1090 = arg2;
		arg0.anInt1091 = arg3;
		arg0.method9117(false);
	}

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "(Lclient!jo;Lclient!lc;II)V", line = 76)
	void method28125(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Interface38 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28126();
		this.aClass86_Sub1_37.method20659(arg1);
		arg0.anInterface37_18 = this.anInterface37_25;
		arg0.anInt1089 = this.anInt4520;
		arg0.anInt1087 = this.anInt4521 - this.anInt4520 + 1;
		arg0.anInt1090 = arg2;
		arg0.anInt1091 = arg3;
		arg0.method9117(false);
	}

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "()V", line = 89)
	void method28126() {
		if (!this.aBoolean723) {
			return;
		}
		this.aBoolean723 = false;
		@Pc(10) byte[] local10 = this.aClass359_2.aByteArray81;
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.aClass359_2.anInt4500;
		@Pc(26) int local26 = this.anInt4515 + this.anInt4516 * this.aClass359_2.anInt4500;
		@Pc(28) int local28;
		for (local28 = -128; local28 < 0; local28++) {
			local12 = (local12 << 8) - local12;
			for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
				if (local10[local26++] != 0) {
					local12++;
				}
			}
			local26 += local16 - 128;
		}
		if (this.anInterface37_25 != null && this.anInt4517 == local12) {
			this.aBoolean723 = false;
			return;
		}
		this.anInt4517 = local12;
		local28 = 0;
		local26 = this.anInt4515 + this.anInt4516 * local16;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(116) int local116;
		if (!this.aClass86_Sub1_37.method20676(Class212.aClass212_17, Class206.aClass206_23)) {
			if (this.anIntArray447 == null) {
				this.anIntArray447 = new int[16384];
			}
			@Pc(208) int[] local208 = this.anIntArray447;
			for (local98 = -128; local98 < 0; local98++) {
				for (local102 = -128; local102 < 0; local102++) {
					if (local10[local26] == 0) {
						local116 = 0;
						if (local10[local26 - 1] != 0) {
							local116++;
						}
						if (local10[local26 + 1] != 0) {
							local116++;
						}
						if (local10[local26 - local16] != 0) {
							local116++;
						}
						if (local10[local26 + local16] != 0) {
							local116++;
						}
						local208[local28++] = local116 * 17 << 24;
					} else {
						local208[local28++] = 1140850688;
					}
					local26++;
				}
				local26 += this.aClass359_2.anInt4500 - 128;
			}
			if (this.anInterface37_25 == null) {
				this.anInterface37_25 = this.aClass86_Sub1_37.method20530(128, 128, false, this.anIntArray447);
				this.anInterface37_25.method10618(false, false);
			} else {
				this.anInterface37_25.method10630(0, 0, 128, 128, this.anIntArray447, 0, 128);
			}
			return;
		}
		if (this.aByteArray82 == null) {
			this.aByteArray82 = new byte[16384];
		}
		@Pc(96) byte[] local96 = this.aByteArray82;
		for (local98 = -128; local98 < 0; local98++) {
			for (local102 = -128; local102 < 0; local102++) {
				if (local10[local26] == 0) {
					local116 = 0;
					if (local10[local26 - 1] != 0) {
						local116++;
					}
					if (local10[local26 + 1] != 0) {
						local116++;
					}
					if (local10[local26 - local16] != 0) {
						local116++;
					}
					if (local10[local26 + local16] != 0) {
						local116++;
					}
					local96[local28++] = (byte) (local116 * 17);
				} else {
					local96[local28++] = 68;
				}
				local26++;
			}
			local26 += this.aClass359_2.anInt4500 - 128;
		}
		if (this.anInterface37_25 == null) {
			this.anInterface37_25 = this.aClass86_Sub1_37.method20533(Class212.aClass212_17, 128, 128, false, this.aByteArray82);
			this.anInterface37_25.method10618(false, false);
		} else {
			this.anInterface37_25.method10605(0, 0, 128, 128, this.aByteArray82, Class212.aClass212_17, 0, 128);
		}
	}

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "()V", line = 89)
	void method28127() {
		if (!this.aBoolean723) {
			return;
		}
		this.aBoolean723 = false;
		@Pc(10) byte[] local10 = this.aClass359_2.aByteArray81;
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.aClass359_2.anInt4500;
		@Pc(26) int local26 = this.anInt4515 + this.anInt4516 * this.aClass359_2.anInt4500;
		@Pc(28) int local28;
		for (local28 = -128; local28 < 0; local28++) {
			local12 = (local12 << 8) - local12;
			for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
				if (local10[local26++] != 0) {
					local12++;
				}
			}
			local26 += local16 - 128;
		}
		if (this.anInterface37_25 != null && this.anInt4517 == local12) {
			this.aBoolean723 = false;
			return;
		}
		this.anInt4517 = local12;
		local28 = 0;
		local26 = this.anInt4515 + this.anInt4516 * local16;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(116) int local116;
		if (!this.aClass86_Sub1_37.method20676(Class212.aClass212_17, Class206.aClass206_23)) {
			if (this.anIntArray447 == null) {
				this.anIntArray447 = new int[16384];
			}
			@Pc(208) int[] local208 = this.anIntArray447;
			for (local98 = -128; local98 < 0; local98++) {
				for (local102 = -128; local102 < 0; local102++) {
					if (local10[local26] == 0) {
						local116 = 0;
						if (local10[local26 - 1] != 0) {
							local116++;
						}
						if (local10[local26 + 1] != 0) {
							local116++;
						}
						if (local10[local26 - local16] != 0) {
							local116++;
						}
						if (local10[local26 + local16] != 0) {
							local116++;
						}
						local208[local28++] = local116 * 17 << 24;
					} else {
						local208[local28++] = 1140850688;
					}
					local26++;
				}
				local26 += this.aClass359_2.anInt4500 - 128;
			}
			if (this.anInterface37_25 == null) {
				this.anInterface37_25 = this.aClass86_Sub1_37.method20530(128, 128, false, this.anIntArray447);
				this.anInterface37_25.method10618(false, false);
			} else {
				this.anInterface37_25.method10630(0, 0, 128, 128, this.anIntArray447, 0, 128);
			}
			return;
		}
		if (this.aByteArray82 == null) {
			this.aByteArray82 = new byte[16384];
		}
		@Pc(96) byte[] local96 = this.aByteArray82;
		for (local98 = -128; local98 < 0; local98++) {
			for (local102 = -128; local102 < 0; local102++) {
				if (local10[local26] == 0) {
					local116 = 0;
					if (local10[local26 - 1] != 0) {
						local116++;
					}
					if (local10[local26 + 1] != 0) {
						local116++;
					}
					if (local10[local26 - local16] != 0) {
						local116++;
					}
					if (local10[local26 + local16] != 0) {
						local116++;
					}
					local96[local28++] = (byte) (local116 * 17);
				} else {
					local96[local28++] = 68;
				}
				local26++;
			}
			local26 += this.aClass359_2.anInt4500 - 128;
		}
		if (this.anInterface37_25 == null) {
			this.anInterface37_25 = this.aClass86_Sub1_37.method20533(Class212.aClass212_17, 128, 128, false, this.aByteArray82);
			this.anInterface37_25.method10618(false, false);
		} else {
			this.anInterface37_25.method10605(0, 0, 128, 128, this.aByteArray82, Class212.aClass212_17, 0, 128);
		}
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "()V", line = 89)
	void method28128() {
		if (!this.aBoolean723) {
			return;
		}
		this.aBoolean723 = false;
		@Pc(10) byte[] local10 = this.aClass359_2.aByteArray81;
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.aClass359_2.anInt4500;
		@Pc(26) int local26 = this.anInt4515 + this.anInt4516 * this.aClass359_2.anInt4500;
		@Pc(28) int local28;
		for (local28 = -128; local28 < 0; local28++) {
			local12 = (local12 << 8) - local12;
			for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
				if (local10[local26++] != 0) {
					local12++;
				}
			}
			local26 += local16 - 128;
		}
		if (this.anInterface37_25 != null && this.anInt4517 == local12) {
			this.aBoolean723 = false;
			return;
		}
		this.anInt4517 = local12;
		local28 = 0;
		local26 = this.anInt4515 + this.anInt4516 * local16;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(116) int local116;
		if (!this.aClass86_Sub1_37.method20676(Class212.aClass212_17, Class206.aClass206_23)) {
			if (this.anIntArray447 == null) {
				this.anIntArray447 = new int[16384];
			}
			@Pc(208) int[] local208 = this.anIntArray447;
			for (local98 = -128; local98 < 0; local98++) {
				for (local102 = -128; local102 < 0; local102++) {
					if (local10[local26] == 0) {
						local116 = 0;
						if (local10[local26 - 1] != 0) {
							local116++;
						}
						if (local10[local26 + 1] != 0) {
							local116++;
						}
						if (local10[local26 - local16] != 0) {
							local116++;
						}
						if (local10[local26 + local16] != 0) {
							local116++;
						}
						local208[local28++] = local116 * 17 << 24;
					} else {
						local208[local28++] = 1140850688;
					}
					local26++;
				}
				local26 += this.aClass359_2.anInt4500 - 128;
			}
			if (this.anInterface37_25 == null) {
				this.anInterface37_25 = this.aClass86_Sub1_37.method20530(128, 128, false, this.anIntArray447);
				this.anInterface37_25.method10618(false, false);
			} else {
				this.anInterface37_25.method10630(0, 0, 128, 128, this.anIntArray447, 0, 128);
			}
			return;
		}
		if (this.aByteArray82 == null) {
			this.aByteArray82 = new byte[16384];
		}
		@Pc(96) byte[] local96 = this.aByteArray82;
		for (local98 = -128; local98 < 0; local98++) {
			for (local102 = -128; local102 < 0; local102++) {
				if (local10[local26] == 0) {
					local116 = 0;
					if (local10[local26 - 1] != 0) {
						local116++;
					}
					if (local10[local26 + 1] != 0) {
						local116++;
					}
					if (local10[local26 - local16] != 0) {
						local116++;
					}
					if (local10[local26 + local16] != 0) {
						local116++;
					}
					local96[local28++] = (byte) (local116 * 17);
				} else {
					local96[local28++] = 68;
				}
				local26++;
			}
			local26 += this.aClass359_2.anInt4500 - 128;
		}
		if (this.anInterface37_25 == null) {
			this.anInterface37_25 = this.aClass86_Sub1_37.method20533(Class212.aClass212_17, 128, 128, false, this.aByteArray82);
			this.anInterface37_25.method10618(false, false);
		} else {
			this.anInterface37_25.method10605(0, 0, 128, 128, this.aByteArray82, Class212.aClass212_17, 0, 128);
		}
	}
}
