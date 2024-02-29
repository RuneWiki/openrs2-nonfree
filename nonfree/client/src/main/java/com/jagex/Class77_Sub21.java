package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aju")
public class Class77_Sub21 extends Class77 {

	@OriginalMember(owner = "client!aju", name = "x", descriptor = "Lclient!bk;")
	Class172 aClass172_13;

	@OriginalMember(owner = "client!aju", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!aju", name = "g", descriptor = "Lclient!jaclib/memory/Stream;")
	Stream aStream1;

	@OriginalMember(owner = "client!aju", name = "y", descriptor = "Lclient!aeg;")
	final Class88_Sub1 aClass88_Sub1_2;

	@OriginalMember(owner = "client!aju", name = "l", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_30;

	@OriginalMember(owner = "client!aju", name = "w", descriptor = "I")
	final int anInt1528;

	@OriginalMember(owner = "client!aju", name = "t", descriptor = "F")
	final float aFloat146;

	@OriginalMember(owner = "client!aju", name = "q", descriptor = "Lclient!db;")
	final Class202 aClass202_4;

	@OriginalMember(owner = "client!aju", name = "s", descriptor = "[I")
	int[] anIntArray198;

	@OriginalMember(owner = "client!aju", name = "d", descriptor = "Lclient!adh;")
	Class74_Sub2 aClass74_Sub2_1;

	@OriginalMember(owner = "client!aju", name = "<init>", descriptor = "(Lclient!aeg;IILclient!db;)V", line = 25)
	Class77_Sub21(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class202 arg3) {
		this.aClass88_Sub1_2 = arg0;
		this.aClass86_Sub3_30 = this.aClass88_Sub1_2.aClass86_Sub3_24;
		this.anInt1528 = arg1;
		this.aFloat146 = arg2;
		this.aClass202_4 = arg3;
		this.anIntArray198 = new int[this.aClass88_Sub1_2.anInt607 * -1924295585 * this.aClass88_Sub1_2.anInt606 * -1466328823];
		this.aClass74_Sub2_1 = new Class74_Sub2(this.aClass86_Sub3_30, 5123, null, 1);
	}

	@OriginalMember(owner = "client!aju", name = "p", descriptor = "(I)V", line = 36)
	void method13516(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass86_Sub3_30.aNativeHeap2.c(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!aju", name = "t", descriptor = "(I)V", line = 36)
	void method13517(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass86_Sub3_30.aNativeHeap2.c(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!aju", name = "q", descriptor = "(I)V", line = 36)
	void method13518(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass86_Sub3_30.aNativeHeap2.c(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!aju", name = "x", descriptor = "(I)V", line = 36)
	void method13519(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass86_Sub3_30.aNativeHeap2.c(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!aju", name = "d", descriptor = "(I)V", line = 41)
	void method13520(@OriginalArg(0) int arg0) {
		this.aStream1.v(arg0 * 4 + 3);
		this.aStream1.l(-1);
	}

	@OriginalMember(owner = "client!aju", name = "c", descriptor = "(I)V", line = 41)
	void method13521(@OriginalArg(0) int arg0) {
		this.aStream1.v(arg0 * 4 + 3);
		this.aStream1.l(-1);
	}

	@OriginalMember(owner = "client!aju", name = "s", descriptor = "(I)V", line = 41)
	void method13522(@OriginalArg(0) int arg0) {
		this.aStream1.v(arg0 * 4 + 3);
		this.aStream1.l(-1);
	}

	@OriginalMember(owner = "client!aju", name = "r", descriptor = "(III)V", line = 46)
	void method13523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray198[arg1 * this.aClass88_Sub1_2.anInt607 * -1924295585 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!aju", name = "g", descriptor = "(III)V", line = 46)
	void method13524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray198[arg1 * this.aClass88_Sub1_2.anInt607 * -1924295585 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!aju", name = "z", descriptor = "(III)V", line = 46)
	void method13525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray198[arg1 * this.aClass88_Sub1_2.anInt607 * -1924295585 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!aju", name = "v", descriptor = "(III)V", line = 46)
	void method13526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray198[arg1 * this.aClass88_Sub1_2.anInt607 * -1924295585 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!aju", name = "l", descriptor = "(IIIF)V", line = 50)
	void method13527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1528 != -1) {
			@Pc(11) Class215 local11 = this.aClass86_Sub3_30.aClass209_9.method25584(this.anInt1528);
			local16 = local11.aByte122 & 0xFF;
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
			local26 = local11.aByte117 & 0xFF;
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
		this.aStream1.v(arg0 * 4);
		this.aStream1.l((byte) (arg1 >> 16));
		this.aStream1.l((byte) (arg1 >> 8));
		this.aStream1.l((byte) arg1);
	}

	@OriginalMember(owner = "client!aju", name = "j", descriptor = "(IIIF)V", line = 50)
	void method13528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1528 != -1) {
			@Pc(11) Class215 local11 = this.aClass86_Sub3_30.aClass209_9.method25584(this.anInt1528);
			local16 = local11.aByte122 & 0xFF;
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
			local26 = local11.aByte117 & 0xFF;
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
		this.aStream1.v(arg0 * 4);
		this.aStream1.l((byte) (arg1 >> 16));
		this.aStream1.l((byte) (arg1 >> 8));
		this.aStream1.l((byte) arg1);
	}

	@OriginalMember(owner = "client!aju", name = "b", descriptor = "(IIIF)V", line = 50)
	void method13529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1528 != -1) {
			@Pc(11) Class215 local11 = this.aClass86_Sub3_30.aClass209_9.method25584(this.anInt1528);
			local16 = local11.aByte122 & 0xFF;
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
			local26 = local11.aByte117 & 0xFF;
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
		this.aStream1.v(arg0 * 4);
		this.aStream1.l((byte) (arg1 >> 16));
		this.aStream1.l((byte) (arg1 >> 8));
		this.aStream1.l((byte) arg1);
	}

	@OriginalMember(owner = "client!aju", name = "n", descriptor = "(IIIF)V", line = 50)
	void method13530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1528 != -1) {
			@Pc(11) Class215 local11 = this.aClass86_Sub3_30.aClass209_9.method25584(this.anInt1528);
			local16 = local11.aByte122 & 0xFF;
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
			local26 = local11.aByte117 & 0xFF;
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
		this.aStream1.v(arg0 * 4);
		this.aStream1.l((byte) (arg1 >> 16));
		this.aStream1.l((byte) (arg1 >> 8));
		this.aStream1.l((byte) arg1);
	}

	@OriginalMember(owner = "client!aju", name = "a", descriptor = "(I)V", line = 99)
	void method13531(@OriginalArg(0) int arg0) {
		this.aStream1.t();
		@Pc(13) Interface14 local13 = this.aClass86_Sub3_30.method6143(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class81_Sub1) {
			this.aNativeHeapBuffer4.j();
		}
		this.aClass172_13 = new Class172(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!aju", name = "y", descriptor = "(I)V", line = 99)
	void method13532(@OriginalArg(0) int arg0) {
		this.aStream1.t();
		@Pc(13) Interface14 local13 = this.aClass86_Sub3_30.method6143(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class81_Sub1) {
			this.aNativeHeapBuffer4.j();
		}
		this.aClass172_13 = new Class172(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!aju", name = "w", descriptor = "([II)V", line = 110)
	void method13533(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class77_Sub39_Sub2 local5 = this.aClass86_Sub3_30.aClass77_Sub39_Sub2_1;
		local5.anInt3089 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass86_Sub3_30.aBoolean116) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass88_Sub1_2.aShortArrayArray1[local21];
				local32 = this.anIntArray198[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22408(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22408(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22408(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass88_Sub1_2.aShortArrayArray1[local21];
				local32 = this.anIntArray198[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22412(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22412(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22412(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass74_Sub2_1.method1832(local5.aByteArray53, local5.anInt3089 * 31645619);
		this.aClass86_Sub3_30.method6155(this.aClass88_Sub1_2.aClass172_6, this.aClass88_Sub1_2.aClass172_7, this.aClass172_13, this.aClass88_Sub1_2.aClass172_8);
		this.aClass86_Sub3_30.method6187(this.anInt1528, (this.aClass88_Sub1_2.anInt507 & 0x7) != 0, (this.aClass88_Sub1_2.anInt507 & 0x8) != 0);
		if (this.aClass86_Sub3_30.aBoolean141) {
			this.aClass86_Sub3_30.method20146(Integer.MAX_VALUE, this.aClass202_4);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat146, 1.0F / this.aFloat146, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_30.method6155(this.aClass88_Sub1_2.aClass172_6, this.aClass88_Sub1_2.aClass172_7, this.aClass172_13, this.aClass88_Sub1_2.aClass172_8);
		this.aClass86_Sub3_30.method6163(this.aClass74_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aju", name = "m", descriptor = "([II)V", line = 110)
	void method13534(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class77_Sub39_Sub2 local5 = this.aClass86_Sub3_30.aClass77_Sub39_Sub2_1;
		local5.anInt3089 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass86_Sub3_30.aBoolean116) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass88_Sub1_2.aShortArrayArray1[local21];
				local32 = this.anIntArray198[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22408(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22408(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22408(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass88_Sub1_2.aShortArrayArray1[local21];
				local32 = this.anIntArray198[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22412(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22412(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22412(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass74_Sub2_1.method1832(local5.aByteArray53, local5.anInt3089 * 31645619);
		this.aClass86_Sub3_30.method6155(this.aClass88_Sub1_2.aClass172_6, this.aClass88_Sub1_2.aClass172_7, this.aClass172_13, this.aClass88_Sub1_2.aClass172_8);
		this.aClass86_Sub3_30.method6187(this.anInt1528, (this.aClass88_Sub1_2.anInt507 & 0x7) != 0, (this.aClass88_Sub1_2.anInt507 & 0x8) != 0);
		if (this.aClass86_Sub3_30.aBoolean141) {
			this.aClass86_Sub3_30.method20146(Integer.MAX_VALUE, this.aClass202_4);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat146, 1.0F / this.aFloat146, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_30.method6155(this.aClass88_Sub1_2.aClass172_6, this.aClass88_Sub1_2.aClass172_7, this.aClass172_13, this.aClass88_Sub1_2.aClass172_8);
		this.aClass86_Sub3_30.method6163(this.aClass74_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aju", name = "h", descriptor = "([II)V", line = 110)
	void method13535(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class77_Sub39_Sub2 local5 = this.aClass86_Sub3_30.aClass77_Sub39_Sub2_1;
		local5.anInt3089 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass86_Sub3_30.aBoolean116) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass88_Sub1_2.aShortArrayArray1[local21];
				local32 = this.anIntArray198[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22408(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22408(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22408(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass88_Sub1_2.aShortArrayArray1[local21];
				local32 = this.anIntArray198[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22412(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22412(local27[local40++] & 0xFFFF);
							local1++;
							local5.method22412(local27[local40++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass74_Sub2_1.method1832(local5.aByteArray53, local5.anInt3089 * 31645619);
		this.aClass86_Sub3_30.method6155(this.aClass88_Sub1_2.aClass172_6, this.aClass88_Sub1_2.aClass172_7, this.aClass172_13, this.aClass88_Sub1_2.aClass172_8);
		this.aClass86_Sub3_30.method6187(this.anInt1528, (this.aClass88_Sub1_2.anInt507 & 0x7) != 0, (this.aClass88_Sub1_2.anInt507 & 0x8) != 0);
		if (this.aClass86_Sub3_30.aBoolean141) {
			this.aClass86_Sub3_30.method20146(Integer.MAX_VALUE, this.aClass202_4);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat146, 1.0F / this.aFloat146, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_30.method6155(this.aClass88_Sub1_2.aClass172_6, this.aClass88_Sub1_2.aClass172_7, this.aClass172_13, this.aClass88_Sub1_2.aClass172_8);
		this.aClass86_Sub3_30.method6163(this.aClass74_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
