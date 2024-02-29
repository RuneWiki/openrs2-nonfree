package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aji")
public class Class77_Sub10 extends Class77 {

	@OriginalMember(owner = "client!aji", name = "x", descriptor = "Lclient!kp;")
	Interface36 anInterface36_10;

	@OriginalMember(owner = "client!aji", name = "j", descriptor = "J")
	long aLong66;

	@OriginalMember(owner = "client!aji", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!aji", name = "d", descriptor = "I")
	int anInt1473 = 0;

	@OriginalMember(owner = "client!aji", name = "r", descriptor = "I")
	int anInt1474 = 0;

	@OriginalMember(owner = "client!aji", name = "g", descriptor = "I")
	int anInt1475 = 0;

	@OriginalMember(owner = "client!aji", name = "z", descriptor = "I")
	int anInt1476 = 0;

	@OriginalMember(owner = "client!aji", name = "y", descriptor = "Lclient!aek;")
	final Class88_Sub2 aClass88_Sub2_1;

	@OriginalMember(owner = "client!aji", name = "l", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_26;

	@OriginalMember(owner = "client!aji", name = "w", descriptor = "I")
	final int anInt1472;

	@OriginalMember(owner = "client!aji", name = "t", descriptor = "F")
	final float aFloat145;

	@OriginalMember(owner = "client!aji", name = "q", descriptor = "Lclient!db;")
	Class202 aClass202_3;

	@OriginalMember(owner = "client!aji", name = "s", descriptor = "[I")
	int[] anIntArray194;

	@OriginalMember(owner = "client!aji", name = "<init>", descriptor = "(Lclient!aek;IILclient!db;)V", line = 23)
	Class77_Sub10(@OriginalArg(0) Class88_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class202 arg3) {
		this.aClass88_Sub2_1 = arg0;
		this.aClass86_Sub1_26 = this.aClass88_Sub2_1.aClass86_Sub1_3;
		this.anInt1472 = arg1;
		this.aFloat145 = arg2;
		this.aClass202_3 = arg3;
		this.anIntArray194 = new int[this.aClass88_Sub2_1.anInt607 * -1924295585 * this.aClass88_Sub2_1.anInt606 * -1466328823];
	}

	@OriginalMember(owner = "client!aji", name = "p", descriptor = "(I)V", line = 33)
	void method13303(@OriginalArg(0) int arg0) {
		this.aByteBuffer4 = this.aClass86_Sub1_26.method20398(arg0 * 4);
		this.aLong66 = this.aClass86_Sub1_26.method20399(this.aByteBuffer4);
		for (@Pc(16) int local16 = 3; local16 < arg0 * 4; local16 += 4) {
			this.aClass86_Sub1_26.anUnsafe4.putByte(this.aLong66 + (long) local16, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!aji", name = "c", descriptor = "(I)V", line = 39)
	void method13304(@OriginalArg(0) int arg0) {
		this.aClass86_Sub1_26.anUnsafe4.putByte(this.aLong66 + (long) (arg0 * 4) + 3L, (byte) -1);
	}

	@OriginalMember(owner = "client!aji", name = "v", descriptor = "(III)V", line = 43)
	void method13305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray194[arg1 * this.aClass88_Sub2_1.anInt607 * -1924295585 + arg0] |= 0x1 << arg2;
		this.anInt1473++;
	}

	@OriginalMember(owner = "client!aji", name = "l", descriptor = "(IIIF)V", line = 48)
	void method13306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1472 != -1) {
			@Pc(11) Class215 local11 = this.aClass86_Sub1_26.aClass209_9.method25584(this.anInt1472);
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
		if (this.aClass86_Sub1_26.anInt2847 == 0) {
			this.aByteBuffer4.put(arg0 * 4, (byte) (arg1 >> 16));
			this.aByteBuffer4.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer4.put(arg0 * 4 + 2, (byte) (arg1 >> 0));
		} else {
			this.aByteBuffer4.put(arg0 * 4, (byte) (arg1 >> 0));
			this.aByteBuffer4.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer4.put(arg0 * 4 + 2, (byte) (arg1 >> 16));
		}
	}

	@OriginalMember(owner = "client!aji", name = "t", descriptor = "(IIIF)V", line = 48)
	void method13307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1472 != -1) {
			@Pc(11) Class215 local11 = this.aClass86_Sub1_26.aClass209_9.method25584(this.anInt1472);
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
		if (this.aClass86_Sub1_26.anInt2847 == 0) {
			this.aByteBuffer4.put(arg0 * 4, (byte) (arg1 >> 16));
			this.aByteBuffer4.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer4.put(arg0 * 4 + 2, (byte) (arg1 >> 0));
		} else {
			this.aByteBuffer4.put(arg0 * 4, (byte) (arg1 >> 0));
			this.aByteBuffer4.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer4.put(arg0 * 4 + 2, (byte) (arg1 >> 16));
		}
	}

	@OriginalMember(owner = "client!aji", name = "q", descriptor = "(I)V", line = 103)
	void method13308(@OriginalArg(0) int arg0) {
		this.anInterface36_10 = this.aClass86_Sub1_26.method20656(false);
		this.anInterface36_10.method28760(arg0 * 4, 4);
		this.anInterface36_10.method28755(0, arg0 * 4, this.aLong66);
		this.aByteBuffer4.clear();
		this.aByteBuffer4 = null;
		this.aLong66 = 0L;
	}

	@OriginalMember(owner = "client!aji", name = "d", descriptor = "(I)V", line = 103)
	void method13309(@OriginalArg(0) int arg0) {
		this.anInterface36_10 = this.aClass86_Sub1_26.method20656(false);
		this.anInterface36_10.method28760(arg0 * 4, 4);
		this.anInterface36_10.method28755(0, arg0 * 4, this.aLong66);
		this.aByteBuffer4.clear();
		this.aByteBuffer4 = null;
		this.aLong66 = 0L;
	}

	@OriginalMember(owner = "client!aji", name = "y", descriptor = "(I)V", line = 103)
	void method13310(@OriginalArg(0) int arg0) {
		this.anInterface36_10 = this.aClass86_Sub1_26.method20656(false);
		this.anInterface36_10.method28760(arg0 * 4, 4);
		this.anInterface36_10.method28755(0, arg0 * 4, this.aLong66);
		this.aByteBuffer4.clear();
		this.aByteBuffer4 = null;
		this.aLong66 = 0L;
	}

	@OriginalMember(owner = "client!aji", name = "x", descriptor = "(I)V", line = 103)
	void method13311(@OriginalArg(0) int arg0) {
		this.anInterface36_10 = this.aClass86_Sub1_26.method20656(false);
		this.anInterface36_10.method28760(arg0 * 4, 4);
		this.anInterface36_10.method28755(0, arg0 * 4, this.aLong66);
		this.aByteBuffer4.clear();
		this.aByteBuffer4 = null;
		this.aLong66 = 0L;
	}

	@OriginalMember(owner = "client!aji", name = "s", descriptor = "([II)V", line = 112)
	void method13312(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1474 = 0;
		this.anInt1475 = 32767;
		this.anInt1476 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass86_Sub1_26.aByteBuffer7;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass88_Sub2_1.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray194[local21];
			if (local32 != 0 && local27 != null) {
				@Pc(38) int local38 = 0;
				@Pc(40) int local40 = 0;
				while (true) {
					while (true) {
						if (local40 >= local27.length) {
							continue label49;
						}
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							for (@Pc(53) int local53 = 0; local53 < 3; local53++) {
								@Pc(63) int local63 = local27[local40++] & 0xFFFF;
								if (local63 > this.anInt1476) {
									this.anInt1476 = local63;
								}
								if (local63 < this.anInt1475) {
									this.anInt1475 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1474 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aji", name = "w", descriptor = "([II)V", line = 112)
	void method13313(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1474 = 0;
		this.anInt1475 = 32767;
		this.anInt1476 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass86_Sub1_26.aByteBuffer7;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass88_Sub2_1.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray194[local21];
			if (local32 != 0 && local27 != null) {
				@Pc(38) int local38 = 0;
				@Pc(40) int local40 = 0;
				while (true) {
					while (true) {
						if (local40 >= local27.length) {
							continue label49;
						}
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							for (@Pc(53) int local53 = 0; local53 < 3; local53++) {
								@Pc(63) int local63 = local27[local40++] & 0xFFFF;
								if (local63 > this.anInt1476) {
									this.anInt1476 = local63;
								}
								if (local63 < this.anInt1475) {
									this.anInt1475 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1474 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aji", name = "r", descriptor = "([II)V", line = 112)
	void method13314(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1474 = 0;
		this.anInt1475 = 32767;
		this.anInt1476 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass86_Sub1_26.aByteBuffer7;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass88_Sub2_1.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray194[local21];
			if (local32 != 0 && local27 != null) {
				@Pc(38) int local38 = 0;
				@Pc(40) int local40 = 0;
				while (true) {
					while (true) {
						if (local40 >= local27.length) {
							continue label49;
						}
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							for (@Pc(53) int local53 = 0; local53 < 3; local53++) {
								@Pc(63) int local63 = local27[local40++] & 0xFFFF;
								if (local63 > this.anInt1476) {
									this.anInt1476 = local63;
								}
								if (local63 < this.anInt1475) {
									this.anInt1475 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1474 += 3;
						}
					}
				}
			}
		}
	}
}
