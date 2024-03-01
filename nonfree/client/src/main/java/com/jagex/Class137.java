package com.jagex;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public class Class137 {

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
	static final int anInt3405 = 1;

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
	static final int anInt3406 = 65535;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
	static final int anInt3407 = 0;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V", line = 16)
	Class137() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "(Lclient!ny;II)Lclient!dx;", line = 21)
	public static Class15 method22938(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method26713(arg1, arg2);
		return local5 == null ? null : method22940(local5)[0];
	}

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "(Lclient!ny;II)Lclient!dx;", line = 21)
	public static Class15 method22941(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method26713(arg1, arg2);
		return local5 == null ? null : method22940(local5)[0];
	}

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "(Lclient!ny;I)Lclient!dx;", line = 27)
	public static Class15 method22936(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method26705(arg1);
		return local4 == null ? null : method22940(local4)[0];
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!ny;I)Lclient!dx;", line = 27)
	public static Class15 method22937(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method26705(arg1);
		return local4 == null ? null : method22940(local4)[0];
	}

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "(Lclient!ny;I)Lclient!dx;", line = 27)
	public static Class15 method22943(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method26705(arg1);
		return local4 == null ? null : method22940(local4)[0];
	}

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "(Lclient!ny;I)Lclient!dx;", line = 27)
	public static Class15 method22945(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method26705(arg1);
		return local4 == null ? null : method22940(local4)[0];
	}

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "(Lclient!ny;II)[Lclient!dx;", line = 33)
	public static Class15[] method22942(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method26713(arg1, arg2);
		return local5 == null ? null : method22940(local5);
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(Lclient!ny;II)[Lclient!dx;", line = 33)
	public static Class15[] method22944(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method26713(arg1, arg2);
		return local5 == null ? null : method22940(local5);
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(Lclient!ny;II)[Lclient!dx;", line = 33)
	public static Class15[] method22948(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method26713(arg1, arg2);
		return local5 == null ? null : method22940(local5);
	}

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "(Lclient!ny;I)[Lclient!dx;", line = 39)
	public static Class15[] method22939(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method26705(arg1);
		return local4 == null ? null : method22940(local4);
	}

	@OriginalMember(owner = "client!dv", name = "z", descriptor = "(Lclient!ny;I)[Lclient!dx;", line = 39)
	public static Class15[] method22946(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method26705(arg1);
		return local4 == null ? null : method22940(local4);
	}

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "([B)[Lclient!dx;", line = 45)
	public static Class15[] method22935(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		local4.anInt2803 = (arg0.length - 2) * -918980331;
		@Pc(16) int local16 = local4.method20271();
		@Pc(55) int local55;
		@Pc(63) int local63;
		@Pc(169) int[] local169;
		@Pc(171) int local171;
		if (local16 != 65535) {
			@Pc(22) Class15_Sub1[] local22 = new Class15_Sub1[local16];
			@Pc(24) int local24;
			for (local24 = 0; local24 < local16; local24++) {
				local22[local24] = new Class15_Sub1();
			}
			local4.anInt2803 = (arg0.length - 7 - local16 * 8) * -918980331;
			local24 = local4.method20271();
			local55 = local4.method20271();
			local63 = (local4.method20269() & 0xFF) + 1;
			@Pc(65) int local65;
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt166 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt167 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt169 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt165 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				@Pc(128) Class15_Sub1 local128 = local22[local65];
				local128.anInt168 = local24 - local128.anInt169 - local128.anInt166;
				local128.anInt164 = local55 - local128.anInt165 - local128.anInt167;
			}
			local4.anInt2803 = (arg0.length - 7 - local16 * 8 - (local63 - 1) * 3) * -918980331;
			local169 = new int[local63];
			for (local171 = 1; local171 < local63; local171++) {
				local169[local171] = local4.method20273();
				if (local169[local171] == 0) {
					local169[local171] = 1;
				}
			}
			for (local171 = 0; local171 < local16; local171++) {
				local22[local171].anIntArray26 = local169;
			}
			local4.anInt2803 = 0;
			for (local171 = 0; local171 < local16; local171++) {
				@Pc(214) Class15_Sub1 local214 = local22[local171];
				@Pc(220) int local220 = local214.anInt169 * local214.anInt165;
				local214.aByteArray1 = new byte[local220];
				@Pc(228) int local228 = local4.method20269();
				@Pc(259) int local259;
				if ((local228 & 0x2) == 0) {
					@Pc(238) int local238;
					if ((local228 & 0x1) == 0) {
						for (local238 = 0; local238 < local220; local238++) {
							local214.aByteArray1[local238] = local4.method20390();
						}
					} else {
						for (local238 = 0; local238 < local214.anInt169; local238++) {
							for (local259 = 0; local259 < local214.anInt165; local259++) {
								local214.aByteArray1[local238 + local259 * local214.anInt169] = local4.method20390();
							}
						}
					}
				} else {
					@Pc(282) boolean local282 = false;
					local214.aByteArray2 = new byte[local220];
					if ((local228 & 0x1) == 0) {
						for (local259 = 0; local259 < local220; local259++) {
							local214.aByteArray1[local259] = local4.method20390();
						}
						for (local259 = 0; local259 < local220; local259++) {
							@Pc(318) byte local318 = local214.aByteArray2[local259] = local4.method20390();
							local282 |= local318 != -1;
						}
					} else {
						@Pc(338) int local338;
						for (local259 = 0; local259 < local214.anInt169; local259++) {
							for (local338 = 0; local338 < local214.anInt165; local338++) {
								local214.aByteArray1[local259 + local338 * local214.anInt169] = local4.method20390();
							}
						}
						for (local259 = 0; local259 < local214.anInt169; local259++) {
							for (local338 = 0; local338 < local214.anInt165; local338++) {
								@Pc(384) byte local384 = local214.aByteArray2[local259 + local338 * local214.anInt169] = local4.method20390();
								local282 |= local384 != -1;
							}
						}
					}
					if (!local282) {
						local214.aByteArray2 = null;
					}
				}
			}
			return local22;
		}
		local4.anInt2803 = 0;
		@Pc(413) int local413 = local4.method20269();
		if (local413 == 0) {
			@Pc(424) boolean local424 = local4.method20269() == 1;
			local55 = local4.method20271();
			local63 = local4.method20271();
			local169 = new int[local55 * local63];
			for (local171 = 0; local171 < local55 * local63; local171++) {
				local169[local171] = local4.method20273() | 0xFF000000;
			}
			if (local424) {
				for (local171 = 0; local171 < local55 * local63; local171++) {
					local169[local171] &= 0xFFFFFF;
					local169[local171] |= local4.method20269() << 24;
				}
			}
			@Pc(490) Class15_Sub2 local490 = new Class15_Sub2(local55, local63, local169);
			return new Class15[] { local490 };
		} else if (local413 == 1) {
			try {
				@Pc(519) BufferedImage local519 = ImageIO.read(new ByteArrayInputStream(local4.aByteArray51, local4.anInt2803 * 62066237, local4.aByteArray51.length - local4.anInt2803 * 62066237));
				local55 = local519.getWidth();
				local63 = local519.getHeight();
				@Pc(542) Class15_Sub2 local542 = new Class15_Sub2(local55, local63, local519.getData().getPixels(0, 0, local55, local63, new int[local55 * local63]));
				return new Class15[] { local542 };
			} catch (@Pc(550) IOException local550) {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "([B)[Lclient!dx;", line = 45)
	public static Class15[] method22940(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		local4.anInt2803 = (arg0.length - 2) * -918980331;
		@Pc(16) int local16 = local4.method20271();
		@Pc(55) int local55;
		@Pc(63) int local63;
		@Pc(169) int[] local169;
		@Pc(171) int local171;
		if (local16 != 65535) {
			@Pc(22) Class15_Sub1[] local22 = new Class15_Sub1[local16];
			@Pc(24) int local24;
			for (local24 = 0; local24 < local16; local24++) {
				local22[local24] = new Class15_Sub1();
			}
			local4.anInt2803 = (arg0.length - 7 - local16 * 8) * -918980331;
			local24 = local4.method20271();
			local55 = local4.method20271();
			local63 = (local4.method20269() & 0xFF) + 1;
			@Pc(65) int local65;
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt166 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt167 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt169 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt165 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				@Pc(128) Class15_Sub1 local128 = local22[local65];
				local128.anInt168 = local24 - local128.anInt169 - local128.anInt166;
				local128.anInt164 = local55 - local128.anInt165 - local128.anInt167;
			}
			local4.anInt2803 = (arg0.length - 7 - local16 * 8 - (local63 - 1) * 3) * -918980331;
			local169 = new int[local63];
			for (local171 = 1; local171 < local63; local171++) {
				local169[local171] = local4.method20273();
				if (local169[local171] == 0) {
					local169[local171] = 1;
				}
			}
			for (local171 = 0; local171 < local16; local171++) {
				local22[local171].anIntArray26 = local169;
			}
			local4.anInt2803 = 0;
			for (local171 = 0; local171 < local16; local171++) {
				@Pc(214) Class15_Sub1 local214 = local22[local171];
				@Pc(220) int local220 = local214.anInt169 * local214.anInt165;
				local214.aByteArray1 = new byte[local220];
				@Pc(228) int local228 = local4.method20269();
				@Pc(259) int local259;
				if ((local228 & 0x2) == 0) {
					@Pc(238) int local238;
					if ((local228 & 0x1) == 0) {
						for (local238 = 0; local238 < local220; local238++) {
							local214.aByteArray1[local238] = local4.method20390();
						}
					} else {
						for (local238 = 0; local238 < local214.anInt169; local238++) {
							for (local259 = 0; local259 < local214.anInt165; local259++) {
								local214.aByteArray1[local238 + local259 * local214.anInt169] = local4.method20390();
							}
						}
					}
				} else {
					@Pc(282) boolean local282 = false;
					local214.aByteArray2 = new byte[local220];
					if ((local228 & 0x1) == 0) {
						for (local259 = 0; local259 < local220; local259++) {
							local214.aByteArray1[local259] = local4.method20390();
						}
						for (local259 = 0; local259 < local220; local259++) {
							@Pc(318) byte local318 = local214.aByteArray2[local259] = local4.method20390();
							local282 |= local318 != -1;
						}
					} else {
						@Pc(338) int local338;
						for (local259 = 0; local259 < local214.anInt169; local259++) {
							for (local338 = 0; local338 < local214.anInt165; local338++) {
								local214.aByteArray1[local259 + local338 * local214.anInt169] = local4.method20390();
							}
						}
						for (local259 = 0; local259 < local214.anInt169; local259++) {
							for (local338 = 0; local338 < local214.anInt165; local338++) {
								@Pc(384) byte local384 = local214.aByteArray2[local259 + local338 * local214.anInt169] = local4.method20390();
								local282 |= local384 != -1;
							}
						}
					}
					if (!local282) {
						local214.aByteArray2 = null;
					}
				}
			}
			return local22;
		}
		local4.anInt2803 = 0;
		@Pc(413) int local413 = local4.method20269();
		if (local413 == 0) {
			@Pc(424) boolean local424 = local4.method20269() == 1;
			local55 = local4.method20271();
			local63 = local4.method20271();
			local169 = new int[local55 * local63];
			for (local171 = 0; local171 < local55 * local63; local171++) {
				local169[local171] = local4.method20273() | 0xFF000000;
			}
			if (local424) {
				for (local171 = 0; local171 < local55 * local63; local171++) {
					local169[local171] &= 0xFFFFFF;
					local169[local171] |= local4.method20269() << 24;
				}
			}
			@Pc(490) Class15_Sub2 local490 = new Class15_Sub2(local55, local63, local169);
			return new Class15[] { local490 };
		} else if (local413 == 1) {
			try {
				@Pc(519) BufferedImage local519 = ImageIO.read(new ByteArrayInputStream(local4.aByteArray51, local4.anInt2803 * 62066237, local4.aByteArray51.length - local4.anInt2803 * 62066237));
				local55 = local519.getWidth();
				local63 = local519.getHeight();
				@Pc(542) Class15_Sub2 local542 = new Class15_Sub2(local55, local63, local519.getData().getPixels(0, 0, local55, local63, new int[local55 * local63]));
				return new Class15[] { local542 };
			} catch (@Pc(550) IOException local550) {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "([B)[Lclient!dx;", line = 45)
	public static Class15[] method22947(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		local4.anInt2803 = (arg0.length - 2) * -918980331;
		@Pc(16) int local16 = local4.method20271();
		@Pc(55) int local55;
		@Pc(63) int local63;
		@Pc(169) int[] local169;
		@Pc(171) int local171;
		if (local16 != 65535) {
			@Pc(22) Class15_Sub1[] local22 = new Class15_Sub1[local16];
			@Pc(24) int local24;
			for (local24 = 0; local24 < local16; local24++) {
				local22[local24] = new Class15_Sub1();
			}
			local4.anInt2803 = (arg0.length - 7 - local16 * 8) * -918980331;
			local24 = local4.method20271();
			local55 = local4.method20271();
			local63 = (local4.method20269() & 0xFF) + 1;
			@Pc(65) int local65;
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt166 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt167 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt169 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt165 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				@Pc(128) Class15_Sub1 local128 = local22[local65];
				local128.anInt168 = local24 - local128.anInt169 - local128.anInt166;
				local128.anInt164 = local55 - local128.anInt165 - local128.anInt167;
			}
			local4.anInt2803 = (arg0.length - 7 - local16 * 8 - (local63 - 1) * 3) * -918980331;
			local169 = new int[local63];
			for (local171 = 1; local171 < local63; local171++) {
				local169[local171] = local4.method20273();
				if (local169[local171] == 0) {
					local169[local171] = 1;
				}
			}
			for (local171 = 0; local171 < local16; local171++) {
				local22[local171].anIntArray26 = local169;
			}
			local4.anInt2803 = 0;
			for (local171 = 0; local171 < local16; local171++) {
				@Pc(214) Class15_Sub1 local214 = local22[local171];
				@Pc(220) int local220 = local214.anInt169 * local214.anInt165;
				local214.aByteArray1 = new byte[local220];
				@Pc(228) int local228 = local4.method20269();
				@Pc(259) int local259;
				if ((local228 & 0x2) == 0) {
					@Pc(238) int local238;
					if ((local228 & 0x1) == 0) {
						for (local238 = 0; local238 < local220; local238++) {
							local214.aByteArray1[local238] = local4.method20390();
						}
					} else {
						for (local238 = 0; local238 < local214.anInt169; local238++) {
							for (local259 = 0; local259 < local214.anInt165; local259++) {
								local214.aByteArray1[local238 + local259 * local214.anInt169] = local4.method20390();
							}
						}
					}
				} else {
					@Pc(282) boolean local282 = false;
					local214.aByteArray2 = new byte[local220];
					if ((local228 & 0x1) == 0) {
						for (local259 = 0; local259 < local220; local259++) {
							local214.aByteArray1[local259] = local4.method20390();
						}
						for (local259 = 0; local259 < local220; local259++) {
							@Pc(318) byte local318 = local214.aByteArray2[local259] = local4.method20390();
							local282 |= local318 != -1;
						}
					} else {
						@Pc(338) int local338;
						for (local259 = 0; local259 < local214.anInt169; local259++) {
							for (local338 = 0; local338 < local214.anInt165; local338++) {
								local214.aByteArray1[local259 + local338 * local214.anInt169] = local4.method20390();
							}
						}
						for (local259 = 0; local259 < local214.anInt169; local259++) {
							for (local338 = 0; local338 < local214.anInt165; local338++) {
								@Pc(384) byte local384 = local214.aByteArray2[local259 + local338 * local214.anInt169] = local4.method20390();
								local282 |= local384 != -1;
							}
						}
					}
					if (!local282) {
						local214.aByteArray2 = null;
					}
				}
			}
			return local22;
		}
		local4.anInt2803 = 0;
		@Pc(413) int local413 = local4.method20269();
		if (local413 == 0) {
			@Pc(424) boolean local424 = local4.method20269() == 1;
			local55 = local4.method20271();
			local63 = local4.method20271();
			local169 = new int[local55 * local63];
			for (local171 = 0; local171 < local55 * local63; local171++) {
				local169[local171] = local4.method20273() | 0xFF000000;
			}
			if (local424) {
				for (local171 = 0; local171 < local55 * local63; local171++) {
					local169[local171] &= 0xFFFFFF;
					local169[local171] |= local4.method20269() << 24;
				}
			}
			@Pc(490) Class15_Sub2 local490 = new Class15_Sub2(local55, local63, local169);
			return new Class15[] { local490 };
		} else if (local413 == 1) {
			try {
				@Pc(519) BufferedImage local519 = ImageIO.read(new ByteArrayInputStream(local4.aByteArray51, local4.anInt2803 * 62066237, local4.aByteArray51.length - local4.anInt2803 * 62066237));
				local55 = local519.getWidth();
				local63 = local519.getHeight();
				@Pc(542) Class15_Sub2 local542 = new Class15_Sub2(local55, local63, local519.getData().getPixels(0, 0, local55, local63, new int[local55 * local63]));
				return new Class15[] { local542 };
			} catch (@Pc(550) IOException local550) {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "([B)[Lclient!dx;", line = 45)
	public static Class15[] method22949(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		local4.anInt2803 = (arg0.length - 2) * -918980331;
		@Pc(16) int local16 = local4.method20271();
		@Pc(55) int local55;
		@Pc(63) int local63;
		@Pc(169) int[] local169;
		@Pc(171) int local171;
		if (local16 != 65535) {
			@Pc(22) Class15_Sub1[] local22 = new Class15_Sub1[local16];
			@Pc(24) int local24;
			for (local24 = 0; local24 < local16; local24++) {
				local22[local24] = new Class15_Sub1();
			}
			local4.anInt2803 = (arg0.length - 7 - local16 * 8) * -918980331;
			local24 = local4.method20271();
			local55 = local4.method20271();
			local63 = (local4.method20269() & 0xFF) + 1;
			@Pc(65) int local65;
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt166 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt167 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt169 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				local22[local65].anInt165 = local4.method20271();
			}
			for (local65 = 0; local65 < local16; local65++) {
				@Pc(128) Class15_Sub1 local128 = local22[local65];
				local128.anInt168 = local24 - local128.anInt169 - local128.anInt166;
				local128.anInt164 = local55 - local128.anInt165 - local128.anInt167;
			}
			local4.anInt2803 = (arg0.length - 7 - local16 * 8 - (local63 - 1) * 3) * -918980331;
			local169 = new int[local63];
			for (local171 = 1; local171 < local63; local171++) {
				local169[local171] = local4.method20273();
				if (local169[local171] == 0) {
					local169[local171] = 1;
				}
			}
			for (local171 = 0; local171 < local16; local171++) {
				local22[local171].anIntArray26 = local169;
			}
			local4.anInt2803 = 0;
			for (local171 = 0; local171 < local16; local171++) {
				@Pc(214) Class15_Sub1 local214 = local22[local171];
				@Pc(220) int local220 = local214.anInt169 * local214.anInt165;
				local214.aByteArray1 = new byte[local220];
				@Pc(228) int local228 = local4.method20269();
				@Pc(259) int local259;
				if ((local228 & 0x2) == 0) {
					@Pc(238) int local238;
					if ((local228 & 0x1) == 0) {
						for (local238 = 0; local238 < local220; local238++) {
							local214.aByteArray1[local238] = local4.method20390();
						}
					} else {
						for (local238 = 0; local238 < local214.anInt169; local238++) {
							for (local259 = 0; local259 < local214.anInt165; local259++) {
								local214.aByteArray1[local238 + local259 * local214.anInt169] = local4.method20390();
							}
						}
					}
				} else {
					@Pc(282) boolean local282 = false;
					local214.aByteArray2 = new byte[local220];
					if ((local228 & 0x1) == 0) {
						for (local259 = 0; local259 < local220; local259++) {
							local214.aByteArray1[local259] = local4.method20390();
						}
						for (local259 = 0; local259 < local220; local259++) {
							@Pc(318) byte local318 = local214.aByteArray2[local259] = local4.method20390();
							local282 |= local318 != -1;
						}
					} else {
						@Pc(338) int local338;
						for (local259 = 0; local259 < local214.anInt169; local259++) {
							for (local338 = 0; local338 < local214.anInt165; local338++) {
								local214.aByteArray1[local259 + local338 * local214.anInt169] = local4.method20390();
							}
						}
						for (local259 = 0; local259 < local214.anInt169; local259++) {
							for (local338 = 0; local338 < local214.anInt165; local338++) {
								@Pc(384) byte local384 = local214.aByteArray2[local259 + local338 * local214.anInt169] = local4.method20390();
								local282 |= local384 != -1;
							}
						}
					}
					if (!local282) {
						local214.aByteArray2 = null;
					}
				}
			}
			return local22;
		}
		local4.anInt2803 = 0;
		@Pc(413) int local413 = local4.method20269();
		if (local413 == 0) {
			@Pc(424) boolean local424 = local4.method20269() == 1;
			local55 = local4.method20271();
			local63 = local4.method20271();
			local169 = new int[local55 * local63];
			for (local171 = 0; local171 < local55 * local63; local171++) {
				local169[local171] = local4.method20273() | 0xFF000000;
			}
			if (local424) {
				for (local171 = 0; local171 < local55 * local63; local171++) {
					local169[local171] &= 0xFFFFFF;
					local169[local171] |= local4.method20269() << 24;
				}
			}
			@Pc(490) Class15_Sub2 local490 = new Class15_Sub2(local55, local63, local169);
			return new Class15[] { local490 };
		} else if (local413 == 1) {
			try {
				@Pc(519) BufferedImage local519 = ImageIO.read(new ByteArrayInputStream(local4.aByteArray51, local4.anInt2803 * 62066237, local4.aByteArray51.length - local4.anInt2803 * 62066237));
				local55 = local519.getWidth();
				local63 = local519.getHeight();
				@Pc(542) Class15_Sub2 local542 = new Class15_Sub2(local55, local63, local519.getData().getPixels(0, 0, local55, local63, new int[local55 * local63]));
				return new Class15[] { local542 };
			} catch (@Pc(550) IOException local550) {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}
	}
}
