package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agj")
public class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!agj", name = "e", descriptor = "J")
	long aLong65;

	@OriginalMember(owner = "client!agj", name = "y", descriptor = "Lclient!if;")
	Interface21 anInterface21_11;

	@OriginalMember(owner = "client!agj", name = "b", descriptor = "I")
	int anInt1298 = 0;

	@OriginalMember(owner = "client!agj", name = "z", descriptor = "I")
	int anInt1299 = 0;

	@OriginalMember(owner = "client!agj", name = "j", descriptor = "I")
	int anInt1301 = 0;

	@OriginalMember(owner = "client!agj", name = "n", descriptor = "I")
	int anInt1302 = 0;

	@OriginalMember(owner = "client!agj", name = "h", descriptor = "Lclient!abs;")
	final Class17_Sub3 aClass17_Sub3_2;

	@OriginalMember(owner = "client!agj", name = "l", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_27;

	@OriginalMember(owner = "client!agj", name = "x", descriptor = "I")
	final int anInt1300;

	@OriginalMember(owner = "client!agj", name = "s", descriptor = "F")
	final float aFloat143;

	@OriginalMember(owner = "client!agj", name = "u", descriptor = "Lclient!dz;")
	Class139 aClass139_4;

	@OriginalMember(owner = "client!agj", name = "c", descriptor = "[I")
	int[] anIntArray183;

	@OriginalMember(owner = "client!agj", name = "<init>", descriptor = "(Lclient!abs;IILclient!dz;)V", line = 22)
	Class3_Sub25(@OriginalArg(0) Class17_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class139 arg3) {
		this.aClass17_Sub3_2 = arg0;
		this.aClass21_Sub3_27 = this.aClass17_Sub3_2.aClass21_Sub3_4;
		this.anInt1300 = arg1;
		this.aFloat143 = arg2;
		this.aClass139_4 = arg3;
		this.anIntArray183 = new int[this.aClass17_Sub3_2.anInt339 * -1007974723 * this.aClass17_Sub3_2.anInt337 * -207323189];
	}

	@OriginalMember(owner = "client!agj", name = "y", descriptor = "(I)V", line = 32)
	void method11509(@OriginalArg(0) int arg0) {
		this.aLong65 = this.aClass21_Sub3_27.anUnsafe3.allocateMemory((long) (arg0 * 4));
		for (@Pc(11) int local11 = 3; local11 < arg0 * 4; local11 += 4) {
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) local11, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "u", descriptor = "(I)V", line = 32)
	void method11513(@OriginalArg(0) int arg0) {
		this.aLong65 = this.aClass21_Sub3_27.anUnsafe3.allocateMemory((long) (arg0 * 4));
		for (@Pc(11) int local11 = 3; local11 < arg0 * 4; local11 += 4) {
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) local11, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "s", descriptor = "(I)V", line = 32)
	void method11514(@OriginalArg(0) int arg0) {
		this.aLong65 = this.aClass21_Sub3_27.anUnsafe3.allocateMemory((long) (arg0 * 4));
		for (@Pc(11) int local11 = 3; local11 < arg0 * 4; local11 += 4) {
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) local11, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "p", descriptor = "(I)V", line = 32)
	void method11523(@OriginalArg(0) int arg0) {
		this.aLong65 = this.aClass21_Sub3_27.anUnsafe3.allocateMemory((long) (arg0 * 4));
		for (@Pc(11) int local11 = 3; local11 < arg0 * 4; local11 += 4) {
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) local11, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "a", descriptor = "(I)V", line = 37)
	void method11506(@OriginalArg(0) int arg0) {
		this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4) + 3L, (byte) -1);
	}

	@OriginalMember(owner = "client!agj", name = "b", descriptor = "(III)V", line = 41)
	void method11507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray183[arg1 * this.aClass17_Sub3_2.anInt339 * -1007974723 + arg0] |= 0x1 << arg2;
		this.anInt1298++;
	}

	@OriginalMember(owner = "client!agj", name = "g", descriptor = "(III)V", line = 41)
	void method11508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray183[arg1 * this.aClass17_Sub3_2.anInt339 * -1007974723 + arg0] |= 0x1 << arg2;
		this.anInt1298++;
	}

	@OriginalMember(owner = "client!agj", name = "z", descriptor = "(III)V", line = 41)
	void method11512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray183[arg1 * this.aClass17_Sub3_2.anInt339 * -1007974723 + arg0] |= 0x1 << arg2;
		this.anInt1298++;
	}

	@OriginalMember(owner = "client!agj", name = "c", descriptor = "(III)V", line = 41)
	void method11516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray183[arg1 * this.aClass17_Sub3_2.anInt339 * -1007974723 + arg0] |= 0x1 << arg2;
		this.anInt1298++;
	}

	@OriginalMember(owner = "client!agj", name = "j", descriptor = "(III)V", line = 41)
	void method11518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray183[arg1 * this.aClass17_Sub3_2.anInt339 * -1007974723 + arg0] |= 0x1 << arg2;
		this.anInt1298++;
	}

	@OriginalMember(owner = "client!agj", name = "l", descriptor = "(IIIF)V", line = 46)
	void method11517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1300 != -1) {
			@Pc(11) Class133 local11 = this.aClass21_Sub3_27.aClass134_7.method22906(this.anInt1300);
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
		if (this.aClass21_Sub3_27.anInt2502 == 0) {
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4), (byte) (arg1 >> 16));
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4) + 1L, (byte) (arg1 >> 8));
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4) + 2L, (byte) arg1);
		} else {
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4), (byte) arg1);
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4) + 1L, (byte) (arg1 >> 8));
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4) + 2L, (byte) (arg1 >> 16));
		}
	}

	@OriginalMember(owner = "client!agj", name = "n", descriptor = "(IIIF)V", line = 46)
	void method11519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1300 != -1) {
			@Pc(11) Class133 local11 = this.aClass21_Sub3_27.aClass134_7.method22906(this.anInt1300);
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
		if (this.aClass21_Sub3_27.anInt2502 == 0) {
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4), (byte) (arg1 >> 16));
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4) + 1L, (byte) (arg1 >> 8));
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4) + 2L, (byte) arg1);
		} else {
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4), (byte) arg1);
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4) + 1L, (byte) (arg1 >> 8));
			this.aClass21_Sub3_27.anUnsafe3.putByte(this.aLong65 + (long) (arg0 * 4) + 2L, (byte) (arg1 >> 16));
		}
	}

	@OriginalMember(owner = "client!agj", name = "h", descriptor = "(I)V", line = 101)
	void method11510(@OriginalArg(0) int arg0) {
		this.anInterface21_11 = this.aClass21_Sub3_27.method17542(false);
		this.anInterface21_11.method25687(arg0 * 4, 4);
		this.anInterface21_11.method25705(0, arg0 * 4, this.aLong65);
		this.aClass21_Sub3_27.anUnsafe3.freeMemory(this.aLong65);
	}

	@OriginalMember(owner = "client!agj", name = "i", descriptor = "(I)V", line = 101)
	void method11520(@OriginalArg(0) int arg0) {
		this.anInterface21_11 = this.aClass21_Sub3_27.method17542(false);
		this.anInterface21_11.method25687(arg0 * 4, 4);
		this.anInterface21_11.method25705(0, arg0 * 4, this.aLong65);
		this.aClass21_Sub3_27.anUnsafe3.freeMemory(this.aLong65);
	}

	@OriginalMember(owner = "client!agj", name = "x", descriptor = "([II)V", line = 108)
	void method11511(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1299 = 0;
		this.anInt1301 = 32767;
		this.anInt1302 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass21_Sub3_27.aByteBuffer4;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass17_Sub3_2.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray183[local21];
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
								if (local63 > this.anInt1302) {
									this.anInt1302 = local63;
								}
								if (local63 < this.anInt1301) {
									this.anInt1301 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1299 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!agj", name = "at", descriptor = "([II)V", line = 108)
	void method11515(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1299 = 0;
		this.anInt1301 = 32767;
		this.anInt1302 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass21_Sub3_27.aByteBuffer4;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass17_Sub3_2.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray183[local21];
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
								if (local63 > this.anInt1302) {
									this.anInt1302 = local63;
								}
								if (local63 < this.anInt1301) {
									this.anInt1301 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1299 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!agj", name = "f", descriptor = "([II)V", line = 108)
	void method11521(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1299 = 0;
		this.anInt1301 = 32767;
		this.anInt1302 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass21_Sub3_27.aByteBuffer4;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass17_Sub3_2.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray183[local21];
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
								if (local63 > this.anInt1302) {
									this.anInt1302 = local63;
								}
								if (local63 < this.anInt1301) {
									this.anInt1301 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1299 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!agj", name = "k", descriptor = "([II)V", line = 108)
	void method11522(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1299 = 0;
		this.anInt1301 = 32767;
		this.anInt1302 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass21_Sub3_27.aByteBuffer4;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass17_Sub3_2.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray183[local21];
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
								if (local63 > this.anInt1302) {
									this.anInt1302 = local63;
								}
								if (local63 < this.anInt1301) {
									this.anInt1301 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1299 += 3;
						}
					}
				}
			}
		}
	}
}
