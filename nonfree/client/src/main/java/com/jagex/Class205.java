package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public class Class205 {

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "[I")
	int[] anIntArray388;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "[B")
	byte[] aByteArray70;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "[I")
	int[] anIntArray389;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "([B)V", line = 8)
	public Class205(@OriginalArg(0) byte[] arg0) {
		@Pc(4) int local4 = arg0.length;
		this.anIntArray388 = new int[local4];
		this.aByteArray70 = arg0;
		@Pc(14) int[] local14 = new int[33];
		this.anIntArray389 = new int[8];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local4; local22++) {
			@Pc(29) byte local29 = arg0[local22];
			if (local29 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local29;
				@Pc(42) int local42 = local14[local29];
				this.anIntArray388[local22] = local42;
				@Pc(58) int local58;
				@Pc(67) int local67;
				@Pc(74) int local74;
				@Pc(83) int local83;
				if ((local42 & local38) == 0) {
					local58 = local42 | local38;
					for (local67 = local29 - 1; local67 >= 1; local67--) {
						local74 = local14[local67];
						if (local42 != local74) {
							break;
						}
						local83 = 0x1 << 32 - local67;
						if ((local74 & local83) != 0) {
							local14[local67] = local14[local67 - 1];
							break;
						}
						local14[local67] = local74 | local83;
					}
				} else {
					local58 = local14[local29 - 1];
				}
				local14[local29] = local58;
				for (local67 = local29 + 1; local67 <= 32; local67++) {
					if (local42 == local14[local67]) {
						local14[local67] = local58;
					}
				}
				local67 = 0;
				for (local74 = 0; local74 < local29; local74++) {
					local83 = Integer.MIN_VALUE >>> local74;
					if ((local42 & local83) == 0) {
						local67++;
					} else {
						if (this.anIntArray389[local67] == 0) {
							this.anIntArray389[local67] = local20;
						}
						local67 = this.anIntArray389[local67];
					}
					if (local67 >= this.anIntArray389.length) {
						@Pc(170) int[] local170 = new int[this.anIntArray389.length * 2];
						for (@Pc(172) int local172 = 0; local172 < this.anIntArray389.length; local172++) {
							local170[local172] = this.anIntArray389[local172];
						}
						this.anIntArray389 = local170;
					}
				}
				this.anIntArray389[local67] = ~local22;
				if (local67 >= local20) {
					local20 = local67 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(J)Ljava/lang/String;", line = 31)
	static String method24186(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(21) long local21 = arg0; local21 != 0L; local21 /= 37L) {
				local19++;
			}
			@Pc(36) StringBuilder local36 = new StringBuilder(local19);
			while (arg0 != 0L) {
				@Pc(42) long local42 = arg0;
				arg0 /= 37L;
				@Pc(55) char local55 = Class542.aCharArray6[(int) (local42 - arg0 * 37L)];
				if (local55 == '_') {
					@Pc(63) int local63 = local36.length() - 1;
					local36.setCharAt(local63, Character.toUpperCase(local36.charAt(local63)));
					local55 = 160;
				}
				local36.append(local55);
			}
			local36.reverse();
			local36.setCharAt(0, Character.toUpperCase(local36.charAt(0)));
			return local36.toString();
		}
	}

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "(I)V", line = 34)
	public static void method24188() {
		if (!Class570.aBoolean828) {
			return;
		}
		if (Class570.anInt5385 * -6912333 < Class400.anInt4803 * -812257991) {
			Class570.anInt5385 = Class400.anInt4803 * 320590435;
		}
		while (true) {
			while (Class570.anInt5385 * -6912333 < Class490.anInt5198 * -830555485) {
				@Pc(27) Class63_Sub1 local27 = Class200.method24148(Class570.anInt5385 * -6912333);
				if (local27 != null && -39887861 * local27.anInt1520 == -1) {
					if (Class570.aClass507_2 == null) {
						Class570.aClass507_2 = client.aClass508_1.method29556(local27.aString52);
					}
					@Pc(55) int local55 = Class570.aClass507_2.anInt5256 * 1101732247;
					if (local55 == -1) {
						return;
					}
					local27.anInt1520 = local55 * 100880291;
					Class570.anInt5385 += -2080270213;
					Class570.aClass507_2 = null;
				} else {
					Class570.anInt5385 += -2080270213;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "([BII[BII)I", line = 63)
	int method24180(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg4 << 3;
		@Pc(9) int local9 = arg2 + arg1;
		while (arg1 < local9) {
			@Pc(18) int local18 = arg0[arg1] & 0xFF;
			@Pc(23) int local23 = this.anIntArray388[local18];
			@Pc(28) byte local28 = this.aByteArray70[local18];
			if (local28 == 0) {
				throw new RuntimeException("" + local18);
			}
			@Pc(47) int local47 = local5 >> 3;
			@Pc(51) int local51 = local5 & 0x7;
			local1 &= -local51 >> 31;
			@Pc(68) int local68 = (local28 + local51 - 1 >> 3) + local47;
			@Pc(69) int local69 = local51 + 24;
			arg3[local47] = (byte) (local1 |= local23 >>> local69);
			if (local47 < local68) {
				local47++;
				local51 = local69 - 8;
				arg3[local47] = (byte) (local1 = local23 >>> local51);
				if (local47 < local68) {
					local47++;
					local51 -= 8;
					arg3[local47] = (byte) (local1 = local23 >>> local51);
					if (local47 < local68) {
						local47++;
						local51 -= 8;
						arg3[local47] = (byte) (local1 = local23 >>> local51);
						if (local47 < local68) {
							local47++;
							local51 -= 8;
							arg3[local47] = (byte) (local1 = local23 << -local51);
						}
					}
				}
			}
			local5 += local28;
			arg1++;
		}
		return (local5 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "([BII[BI)I", line = 63)
	int method24181(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg4 << 3;
		@Pc(9) int local9 = arg2 + arg1;
		while (arg1 < local9) {
			@Pc(18) int local18 = arg0[arg1] & 0xFF;
			@Pc(23) int local23 = this.anIntArray388[local18];
			@Pc(28) byte local28 = this.aByteArray70[local18];
			if (local28 == 0) {
				throw new RuntimeException("" + local18);
			}
			@Pc(47) int local47 = local5 >> 3;
			@Pc(51) int local51 = local5 & 0x7;
			local1 &= -local51 >> 31;
			@Pc(68) int local68 = (local28 + local51 - 1 >> 3) + local47;
			@Pc(69) int local69 = local51 + 24;
			arg3[local47] = (byte) (local1 |= local23 >>> local69);
			if (local47 < local68) {
				local47++;
				local51 = local69 - 8;
				arg3[local47] = (byte) (local1 = local23 >>> local51);
				if (local47 < local68) {
					local47++;
					local51 -= 8;
					arg3[local47] = (byte) (local1 = local23 >>> local51);
					if (local47 < local68) {
						local47++;
						local51 -= 8;
						arg3[local47] = (byte) (local1 = local23 >>> local51);
						if (local47 < local68) {
							local47++;
							local51 -= 8;
							arg3[local47] = (byte) (local1 = local23 << -local51);
						}
					}
				}
			}
			local5 += local28;
			arg1++;
		}
		return (local5 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([BI[BIII)I", line = 101)
	int method24179(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray389[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(64) int local64;
			if ((local64 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local64;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(96) int local96;
			if ((local96 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local96;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local129;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local161;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local194;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(226) int local226;
			if ((local226 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local226;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local258;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "([BI[BII)I", line = 101)
	int method24182(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray389[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(64) int local64;
			if ((local64 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local64;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(96) int local96;
			if ((local96 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local96;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local129;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local161;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local194;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(226) int local226;
			if ((local226 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local226;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local258;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "([BI[BII)I", line = 101)
	int method24183(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray389[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(64) int local64;
			if ((local64 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local64;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(96) int local96;
			if ((local96 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local96;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local129;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local161;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local194;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(226) int local226;
			if ((local226 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local226;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray389[local6];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray389[local6]) < 0) {
				arg2[arg3++] = (byte) ~local258;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!gp", name = "fw", descriptor = "(Lclient!vs;I)V", line = 5052)
	static final void method24192(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class51.method9860(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!gp", name = "mf", descriptor = "(Lclient!vs;I)V", line = 6374)
	static final void method24184(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class186.method23924(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gp", name = "pu", descriptor = "(Lclient!vs;S)V", line = 6952)
	static final void method24191(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3509 * 1314053873;
	}

	@OriginalMember(owner = "client!gp", name = "vc", descriptor = "(Lclient!vs;S)V", line = 7942)
	static final void method24185(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3094 * -618159829;
	}

	@OriginalMember(owner = "client!gp", name = "mw", descriptor = "(I)I", line = 11785)
	public static int method24189() {
		return Class630.aClass493_1.aBoolean811 ? 3 : 5;
	}

	@OriginalMember(owner = "client!gp", name = "avz", descriptor = "(Lclient!vs;B)V", line = 12692)
	static final void method24187(@OriginalArg(0) Class536 arg0) {
		Class30.method16449((Class26_Sub1) arg0.anInterface43_1, arg0);
	}

	@OriginalMember(owner = "client!gp", name = "avq", descriptor = "(Lclient!vs;I)V", line = 12763)
	static final void method24190(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
	}
}
