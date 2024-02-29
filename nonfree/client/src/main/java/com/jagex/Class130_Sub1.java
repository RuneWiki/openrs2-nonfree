package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ail")
public class Class130_Sub1 extends Class130 {

	@OriginalMember(owner = "client!ail", name = "cx", descriptor = "I")
	static final int anInt1408 = 0;

	@OriginalMember(owner = "client!ail", name = "ct", descriptor = "I")
	static final int anInt1409 = 1;

	@OriginalMember(owner = "client!ail", name = "cv", descriptor = "I")
	static final int anInt1410 = 2;

	@OriginalMember(owner = "client!ail", name = "cu", descriptor = "I")
	static final int anInt1411 = 3;

	@OriginalMember(owner = "client!ail", name = "op", descriptor = "I")
	static int anInt1413;

	@OriginalMember(owner = "client!ail", name = "ca", descriptor = "Z")
	static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!ail", name = "cr", descriptor = "Z")
	static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!ail", name = "cm", descriptor = "[I")
	static final int[] anIntArray189 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ail", name = "ci", descriptor = "[I")
	static final int[] anIntArray190 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ail", name = "co", descriptor = "[I")
	static final int[] anIntArray188 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ail", name = "cn", descriptor = "[I")
	static final int[] anIntArray191 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ail", name = "cq", descriptor = "I")
	int anInt1412 = 218513323;

	@OriginalMember(owner = "client!ail", name = "cs", descriptor = "Lclient!anu;")
	Class35_Sub12 aClass35_Sub12_5;

	@OriginalMember(owner = "client!ail", name = "cy", descriptor = "Lclient!wb;")
	Class613 aClass613_1;

	@OriginalMember(owner = "client!ail", name = "<init>", descriptor = "(Lclient!tk;Lclient!anu;IIIZLclient!ps;Lclient!wb;)V", line = 66)
	public Class130_Sub1(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class35_Sub12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class474 arg6, @OriginalArg(7) Class613 arg7) {
		super(arg0, arg2, arg3, arg4, arg5, Class555.aClass35_Sub17_3, Class65.aClass35_Sub13_1, arg6);
		this.aClass35_Sub12_5 = arg1;
		this.aClass613_1 = arg7;
	}

	@OriginalMember(owner = "client!ail", name = "cp", descriptor = "(Lclient!dx;Lclient!akv;II)V", line = 72)
	public final void method12487(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub39 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean295) {
			return;
		}
		arg1.anInt3089 += 1785150424;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class631 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(55) int local55;
			@Pc(255) int local255;
			@Pc(259) int local259;
			@Pc(59) int local59;
			while (arg1.anInt3089 * 31645619 < arg1.aByteArray53.length) {
				local27 = arg1.method22478();
				if (local27 != 0) {
					@Pc(121) int local121;
					@Pc(129) int local129;
					@Pc(133) int local133;
					if (local27 == 1) {
						local55 = arg1.method22478();
						if (local55 > 0) {
							for (local59 = 0; local59 < local55; local59++) {
								@Pc(74) Class561 local74 = new Class561(arg0, this.aClass556_13.anInt5243 * 941710601, arg1, 2);
								if (local74.anInt5286 * -1065201513 == 31) {
									@Pc(88) Class55 local88 = (Class55) Class96_Sub10.aClass35_Sub20_1.method18319(arg1.method22483());
									local74.method31295(local88.anInt185 * -1260868599, local88.anInt186 * -799202129, local88.anInt183 * -1111788061, local88.anInt184 * 94447489);
								}
								if (arg0.method20129() > 0) {
									@Pc(113) Class77_Sub22 local113 = local74.aClass77_Sub22_3;
									local121 = local113.method13544() + (arg2 << 9);
									local129 = local113.method13552() + (arg3 << 9);
									local133 = local121 >> 9;
									@Pc(137) int local137 = local129 >> 9;
									if (local133 >= 0 && local137 >= 0 && local133 < this.anInt1381 * -60640777 && local137 < this.anInt1400 * -1584311401) {
										local113.method13568(local121, this.anIntArrayArrayArray14[local74.anInt5307 * 551684827][local133][local137] - local113.method13550(), local129);
										this.aClass556_13.method31234(local74);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32616(arg1);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32617(arg1);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32622(arg1, this.aClass613_1);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray8 == null) {
							this.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local55 = 0; local55 < 4; local55++) {
							@Pc(244) byte local244 = arg1.method22481();
							if (local244 == 0 && this.aByteArrayArrayArray8[local55] != null) {
								local255 = arg2;
								local259 = arg2 + 64;
								local121 = arg3;
								local129 = arg3 + 64;
								if (arg2 < 0) {
									local255 = 0;
								} else if (arg2 >= this.anInt1381 * -60640777) {
									local255 = this.anInt1381 * -60640777;
								}
								if (local259 < 0) {
									local259 = 0;
								} else if (local259 >= this.anInt1381 * -60640777) {
									local259 = this.anInt1381 * -60640777;
								}
								if (arg3 < 0) {
									local121 = 0;
								} else if (arg3 >= this.anInt1400 * -1584311401) {
									local121 = this.anInt1400 * -1584311401;
								}
								if (local129 < 0) {
									local129 = 0;
								} else if (local129 >= this.anInt1400 * -1584311401) {
									local129 = this.anInt1400 * -1584311401;
								}
								while (local255 < local259) {
									while (local121 < local129) {
										this.aByteArrayArrayArray8[local55][local255][local121] = 0;
										local121++;
									}
									local255++;
								}
							} else if (local244 == 1) {
								if (this.aByteArrayArrayArray8[local55] == null) {
									this.aByteArrayArrayArray8[local55] = new byte[this.anInt1381 * -60640777 + 1][this.anInt1400 * -1584311401 + 1];
								}
								for (local255 = 0; local255 < 64; local255 += 4) {
									for (local259 = 0; local259 < 64; local259 += 4) {
										@Pc(389) byte local389 = arg1.method22481();
										for (local129 = arg2 + local255; local129 < arg2 + 4 + local255; local129++) {
											for (local133 = arg3 + local259; local133 < local259 + arg3 + 4; local133++) {
												if (local129 >= 0 && local129 < this.anInt1381 * -60640777 && local133 >= 0 && local133 < this.anInt1400 * -1584311401) {
													this.aByteArrayArrayArray8[local55][local129][local133] = local389;
												}
											}
										}
									}
								}
							} else if (local244 == 2) {
								if (this.aByteArrayArrayArray8[local55] == null) {
									this.aByteArrayArrayArray8[local55] = new byte[this.anInt1381 * -60640777 + 1][this.anInt1400 * -1584311401 + 1];
								}
								if (local55 > 0) {
									local255 = arg2;
									local259 = arg2 + 64;
									local121 = arg3;
									local129 = arg3 + 64;
									if (arg2 < 0) {
										local255 = 0;
									} else if (arg2 >= this.anInt1381 * -60640777) {
										local255 = this.anInt1381 * -60640777;
									}
									if (local259 < 0) {
										local259 = 0;
									} else if (local259 >= this.anInt1381 * -60640777) {
										local259 = this.anInt1381 * -60640777;
									}
									if (arg3 < 0) {
										local121 = 0;
									} else if (arg3 >= this.anInt1400 * -1584311401) {
										local121 = this.anInt1400 * -1584311401;
									}
									if (local129 < 0) {
										local129 = 0;
									} else if (local129 >= this.anInt1400 * -1584311401) {
										local129 = this.anInt1400 * -1584311401;
									}
									while (local255 < local259) {
										while (local121 < local129) {
											this.aByteArrayArrayArray8[local55][local255][local121] = this.aByteArrayArrayArray8[local55 - 1][local255][local121];
											local121++;
										}
										local255++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class631(arg1, this.aClass613_1);
				} else {
					local13.method32615(arg1, this.aClass613_1);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local55 = 0; local55 < 8; local55++) {
					local59 = local27 + (arg2 >> 3);
					local255 = (arg3 >> 3) + local55;
					if (local59 >= 0 && local59 < this.anInt1381 * -60640777 >> 3 && local255 >= 0 && local255 < this.anInt1400 * -1584311401 >> 3) {
						if (local13 != null) {
							this.aClass613_1.method32275(local59, local255, local13);
						}
						Class313.method27313(local59, local255, local15);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray8 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray8[local27] != null) {
						for (local55 = 0; local55 < 16; local55++) {
							for (local59 = 0; local59 < 16; local59++) {
								local255 = (arg2 >> 2) + local55;
								local259 = (arg3 >> 2) + local59;
								if (local255 >= 0 && local255 < 26 && local259 >= 0 && local259 < 26) {
									this.aByteArrayArrayArray8[local27][local255][local259] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ail", name = "bm", descriptor = "(Lclient!dx;Lclient!akv;III)V", line = 72)
	public final void method12488(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub39 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean295) {
			return;
		}
		arg1.anInt3089 += 1785150424;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class631 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(55) int local55;
			@Pc(255) int local255;
			@Pc(259) int local259;
			@Pc(59) int local59;
			while (arg1.anInt3089 * 31645619 < arg1.aByteArray53.length) {
				local27 = arg1.method22478();
				if (local27 != 0) {
					@Pc(121) int local121;
					@Pc(129) int local129;
					@Pc(133) int local133;
					if (local27 == 1) {
						local55 = arg1.method22478();
						if (local55 > 0) {
							for (local59 = 0; local59 < local55; local59++) {
								@Pc(74) Class561 local74 = new Class561(arg0, this.aClass556_13.anInt5243 * 941710601, arg1, 2);
								if (local74.anInt5286 * -1065201513 == 31) {
									@Pc(88) Class55 local88 = (Class55) Class96_Sub10.aClass35_Sub20_1.method18319(arg1.method22483());
									local74.method31295(local88.anInt185 * -1260868599, local88.anInt186 * -799202129, local88.anInt183 * -1111788061, local88.anInt184 * 94447489);
								}
								if (arg0.method20129() > 0) {
									@Pc(113) Class77_Sub22 local113 = local74.aClass77_Sub22_3;
									local121 = local113.method13544() + (arg2 << 9);
									local129 = local113.method13552() + (arg3 << 9);
									local133 = local121 >> 9;
									@Pc(137) int local137 = local129 >> 9;
									if (local133 >= 0 && local137 >= 0 && local133 < this.anInt1381 * -60640777 && local137 < this.anInt1400 * -1584311401) {
										local113.method13568(local121, this.anIntArrayArrayArray14[local74.anInt5307 * 551684827][local133][local137] - local113.method13550(), local129);
										this.aClass556_13.method31234(local74);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32616(arg1);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32617(arg1);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32622(arg1, this.aClass613_1);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray8 == null) {
							this.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local55 = 0; local55 < 4; local55++) {
							@Pc(244) byte local244 = arg1.method22481();
							if (local244 == 0 && this.aByteArrayArrayArray8[local55] != null) {
								local255 = arg2;
								local259 = arg2 + 64;
								local121 = arg3;
								local129 = arg3 + 64;
								if (arg2 < 0) {
									local255 = 0;
								} else if (arg2 >= this.anInt1381 * -60640777) {
									local255 = this.anInt1381 * -60640777;
								}
								if (local259 < 0) {
									local259 = 0;
								} else if (local259 >= this.anInt1381 * -60640777) {
									local259 = this.anInt1381 * -60640777;
								}
								if (arg3 < 0) {
									local121 = 0;
								} else if (arg3 >= this.anInt1400 * -1584311401) {
									local121 = this.anInt1400 * -1584311401;
								}
								if (local129 < 0) {
									local129 = 0;
								} else if (local129 >= this.anInt1400 * -1584311401) {
									local129 = this.anInt1400 * -1584311401;
								}
								while (local255 < local259) {
									while (local121 < local129) {
										this.aByteArrayArrayArray8[local55][local255][local121] = 0;
										local121++;
									}
									local255++;
								}
							} else if (local244 == 1) {
								if (this.aByteArrayArrayArray8[local55] == null) {
									this.aByteArrayArrayArray8[local55] = new byte[this.anInt1381 * -60640777 + 1][this.anInt1400 * -1584311401 + 1];
								}
								for (local255 = 0; local255 < 64; local255 += 4) {
									for (local259 = 0; local259 < 64; local259 += 4) {
										@Pc(389) byte local389 = arg1.method22481();
										for (local129 = arg2 + local255; local129 < arg2 + 4 + local255; local129++) {
											for (local133 = arg3 + local259; local133 < local259 + arg3 + 4; local133++) {
												if (local129 >= 0 && local129 < this.anInt1381 * -60640777 && local133 >= 0 && local133 < this.anInt1400 * -1584311401) {
													this.aByteArrayArrayArray8[local55][local129][local133] = local389;
												}
											}
										}
									}
								}
							} else if (local244 == 2) {
								if (this.aByteArrayArrayArray8[local55] == null) {
									this.aByteArrayArrayArray8[local55] = new byte[this.anInt1381 * -60640777 + 1][this.anInt1400 * -1584311401 + 1];
								}
								if (local55 > 0) {
									local255 = arg2;
									local259 = arg2 + 64;
									local121 = arg3;
									local129 = arg3 + 64;
									if (arg2 < 0) {
										local255 = 0;
									} else if (arg2 >= this.anInt1381 * -60640777) {
										local255 = this.anInt1381 * -60640777;
									}
									if (local259 < 0) {
										local259 = 0;
									} else if (local259 >= this.anInt1381 * -60640777) {
										local259 = this.anInt1381 * -60640777;
									}
									if (arg3 < 0) {
										local121 = 0;
									} else if (arg3 >= this.anInt1400 * -1584311401) {
										local121 = this.anInt1400 * -1584311401;
									}
									if (local129 < 0) {
										local129 = 0;
									} else if (local129 >= this.anInt1400 * -1584311401) {
										local129 = this.anInt1400 * -1584311401;
									}
									while (local255 < local259) {
										while (local121 < local129) {
											this.aByteArrayArrayArray8[local55][local255][local121] = this.aByteArrayArrayArray8[local55 - 1][local255][local121];
											local121++;
										}
										local255++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class631(arg1, this.aClass613_1);
				} else {
					local13.method32615(arg1, this.aClass613_1);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local55 = 0; local55 < 8; local55++) {
					local59 = local27 + (arg2 >> 3);
					local255 = (arg3 >> 3) + local55;
					if (local59 >= 0 && local59 < this.anInt1381 * -60640777 >> 3 && local255 >= 0 && local255 < this.anInt1400 * -1584311401 >> 3) {
						if (local13 != null) {
							this.aClass613_1.method32275(local59, local255, local13);
						}
						Class313.method27313(local59, local255, local15);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray8 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray8[local27] != null) {
						for (local55 = 0; local55 < 16; local55++) {
							for (local59 = 0; local59 < 16; local59++) {
								local255 = (arg2 >> 2) + local55;
								local259 = (arg3 >> 2) + local59;
								if (local255 >= 0 && local255 < 26 && local259 >= 0 && local259 < 26) {
									this.aByteArrayArrayArray8[local27][local255][local259] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ail", name = "bf", descriptor = "(IIS)I", line = 82)
	static int method12489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class593.aClass593_3.anInt5501 * 847393323 == arg0 || Class593.aClass593_5.anInt5501 * 847393323 == arg0 ? Class104_Sub1_Sub2_Sub1.anIntArray135[arg1 & 0x3] : Class104_Sub1_Sub2_Sub1.anIntArray136[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ail", name = "bo", descriptor = "(Lclient!dx;Lclient!akv;IIIIIIII)V", line = 212)
	public final void method12490(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub39 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean295) {
			return;
		}
		arg1.anInt3089 += 1785150424;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class631 local13 = null;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = (arg6 & 0x7) * 8;
		@Pc(27) int local27 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(67) int local67;
			@Pc(331) int local331;
			@Pc(71) int local71;
			while (arg1.anInt3089 * 31645619 < arg1.aByteArray53.length) {
				local39 = arg1.method22478();
				if (local39 != 0) {
					@Pc(137) int local137;
					@Pc(177) int local177;
					@Pc(195) int local195;
					@Pc(131) int local131;
					if (local39 == 1) {
						local67 = arg1.method22478();
						if (local67 > 0) {
							for (local71 = 0; local71 < local67; local71++) {
								@Pc(86) Class561 local86 = new Class561(arg0, this.aClass556_13.anInt5243 * 941710601, arg1, 2);
								if (local86.anInt5286 * -1065201513 == 31) {
									@Pc(100) Class55 local100 = (Class55) Class96_Sub10.aClass35_Sub20_1.method18319(arg1.method22483());
									local86.method31295(local100.anInt185 * -1260868599, local100.anInt186 * -799202129, local100.anInt183 * -1111788061, local100.anInt184 * 94447489);
								}
								if (arg0.method20129() > 0) {
									@Pc(125) Class77_Sub22 local125 = local86.aClass77_Sub22_3;
									local131 = local125.method13544() >> 9;
									local137 = local125.method13552() >> 9;
									if (local86.anInt5307 * 551684827 == arg5 && local131 >= local21 && local131 < local21 + 8 && local137 >= local27 && local137 < local27 + 8) {
										local177 = (arg3 << 9) + Class422.method28707(local125.method13544() & 0xFFF, local125.method13552() & 0xFFF, arg8);
										local195 = (arg4 << 9) + Class668.method33173(local125.method13544() & 0xFFF, local125.method13552() & 0xFFF, arg8);
										local131 = local177 >> 9;
										local137 = local195 >> 9;
										if (local131 >= 0 && local137 >= 0 && local131 < this.anInt1381 * -60640777 && local137 < this.anInt1400 * -1584311401) {
											local86.anInt5307 = arg2 * 725934419;
											local125.method13568(local177, this.anIntArrayArrayArray14[local86.anInt5307 * 551684827][local131][local137] - local125.method13550(), local195);
											this.aClass556_13.method31234(local86);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32616(arg1);
					} else if (local39 == 3) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32617(arg1);
					} else if (local39 == 128) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32622(arg1, this.aClass613_1);
					} else if (local39 == 129) {
						if (this.aByteArrayArrayArray8 == null) {
							this.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local67 = 0; local67 < 4; local67++) {
							@Pc(318) byte local318 = arg1.method22481();
							@Pc(335) int local335;
							if (local318 == 0 && this.aByteArrayArrayArray8[arg2] != null) {
								if (local67 <= arg5) {
									local331 = arg3;
									local335 = arg3 + 7;
									local131 = arg4;
									local137 = arg4 + 7;
									if (arg3 < 0) {
										local331 = 0;
									} else if (arg3 >= this.anInt1381 * -60640777) {
										local331 = this.anInt1381 * -60640777;
									}
									if (local335 < 0) {
										local335 = 0;
									} else if (local335 >= this.anInt1381 * -60640777) {
										local335 = this.anInt1381 * -60640777;
									}
									if (arg4 < 0) {
										local131 = 0;
									} else if (arg4 >= this.anInt1400 * -1584311401) {
										local131 = this.anInt1400 * -1584311401;
									}
									if (local137 < 0) {
										local137 = 0;
									} else if (local137 >= this.anInt1400 * -1584311401) {
										local137 = this.anInt1400 * -1584311401;
									}
									while (local331 < local335) {
										while (local131 < local137) {
											this.aByteArrayArrayArray8[arg2][local331][local131] = 0;
											local131++;
										}
										local331++;
									}
								}
							} else if (local318 == 1) {
								if (this.aByteArrayArrayArray8[arg2] == null) {
									this.aByteArrayArrayArray8[arg2] = new byte[this.anInt1381 * -60640777 + 1][this.anInt1400 * -1584311401 + 1];
								}
								for (local331 = 0; local331 < 64; local331 += 4) {
									for (local335 = 0; local335 < 64; local335 += 4) {
										@Pc(464) byte local464 = arg1.method22481();
										if (local67 <= arg5) {
											for (local137 = local331; local137 < local331 + 4; local137++) {
												for (local177 = local335; local177 < local335 + 4; local177++) {
													if (local137 >= local21 && local137 < local21 + 8 && local177 >= local27 && local177 < local27 + 8) {
														local195 = arg3 + Class642.method32810(local137 & 0x7, local177 & 0x7, arg8);
														@Pc(521) int local521 = arg4 + Class37.method644(local137 & 0x7, local177 & 0x7, arg8);
														if (local195 >= 0 && local195 < this.anInt1381 * -60640777 && local521 >= 0 && local521 < this.anInt1400 * -1584311401) {
															this.aByteArrayArrayArray8[arg2][local195][local521] = local464;
															local11 = true;
														}
													}
												}
											}
										}
									}
								}
							} else if (local318 == 2) {
							}
						}
					} else if (local39 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class631(arg1, this.aClass613_1);
				} else {
					local13.method32615(arg1, this.aClass613_1);
				}
			}
			if (local13 != null) {
				this.aClass613_1.method32275(arg3 >> 3, arg4 >> 3, local13);
			}
			Class313.method27313(arg3 >> 3, arg4 >> 3, local15);
			if (!local11 && this.aByteArrayArrayArray8 != null && this.aByteArrayArrayArray8[arg2] != null) {
				local39 = arg3 + 7;
				local67 = arg4 + 7;
				for (local71 = arg3; local71 < local39; local71++) {
					for (local331 = arg4; local331 < local67; local331++) {
						this.aByteArrayArrayArray8[arg2][local71][local331] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ail", name = "cw", descriptor = "(Lclient!dx;Lclient!akv;IIIIIII)V", line = 212)
	public final void method12491(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub39 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean295) {
			return;
		}
		arg1.anInt3089 += 1785150424;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class631 local13 = null;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = (arg6 & 0x7) * 8;
		@Pc(27) int local27 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(67) int local67;
			@Pc(331) int local331;
			@Pc(71) int local71;
			while (arg1.anInt3089 * 31645619 < arg1.aByteArray53.length) {
				local39 = arg1.method22478();
				if (local39 != 0) {
					@Pc(137) int local137;
					@Pc(177) int local177;
					@Pc(195) int local195;
					@Pc(131) int local131;
					if (local39 == 1) {
						local67 = arg1.method22478();
						if (local67 > 0) {
							for (local71 = 0; local71 < local67; local71++) {
								@Pc(86) Class561 local86 = new Class561(arg0, this.aClass556_13.anInt5243 * 941710601, arg1, 2);
								if (local86.anInt5286 * -1065201513 == 31) {
									@Pc(100) Class55 local100 = (Class55) Class96_Sub10.aClass35_Sub20_1.method18319(arg1.method22483());
									local86.method31295(local100.anInt185 * -1260868599, local100.anInt186 * -799202129, local100.anInt183 * -1111788061, local100.anInt184 * 94447489);
								}
								if (arg0.method20129() > 0) {
									@Pc(125) Class77_Sub22 local125 = local86.aClass77_Sub22_3;
									local131 = local125.method13544() >> 9;
									local137 = local125.method13552() >> 9;
									if (local86.anInt5307 * 551684827 == arg5 && local131 >= local21 && local131 < local21 + 8 && local137 >= local27 && local137 < local27 + 8) {
										local177 = (arg3 << 9) + Class422.method28707(local125.method13544() & 0xFFF, local125.method13552() & 0xFFF, arg8);
										local195 = (arg4 << 9) + Class668.method33173(local125.method13544() & 0xFFF, local125.method13552() & 0xFFF, arg8);
										local131 = local177 >> 9;
										local137 = local195 >> 9;
										if (local131 >= 0 && local137 >= 0 && local131 < this.anInt1381 * -60640777 && local137 < this.anInt1400 * -1584311401) {
											local86.anInt5307 = arg2 * 725934419;
											local125.method13568(local177, this.anIntArrayArrayArray14[local86.anInt5307 * 551684827][local131][local137] - local125.method13550(), local195);
											this.aClass556_13.method31234(local86);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32616(arg1);
					} else if (local39 == 3) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32617(arg1);
					} else if (local39 == 128) {
						if (local13 == null) {
							local13 = new Class631();
						}
						local13.method32622(arg1, this.aClass613_1);
					} else if (local39 == 129) {
						if (this.aByteArrayArrayArray8 == null) {
							this.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local67 = 0; local67 < 4; local67++) {
							@Pc(318) byte local318 = arg1.method22481();
							@Pc(335) int local335;
							if (local318 == 0 && this.aByteArrayArrayArray8[arg2] != null) {
								if (local67 <= arg5) {
									local331 = arg3;
									local335 = arg3 + 7;
									local131 = arg4;
									local137 = arg4 + 7;
									if (arg3 < 0) {
										local331 = 0;
									} else if (arg3 >= this.anInt1381 * -60640777) {
										local331 = this.anInt1381 * -60640777;
									}
									if (local335 < 0) {
										local335 = 0;
									} else if (local335 >= this.anInt1381 * -60640777) {
										local335 = this.anInt1381 * -60640777;
									}
									if (arg4 < 0) {
										local131 = 0;
									} else if (arg4 >= this.anInt1400 * -1584311401) {
										local131 = this.anInt1400 * -1584311401;
									}
									if (local137 < 0) {
										local137 = 0;
									} else if (local137 >= this.anInt1400 * -1584311401) {
										local137 = this.anInt1400 * -1584311401;
									}
									while (local331 < local335) {
										while (local131 < local137) {
											this.aByteArrayArrayArray8[arg2][local331][local131] = 0;
											local131++;
										}
										local331++;
									}
								}
							} else if (local318 == 1) {
								if (this.aByteArrayArrayArray8[arg2] == null) {
									this.aByteArrayArrayArray8[arg2] = new byte[this.anInt1381 * -60640777 + 1][this.anInt1400 * -1584311401 + 1];
								}
								for (local331 = 0; local331 < 64; local331 += 4) {
									for (local335 = 0; local335 < 64; local335 += 4) {
										@Pc(464) byte local464 = arg1.method22481();
										if (local67 <= arg5) {
											for (local137 = local331; local137 < local331 + 4; local137++) {
												for (local177 = local335; local177 < local335 + 4; local177++) {
													if (local137 >= local21 && local137 < local21 + 8 && local177 >= local27 && local177 < local27 + 8) {
														local195 = arg3 + Class642.method32810(local137 & 0x7, local177 & 0x7, arg8);
														@Pc(521) int local521 = arg4 + Class37.method644(local137 & 0x7, local177 & 0x7, arg8);
														if (local195 >= 0 && local195 < this.anInt1381 * -60640777 && local521 >= 0 && local521 < this.anInt1400 * -1584311401) {
															this.aByteArrayArrayArray8[arg2][local195][local521] = local464;
															local11 = true;
														}
													}
												}
											}
										}
									}
								}
							} else if (local318 == 2) {
							}
						}
					} else if (local39 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class631(arg1, this.aClass613_1);
				} else {
					local13.method32615(arg1, this.aClass613_1);
				}
			}
			if (local13 != null) {
				this.aClass613_1.method32275(arg3 >> 3, arg4 >> 3, local13);
			}
			Class313.method27313(arg3 >> 3, arg4 >> 3, local15);
			if (!local11 && this.aByteArrayArrayArray8 != null && this.aByteArrayArrayArray8[arg2] != null) {
				local39 = arg3 + 7;
				local67 = arg4 + 7;
				for (local71 = arg3; local71 < local39; local71++) {
					for (local331 = arg4; local331 < local67; local331++) {
						this.aByteArrayArrayArray8[arg2][local71][local331] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ail", name = "ck", descriptor = "(Lclient!anu;[BIIIILclient!xj;Lclient!xj;)I", line = 334)
	public static final int method12492(@OriginalArg(0) Class35_Sub12 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class645 arg6, @OriginalArg(7) Class645 arg7) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class77_Sub39 local6 = new Class77_Sub39(arg1);
		@Pc(8) int local8 = -1;
		label65: while (true) {
			@Pc(12) int local12 = local6.method22545();
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(22) int local22 = 0;
			@Pc(24) boolean local24 = false;
			while (true) {
				@Pc(30) int local30;
				while (!local24) {
					local30 = local6.method22537();
					if (local30 == 0) {
						continue label65;
					}
					local22 += local30 - 1;
					@Pc(56) int local56 = local22 & 0x3F;
					@Pc(62) int local62 = local22 >> 6 & 0x3F;
					@Pc(68) int local68 = local6.method22478() >> 2;
					@Pc(72) int local72 = local68 & 0x3;
					@Pc(76) int local76 = local68 >> 2;
					@Pc(80) int local80 = local62 + arg2;
					@Pc(84) int local84 = arg3 + local56;
					@Pc(90) Class599 local90 = (Class599) arg0.method18319(local8);
					@Pc(100) int local100;
					@Pc(105) int local105;
					if ((local72 & 0x1) == 0) {
						local100 = local90.anInt5516 * -1082258489;
						local105 = local90.anInt5529 * -1990374967;
					} else {
						local100 = local90.anInt5529 * -1990374967;
						local105 = local90.anInt5516 * -1082258489;
					}
					if (local80 < arg4 && local84 < arg5 && local80 + local100 >= 0 && local105 + local84 >= 0 && (local76 != Class593.aClass593_19.anInt5501 * 847393323 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222() != 0 || local90.anInt5518 * -2134171963 != 0 || local90.anInt5527 * -499459421 == 1 || local90.aBoolean821)) {
						if (!local90.method31998(arg7)) {
							arg6.anInt5723 = local8 * 511701673;
							local1++;
						}
						local24 = true;
					}
				}
				local30 = local6.method22537();
				if (local30 == 0) {
					break;
				}
				local6.method22478();
			}
		}
	}

	@OriginalMember(owner = "client!ail", name = "ca", descriptor = "(Lclient!anu;II)Z", line = 386)
	static final boolean method12493(@OriginalArg(0) Class35_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class599 local5 = (Class599) arg0.method18319(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local5.method31995(arg2);
	}

	@OriginalMember(owner = "client!ail", name = "cz", descriptor = "(Lclient!anu;II)Z", line = 386)
	static final boolean method12494(@OriginalArg(0) Class35_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class599 local5 = (Class599) arg0.method18319(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local5.method31995(arg2);
	}

	@OriginalMember(owner = "client!ail", name = "ch", descriptor = "(Lclient!anu;II)Z", line = 386)
	static final boolean method12495(@OriginalArg(0) Class35_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class599 local5 = (Class599) arg0.method18319(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local5.method31995(arg2);
	}

	@OriginalMember(owner = "client!ail", name = "ct", descriptor = "(Lclient!dx;[BII)V", line = 393)
	public final void method12496(@OriginalArg(0) Class86 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.method22545();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(64) int local64;
				@Pc(68) int local68;
				@Pc(108) int local108;
				do {
					@Pc(104) int local104;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.method22537();
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									@Pc(52) int local52 = local4.method22478();
									local56 = local52 >> 2;
									local60 = local52 & 0x3;
									local64 = arg2 + local44;
									local68 = local38 + arg3;
									@Pc(75) Class599 local75 = (Class599) this.aClass35_Sub12_5.method18319(local6);
									@Pc(84) int local84;
									@Pc(89) int local89;
									if ((local60 & 0x1) == 0) {
										local84 = local75.anInt5516 * -1082258489;
										local89 = local75.anInt5529 * -1990374967;
									} else {
										local84 = local75.anInt5529 * -1990374967;
										local89 = local75.anInt5516 * -1082258489;
									}
									local104 = local64 + local84;
									local108 = local89 + local68;
								} while (local64 >= this.anInt1381 * -60640777);
							} while (local68 >= this.anInt1400 * -1584311401);
						} while (local104 <= 0);
					} while (local108 <= 0);
				} while (Class593.aClass593_9.anInt5501 * 847393323 != local56 && local56 != Class593.aClass593_23.anInt5501 * 847393323 && (local64 <= 0 || local68 <= 0 || local64 >= this.anInt1381 * -60640777 - 1 || local68 >= this.anInt1400 * -1584311401 - 1));
				this.method12503(arg0, local48, local48, local64, local68, local6, local60, local56, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ail", name = "bq", descriptor = "(Lclient!dx;[BIII)V", line = 393)
	public final void method12497(@OriginalArg(0) Class86 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.method22545();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(64) int local64;
				@Pc(68) int local68;
				@Pc(108) int local108;
				do {
					@Pc(104) int local104;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.method22537();
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									@Pc(52) int local52 = local4.method22478();
									local56 = local52 >> 2;
									local60 = local52 & 0x3;
									local64 = arg2 + local44;
									local68 = local38 + arg3;
									@Pc(75) Class599 local75 = (Class599) this.aClass35_Sub12_5.method18319(local6);
									@Pc(84) int local84;
									@Pc(89) int local89;
									if ((local60 & 0x1) == 0) {
										local84 = local75.anInt5516 * -1082258489;
										local89 = local75.anInt5529 * -1990374967;
									} else {
										local84 = local75.anInt5529 * -1990374967;
										local89 = local75.anInt5516 * -1082258489;
									}
									local104 = local64 + local84;
									local108 = local89 + local68;
								} while (local64 >= this.anInt1381 * -60640777);
							} while (local68 >= this.anInt1400 * -1584311401);
						} while (local104 <= 0);
					} while (local108 <= 0);
				} while (Class593.aClass593_9.anInt5501 * 847393323 != local56 && local56 != Class593.aClass593_23.anInt5501 * 847393323 && (local64 <= 0 || local68 <= 0 || local64 >= this.anInt1381 * -60640777 - 1 || local68 >= this.anInt1400 * -1584311401 - 1));
				this.method12503(arg0, local48, local48, local64, local68, local6, local60, local56, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ail", name = "cr", descriptor = "(Lclient!dx;[BII)V", line = 393)
	public final void method12498(@OriginalArg(0) Class86 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.method22545();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(64) int local64;
				@Pc(68) int local68;
				@Pc(108) int local108;
				do {
					@Pc(104) int local104;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.method22537();
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									@Pc(52) int local52 = local4.method22478();
									local56 = local52 >> 2;
									local60 = local52 & 0x3;
									local64 = arg2 + local44;
									local68 = local38 + arg3;
									@Pc(75) Class599 local75 = (Class599) this.aClass35_Sub12_5.method18319(local6);
									@Pc(84) int local84;
									@Pc(89) int local89;
									if ((local60 & 0x1) == 0) {
										local84 = local75.anInt5516 * -1082258489;
										local89 = local75.anInt5529 * -1990374967;
									} else {
										local84 = local75.anInt5529 * -1990374967;
										local89 = local75.anInt5516 * -1082258489;
									}
									local104 = local64 + local84;
									local108 = local89 + local68;
								} while (local64 >= this.anInt1381 * -60640777);
							} while (local68 >= this.anInt1400 * -1584311401);
						} while (local104 <= 0);
					} while (local108 <= 0);
				} while (Class593.aClass593_9.anInt5501 * 847393323 != local56 && local56 != Class593.aClass593_23.anInt5501 * 847393323 && (local64 <= 0 || local68 <= 0 || local64 >= this.anInt1381 * -60640777 - 1 || local68 >= this.anInt1400 * -1584311401 - 1));
				this.method12503(arg0, local48, local48, local64, local68, local6, local60, local56, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ail", name = "cv", descriptor = "(Lclient!dx;[BII)V", line = 393)
	public final void method12499(@OriginalArg(0) Class86 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.method22545();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(64) int local64;
				@Pc(68) int local68;
				@Pc(108) int local108;
				do {
					@Pc(104) int local104;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.method22537();
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									@Pc(52) int local52 = local4.method22478();
									local56 = local52 >> 2;
									local60 = local52 & 0x3;
									local64 = arg2 + local44;
									local68 = local38 + arg3;
									@Pc(75) Class599 local75 = (Class599) this.aClass35_Sub12_5.method18319(local6);
									@Pc(84) int local84;
									@Pc(89) int local89;
									if ((local60 & 0x1) == 0) {
										local84 = local75.anInt5516 * -1082258489;
										local89 = local75.anInt5529 * -1990374967;
									} else {
										local84 = local75.anInt5529 * -1990374967;
										local89 = local75.anInt5516 * -1082258489;
									}
									local104 = local64 + local84;
									local108 = local89 + local68;
								} while (local64 >= this.anInt1381 * -60640777);
							} while (local68 >= this.anInt1400 * -1584311401);
						} while (local104 <= 0);
					} while (local108 <= 0);
				} while (Class593.aClass593_9.anInt5501 * 847393323 != local56 && local56 != Class593.aClass593_23.anInt5501 * 847393323 && (local64 <= 0 || local68 <= 0 || local64 >= this.anInt1381 * -60640777 - 1 || local68 >= this.anInt1400 * -1584311401 - 1));
				this.method12503(arg0, local48, local48, local64, local68, local6, local60, local56, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ail", name = "cu", descriptor = "(Lclient!dx;[BII)V", line = 393)
	public final void method12500(@OriginalArg(0) Class86 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.method22545();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(64) int local64;
				@Pc(68) int local68;
				@Pc(108) int local108;
				do {
					@Pc(104) int local104;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.method22537();
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									@Pc(52) int local52 = local4.method22478();
									local56 = local52 >> 2;
									local60 = local52 & 0x3;
									local64 = arg2 + local44;
									local68 = local38 + arg3;
									@Pc(75) Class599 local75 = (Class599) this.aClass35_Sub12_5.method18319(local6);
									@Pc(84) int local84;
									@Pc(89) int local89;
									if ((local60 & 0x1) == 0) {
										local84 = local75.anInt5516 * -1082258489;
										local89 = local75.anInt5529 * -1990374967;
									} else {
										local84 = local75.anInt5529 * -1990374967;
										local89 = local75.anInt5516 * -1082258489;
									}
									local104 = local64 + local84;
									local108 = local89 + local68;
								} while (local64 >= this.anInt1381 * -60640777);
							} while (local68 >= this.anInt1400 * -1584311401);
						} while (local104 <= 0);
					} while (local108 <= 0);
				} while (Class593.aClass593_9.anInt5501 * 847393323 != local56 && local56 != Class593.aClass593_23.anInt5501 * 847393323 && (local64 <= 0 || local68 <= 0 || local64 >= this.anInt1381 * -60640777 - 1 || local68 >= this.anInt1400 * -1584311401 - 1));
				this.method12503(arg0, local48, local48, local64, local68, local6, local60, local56, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ail", name = "cx", descriptor = "(Lclient!dx;[BII)V", line = 393)
	public final void method12501(@OriginalArg(0) Class86 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.method22545();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(64) int local64;
				@Pc(68) int local68;
				@Pc(108) int local108;
				do {
					@Pc(104) int local104;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.method22537();
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									@Pc(52) int local52 = local4.method22478();
									local56 = local52 >> 2;
									local60 = local52 & 0x3;
									local64 = arg2 + local44;
									local68 = local38 + arg3;
									@Pc(75) Class599 local75 = (Class599) this.aClass35_Sub12_5.method18319(local6);
									@Pc(84) int local84;
									@Pc(89) int local89;
									if ((local60 & 0x1) == 0) {
										local84 = local75.anInt5516 * -1082258489;
										local89 = local75.anInt5529 * -1990374967;
									} else {
										local84 = local75.anInt5529 * -1990374967;
										local89 = local75.anInt5516 * -1082258489;
									}
									local104 = local64 + local84;
									local108 = local89 + local68;
								} while (local64 >= this.anInt1381 * -60640777);
							} while (local68 >= this.anInt1400 * -1584311401);
						} while (local104 <= 0);
					} while (local108 <= 0);
				} while (Class593.aClass593_9.anInt5501 * 847393323 != local56 && local56 != Class593.aClass593_23.anInt5501 * 847393323 && (local64 <= 0 || local68 <= 0 || local64 >= this.anInt1381 * -60640777 - 1 || local68 >= this.anInt1400 * -1584311401 - 1));
				this.method12503(arg0, local48, local48, local64, local68, local6, local60, local56, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ail", name = "bh", descriptor = "(Lclient!dx;[BIIIIIIIB)V", line = 435)
	public final void method12502(@OriginalArg(0) Class86 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.method22545();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(132) int local132;
				@Pc(153) int local153;
				@Pc(161) int local161;
				do {
					@Pc(157) int local157;
					do {
						do {
							do {
								do {
									@Pc(38) int local38;
									@Pc(44) int local44;
									do {
										do {
											do {
												@Pc(48) int local48;
												do {
													do {
														@Pc(24) int local24 = local4.method22537();
														if (local24 == 0) {
															continue label91;
														}
														local20 += local24 - 1;
														local38 = local20 & 0x3F;
														local44 = local20 >> 6 & 0x3F;
														local48 = local20 >> 12;
														@Pc(52) int local52 = local4.method22478();
														local56 = local52 >> 2;
														local60 = local52 & 0x3;
													} while (arg5 != local48);
												} while (local44 < arg6);
											} while (local44 >= arg6 + 8);
										} while (local38 < arg7);
									} while (local38 >= arg7 + 8);
									@Pc(86) Class599 local86 = (Class599) this.aClass35_Sub12_5.method18319(local6);
									@Pc(95) int local95;
									@Pc(100) int local100;
									if ((local60 & 0x1) == 0) {
										local95 = local86.anInt5516 * -1082258489;
										local100 = local86.anInt5529 * -1990374967;
									} else {
										local95 = local86.anInt5529 * -1990374967;
										local100 = local86.anInt5516 * -1082258489;
									}
									local132 = arg3 + Class417.method28674(local44 & 0x7, local38 & 0x7, arg8, local86.anInt5516 * -1082258489, local86.anInt5529 * -1990374967, local60);
									local153 = arg4 + Class241.method25953(local44 & 0x7, local38 & 0x7, arg8, local86.anInt5516 * -1082258489, local86.anInt5529 * -1990374967, local60);
									local157 = local95 + local132;
									local161 = local100 + local153;
								} while (local132 >= this.anInt1381 * -60640777);
							} while (local153 >= this.anInt1400 * -1584311401);
						} while (local157 <= 0);
					} while (local161 <= 0);
				} while (Class593.aClass593_9.anInt5501 * 847393323 != local56 && Class593.aClass593_23.anInt5501 * 847393323 != local56 && (local132 <= 0 || local153 <= 0 || local132 >= this.anInt1381 * -60640777 - 1 || local153 >= this.anInt1400 * -1584311401 - 1));
				this.method12503(arg0, arg2, arg2, local132, local153, local6, local60 + arg8 & 0x3, local56, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ail", name = "be", descriptor = "(Lclient!dx;IIIIIIIIII)V", line = 479)
	final void method12503(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < this.anInt1412 * 602499625) {
			this.anInt1412 = arg2 * -301477351;
		}
		@Pc(17) Class599 local17 = (Class599) this.aClass35_Sub12_5.method18319(arg5);
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method15463() == 0 && local17.aBoolean824) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		if (arg6 == 1 || arg6 == 3) {
			local37 = local17.anInt5529 * -1990374967;
			local42 = local17.anInt5516 * -1082258489;
		} else {
			local37 = local17.anInt5516 * -1082258489;
			local42 = local17.anInt5529 * -1990374967;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (arg3 + local37 <= this.anInt1381 * -60640777) {
			local67 = arg3 + (local37 >> 1);
			local75 = arg3 + (local37 + 1 >> 1);
		} else {
			local67 = arg3;
			local75 = arg3 + 1;
		}
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (arg4 + local42 <= this.anInt1400 * -1584311401) {
			local96 = arg4 + (local42 >> 1);
			local104 = (local42 + 1 >> 1) + arg4;
		} else {
			local96 = arg4;
			local104 = arg4 + 1;
		}
		@Pc(117) Class88 local117 = this.aClass556_13.aClass88Array1[arg1];
		@Pc(155) int local155;
		if (Class593.aClass593_9.anInt5501 * 847393323 == arg7 || arg7 == Class593.aClass593_23.anInt5501 * 847393323) {
			local155 = local117.method5505(local67, local96) + local117.method5505(local75, local96) + local117.method5505(local67, local104) + local117.method5505(local75, local104) >> 2;
		} else {
			local155 = local117.method5500(local67, local96) + local117.method5500(local75, local96) + local117.method5500(local67, local104) + local117.method5500(local75, local104) >> 2;
		}
		@Pc(190) int local190 = (local37 << 8) + (arg3 << 9);
		@Pc(198) int local198 = (arg4 << 9) + (local42 << 8);
		@Pc(211) boolean local211 = this.aBoolean293 && !this.aBoolean295 && local17.aBoolean817;
		if (local17.method32013()) {
			Class458.method29495(arg2, arg3, arg4, arg6, local17, null, null);
		}
		@Pc(253) boolean local253 = arg8 == -1 && (!local17.method32016() || local17.aBoolean818 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950() == 0) && local17.anIntArray511 == null && !local17.aBoolean826 && !local17.aBoolean828;
		if (aBoolean302 && (Class208.method25578(arg7) && local17.anInt5520 * 1216611823 != 1 || !(!Class212.method25609(arg7) || local17.anInt5520 * 1216611823 != 0))) {
			return;
		}
		if (Class593.aClass593_19.anInt5501 * 847393323 != arg7) {
			@Pc(424) Class104_Sub1_Sub1 local424;
			@Pc(377) Class104_Sub1_Sub1_Sub2 local377;
			if (arg7 == Class593.aClass593_9.anInt5501 * 847393323 || arg7 == Class593.aClass593_23.anInt5501 * 847393323) {
				local377 = null;
				@Pc(422) int local422;
				if (local253) {
					@Pc(418) Class104_Sub1_Sub1_Sub2 local418 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, local17.aClass591_4 != Class591.aClass591_2);
					local422 = local418.method11483();
					local424 = local418;
					local377 = local418;
				} else {
					local424 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, local42 + arg4 - 1, arg7, arg6, arg8, arg9, Class591.aClass591_2 != local17.aClass591_4);
					local422 = 15;
				}
				if (this.aClass556_13.method31148(local424, false)) {
					if (local377 != null && local377.method13072()) {
						local377.method13056(arg0);
					}
					if (local17.aBoolean827 && this.aBoolean293) {
						if (local422 > 30) {
							local422 = 30;
						}
						for (@Pc(499) int local499 = 0; local499 <= local37; local499++) {
							for (@Pc(504) int local504 = 0; local504 <= local42; local504++) {
								local117.method5508(local499 + arg3, arg4 + local504, local422);
							}
						}
					}
				}
			} else if (Class212.method25609(arg7) || Class285.method26723(arg7)) {
				if (local253) {
					local377 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, true);
					if (local377.method13072()) {
						local377.method13056(arg0);
					}
					local424 = local377;
				} else {
					local424 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, true);
				}
				this.aClass556_13.method31148(local424, false);
				if (this.aBoolean293 && !this.aBoolean295 && Class212.method25609(arg7) && Class593.aClass593_13.anInt5501 * 847393323 != arg7 && arg2 > 0 && local17.anInt5520 * 1216611823 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method12508(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, local211, local117, local37, local42) && !this.method12510(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4)) {
				;
			}
		} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222() != 0 || local17.anInt5518 * -2134171963 != 0 || local17.anInt5527 * -499459421 == 1 || local17.aBoolean821) {
			@Pc(333) Class104_Sub1_Sub4 local333;
			if (local253) {
				@Pc(323) Class104_Sub1_Sub4_Sub1 local323 = new Class104_Sub1_Sub4_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg6, local211);
				if (local323.method13072()) {
					local323.method13056(arg0);
				}
				local333 = local323;
			} else {
				local333 = new Class104_Sub1_Sub4_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg6, arg8, arg9);
			}
			this.aClass556_13.method31138(arg2, arg3, arg4, local333);
		}
	}

	@OriginalMember(owner = "client!ail", name = "cm", descriptor = "(Lclient!dx;IIIIIIIII)V", line = 479)
	final void method12504(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < this.anInt1412 * 602499625) {
			this.anInt1412 = arg2 * -301477351;
		}
		@Pc(17) Class599 local17 = (Class599) this.aClass35_Sub12_5.method18319(arg5);
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method15463() == 0 && local17.aBoolean824) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		if (arg6 == 1 || arg6 == 3) {
			local37 = local17.anInt5529 * -1990374967;
			local42 = local17.anInt5516 * -1082258489;
		} else {
			local37 = local17.anInt5516 * -1082258489;
			local42 = local17.anInt5529 * -1990374967;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (arg3 + local37 <= this.anInt1381 * -60640777) {
			local67 = arg3 + (local37 >> 1);
			local75 = arg3 + (local37 + 1 >> 1);
		} else {
			local67 = arg3;
			local75 = arg3 + 1;
		}
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (arg4 + local42 <= this.anInt1400 * -1584311401) {
			local96 = arg4 + (local42 >> 1);
			local104 = (local42 + 1 >> 1) + arg4;
		} else {
			local96 = arg4;
			local104 = arg4 + 1;
		}
		@Pc(117) Class88 local117 = this.aClass556_13.aClass88Array1[arg1];
		@Pc(155) int local155;
		if (Class593.aClass593_9.anInt5501 * 847393323 == arg7 || arg7 == Class593.aClass593_23.anInt5501 * 847393323) {
			local155 = local117.method5505(local67, local96) + local117.method5505(local75, local96) + local117.method5505(local67, local104) + local117.method5505(local75, local104) >> 2;
		} else {
			local155 = local117.method5500(local67, local96) + local117.method5500(local75, local96) + local117.method5500(local67, local104) + local117.method5500(local75, local104) >> 2;
		}
		@Pc(190) int local190 = (local37 << 8) + (arg3 << 9);
		@Pc(198) int local198 = (arg4 << 9) + (local42 << 8);
		@Pc(211) boolean local211 = this.aBoolean293 && !this.aBoolean295 && local17.aBoolean817;
		if (local17.method32013()) {
			Class458.method29495(arg2, arg3, arg4, arg6, local17, null, null);
		}
		@Pc(253) boolean local253 = arg8 == -1 && (!local17.method32016() || local17.aBoolean818 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950() == 0) && local17.anIntArray511 == null && !local17.aBoolean826 && !local17.aBoolean828;
		if (aBoolean302 && (Class208.method25578(arg7) && local17.anInt5520 * 1216611823 != 1 || !(!Class212.method25609(arg7) || local17.anInt5520 * 1216611823 != 0))) {
			return;
		}
		if (Class593.aClass593_19.anInt5501 * 847393323 != arg7) {
			@Pc(424) Class104_Sub1_Sub1 local424;
			@Pc(377) Class104_Sub1_Sub1_Sub2 local377;
			if (arg7 == Class593.aClass593_9.anInt5501 * 847393323 || arg7 == Class593.aClass593_23.anInt5501 * 847393323) {
				local377 = null;
				@Pc(422) int local422;
				if (local253) {
					@Pc(418) Class104_Sub1_Sub1_Sub2 local418 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, local17.aClass591_4 != Class591.aClass591_2);
					local422 = local418.method11483();
					local424 = local418;
					local377 = local418;
				} else {
					local424 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, local42 + arg4 - 1, arg7, arg6, arg8, arg9, Class591.aClass591_2 != local17.aClass591_4);
					local422 = 15;
				}
				if (this.aClass556_13.method31148(local424, false)) {
					if (local377 != null && local377.method13072()) {
						local377.method13056(arg0);
					}
					if (local17.aBoolean827 && this.aBoolean293) {
						if (local422 > 30) {
							local422 = 30;
						}
						for (@Pc(499) int local499 = 0; local499 <= local37; local499++) {
							for (@Pc(504) int local504 = 0; local504 <= local42; local504++) {
								local117.method5508(local499 + arg3, arg4 + local504, local422);
							}
						}
					}
				}
			} else if (Class212.method25609(arg7) || Class285.method26723(arg7)) {
				if (local253) {
					local377 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, true);
					if (local377.method13072()) {
						local377.method13056(arg0);
					}
					local424 = local377;
				} else {
					local424 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, true);
				}
				this.aClass556_13.method31148(local424, false);
				if (this.aBoolean293 && !this.aBoolean295 && Class212.method25609(arg7) && Class593.aClass593_13.anInt5501 * 847393323 != arg7 && arg2 > 0 && local17.anInt5520 * 1216611823 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method12508(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, local211, local117, local37, local42) && !this.method12510(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4)) {
				;
			}
		} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222() != 0 || local17.anInt5518 * -2134171963 != 0 || local17.anInt5527 * -499459421 == 1 || local17.aBoolean821) {
			@Pc(333) Class104_Sub1_Sub4 local333;
			if (local253) {
				@Pc(323) Class104_Sub1_Sub4_Sub1 local323 = new Class104_Sub1_Sub4_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg6, local211);
				if (local323.method13072()) {
					local323.method13056(arg0);
				}
				local333 = local323;
			} else {
				local333 = new Class104_Sub1_Sub4_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg6, arg8, arg9);
			}
			this.aClass556_13.method31138(arg2, arg3, arg4, local333);
		}
	}

	@OriginalMember(owner = "client!ail", name = "ci", descriptor = "(Lclient!dx;IIIIIIIII)V", line = 479)
	final void method12505(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < this.anInt1412 * 602499625) {
			this.anInt1412 = arg2 * -301477351;
		}
		@Pc(17) Class599 local17 = (Class599) this.aClass35_Sub12_5.method18319(arg5);
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method15463() == 0 && local17.aBoolean824) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		if (arg6 == 1 || arg6 == 3) {
			local37 = local17.anInt5529 * -1990374967;
			local42 = local17.anInt5516 * -1082258489;
		} else {
			local37 = local17.anInt5516 * -1082258489;
			local42 = local17.anInt5529 * -1990374967;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (arg3 + local37 <= this.anInt1381 * -60640777) {
			local67 = arg3 + (local37 >> 1);
			local75 = arg3 + (local37 + 1 >> 1);
		} else {
			local67 = arg3;
			local75 = arg3 + 1;
		}
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (arg4 + local42 <= this.anInt1400 * -1584311401) {
			local96 = arg4 + (local42 >> 1);
			local104 = (local42 + 1 >> 1) + arg4;
		} else {
			local96 = arg4;
			local104 = arg4 + 1;
		}
		@Pc(117) Class88 local117 = this.aClass556_13.aClass88Array1[arg1];
		@Pc(155) int local155;
		if (Class593.aClass593_9.anInt5501 * 847393323 == arg7 || arg7 == Class593.aClass593_23.anInt5501 * 847393323) {
			local155 = local117.method5505(local67, local96) + local117.method5505(local75, local96) + local117.method5505(local67, local104) + local117.method5505(local75, local104) >> 2;
		} else {
			local155 = local117.method5500(local67, local96) + local117.method5500(local75, local96) + local117.method5500(local67, local104) + local117.method5500(local75, local104) >> 2;
		}
		@Pc(190) int local190 = (local37 << 8) + (arg3 << 9);
		@Pc(198) int local198 = (arg4 << 9) + (local42 << 8);
		@Pc(211) boolean local211 = this.aBoolean293 && !this.aBoolean295 && local17.aBoolean817;
		if (local17.method32013()) {
			Class458.method29495(arg2, arg3, arg4, arg6, local17, null, null);
		}
		@Pc(253) boolean local253 = arg8 == -1 && (!local17.method32016() || local17.aBoolean818 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950() == 0) && local17.anIntArray511 == null && !local17.aBoolean826 && !local17.aBoolean828;
		if (aBoolean302 && (Class208.method25578(arg7) && local17.anInt5520 * 1216611823 != 1 || !(!Class212.method25609(arg7) || local17.anInt5520 * 1216611823 != 0))) {
			return;
		}
		if (Class593.aClass593_19.anInt5501 * 847393323 != arg7) {
			@Pc(424) Class104_Sub1_Sub1 local424;
			@Pc(377) Class104_Sub1_Sub1_Sub2 local377;
			if (arg7 == Class593.aClass593_9.anInt5501 * 847393323 || arg7 == Class593.aClass593_23.anInt5501 * 847393323) {
				local377 = null;
				@Pc(422) int local422;
				if (local253) {
					@Pc(418) Class104_Sub1_Sub1_Sub2 local418 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, local17.aClass591_4 != Class591.aClass591_2);
					local422 = local418.method11483();
					local424 = local418;
					local377 = local418;
				} else {
					local424 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, local42 + arg4 - 1, arg7, arg6, arg8, arg9, Class591.aClass591_2 != local17.aClass591_4);
					local422 = 15;
				}
				if (this.aClass556_13.method31148(local424, false)) {
					if (local377 != null && local377.method13072()) {
						local377.method13056(arg0);
					}
					if (local17.aBoolean827 && this.aBoolean293) {
						if (local422 > 30) {
							local422 = 30;
						}
						for (@Pc(499) int local499 = 0; local499 <= local37; local499++) {
							for (@Pc(504) int local504 = 0; local504 <= local42; local504++) {
								local117.method5508(local499 + arg3, arg4 + local504, local422);
							}
						}
					}
				}
			} else if (Class212.method25609(arg7) || Class285.method26723(arg7)) {
				if (local253) {
					local377 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, true);
					if (local377.method13072()) {
						local377.method13056(arg0);
					}
					local424 = local377;
				} else {
					local424 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, true);
				}
				this.aClass556_13.method31148(local424, false);
				if (this.aBoolean293 && !this.aBoolean295 && Class212.method25609(arg7) && Class593.aClass593_13.anInt5501 * 847393323 != arg7 && arg2 > 0 && local17.anInt5520 * 1216611823 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method12508(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, local211, local117, local37, local42) && !this.method12510(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4)) {
				;
			}
		} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222() != 0 || local17.anInt5518 * -2134171963 != 0 || local17.anInt5527 * -499459421 == 1 || local17.aBoolean821) {
			@Pc(333) Class104_Sub1_Sub4 local333;
			if (local253) {
				@Pc(323) Class104_Sub1_Sub4_Sub1 local323 = new Class104_Sub1_Sub4_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg6, local211);
				if (local323.method13072()) {
					local323.method13056(arg0);
				}
				local333 = local323;
			} else {
				local333 = new Class104_Sub1_Sub4_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg6, arg8, arg9);
			}
			this.aClass556_13.method31138(arg2, arg3, arg4, local333);
		}
	}

	@OriginalMember(owner = "client!ail", name = "co", descriptor = "(Lclient!dx;IIIIIIIII)V", line = 479)
	final void method12506(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < this.anInt1412 * 602499625) {
			this.anInt1412 = arg2 * -301477351;
		}
		@Pc(17) Class599 local17 = (Class599) this.aClass35_Sub12_5.method18319(arg5);
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method15463() == 0 && local17.aBoolean824) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		if (arg6 == 1 || arg6 == 3) {
			local37 = local17.anInt5529 * -1990374967;
			local42 = local17.anInt5516 * -1082258489;
		} else {
			local37 = local17.anInt5516 * -1082258489;
			local42 = local17.anInt5529 * -1990374967;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (arg3 + local37 <= this.anInt1381 * -60640777) {
			local67 = arg3 + (local37 >> 1);
			local75 = arg3 + (local37 + 1 >> 1);
		} else {
			local67 = arg3;
			local75 = arg3 + 1;
		}
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (arg4 + local42 <= this.anInt1400 * -1584311401) {
			local96 = arg4 + (local42 >> 1);
			local104 = (local42 + 1 >> 1) + arg4;
		} else {
			local96 = arg4;
			local104 = arg4 + 1;
		}
		@Pc(117) Class88 local117 = this.aClass556_13.aClass88Array1[arg1];
		@Pc(155) int local155;
		if (Class593.aClass593_9.anInt5501 * 847393323 == arg7 || arg7 == Class593.aClass593_23.anInt5501 * 847393323) {
			local155 = local117.method5505(local67, local96) + local117.method5505(local75, local96) + local117.method5505(local67, local104) + local117.method5505(local75, local104) >> 2;
		} else {
			local155 = local117.method5500(local67, local96) + local117.method5500(local75, local96) + local117.method5500(local67, local104) + local117.method5500(local75, local104) >> 2;
		}
		@Pc(190) int local190 = (local37 << 8) + (arg3 << 9);
		@Pc(198) int local198 = (arg4 << 9) + (local42 << 8);
		@Pc(211) boolean local211 = this.aBoolean293 && !this.aBoolean295 && local17.aBoolean817;
		if (local17.method32013()) {
			Class458.method29495(arg2, arg3, arg4, arg6, local17, null, null);
		}
		@Pc(253) boolean local253 = arg8 == -1 && (!local17.method32016() || local17.aBoolean818 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950() == 0) && local17.anIntArray511 == null && !local17.aBoolean826 && !local17.aBoolean828;
		if (aBoolean302 && (Class208.method25578(arg7) && local17.anInt5520 * 1216611823 != 1 || !(!Class212.method25609(arg7) || local17.anInt5520 * 1216611823 != 0))) {
			return;
		}
		if (Class593.aClass593_19.anInt5501 * 847393323 != arg7) {
			@Pc(424) Class104_Sub1_Sub1 local424;
			@Pc(377) Class104_Sub1_Sub1_Sub2 local377;
			if (arg7 == Class593.aClass593_9.anInt5501 * 847393323 || arg7 == Class593.aClass593_23.anInt5501 * 847393323) {
				local377 = null;
				@Pc(422) int local422;
				if (local253) {
					@Pc(418) Class104_Sub1_Sub1_Sub2 local418 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, local17.aClass591_4 != Class591.aClass591_2);
					local422 = local418.method11483();
					local424 = local418;
					local377 = local418;
				} else {
					local424 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, local42 + arg4 - 1, arg7, arg6, arg8, arg9, Class591.aClass591_2 != local17.aClass591_4);
					local422 = 15;
				}
				if (this.aClass556_13.method31148(local424, false)) {
					if (local377 != null && local377.method13072()) {
						local377.method13056(arg0);
					}
					if (local17.aBoolean827 && this.aBoolean293) {
						if (local422 > 30) {
							local422 = 30;
						}
						for (@Pc(499) int local499 = 0; local499 <= local37; local499++) {
							for (@Pc(504) int local504 = 0; local504 <= local42; local504++) {
								local117.method5508(local499 + arg3, arg4 + local504, local422);
							}
						}
					}
				}
			} else if (Class212.method25609(arg7) || Class285.method26723(arg7)) {
				if (local253) {
					local377 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, true);
					if (local377.method13072()) {
						local377.method13056(arg0);
					}
					local424 = local377;
				} else {
					local424 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, true);
				}
				this.aClass556_13.method31148(local424, false);
				if (this.aBoolean293 && !this.aBoolean295 && Class212.method25609(arg7) && Class593.aClass593_13.anInt5501 * 847393323 != arg7 && arg2 > 0 && local17.anInt5520 * 1216611823 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method12508(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, local211, local117, local37, local42) && !this.method12510(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4)) {
				;
			}
		} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222() != 0 || local17.anInt5518 * -2134171963 != 0 || local17.anInt5527 * -499459421 == 1 || local17.aBoolean821) {
			@Pc(333) Class104_Sub1_Sub4 local333;
			if (local253) {
				@Pc(323) Class104_Sub1_Sub4_Sub1 local323 = new Class104_Sub1_Sub4_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg6, local211);
				if (local323.method13072()) {
					local323.method13056(arg0);
				}
				local333 = local323;
			} else {
				local333 = new Class104_Sub1_Sub4_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg6, arg8, arg9);
			}
			this.aClass556_13.method31138(arg2, arg3, arg4, local333);
		}
	}

	@OriginalMember(owner = "client!ail", name = "cn", descriptor = "(Lclient!dx;IIIIIIIII)V", line = 479)
	final void method12507(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < this.anInt1412 * 602499625) {
			this.anInt1412 = arg2 * -301477351;
		}
		@Pc(17) Class599 local17 = (Class599) this.aClass35_Sub12_5.method18319(arg5);
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method15463() == 0 && local17.aBoolean824) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		if (arg6 == 1 || arg6 == 3) {
			local37 = local17.anInt5529 * -1990374967;
			local42 = local17.anInt5516 * -1082258489;
		} else {
			local37 = local17.anInt5516 * -1082258489;
			local42 = local17.anInt5529 * -1990374967;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (arg3 + local37 <= this.anInt1381 * -60640777) {
			local67 = arg3 + (local37 >> 1);
			local75 = arg3 + (local37 + 1 >> 1);
		} else {
			local67 = arg3;
			local75 = arg3 + 1;
		}
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (arg4 + local42 <= this.anInt1400 * -1584311401) {
			local96 = arg4 + (local42 >> 1);
			local104 = (local42 + 1 >> 1) + arg4;
		} else {
			local96 = arg4;
			local104 = arg4 + 1;
		}
		@Pc(117) Class88 local117 = this.aClass556_13.aClass88Array1[arg1];
		@Pc(155) int local155;
		if (Class593.aClass593_9.anInt5501 * 847393323 == arg7 || arg7 == Class593.aClass593_23.anInt5501 * 847393323) {
			local155 = local117.method5505(local67, local96) + local117.method5505(local75, local96) + local117.method5505(local67, local104) + local117.method5505(local75, local104) >> 2;
		} else {
			local155 = local117.method5500(local67, local96) + local117.method5500(local75, local96) + local117.method5500(local67, local104) + local117.method5500(local75, local104) >> 2;
		}
		@Pc(190) int local190 = (local37 << 8) + (arg3 << 9);
		@Pc(198) int local198 = (arg4 << 9) + (local42 << 8);
		@Pc(211) boolean local211 = this.aBoolean293 && !this.aBoolean295 && local17.aBoolean817;
		if (local17.method32013()) {
			Class458.method29495(arg2, arg3, arg4, arg6, local17, null, null);
		}
		@Pc(253) boolean local253 = arg8 == -1 && (!local17.method32016() || local17.aBoolean818 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950() == 0) && local17.anIntArray511 == null && !local17.aBoolean826 && !local17.aBoolean828;
		if (aBoolean302 && (Class208.method25578(arg7) && local17.anInt5520 * 1216611823 != 1 || !(!Class212.method25609(arg7) || local17.anInt5520 * 1216611823 != 0))) {
			return;
		}
		if (Class593.aClass593_19.anInt5501 * 847393323 != arg7) {
			@Pc(424) Class104_Sub1_Sub1 local424;
			@Pc(377) Class104_Sub1_Sub1_Sub2 local377;
			if (arg7 == Class593.aClass593_9.anInt5501 * 847393323 || arg7 == Class593.aClass593_23.anInt5501 * 847393323) {
				local377 = null;
				@Pc(422) int local422;
				if (local253) {
					@Pc(418) Class104_Sub1_Sub1_Sub2 local418 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, local17.aClass591_4 != Class591.aClass591_2);
					local422 = local418.method11483();
					local424 = local418;
					local377 = local418;
				} else {
					local424 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, local42 + arg4 - 1, arg7, arg6, arg8, arg9, Class591.aClass591_2 != local17.aClass591_4);
					local422 = 15;
				}
				if (this.aClass556_13.method31148(local424, false)) {
					if (local377 != null && local377.method13072()) {
						local377.method13056(arg0);
					}
					if (local17.aBoolean827 && this.aBoolean293) {
						if (local422 > 30) {
							local422 = 30;
						}
						for (@Pc(499) int local499 = 0; local499 <= local37; local499++) {
							for (@Pc(504) int local504 = 0; local504 <= local42; local504++) {
								local117.method5508(local499 + arg3, arg4 + local504, local422);
							}
						}
					}
				}
			} else if (Class212.method25609(arg7) || Class285.method26723(arg7)) {
				if (local253) {
					local377 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, true);
					if (local377.method13072()) {
						local377.method13056(arg0);
					}
					local424 = local377;
				} else {
					local424 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, true);
				}
				this.aClass556_13.method31148(local424, false);
				if (this.aBoolean293 && !this.aBoolean295 && Class212.method25609(arg7) && Class593.aClass593_13.anInt5501 * 847393323 != arg7 && arg2 > 0 && local17.anInt5520 * 1216611823 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method12508(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, local211, local117, local37, local42) && !this.method12510(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4)) {
				;
			}
		} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222() != 0 || local17.anInt5518 * -2134171963 != 0 || local17.anInt5527 * -499459421 == 1 || local17.aBoolean821) {
			@Pc(333) Class104_Sub1_Sub4 local333;
			if (local253) {
				@Pc(323) Class104_Sub1_Sub4_Sub1 local323 = new Class104_Sub1_Sub4_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg6, local211);
				if (local323.method13072()) {
					local323.method13056(arg0);
				}
				local333 = local323;
			} else {
				local333 = new Class104_Sub1_Sub4_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, local17, arg2, arg1, local190, local155, local198, this.aBoolean295, arg6, arg8, arg9);
			}
			this.aClass556_13.method31138(arg2, arg3, arg4, local333);
		}
	}

	@OriginalMember(owner = "client!ail", name = "cb", descriptor = "(Lclient!dx;IIZLclient!vm;IIIIIIIIIZLclient!cj;IIB)Z", line = 580)
	boolean method12508(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class599 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class88 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17) {
		@Pc(52) Class104_Sub1_Sub2 local52;
		if (Class593.aClass593_24.anInt5501 * 847393323 == arg1) {
			@Pc(10) int local10 = arg4.anInt5520 * 1216611823;
			if (aBoolean301 && arg4.anInt5520 * 1216611823 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(42) Class104_Sub1_Sub2_Sub1 local42 = new Class104_Sub1_Sub2_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg14);
				if (local42.method13072()) {
					local42.method13056(arg0);
				}
				local52 = local42;
			} else {
				local52 = new Class104_Sub1_Sub2_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31145(arg7, arg12, arg13, local52, null);
			if (arg2 == 0) {
				if (this.aBoolean293 && arg4.aBoolean827) {
					arg15.method5508(arg12, arg13, 50);
					arg15.method5508(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean295) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean293 && arg4.aBoolean827) {
					arg15.method5508(arg12, arg13 + 1, 50);
					arg15.method5508(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean295) {
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13 + 1, arg4.anInt5546 * -755959825, -(arg4.anInt5522 * 2026375877));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean293 && arg4.aBoolean827) {
					arg15.method5508(arg12 + 1, arg13, 50);
					arg15.method5508(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean295) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12 + 1, arg13, arg4.anInt5546 * -755959825, -(arg4.anInt5522 * 2026375877));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean293 && arg4.aBoolean827) {
					arg15.method5508(arg12, arg13, 50);
					arg15.method5508(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean295) {
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				}
			}
			if (arg4.anInt5524 * -1211724411 != 64) {
				this.aClass556_13.method31151(arg7, arg12, arg13, arg4.anInt5524 * -1211724411);
			}
			return true;
		}
		@Pc(329) Class104_Sub1_Sub2 local329;
		@Pc(319) Class104_Sub1_Sub2_Sub1 local319;
		if (arg1 == Class593.aClass593_3.anInt5501 * 847393323) {
			if (arg3) {
				local319 = new Class104_Sub1_Sub2_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg14);
				if (local319.method13072()) {
					local319.method13056(arg0);
				}
				local329 = local319;
			} else {
				local329 = new Class104_Sub1_Sub2_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31145(arg7, arg12, arg13, local329, null);
			if (arg4.aBoolean827 && this.aBoolean293) {
				if (arg2 == 0) {
					arg15.method5508(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method5508(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method5508(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method5508(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class593.aClass593_2.anInt5501 * 847393323) {
			@Pc(423) int local423 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(447) Class104_Sub1_Sub2_Sub1 local447 = new Class104_Sub1_Sub2_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2 + 4, arg14);
				@Pc(467) Class104_Sub1_Sub2_Sub1 local467 = new Class104_Sub1_Sub2_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, local423, arg14);
				if (local447.method13072()) {
					local447.method13056(arg0);
				}
				if (local467.method13072()) {
					local467.method13056(arg0);
				}
				local329 = local447;
				local52 = local467;
			} else {
				local329 = new Class104_Sub1_Sub2_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2 + 4, arg5, arg6);
				local52 = new Class104_Sub1_Sub2_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, local423, arg5, arg6);
			}
			this.aClass556_13.method31145(arg7, arg12, arg13, local329, local52);
			if ((arg4.anInt5520 * 1216611823 == 1 || aBoolean301 && arg4.anInt5520 * 1216611823 == -1) && !this.aBoolean295) {
				if (arg2 == 0) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13 + 1, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				} else if (arg2 == 1) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12 + 1, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13 + 1, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				} else if (arg2 == 2) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12 + 1, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				} else if (arg2 == 3) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				}
			}
			if (arg4.anInt5524 * -1211724411 != 64) {
				this.aClass556_13.method31151(arg7, arg12, arg13, arg4.anInt5524 * -1211724411);
			}
			return true;
		} else if (Class593.aClass593_5.anInt5501 * 847393323 == arg1) {
			if (arg3) {
				local319 = new Class104_Sub1_Sub2_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg14);
				if (local319.method13072()) {
					local319.method13056(arg0);
				}
				local329 = local319;
			} else {
				local329 = new Class104_Sub1_Sub2_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31145(arg7, arg12, arg13, local329, null);
			if (arg4.aBoolean827 && this.aBoolean293) {
				if (arg2 == 0) {
					arg15.method5508(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method5508(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method5508(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method5508(arg12, arg13, 50);
				}
			}
			return true;
		} else if (Class593.aClass593_6.anInt5501 * 847393323 == arg1) {
			@Pc(890) Class104_Sub1_Sub1 local890;
			if (arg3) {
				@Pc(880) Class104_Sub1_Sub1_Sub2 local880 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true);
				if (local880.method13072()) {
					local880.method13056(arg0);
				}
				local890 = local880;
			} else {
				local890 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg12, arg12 + arg16 - 1, arg13, arg17 + arg13 - 1, arg1, arg2, arg5, arg6, true);
			}
			this.aClass556_13.method31148(local890, false);
			if (arg4.anInt5520 * 1216611823 == 1 && !this.aBoolean295) {
				@Pc(947) byte local947;
				if ((arg2 & 0x1) == 0) {
					local947 = 8;
				} else {
					local947 = 16;
				}
				this.aClass556_13.aClass553_1.method31019(local947, arg7, arg12, arg13, arg4.anInt5546 * -755959825, 0);
			}
			if (arg4.anInt5524 * -1211724411 != 64) {
				this.aClass556_13.method31151(arg7, arg12, arg13, arg4.anInt5524 * -1211724411);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ail", name = "cq", descriptor = "(Lclient!dx;IIZLclient!vm;IIIIIIIIIZLclient!cj;II)Z", line = 580)
	boolean method12509(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class599 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class88 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17) {
		@Pc(52) Class104_Sub1_Sub2 local52;
		if (Class593.aClass593_24.anInt5501 * 847393323 == arg1) {
			@Pc(10) int local10 = arg4.anInt5520 * 1216611823;
			if (aBoolean301 && arg4.anInt5520 * 1216611823 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(42) Class104_Sub1_Sub2_Sub1 local42 = new Class104_Sub1_Sub2_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg14);
				if (local42.method13072()) {
					local42.method13056(arg0);
				}
				local52 = local42;
			} else {
				local52 = new Class104_Sub1_Sub2_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31145(arg7, arg12, arg13, local52, null);
			if (arg2 == 0) {
				if (this.aBoolean293 && arg4.aBoolean827) {
					arg15.method5508(arg12, arg13, 50);
					arg15.method5508(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean295) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean293 && arg4.aBoolean827) {
					arg15.method5508(arg12, arg13 + 1, 50);
					arg15.method5508(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean295) {
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13 + 1, arg4.anInt5546 * -755959825, -(arg4.anInt5522 * 2026375877));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean293 && arg4.aBoolean827) {
					arg15.method5508(arg12 + 1, arg13, 50);
					arg15.method5508(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean295) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12 + 1, arg13, arg4.anInt5546 * -755959825, -(arg4.anInt5522 * 2026375877));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean293 && arg4.aBoolean827) {
					arg15.method5508(arg12, arg13, 50);
					arg15.method5508(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean295) {
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				}
			}
			if (arg4.anInt5524 * -1211724411 != 64) {
				this.aClass556_13.method31151(arg7, arg12, arg13, arg4.anInt5524 * -1211724411);
			}
			return true;
		}
		@Pc(329) Class104_Sub1_Sub2 local329;
		@Pc(319) Class104_Sub1_Sub2_Sub1 local319;
		if (arg1 == Class593.aClass593_3.anInt5501 * 847393323) {
			if (arg3) {
				local319 = new Class104_Sub1_Sub2_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg14);
				if (local319.method13072()) {
					local319.method13056(arg0);
				}
				local329 = local319;
			} else {
				local329 = new Class104_Sub1_Sub2_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31145(arg7, arg12, arg13, local329, null);
			if (arg4.aBoolean827 && this.aBoolean293) {
				if (arg2 == 0) {
					arg15.method5508(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method5508(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method5508(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method5508(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class593.aClass593_2.anInt5501 * 847393323) {
			@Pc(423) int local423 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(447) Class104_Sub1_Sub2_Sub1 local447 = new Class104_Sub1_Sub2_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2 + 4, arg14);
				@Pc(467) Class104_Sub1_Sub2_Sub1 local467 = new Class104_Sub1_Sub2_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, local423, arg14);
				if (local447.method13072()) {
					local447.method13056(arg0);
				}
				if (local467.method13072()) {
					local467.method13056(arg0);
				}
				local329 = local447;
				local52 = local467;
			} else {
				local329 = new Class104_Sub1_Sub2_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2 + 4, arg5, arg6);
				local52 = new Class104_Sub1_Sub2_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, local423, arg5, arg6);
			}
			this.aClass556_13.method31145(arg7, arg12, arg13, local329, local52);
			if ((arg4.anInt5520 * 1216611823 == 1 || aBoolean301 && arg4.anInt5520 * 1216611823 == -1) && !this.aBoolean295) {
				if (arg2 == 0) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13 + 1, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				} else if (arg2 == 1) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12 + 1, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13 + 1, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				} else if (arg2 == 2) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12 + 1, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				} else if (arg2 == 3) {
					this.aClass556_13.aClass553_1.method31019(1, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
					this.aClass556_13.aClass553_1.method31019(2, arg7, arg12, arg13, arg4.anInt5546 * -755959825, arg4.anInt5522 * 2026375877);
				}
			}
			if (arg4.anInt5524 * -1211724411 != 64) {
				this.aClass556_13.method31151(arg7, arg12, arg13, arg4.anInt5524 * -1211724411);
			}
			return true;
		} else if (Class593.aClass593_5.anInt5501 * 847393323 == arg1) {
			if (arg3) {
				local319 = new Class104_Sub1_Sub2_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg14);
				if (local319.method13072()) {
					local319.method13056(arg0);
				}
				local329 = local319;
			} else {
				local329 = new Class104_Sub1_Sub2_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31145(arg7, arg12, arg13, local329, null);
			if (arg4.aBoolean827 && this.aBoolean293) {
				if (arg2 == 0) {
					arg15.method5508(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method5508(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method5508(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method5508(arg12, arg13, 50);
				}
			}
			return true;
		} else if (Class593.aClass593_6.anInt5501 * 847393323 == arg1) {
			@Pc(890) Class104_Sub1_Sub1 local890;
			if (arg3) {
				@Pc(880) Class104_Sub1_Sub1_Sub2 local880 = new Class104_Sub1_Sub1_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true);
				if (local880.method13072()) {
					local880.method13056(arg0);
				}
				local890 = local880;
			} else {
				local890 = new Class104_Sub1_Sub1_Sub3(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, arg12, arg12 + arg16 - 1, arg13, arg17 + arg13 - 1, arg1, arg2, arg5, arg6, true);
			}
			this.aClass556_13.method31148(local890, false);
			if (arg4.anInt5520 * 1216611823 == 1 && !this.aBoolean295) {
				@Pc(947) byte local947;
				if ((arg2 & 0x1) == 0) {
					local947 = 8;
				} else {
					local947 = 16;
				}
				this.aClass556_13.aClass553_1.method31019(local947, arg7, arg12, arg13, arg4.anInt5546 * -755959825, 0);
			}
			if (arg4.anInt5524 * -1211724411 != 64) {
				this.aClass556_13.method31151(arg7, arg12, arg13, arg4.anInt5524 * -1211724411);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ail", name = "cg", descriptor = "(Lclient!dx;IIZLclient!vm;IIIIIIIIIS)Z", line = 716)
	boolean method12510(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class599 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(38) Class104_Sub1_Sub3 local38;
		if (arg1 == Class593.aClass593_7.anInt5501 * 847393323) {
			if (arg3) {
				@Pc(28) Class104_Sub1_Sub3_Sub2 local28 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, arg2);
				if (local28.method13072()) {
					local28.method13056(arg0);
				}
				local38 = local28;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		}
		@Pc(81) int local81;
		@Pc(90) Interface61 local90;
		@Pc(137) Class104_Sub1_Sub3_Sub2 local137;
		if (arg1 == Class593.aClass593_8.anInt5501 * 847393323) {
			local81 = 65;
			local90 = (Interface61) this.aClass556_13.method31179(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = ((Class599) this.aClass35_Sub12_5.method18319(local90.method13060())).anInt5524 * -1211724411 + 1;
			}
			if (arg3) {
				local137 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray189[arg2] * local81, anIntArray190[arg2] * local81, arg1, arg2);
				if (local137.method13072()) {
					local137.method13056(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray189[arg2] * local81, local81 * anIntArray190[arg2], arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class593.aClass593_18.anInt5501 * 847393323) {
			local81 = 33;
			local90 = (Interface61) this.aClass556_13.method31179(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = ((Class599) this.aClass35_Sub12_5.method18319(local90.method13060())).anInt5524 * -1211724411 / 2 + 1;
			}
			if (arg3) {
				local137 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray189[arg2] * local81, anIntArray190[arg2] * local81, arg1, arg2 + 4);
				if (local137.method13072()) {
					local137.method13056(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray188[arg2] * local81, anIntArray191[arg2] * local81, arg1, arg2 + 4, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class593.aClass593_10.anInt5501 * 847393323) {
			local81 = arg2 + 2 & 0x3;
			if (arg3) {
				@Pc(350) Class104_Sub1_Sub3_Sub2 local350 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local81 + 4);
				if (local350.method13072()) {
					local350.method13056(arg0);
				}
				local38 = local350;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local81 + 4, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class593.aClass593_11.anInt5501 * 847393323) {
			@Pc(409) int local409 = arg2 + 2 & 0x3;
			@Pc(411) int local411 = 33;
			@Pc(420) Interface61 local420 = (Interface61) this.aClass556_13.method31179(arg7, arg12, arg13);
			if (local420 != null) {
				local411 = ((Class599) this.aClass35_Sub12_5.method18319(local420.method13060())).anInt5524 * -1211724411 / 2 + 1;
			}
			@Pc(514) Class104_Sub1_Sub3 local514;
			if (arg3) {
				@Pc(471) Class104_Sub1_Sub3_Sub2 local471 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, local411 * anIntArray188[arg2], local411 * anIntArray191[arg2], arg1, arg2 + 4);
				@Pc(494) Class104_Sub1_Sub3_Sub2 local494 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local409 + 4);
				if (local471.method13072()) {
					local471.method13056(arg0);
				}
				if (local494.method13072()) {
					local494.method13056(arg0);
				}
				local38 = local471;
				local514 = local494;
			} else {
				@Pc(548) Class104_Sub1_Sub3_Sub1 local548 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray188[arg2] * local411, anIntArray191[arg2] * local411, arg1, arg2 + 4, arg5, arg6);
				@Pc(573) Class104_Sub1_Sub3_Sub1 local573 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local409 + 4, arg5, arg6);
				local38 = local548;
				local514 = local573;
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, local514);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ail", name = "cs", descriptor = "(Lclient!dx;IIZLclient!vm;IIIIIIIII)Z", line = 716)
	boolean method12511(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class599 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(38) Class104_Sub1_Sub3 local38;
		if (arg1 == Class593.aClass593_7.anInt5501 * 847393323) {
			if (arg3) {
				@Pc(28) Class104_Sub1_Sub3_Sub2 local28 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, arg2);
				if (local28.method13072()) {
					local28.method13056(arg0);
				}
				local38 = local28;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		}
		@Pc(81) int local81;
		@Pc(90) Interface61 local90;
		@Pc(137) Class104_Sub1_Sub3_Sub2 local137;
		if (arg1 == Class593.aClass593_8.anInt5501 * 847393323) {
			local81 = 65;
			local90 = (Interface61) this.aClass556_13.method31179(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = ((Class599) this.aClass35_Sub12_5.method18319(local90.method13060())).anInt5524 * -1211724411 + 1;
			}
			if (arg3) {
				local137 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray189[arg2] * local81, anIntArray190[arg2] * local81, arg1, arg2);
				if (local137.method13072()) {
					local137.method13056(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray189[arg2] * local81, local81 * anIntArray190[arg2], arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class593.aClass593_18.anInt5501 * 847393323) {
			local81 = 33;
			local90 = (Interface61) this.aClass556_13.method31179(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = ((Class599) this.aClass35_Sub12_5.method18319(local90.method13060())).anInt5524 * -1211724411 / 2 + 1;
			}
			if (arg3) {
				local137 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray189[arg2] * local81, anIntArray190[arg2] * local81, arg1, arg2 + 4);
				if (local137.method13072()) {
					local137.method13056(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray188[arg2] * local81, anIntArray191[arg2] * local81, arg1, arg2 + 4, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class593.aClass593_10.anInt5501 * 847393323) {
			local81 = arg2 + 2 & 0x3;
			if (arg3) {
				@Pc(350) Class104_Sub1_Sub3_Sub2 local350 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local81 + 4);
				if (local350.method13072()) {
					local350.method13056(arg0);
				}
				local38 = local350;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local81 + 4, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class593.aClass593_11.anInt5501 * 847393323) {
			@Pc(409) int local409 = arg2 + 2 & 0x3;
			@Pc(411) int local411 = 33;
			@Pc(420) Interface61 local420 = (Interface61) this.aClass556_13.method31179(arg7, arg12, arg13);
			if (local420 != null) {
				local411 = ((Class599) this.aClass35_Sub12_5.method18319(local420.method13060())).anInt5524 * -1211724411 / 2 + 1;
			}
			@Pc(514) Class104_Sub1_Sub3 local514;
			if (arg3) {
				@Pc(471) Class104_Sub1_Sub3_Sub2 local471 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, local411 * anIntArray188[arg2], local411 * anIntArray191[arg2], arg1, arg2 + 4);
				@Pc(494) Class104_Sub1_Sub3_Sub2 local494 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local409 + 4);
				if (local471.method13072()) {
					local471.method13056(arg0);
				}
				if (local494.method13072()) {
					local494.method13056(arg0);
				}
				local38 = local471;
				local514 = local494;
			} else {
				@Pc(548) Class104_Sub1_Sub3_Sub1 local548 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray188[arg2] * local411, anIntArray191[arg2] * local411, arg1, arg2 + 4, arg5, arg6);
				@Pc(573) Class104_Sub1_Sub3_Sub1 local573 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local409 + 4, arg5, arg6);
				local38 = local548;
				local514 = local573;
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, local514);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ail", name = "cy", descriptor = "(Lclient!dx;IIZLclient!vm;IIIIIIIII)Z", line = 716)
	boolean method12512(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class599 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(38) Class104_Sub1_Sub3 local38;
		if (arg1 == Class593.aClass593_7.anInt5501 * 847393323) {
			if (arg3) {
				@Pc(28) Class104_Sub1_Sub3_Sub2 local28 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, arg2);
				if (local28.method13072()) {
					local28.method13056(arg0);
				}
				local38 = local28;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		}
		@Pc(81) int local81;
		@Pc(90) Interface61 local90;
		@Pc(137) Class104_Sub1_Sub3_Sub2 local137;
		if (arg1 == Class593.aClass593_8.anInt5501 * 847393323) {
			local81 = 65;
			local90 = (Interface61) this.aClass556_13.method31179(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = ((Class599) this.aClass35_Sub12_5.method18319(local90.method13060())).anInt5524 * -1211724411 + 1;
			}
			if (arg3) {
				local137 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray189[arg2] * local81, anIntArray190[arg2] * local81, arg1, arg2);
				if (local137.method13072()) {
					local137.method13056(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray189[arg2] * local81, local81 * anIntArray190[arg2], arg1, arg2, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class593.aClass593_18.anInt5501 * 847393323) {
			local81 = 33;
			local90 = (Interface61) this.aClass556_13.method31179(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = ((Class599) this.aClass35_Sub12_5.method18319(local90.method13060())).anInt5524 * -1211724411 / 2 + 1;
			}
			if (arg3) {
				local137 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray189[arg2] * local81, anIntArray190[arg2] * local81, arg1, arg2 + 4);
				if (local137.method13072()) {
					local137.method13056(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray188[arg2] * local81, anIntArray191[arg2] * local81, arg1, arg2 + 4, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class593.aClass593_10.anInt5501 * 847393323) {
			local81 = arg2 + 2 & 0x3;
			if (arg3) {
				@Pc(350) Class104_Sub1_Sub3_Sub2 local350 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local81 + 4);
				if (local350.method13072()) {
					local350.method13056(arg0);
				}
				local38 = local350;
			} else {
				local38 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local81 + 4, arg5, arg6);
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class593.aClass593_11.anInt5501 * 847393323) {
			@Pc(409) int local409 = arg2 + 2 & 0x3;
			@Pc(411) int local411 = 33;
			@Pc(420) Interface61 local420 = (Interface61) this.aClass556_13.method31179(arg7, arg12, arg13);
			if (local420 != null) {
				local411 = ((Class599) this.aClass35_Sub12_5.method18319(local420.method13060())).anInt5524 * -1211724411 / 2 + 1;
			}
			@Pc(514) Class104_Sub1_Sub3 local514;
			if (arg3) {
				@Pc(471) Class104_Sub1_Sub3_Sub2 local471 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, local411 * anIntArray188[arg2], local411 * anIntArray191[arg2], arg1, arg2 + 4);
				@Pc(494) Class104_Sub1_Sub3_Sub2 local494 = new Class104_Sub1_Sub3_Sub2(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local409 + 4);
				if (local471.method13072()) {
					local471.method13056(arg0);
				}
				if (local494.method13072()) {
					local494.method13056(arg0);
				}
				local38 = local471;
				local514 = local494;
			} else {
				@Pc(548) Class104_Sub1_Sub3_Sub1 local548 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, anIntArray188[arg2] * local411, anIntArray191[arg2] * local411, arg1, arg2 + 4, arg5, arg6);
				@Pc(573) Class104_Sub1_Sub3_Sub1 local573 = new Class104_Sub1_Sub3_Sub1(this.aClass556_13, arg0, this.aClass35_Sub12_5, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean295, 0, 0, arg1, local409 + 4, arg5, arg6);
				local38 = local548;
				local514 = local573;
			}
			this.aClass556_13.method31146(arg7, arg12, arg13, local38, local514);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ail", name = "cj", descriptor = "(Lclient!dx;IIII)V", line = 795)
	void method12513(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Interface61 local7 = this.method12516(arg1, arg2, arg3, arg4);
		if (local7 == null) {
			return;
		}
		@Pc(19) Class599 local19 = (Class599) this.aClass35_Sub12_5.method18319(local7.method13060());
		@Pc(23) int local23 = local7.method13057();
		@Pc(27) int local27 = local7.method13058();
		if (local19.method32013()) {
			Class602.method32049(arg1, arg3, arg4, local19);
		}
		if (local7.method13072()) {
			local7.method13063(arg0);
		}
		if (arg2 == 0) {
			this.aClass556_13.method31157(arg1, arg3, arg4);
			this.aClass556_13.method31162(arg1, arg3, arg4);
			if (local19.anInt5520 * 1216611823 == 1) {
				if (local27 == 0) {
					this.aClass556_13.aClass553_1.method31022(1, arg1, arg3, arg4);
				} else if (local27 == 1) {
					this.aClass556_13.aClass553_1.method31022(2, arg1, arg3, arg4 + 1);
				} else if (local27 == 2) {
					this.aClass556_13.aClass553_1.method31022(1, arg1, arg3 + 1, arg4);
				} else if (local27 == 3) {
					this.aClass556_13.aClass553_1.method31022(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass556_13.method31164(arg1, arg3, arg4);
			this.aClass556_13.method31165(arg1, arg3, arg4);
		} else if (arg2 == 2) {
			this.aClass556_13.method31173(arg1, arg3, arg4, client.anInterface63_1);
			if (local23 == Class593.aClass593_6.anInt5501 * 847393323) {
				if ((local27 & 0x1) == 0) {
					this.aClass556_13.aClass553_1.method31022(8, arg1, arg3, arg4);
				} else {
					this.aClass556_13.aClass553_1.method31022(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass556_13.method31167(arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ail", name = "cd", descriptor = "(Lclient!dx;IIII)V", line = 795)
	void method12514(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Interface61 local7 = this.method12516(arg1, arg2, arg3, arg4);
		if (local7 == null) {
			return;
		}
		@Pc(19) Class599 local19 = (Class599) this.aClass35_Sub12_5.method18319(local7.method13060());
		@Pc(23) int local23 = local7.method13057();
		@Pc(27) int local27 = local7.method13058();
		if (local19.method32013()) {
			Class602.method32049(arg1, arg3, arg4, local19);
		}
		if (local7.method13072()) {
			local7.method13063(arg0);
		}
		if (arg2 == 0) {
			this.aClass556_13.method31157(arg1, arg3, arg4);
			this.aClass556_13.method31162(arg1, arg3, arg4);
			if (local19.anInt5520 * 1216611823 == 1) {
				if (local27 == 0) {
					this.aClass556_13.aClass553_1.method31022(1, arg1, arg3, arg4);
				} else if (local27 == 1) {
					this.aClass556_13.aClass553_1.method31022(2, arg1, arg3, arg4 + 1);
				} else if (local27 == 2) {
					this.aClass556_13.aClass553_1.method31022(1, arg1, arg3 + 1, arg4);
				} else if (local27 == 3) {
					this.aClass556_13.aClass553_1.method31022(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass556_13.method31164(arg1, arg3, arg4);
			this.aClass556_13.method31165(arg1, arg3, arg4);
		} else if (arg2 == 2) {
			this.aClass556_13.method31173(arg1, arg3, arg4, client.anInterface63_1);
			if (local23 == Class593.aClass593_6.anInt5501 * 847393323) {
				if ((local27 & 0x1) == 0) {
					this.aClass556_13.aClass553_1.method31022(8, arg1, arg3, arg4);
				} else {
					this.aClass556_13.aClass553_1.method31022(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass556_13.method31167(arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ail", name = "cc", descriptor = "(Lclient!dx;IIIII)V", line = 795)
	void method12515(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Interface61 local7 = this.method12516(arg1, arg2, arg3, arg4);
		if (local7 == null) {
			return;
		}
		@Pc(19) Class599 local19 = (Class599) this.aClass35_Sub12_5.method18319(local7.method13060());
		@Pc(23) int local23 = local7.method13057();
		@Pc(27) int local27 = local7.method13058();
		if (local19.method32013()) {
			Class602.method32049(arg1, arg3, arg4, local19);
		}
		if (local7.method13072()) {
			local7.method13063(arg0);
		}
		if (arg2 == 0) {
			this.aClass556_13.method31157(arg1, arg3, arg4);
			this.aClass556_13.method31162(arg1, arg3, arg4);
			if (local19.anInt5520 * 1216611823 == 1) {
				if (local27 == 0) {
					this.aClass556_13.aClass553_1.method31022(1, arg1, arg3, arg4);
				} else if (local27 == 1) {
					this.aClass556_13.aClass553_1.method31022(2, arg1, arg3, arg4 + 1);
				} else if (local27 == 2) {
					this.aClass556_13.aClass553_1.method31022(1, arg1, arg3 + 1, arg4);
				} else if (local27 == 3) {
					this.aClass556_13.aClass553_1.method31022(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass556_13.method31164(arg1, arg3, arg4);
			this.aClass556_13.method31165(arg1, arg3, arg4);
		} else if (arg2 == 2) {
			this.aClass556_13.method31173(arg1, arg3, arg4, client.anInterface63_1);
			if (local23 == Class593.aClass593_6.anInt5501 * 847393323) {
				if ((local27 & 0x1) == 0) {
					this.aClass556_13.aClass553_1.method31022(8, arg1, arg3, arg4);
				} else {
					this.aClass556_13.aClass553_1.method31022(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass556_13.method31167(arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ail", name = "cf", descriptor = "(IIIIB)Lclient!sy;", line = 830)
	Interface61 method12516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface61 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface61) this.aClass556_13.method31179(arg0, arg2, arg3);
		}
		if (arg1 == 1) {
			local1 = (Interface61) this.aClass556_13.method31187(arg0, arg2, arg3);
		}
		if (arg1 == 2) {
			local1 = (Interface61) this.aClass556_13.method31191(arg0, arg2, arg3, client.anInterface63_1);
		}
		if (arg1 == 3) {
			local1 = (Interface61) this.aClass556_13.method31195(arg0, arg2, arg3);
		}
		return local1;
	}

	@OriginalMember(owner = "client!ail", name = "do", descriptor = "(IIII)Lclient!sy;", line = 830)
	Interface61 method12517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface61 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface61) this.aClass556_13.method31179(arg0, arg2, arg3);
		}
		if (arg1 == 1) {
			local1 = (Interface61) this.aClass556_13.method31187(arg0, arg2, arg3);
		}
		if (arg1 == 2) {
			local1 = (Interface61) this.aClass556_13.method31191(arg0, arg2, arg3, client.anInterface63_1);
		}
		if (arg1 == 3) {
			local1 = (Interface61) this.aClass556_13.method31195(arg0, arg2, arg3);
		}
		return local1;
	}

	@OriginalMember(owner = "client!ail", name = "ce", descriptor = "(IIII)Lclient!sy;", line = 830)
	Interface61 method12518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface61 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface61) this.aClass556_13.method31179(arg0, arg2, arg3);
		}
		if (arg1 == 1) {
			local1 = (Interface61) this.aClass556_13.method31187(arg0, arg2, arg3);
		}
		if (arg1 == 2) {
			local1 = (Interface61) this.aClass556_13.method31191(arg0, arg2, arg3, client.anInterface63_1);
		}
		if (arg1 == 3) {
			local1 = (Interface61) this.aClass556_13.method31195(arg0, arg2, arg3);
		}
		return local1;
	}

	@OriginalMember(owner = "client!ail", name = "dt", descriptor = "(IIII)Lclient!sy;", line = 830)
	Interface61 method12519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface61 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface61) this.aClass556_13.method31179(arg0, arg2, arg3);
		}
		if (arg1 == 1) {
			local1 = (Interface61) this.aClass556_13.method31187(arg0, arg2, arg3);
		}
		if (arg1 == 2) {
			local1 = (Interface61) this.aClass556_13.method31191(arg0, arg2, arg3, client.anInterface63_1);
		}
		if (arg1 == 3) {
			local1 = (Interface61) this.aClass556_13.method31195(arg0, arg2, arg3);
		}
		return local1;
	}

	@OriginalMember(owner = "client!ail", name = "cl", descriptor = "(Lclient!dx;ZB)V", line = 839)
	public final void method12520(@OriginalArg(0) Class86 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass556_13.method31197();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1380 * -692901467 > 1) {
				for (local12 = 0; local12 < this.anInt1381 * -60640777; local12++) {
					for (local20 = 0; local20 < this.anInt1400 * -1584311401; local20++) {
						if ((this.aClass474_2.aByteArrayArrayArray13[1][local12][local20] & 0x2) == 2) {
							this.aClass556_13.method31097(local12, local20);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1380 * -692901467; local12++) {
				for (local20 = 0; local20 <= this.anInt1400 * -1584311401; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1381 * -60640777; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(87) int local87 = local67;
							@Pc(89) int local89 = local67;
							@Pc(91) int local91 = local20;
							@Pc(93) int local93 = local20;
							while (local91 > 0 && (this.aByteArrayArrayArray6[local12][local67][local91 - 1] & 0x4) != 0 && local93 - local91 < 10) {
								local91--;
							}
							while (local93 < this.anInt1400 * -1584311401 && (this.aByteArrayArrayArray6[local12][local67][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(150) int local150;
							label108: while (local87 > 0 && local89 - local87 < 10) {
								for (local150 = local91; local150 <= local93; local150++) {
									if ((this.aByteArrayArrayArray6[local12][local87 - 1][local150] & 0x4) == 0) {
										break label108;
									}
								}
								local87--;
							}
							label95: while (local89 < this.anInt1381 * -60640777 && local89 - local87 < 10) {
								for (local150 = local91; local150 <= local93; local150++) {
									if ((this.aByteArrayArrayArray6[local12][local89 + 1][local150] & 0x4) == 0) {
										break label95;
									}
								}
								local89++;
							}
							if ((local89 - local87 + 1) * (local93 - local91 + 1) >= 4) {
								local150 = this.anIntArrayArrayArray14[local12][local87][local91];
								this.aClass556_13.aClass553_1.method31031(4, local12, local87 << 9, (local89 << 9) + 512, local91 << 9, (local93 << 9) + 512, local150, local150);
								for (@Pc(255) int local255 = local87; local255 <= local89; local255++) {
									for (@Pc(260) int local260 = local91; local260 <= local93; local260++) {
										this.aByteArrayArrayArray6[local12][local255][local260] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass556_13.aClass553_1.method31028();
		}
		this.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!ail", name = "dh", descriptor = "(Lclient!dx;Z)V", line = 839)
	public final void method12521(@OriginalArg(0) Class86 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass556_13.method31197();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1380 * -692901467 > 1) {
				for (local12 = 0; local12 < this.anInt1381 * -60640777; local12++) {
					for (local20 = 0; local20 < this.anInt1400 * -1584311401; local20++) {
						if ((this.aClass474_2.aByteArrayArrayArray13[1][local12][local20] & 0x2) == 2) {
							this.aClass556_13.method31097(local12, local20);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1380 * -692901467; local12++) {
				for (local20 = 0; local20 <= this.anInt1400 * -1584311401; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1381 * -60640777; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(87) int local87 = local67;
							@Pc(89) int local89 = local67;
							@Pc(91) int local91 = local20;
							@Pc(93) int local93 = local20;
							while (local91 > 0 && (this.aByteArrayArrayArray6[local12][local67][local91 - 1] & 0x4) != 0 && local93 - local91 < 10) {
								local91--;
							}
							while (local93 < this.anInt1400 * -1584311401 && (this.aByteArrayArrayArray6[local12][local67][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(150) int local150;
							label108: while (local87 > 0 && local89 - local87 < 10) {
								for (local150 = local91; local150 <= local93; local150++) {
									if ((this.aByteArrayArrayArray6[local12][local87 - 1][local150] & 0x4) == 0) {
										break label108;
									}
								}
								local87--;
							}
							label95: while (local89 < this.anInt1381 * -60640777 && local89 - local87 < 10) {
								for (local150 = local91; local150 <= local93; local150++) {
									if ((this.aByteArrayArrayArray6[local12][local89 + 1][local150] & 0x4) == 0) {
										break label95;
									}
								}
								local89++;
							}
							if ((local89 - local87 + 1) * (local93 - local91 + 1) >= 4) {
								local150 = this.anIntArrayArrayArray14[local12][local87][local91];
								this.aClass556_13.aClass553_1.method31031(4, local12, local87 << 9, (local89 << 9) + 512, local91 << 9, (local93 << 9) + 512, local150, local150);
								for (@Pc(255) int local255 = local87; local255 <= local89; local255++) {
									for (@Pc(260) int local260 = local91; local260 <= local93; local260++) {
										this.aByteArrayArrayArray6[local12][local255][local260] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass556_13.aClass553_1.method31028();
		}
		this.aByteArrayArrayArray6 = null;
	}
}
