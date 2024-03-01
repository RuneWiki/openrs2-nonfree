package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afb")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!afb", name = "z", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!afb", name = "y", descriptor = "Lclient!bc;")
	Class88 aClass88_11;

	@OriginalMember(owner = "client!afb", name = "j", descriptor = "Lclient!jaclib/memory/Stream;")
	Stream aStream1;

	@OriginalMember(owner = "client!afb", name = "h", descriptor = "Lclient!abh;")
	final Class17_Sub1 aClass17_Sub1_1;

	@OriginalMember(owner = "client!afb", name = "l", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_27;

	@OriginalMember(owner = "client!afb", name = "x", descriptor = "I")
	final int anInt1131;

	@OriginalMember(owner = "client!afb", name = "s", descriptor = "F")
	final float aFloat141;

	@OriginalMember(owner = "client!afb", name = "u", descriptor = "Lclient!dz;")
	final Class139 aClass139_3;

	@OriginalMember(owner = "client!afb", name = "c", descriptor = "[I")
	int[] anIntArray168;

	@OriginalMember(owner = "client!afb", name = "b", descriptor = "Lclient!aau;")
	Class9_Sub2 aClass9_Sub2_1;

	@OriginalMember(owner = "client!afb", name = "<init>", descriptor = "(Lclient!abh;IILclient!dz;)V", line = 25)
	Class3_Sub2(@OriginalArg(0) Class17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class139 arg3) {
		this.aClass17_Sub1_1 = arg0;
		this.aClass21_Sub2_27 = this.aClass17_Sub1_1.aClass21_Sub2_24;
		this.anInt1131 = arg1;
		this.aFloat141 = arg2;
		this.aClass139_3 = arg3;
		this.anIntArray168 = new int[this.aClass17_Sub1_1.anInt339 * -1007974723 * this.aClass17_Sub1_1.anInt337 * -207323189];
		this.aClass9_Sub2_1 = new Class9_Sub2(this.aClass21_Sub2_27, 5123, null, 1);
	}

	@OriginalMember(owner = "client!afb", name = "p", descriptor = "(I)V", line = 36)
	void method9947(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass21_Sub2_27.aNativeHeap1.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!afb", name = "u", descriptor = "(I)V", line = 36)
	void method9954(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass21_Sub2_27.aNativeHeap1.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!afb", name = "s", descriptor = "(I)V", line = 36)
	void method9956(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass21_Sub2_27.aNativeHeap1.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!afb", name = "b", descriptor = "(I)V", line = 41)
	void method9946(@OriginalArg(0) int arg0) {
		this.aStream1.g(arg0 * 4 + 3);
		this.aStream1.l(-1);
	}

	@OriginalMember(owner = "client!afb", name = "a", descriptor = "(I)V", line = 41)
	void method9953(@OriginalArg(0) int arg0) {
		this.aStream1.g(arg0 * 4 + 3);
		this.aStream1.l(-1);
	}

	@OriginalMember(owner = "client!afb", name = "y", descriptor = "(I)V", line = 41)
	void method9955(@OriginalArg(0) int arg0) {
		this.aStream1.g(arg0 * 4 + 3);
		this.aStream1.l(-1);
	}

	@OriginalMember(owner = "client!afb", name = "c", descriptor = "(I)V", line = 41)
	void method9957(@OriginalArg(0) int arg0) {
		this.aStream1.g(arg0 * 4 + 3);
		this.aStream1.l(-1);
	}

	@OriginalMember(owner = "client!afb", name = "g", descriptor = "(III)V", line = 46)
	void method9949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray168[arg1 * this.aClass17_Sub1_1.anInt339 * -1007974723 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!afb", name = "j", descriptor = "(III)V", line = 46)
	void method9958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray168[arg1 * this.aClass17_Sub1_1.anInt339 * -1007974723 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!afb", name = "z", descriptor = "(III)V", line = 46)
	void method9965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray168[arg1 * this.aClass17_Sub1_1.anInt339 * -1007974723 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!afb", name = "l", descriptor = "(IIIF)V", line = 50)
	void method9950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1131 != -1) {
			@Pc(11) Class133 local11 = this.aClass21_Sub2_27.aClass134_7.method22906(this.anInt1131);
			local16 = local11.aByte120 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte118 != 4) {
				if (arg2 < 0) {
					local26 = 0;
				} else if (arg2 > 127) {
					local26 = 16777215;
				} else {
					local26 = arg2 * 131586;
				}
				if (local16 == 256) {
					arg1 = local26;
				} else {
					local49 = 256 - local16;
					arg1 = ((local26 & 0xFF00FF) * local16 + (arg1 & 0xFF00FF) * local49 & 0xFF00FF00) + ((local26 & 0xFF00) * local16 + (arg1 & 0xFF00) * local49 & 0xFF0000) >> 8;
				}
			}
			local26 = local11.aByte121 & 0xFF;
			if (local26 != 0) {
				local26 += 256;
				@Pc(95) int local95 = (arg1 >> 16 & 0xFF) * local26;
				if (local95 > 65535) {
					local95 = 65535;
				}
				local49 = (arg1 >> 8 & 0xFF) * local26;
				if (local49 > 65535) {
					local49 = 65535;
				}
				@Pc(119) int local119 = (arg1 & 0xFF) * local26;
				if (local119 > 65535) {
					local119 = 65535;
				}
				arg1 = ((local95 & 0xFF00) << 8) + (local49 & 0xFF00) + (local119 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(148) int local148 = arg1 >> 16 & 0xFF;
			local16 = arg1 >> 8 & 0xFF;
			local26 = arg1 & 0xFF;
			local148 = (int) ((float) local148 * arg3);
			if (local148 < 0) {
				local148 = 0;
			} else if (local148 > 255) {
				local148 = 255;
			}
			local16 = (int) ((float) local16 * arg3);
			if (local16 < 0) {
				local16 = 0;
			} else if (local16 > 255) {
				local16 = 255;
			}
			local26 = (int) ((float) local26 * arg3);
			if (local26 < 0) {
				local26 = 0;
			} else if (local26 > 255) {
				local26 = 255;
			}
			arg1 = local148 << 16 | local16 << 8 | local26;
		}
		this.aStream1.g(arg0 * 4);
		this.aStream1.l((byte) (arg1 >> 16));
		this.aStream1.l((byte) (arg1 >> 8));
		this.aStream1.l((byte) arg1);
	}

	@OriginalMember(owner = "client!afb", name = "n", descriptor = "(IIIF)V", line = 50)
	void method9959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1131 != -1) {
			@Pc(11) Class133 local11 = this.aClass21_Sub2_27.aClass134_7.method22906(this.anInt1131);
			local16 = local11.aByte120 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte118 != 4) {
				if (arg2 < 0) {
					local26 = 0;
				} else if (arg2 > 127) {
					local26 = 16777215;
				} else {
					local26 = arg2 * 131586;
				}
				if (local16 == 256) {
					arg1 = local26;
				} else {
					local49 = 256 - local16;
					arg1 = ((local26 & 0xFF00FF) * local16 + (arg1 & 0xFF00FF) * local49 & 0xFF00FF00) + ((local26 & 0xFF00) * local16 + (arg1 & 0xFF00) * local49 & 0xFF0000) >> 8;
				}
			}
			local26 = local11.aByte121 & 0xFF;
			if (local26 != 0) {
				local26 += 256;
				@Pc(95) int local95 = (arg1 >> 16 & 0xFF) * local26;
				if (local95 > 65535) {
					local95 = 65535;
				}
				local49 = (arg1 >> 8 & 0xFF) * local26;
				if (local49 > 65535) {
					local49 = 65535;
				}
				@Pc(119) int local119 = (arg1 & 0xFF) * local26;
				if (local119 > 65535) {
					local119 = 65535;
				}
				arg1 = ((local95 & 0xFF00) << 8) + (local49 & 0xFF00) + (local119 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(148) int local148 = arg1 >> 16 & 0xFF;
			local16 = arg1 >> 8 & 0xFF;
			local26 = arg1 & 0xFF;
			local148 = (int) ((float) local148 * arg3);
			if (local148 < 0) {
				local148 = 0;
			} else if (local148 > 255) {
				local148 = 255;
			}
			local16 = (int) ((float) local16 * arg3);
			if (local16 < 0) {
				local16 = 0;
			} else if (local16 > 255) {
				local16 = 255;
			}
			local26 = (int) ((float) local26 * arg3);
			if (local26 < 0) {
				local26 = 0;
			} else if (local26 > 255) {
				local26 = 255;
			}
			arg1 = local148 << 16 | local16 << 8 | local26;
		}
		this.aStream1.g(arg0 * 4);
		this.aStream1.l((byte) (arg1 >> 16));
		this.aStream1.l((byte) (arg1 >> 8));
		this.aStream1.l((byte) arg1);
	}

	@OriginalMember(owner = "client!afb", name = "h", descriptor = "(I)V", line = 99)
	void method9951(@OriginalArg(0) int arg0) {
		this.aStream1.s();
		@Pc(13) Interface5 local13 = this.aClass21_Sub2_27.method4062(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class8_Sub2) {
			this.aNativeHeapBuffer4.n();
		}
		this.aClass88_11 = new Class88(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!afb", name = "i", descriptor = "(I)V", line = 99)
	void method9960(@OriginalArg(0) int arg0) {
		this.aStream1.s();
		@Pc(13) Interface5 local13 = this.aClass21_Sub2_27.method4062(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class8_Sub2) {
			this.aNativeHeapBuffer4.n();
		}
		this.aClass88_11 = new Class88(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!afb", name = "f", descriptor = "(I)V", line = 99)
	void method9961(@OriginalArg(0) int arg0) {
		this.aStream1.s();
		@Pc(13) Interface5 local13 = this.aClass21_Sub2_27.method4062(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class8_Sub2) {
			this.aNativeHeapBuffer4.n();
		}
		this.aClass88_11 = new Class88(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!afb", name = "af", descriptor = "([II)V", line = 110)
	void method9948(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class3_Sub41_Sub2 local5 = this.aClass21_Sub2_27.aClass3_Sub41_Sub2_1;
		local5.anInt2803 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass21_Sub2_27.aBoolean63) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass17_Sub1_1.aShortArrayArray1[local21];
				local32 = this.anIntArray168[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass17_Sub1_1.aShortArrayArray1[local21];
				local32 = this.anIntArray168[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass9_Sub2_1.method1122(local5.aByteArray51, local5.anInt2803 * 62066237);
		this.aClass21_Sub2_27.method4064(this.aClass17_Sub1_1.aClass88_3, this.aClass17_Sub1_1.aClass88_2, this.aClass88_11, this.aClass17_Sub1_1.aClass88_4);
		this.aClass21_Sub2_27.method4072(this.anInt1131, (this.aClass17_Sub1_1.anInt205 & 0x7) != 0, (this.aClass17_Sub1_1.anInt205 & 0x8) != 0);
		if (this.aClass21_Sub2_27.aBoolean73) {
			this.aClass21_Sub2_27.method17101(Integer.MAX_VALUE, this.aClass139_3);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat141, 1.0F / this.aFloat141, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_27.method4064(this.aClass17_Sub1_1.aClass88_3, this.aClass17_Sub1_1.aClass88_2, this.aClass88_11, this.aClass17_Sub1_1.aClass88_4);
		this.aClass21_Sub2_27.method4066(this.aClass9_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!afb", name = "x", descriptor = "([II)V", line = 110)
	void method9952(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class3_Sub41_Sub2 local5 = this.aClass21_Sub2_27.aClass3_Sub41_Sub2_1;
		local5.anInt2803 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass21_Sub2_27.aBoolean63) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass17_Sub1_1.aShortArrayArray1[local21];
				local32 = this.anIntArray168[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass17_Sub1_1.aShortArrayArray1[local21];
				local32 = this.anIntArray168[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass9_Sub2_1.method1122(local5.aByteArray51, local5.anInt2803 * 62066237);
		this.aClass21_Sub2_27.method4064(this.aClass17_Sub1_1.aClass88_3, this.aClass17_Sub1_1.aClass88_2, this.aClass88_11, this.aClass17_Sub1_1.aClass88_4);
		this.aClass21_Sub2_27.method4072(this.anInt1131, (this.aClass17_Sub1_1.anInt205 & 0x7) != 0, (this.aClass17_Sub1_1.anInt205 & 0x8) != 0);
		if (this.aClass21_Sub2_27.aBoolean73) {
			this.aClass21_Sub2_27.method17101(Integer.MAX_VALUE, this.aClass139_3);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat141, 1.0F / this.aFloat141, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_27.method4064(this.aClass17_Sub1_1.aClass88_3, this.aClass17_Sub1_1.aClass88_2, this.aClass88_11, this.aClass17_Sub1_1.aClass88_4);
		this.aClass21_Sub2_27.method4066(this.aClass9_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!afb", name = "k", descriptor = "([II)V", line = 110)
	void method9962(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class3_Sub41_Sub2 local5 = this.aClass21_Sub2_27.aClass3_Sub41_Sub2_1;
		local5.anInt2803 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass21_Sub2_27.aBoolean63) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass17_Sub1_1.aShortArrayArray1[local21];
				local32 = this.anIntArray168[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass17_Sub1_1.aShortArrayArray1[local21];
				local32 = this.anIntArray168[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass9_Sub2_1.method1122(local5.aByteArray51, local5.anInt2803 * 62066237);
		this.aClass21_Sub2_27.method4064(this.aClass17_Sub1_1.aClass88_3, this.aClass17_Sub1_1.aClass88_2, this.aClass88_11, this.aClass17_Sub1_1.aClass88_4);
		this.aClass21_Sub2_27.method4072(this.anInt1131, (this.aClass17_Sub1_1.anInt205 & 0x7) != 0, (this.aClass17_Sub1_1.anInt205 & 0x8) != 0);
		if (this.aClass21_Sub2_27.aBoolean73) {
			this.aClass21_Sub2_27.method17101(Integer.MAX_VALUE, this.aClass139_3);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat141, 1.0F / this.aFloat141, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_27.method4064(this.aClass17_Sub1_1.aClass88_3, this.aClass17_Sub1_1.aClass88_2, this.aClass88_11, this.aClass17_Sub1_1.aClass88_4);
		this.aClass21_Sub2_27.method4066(this.aClass9_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!afb", name = "at", descriptor = "([II)V", line = 110)
	void method9963(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class3_Sub41_Sub2 local5 = this.aClass21_Sub2_27.aClass3_Sub41_Sub2_1;
		local5.anInt2803 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass21_Sub2_27.aBoolean63) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass17_Sub1_1.aShortArrayArray1[local21];
				local32 = this.anIntArray168[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass17_Sub1_1.aShortArrayArray1[local21];
				local32 = this.anIntArray168[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass9_Sub2_1.method1122(local5.aByteArray51, local5.anInt2803 * 62066237);
		this.aClass21_Sub2_27.method4064(this.aClass17_Sub1_1.aClass88_3, this.aClass17_Sub1_1.aClass88_2, this.aClass88_11, this.aClass17_Sub1_1.aClass88_4);
		this.aClass21_Sub2_27.method4072(this.anInt1131, (this.aClass17_Sub1_1.anInt205 & 0x7) != 0, (this.aClass17_Sub1_1.anInt205 & 0x8) != 0);
		if (this.aClass21_Sub2_27.aBoolean73) {
			this.aClass21_Sub2_27.method17101(Integer.MAX_VALUE, this.aClass139_3);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat141, 1.0F / this.aFloat141, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_27.method4064(this.aClass17_Sub1_1.aClass88_3, this.aClass17_Sub1_1.aClass88_2, this.aClass88_11, this.aClass17_Sub1_1.aClass88_4);
		this.aClass21_Sub2_27.method4066(this.aClass9_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!afb", name = "ak", descriptor = "([II)V", line = 110)
	void method9964(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class3_Sub41_Sub2 local5 = this.aClass21_Sub2_27.aClass3_Sub41_Sub2_1;
		local5.anInt2803 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass21_Sub2_27.aBoolean63) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass17_Sub1_1.aShortArrayArray1[local21];
				local32 = this.anIntArray168[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20251(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass17_Sub1_1.aShortArrayArray1[local21];
				local32 = this.anIntArray168[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
							local5.method20442(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass9_Sub2_1.method1122(local5.aByteArray51, local5.anInt2803 * 62066237);
		this.aClass21_Sub2_27.method4064(this.aClass17_Sub1_1.aClass88_3, this.aClass17_Sub1_1.aClass88_2, this.aClass88_11, this.aClass17_Sub1_1.aClass88_4);
		this.aClass21_Sub2_27.method4072(this.anInt1131, (this.aClass17_Sub1_1.anInt205 & 0x7) != 0, (this.aClass17_Sub1_1.anInt205 & 0x8) != 0);
		if (this.aClass21_Sub2_27.aBoolean73) {
			this.aClass21_Sub2_27.method17101(Integer.MAX_VALUE, this.aClass139_3);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat141, 1.0F / this.aFloat141, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_27.method4064(this.aClass17_Sub1_1.aClass88_3, this.aClass17_Sub1_1.aClass88_2, this.aClass88_11, this.aClass17_Sub1_1.aClass88_4);
		this.aClass21_Sub2_27.method4066(this.aClass9_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
