package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public class Class337 {

	@OriginalMember(owner = "client!ig", name = "fl", descriptor = "Lclient!py;")
	public static Class497 aClass497_103;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
	int[] anIntArray417;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "[B")
	byte[] aByteArray85;

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "[I")
	int[] anIntArray416;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V", line = 8)
	public Class337(@OriginalArg(0) byte[] arg0) {
		@Pc(4) int local4 = arg0.length;
		this.anIntArray417 = new int[local4];
		this.aByteArray85 = arg0;
		@Pc(14) int[] local14 = new int[33];
		this.anIntArray416 = new int[8];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local4; local22++) {
			@Pc(29) byte local29 = arg0[local22];
			if (local29 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local29;
				@Pc(42) int local42 = local14[local29];
				this.anIntArray417[local22] = local42;
				@Pc(57) int local57;
				@Pc(66) int local66;
				@Pc(73) int local73;
				@Pc(82) int local82;
				if ((local42 & local38) == 0) {
					local57 = local42 | local38;
					for (local66 = local29 - 1; local66 >= 1; local66--) {
						local73 = local14[local66];
						if (local73 != local42) {
							break;
						}
						local82 = 0x1 << 32 - local66;
						if ((local73 & local82) != 0) {
							local14[local66] = local14[local66 - 1];
							break;
						}
						local14[local66] = local73 | local82;
					}
				} else {
					local57 = local14[local29 - 1];
				}
				local14[local29] = local57;
				for (local66 = local29 + 1; local66 <= 32; local66++) {
					if (local14[local66] == local42) {
						local14[local66] = local57;
					}
				}
				local66 = 0;
				for (local73 = 0; local73 < local29; local73++) {
					local82 = Integer.MIN_VALUE >>> local73;
					if ((local42 & local82) == 0) {
						local66++;
					} else {
						if (this.anIntArray416[local66] == 0) {
							this.anIntArray416[local66] = local20;
						}
						local66 = this.anIntArray416[local66];
					}
					if (local66 >= this.anIntArray416.length) {
						@Pc(170) int[] local170 = new int[this.anIntArray416.length * 2];
						for (@Pc(172) int local172 = 0; local172 < this.anIntArray416.length; local172++) {
							local170[local172] = this.anIntArray416[local172];
						}
						this.anIntArray416 = local170;
					}
				}
				this.anIntArray416[local66] = ~local22;
				if (local66 >= local20) {
					local20 = local66 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "([BII[BII)I", line = 63)
	int method27451(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg4 << 3;
		@Pc(9) int local9 = arg2 + arg1;
		while (arg1 < local9) {
			@Pc(18) int local18 = arg0[arg1] & 0xFF;
			@Pc(23) int local23 = this.anIntArray417[local18];
			@Pc(28) byte local28 = this.aByteArray85[local18];
			if (local28 == 0) {
				throw new RuntimeException("" + local18);
			}
			@Pc(46) int local46 = local5 >> 3;
			@Pc(50) int local50 = local5 & 0x7;
			local1 &= -local50 >> 31;
			@Pc(67) int local67 = local46 + (local50 + local28 - 1 >> 3);
			@Pc(68) int local68 = local50 + 24;
			arg3[local46] = (byte) (local1 |= local23 >>> local68);
			if (local46 < local67) {
				local46++;
				local50 = local68 - 8;
				arg3[local46] = (byte) (local1 = local23 >>> local50);
				if (local46 < local67) {
					local46++;
					local50 -= 8;
					arg3[local46] = (byte) (local1 = local23 >>> local50);
					if (local46 < local67) {
						local46++;
						local50 -= 8;
						arg3[local46] = (byte) (local1 = local23 >>> local50);
						if (local46 < local67) {
							local46++;
							local50 -= 8;
							arg3[local46] = (byte) (local1 = local23 << -local50);
						}
					}
				}
			}
			local5 += local28;
			arg1++;
		}
		return (local5 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "([BII[BI)I", line = 63)
	int method27452(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg4 << 3;
		@Pc(9) int local9 = arg2 + arg1;
		while (arg1 < local9) {
			@Pc(18) int local18 = arg0[arg1] & 0xFF;
			@Pc(23) int local23 = this.anIntArray417[local18];
			@Pc(28) byte local28 = this.aByteArray85[local18];
			if (local28 == 0) {
				throw new RuntimeException("" + local18);
			}
			@Pc(46) int local46 = local5 >> 3;
			@Pc(50) int local50 = local5 & 0x7;
			local1 &= -local50 >> 31;
			@Pc(67) int local67 = local46 + (local50 + local28 - 1 >> 3);
			@Pc(68) int local68 = local50 + 24;
			arg3[local46] = (byte) (local1 |= local23 >>> local68);
			if (local46 < local67) {
				local46++;
				local50 = local68 - 8;
				arg3[local46] = (byte) (local1 = local23 >>> local50);
				if (local46 < local67) {
					local46++;
					local50 -= 8;
					arg3[local46] = (byte) (local1 = local23 >>> local50);
					if (local46 < local67) {
						local46++;
						local50 -= 8;
						arg3[local46] = (byte) (local1 = local23 >>> local50);
						if (local46 < local67) {
							local46++;
							local50 -= 8;
							arg3[local46] = (byte) (local1 = local23 << -local50);
						}
					}
				}
			}
			local5 += local28;
			arg1++;
		}
		return (local5 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "([BII[BI)I", line = 63)
	int method27453(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg4 << 3;
		@Pc(9) int local9 = arg2 + arg1;
		while (arg1 < local9) {
			@Pc(18) int local18 = arg0[arg1] & 0xFF;
			@Pc(23) int local23 = this.anIntArray417[local18];
			@Pc(28) byte local28 = this.aByteArray85[local18];
			if (local28 == 0) {
				throw new RuntimeException("" + local18);
			}
			@Pc(46) int local46 = local5 >> 3;
			@Pc(50) int local50 = local5 & 0x7;
			local1 &= -local50 >> 31;
			@Pc(67) int local67 = local46 + (local50 + local28 - 1 >> 3);
			@Pc(68) int local68 = local50 + 24;
			arg3[local46] = (byte) (local1 |= local23 >>> local68);
			if (local46 < local67) {
				local46++;
				local50 = local68 - 8;
				arg3[local46] = (byte) (local1 = local23 >>> local50);
				if (local46 < local67) {
					local46++;
					local50 -= 8;
					arg3[local46] = (byte) (local1 = local23 >>> local50);
					if (local46 < local67) {
						local46++;
						local50 -= 8;
						arg3[local46] = (byte) (local1 = local23 >>> local50);
						if (local46 < local67) {
							local46++;
							local50 -= 8;
							arg3[local46] = (byte) (local1 = local23 << -local50);
						}
					}
				}
			}
			local5 += local28;
			arg1++;
		}
		return (local5 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "(J)V", line = 100)
	static void method27459(@OriginalArg(0) long arg0) {
		Class69.aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "([BI[BII)I", line = 101)
	int method27454(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray416[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(63) int local63;
			if ((local63 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local63;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(95) int local95;
			if ((local95 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local95;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(128) int local128;
			if ((local128 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local128;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local160;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local193;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local225;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(257) int local257;
			if ((local257 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local257;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "([BI[BII)I", line = 101)
	int method27455(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray416[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(63) int local63;
			if ((local63 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local63;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(95) int local95;
			if ((local95 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local95;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(128) int local128;
			if ((local128 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local128;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local160;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local193;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local225;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(257) int local257;
			if ((local257 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local257;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "([BI[BII)I", line = 101)
	int method27456(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray416[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(63) int local63;
			if ((local63 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local63;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(95) int local95;
			if ((local95 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local95;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(128) int local128;
			if ((local128 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local128;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local160;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local193;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local225;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(257) int local257;
			if ((local257 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local257;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "([BI[BIIB)I", line = 101)
	int method27457(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray416[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(63) int local63;
			if ((local63 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local63;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(95) int local95;
			if ((local95 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local95;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(128) int local128;
			if ((local128 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local128;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local160;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local193;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local225;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray416[local6];
			}
			@Pc(257) int local257;
			if ((local257 = this.anIntArray416[local6]) < 0) {
				arg2[arg3++] = (byte) ~local257;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "(Lclient!hq;Lclient!hf;I)V", line = 485)
	static void method27460(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class312 arg1) {
		if (arg1 == null) {
			return;
		}
		@Pc(77) int local77;
		if (arg1.anInt3970 * 532402067 == -1) {
			@Pc(112) Class312[] local112 = arg0.method27236();
			for (local77 = 0; local77 < local112.length && local112[local77] != arg1; local77++) {
			}
			if (local77 >= local112.length) {
				return;
			}
			Class713.method36842(local112, 0, local112, 1, local77);
			local112[0] = arg1;
			return;
		}
		@Pc(18) Class312 local18 = arg0.aClass312Array3[arg1.anInt3985 * 897022795 & 0xFFFF];
		if (local18 == null) {
			return;
		}
		if (local18.aClass312Array2 == local18.aClass312Array1) {
			local18.aClass312Array1 = new Class312[local18.aClass312Array2.length];
			local18.aClass312Array1[0] = arg1;
			Class713.method36842(local18.aClass312Array2, 0, local18.aClass312Array1, 1, arg1.anInt3970 * 532402067);
			Class713.method36842(local18.aClass312Array2, arg1.anInt3970 * 532402067 + 1, local18.aClass312Array1, arg1.anInt3970 * 532402067 + 1, local18.aClass312Array2.length - arg1.anInt3970 * 532402067 - 1);
			return;
		}
		local77 = 0;
		@Pc(80) Class312[] local80 = local18.aClass312Array1;
		while (local77 < local80.length && arg1 != local80[local77]) {
			local77++;
		}
		if (local77 >= local80.length) {
			return;
		}
		Class713.method36842(local80, 0, local80, 1, local77);
		local80[0] = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "bp", descriptor = "(Lclient!yf;B)V", line = 5264)
	static final void method27461(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class391.method28288(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ig", name = "kq", descriptor = "(Lclient!yf;I)V", line = 6756)
	static final void method27458(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class420.method28739(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ig", name = "axo", descriptor = "(Lclient!yf;I)V", line = 13858)
	static final void method27462(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		Class334.method27403(10, local13, local23, "");
	}
}
