package com.jagex;

import java.util.Iterator;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zd")
public class Class686 {

	@OriginalMember(owner = "client!zd", name = "p", descriptor = "I")
	static int anInt5870 = 0;

	@OriginalMember(owner = "client!zd", name = "c", descriptor = "I")
	static int anInt5868 = 0;

	@OriginalMember(owner = "client!zd", name = "v", descriptor = "I")
	static int anInt5869 = 0;

	@OriginalMember(owner = "client!zd", name = "l", descriptor = "[[B")
	static byte[][] aByteArrayArray27 = new byte[1000][];

	@OriginalMember(owner = "client!zd", name = "y", descriptor = "[[B")
	static byte[][] aByteArrayArray26 = new byte[250][];

	@OriginalMember(owner = "client!zd", name = "w", descriptor = "[[B")
	static byte[][] aByteArrayArray28 = new byte[50][];

	@OriginalMember(owner = "client!zd", name = "<init>", descriptor = "()V", line = 14)
	Class686() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zd", name = "y", descriptor = "([I[I)V", line = 19)
	public static void method36277(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Class98.anIntArray105 = null;
			Class207.anIntArray348 = null;
			Class460.aByteArrayArrayArray12 = null;
			return;
		}
		Class98.anIntArray105 = arg0;
		Class207.anIntArray348 = new int[arg0.length];
		Class460.aByteArrayArrayArray12 = new byte[arg0.length][][];
		for (@Pc(24) int local24 = 0; local24 < Class98.anIntArray105.length; local24++) {
			Class460.aByteArrayArrayArray12[local24] = new byte[arg1[local24]][];
		}
	}

	@OriginalMember(owner = "client!zd", name = "c", descriptor = "(IZI)[B", line = 35)
	public static synchronized byte[] method36278(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) byte[] local21;
		if ((arg0 == 100 || arg0 < 100 && arg1) && anInt5870 * -1336434345 > 0) {
			local21 = aByteArrayArray27[(anInt5870 -= -1556686233) * -1336434345];
			aByteArrayArray27[anInt5870 * -1336434345] = null;
			return local21;
		} else if ((arg0 == 5000 || arg0 < 5000 && arg1) && anInt5868 * -1246390875 > 0) {
			local21 = aByteArrayArray26[(anInt5868 -= -1609086419) * -1246390875];
			aByteArrayArray26[anInt5868 * -1246390875] = null;
			return local21;
		} else if ((arg0 == 30000 || arg0 < 30000 && arg1) && anInt5869 * 2083096697 > 0) {
			local21 = aByteArrayArray28[(anInt5869 -= -325164599) * 2083096697];
			aByteArrayArray28[anInt5869 * 2083096697] = null;
			return local21;
		} else {
			@Pc(93) int local93;
			if (Class460.aByteArrayArrayArray12 != null) {
				for (local93 = 0; local93 < Class98.anIntArray105.length; local93++) {
					if ((arg0 == Class98.anIntArray105[local93] || arg0 < Class98.anIntArray105[local93] && arg1) && Class207.anIntArray348[local93] > 0) {
						@Pc(126) byte[] local126 = Class460.aByteArrayArrayArray12[local93][--Class207.anIntArray348[local93]];
						Class460.aByteArrayArrayArray12[local93][Class207.anIntArray348[local93]] = null;
						return local126;
					}
				}
			}
			if (arg1 && Class98.anIntArray105 != null) {
				for (local93 = 0; local93 < Class98.anIntArray105.length; local93++) {
					if (arg0 <= Class98.anIntArray105[local93] && Class207.anIntArray348[local93] < Class460.aByteArrayArrayArray12[local93].length) {
						return new byte[Class98.anIntArray105[local93]];
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!zd", name = "t", descriptor = "(IZ)[B", line = 35)
	public static synchronized byte[] method36279(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) byte[] local21;
		if ((arg0 == 100 || arg0 < 100 && arg1) && anInt5870 * -1336434345 > 0) {
			local21 = aByteArrayArray27[(anInt5870 -= -1556686233) * -1336434345];
			aByteArrayArray27[anInt5870 * -1336434345] = null;
			return local21;
		} else if ((arg0 == 5000 || arg0 < 5000 && arg1) && anInt5868 * -1246390875 > 0) {
			local21 = aByteArrayArray26[(anInt5868 -= -1609086419) * -1246390875];
			aByteArrayArray26[anInt5868 * -1246390875] = null;
			return local21;
		} else if ((arg0 == 30000 || arg0 < 30000 && arg1) && anInt5869 * 2083096697 > 0) {
			local21 = aByteArrayArray28[(anInt5869 -= -325164599) * 2083096697];
			aByteArrayArray28[anInt5869 * 2083096697] = null;
			return local21;
		} else {
			@Pc(93) int local93;
			if (Class460.aByteArrayArrayArray12 != null) {
				for (local93 = 0; local93 < Class98.anIntArray105.length; local93++) {
					if ((arg0 == Class98.anIntArray105[local93] || arg0 < Class98.anIntArray105[local93] && arg1) && Class207.anIntArray348[local93] > 0) {
						@Pc(126) byte[] local126 = Class460.aByteArrayArrayArray12[local93][--Class207.anIntArray348[local93]];
						Class460.aByteArrayArrayArray12[local93][Class207.anIntArray348[local93]] = null;
						return local126;
					}
				}
			}
			if (arg1 && Class98.anIntArray105 != null) {
				for (local93 = 0; local93 < Class98.anIntArray105.length; local93++) {
					if (arg0 <= Class98.anIntArray105[local93] && Class207.anIntArray348[local93] < Class460.aByteArrayArrayArray12[local93].length) {
						return new byte[Class98.anIntArray105[local93]];
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!zd", name = "w", descriptor = "(IZ)[B", line = 35)
	public static synchronized byte[] method36280(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) byte[] local21;
		if ((arg0 == 100 || arg0 < 100 && arg1) && anInt5870 * -1336434345 > 0) {
			local21 = aByteArrayArray27[(anInt5870 -= -1556686233) * -1336434345];
			aByteArrayArray27[anInt5870 * -1336434345] = null;
			return local21;
		} else if ((arg0 == 5000 || arg0 < 5000 && arg1) && anInt5868 * -1246390875 > 0) {
			local21 = aByteArrayArray26[(anInt5868 -= -1609086419) * -1246390875];
			aByteArrayArray26[anInt5868 * -1246390875] = null;
			return local21;
		} else if ((arg0 == 30000 || arg0 < 30000 && arg1) && anInt5869 * 2083096697 > 0) {
			local21 = aByteArrayArray28[(anInt5869 -= -325164599) * 2083096697];
			aByteArrayArray28[anInt5869 * 2083096697] = null;
			return local21;
		} else {
			@Pc(93) int local93;
			if (Class460.aByteArrayArrayArray12 != null) {
				for (local93 = 0; local93 < Class98.anIntArray105.length; local93++) {
					if ((arg0 == Class98.anIntArray105[local93] || arg0 < Class98.anIntArray105[local93] && arg1) && Class207.anIntArray348[local93] > 0) {
						@Pc(126) byte[] local126 = Class460.aByteArrayArrayArray12[local93][--Class207.anIntArray348[local93]];
						Class460.aByteArrayArrayArray12[local93][Class207.anIntArray348[local93]] = null;
						return local126;
					}
				}
			}
			if (arg1 && Class98.anIntArray105 != null) {
				for (local93 = 0; local93 < Class98.anIntArray105.length; local93++) {
					if (arg0 <= Class98.anIntArray105[local93] && Class207.anIntArray348[local93] < Class460.aByteArrayArrayArray12[local93].length) {
						return new byte[Class98.anIntArray105[local93]];
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!zd", name = "c", descriptor = "(CI)Z", line = 45)
	public static boolean method36281(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(17) char[] local17 = Class680.aCharArray8;
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				@Pc(27) char local27 = local17[local19];
				if (arg0 == local27) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!zd", name = "v", descriptor = "(II)[B", line = 72)
	public static synchronized byte[] method36282(@OriginalArg(0) int arg0) {
		return method36278(arg0, false);
	}

	@OriginalMember(owner = "client!zd", name = "l", descriptor = "([BS)V", line = 76)
	public static synchronized void method36283(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && anInt5870 * -1336434345 < 1000) {
			aByteArrayArray27[(anInt5870 += -1556686233) * -1336434345 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt5868 * -1246390875 < 250) {
			aByteArrayArray26[(anInt5868 += -1609086419) * -1246390875 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt5869 * 2083096697 < 50) {
			aByteArrayArray28[(anInt5869 += -325164599) * 2083096697 - 1] = arg0;
		} else if (Class460.aByteArrayArrayArray12 != null) {
			for (@Pc(69) int local69 = 0; local69 < Class98.anIntArray105.length; local69++) {
				if (Class98.anIntArray105[local69] == arg0.length && Class207.anIntArray348[local69] < Class460.aByteArrayArrayArray12[local69].length) {
					Class460.aByteArrayArrayArray12[local69][Class207.anIntArray348[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zd", name = "q", descriptor = "([B)V", line = 76)
	public static synchronized void method36284(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && anInt5870 * -1336434345 < 1000) {
			aByteArrayArray27[(anInt5870 += -1556686233) * -1336434345 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt5868 * -1246390875 < 250) {
			aByteArrayArray26[(anInt5868 += -1609086419) * -1246390875 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt5869 * 2083096697 < 50) {
			aByteArrayArray28[(anInt5869 += -325164599) * 2083096697 - 1] = arg0;
		} else if (Class460.aByteArrayArrayArray12 != null) {
			for (@Pc(69) int local69 = 0; local69 < Class98.anIntArray105.length; local69++) {
				if (Class98.anIntArray105[local69] == arg0.length && Class207.anIntArray348[local69] < Class460.aByteArrayArrayArray12[local69].length) {
					Class460.aByteArrayArrayArray12[local69][Class207.anIntArray348[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zd", name = "db", descriptor = "(III)V", line = 708)
	static final void method36285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class136_Sub1.aFloat151 < Class136_Sub1.aFloat152) {
			Class136_Sub1.aFloat151 = (float) ((double) Class136_Sub1.aFloat151 + (double) Class136_Sub1.aFloat151 / 30.0D);
			if (Class136_Sub1.aFloat151 > Class136_Sub1.aFloat152) {
				Class136_Sub1.aFloat151 = Class136_Sub1.aFloat152;
			}
			Class608.method32139();
			Class136_Sub1.anInt1685 = (int) Class136_Sub1.aFloat152 >> 1;
			Class136_Sub1.aByteArrayArrayArray11 = Class96_Sub19.method7726(Class136_Sub1.anInt1685);
		} else if (Class136_Sub1.aFloat151 > Class136_Sub1.aFloat152) {
			Class136_Sub1.aFloat151 = (float) ((double) Class136_Sub1.aFloat151 - (double) Class136_Sub1.aFloat151 / 30.0D);
			if (Class136_Sub1.aFloat151 < Class136_Sub1.aFloat152) {
				Class136_Sub1.aFloat151 = Class136_Sub1.aFloat152;
			}
			Class608.method32139();
			Class136_Sub1.anInt1685 = (int) Class136_Sub1.aFloat152 >> 1;
			Class136_Sub1.aByteArrayArrayArray11 = Class96_Sub19.method7726(Class136_Sub1.anInt1685);
		}
		if (-620394103 * Class136_Sub1.anInt1703 != -1 && Class136_Sub1.anInt1704 * -128963373 != -1) {
			@Pc(78) int local78 = Class136_Sub1.anInt1703 * -620394103 - Class88.anInt610 * 204700261;
			if (local78 != 0) {
				local78 /= Math.min(Class136_Sub1.anInt1707 * -1048197681, Math.abs(local78));
			}
			@Pc(97) int local97 = Class136_Sub1.anInt1704 * -128963373 - Class349.anInt4496 * -1636630007;
			if (local97 != 0) {
				local97 /= Math.min(Class136_Sub1.anInt1707 * -1048197681, Math.abs(local97));
			}
			Class88.anInt610 = (local78 + Class88.anInt610 * 204700261) * 704227181;
			Class349.anInt4496 = (Class349.anInt4496 * -1636630007 + local97) * 980626489;
			if (local78 == 0 && local97 == 0) {
				Class136_Sub1.anInt1703 = 1421361991;
				Class136_Sub1.anInt1704 = -2017528667;
			}
			Class608.method32139();
		}
		@Pc(139) Iterator local139 = Class136_Sub1.aHashMap5.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(148) Class1 local148;
				do {
					if (!local139.hasNext()) {
						local139 = Class136_Sub1.aHashMap4.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local139.hasNext()) {
										if (Class136_Sub1.aBoolean341 && Class612.aClass695_52 != null) {
											for (@Pc(239) Class77_Sub19 local239 = (Class77_Sub19) Class612.aClass695_52.method36395(); local239 != null; local239 = (Class77_Sub19) Class612.aClass695_52.method36406()) {
												@Pc(252) Class302 local252 = (Class302) Class136_Sub1.aClass35_Sub10_2.method18319(local239.aClass77_Sub30_1.anInt1635 * 1592054281);
												if (local239.method13487(arg0, arg1)) {
													if (local252.aStringArray26 != null) {
														if (local252.aStringArray26[4] != null) {
															Class155.method23634(local252.aStringArray26[4], local252.aString188, -1, 1012, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[3] != null) {
															Class155.method23634(local252.aStringArray26[3], local252.aString188, -1, 1011, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[2] != null) {
															Class155.method23634(local252.aStringArray26[2], local252.aString188, -1, 1010, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[1] != null) {
															Class155.method23634(local252.aStringArray26[1], local252.aString188, -1, 1009, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[0] != null) {
															Class155.method23634(local252.aStringArray26[0], local252.aString188, -1, 1008, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
													}
													if (!local239.aClass77_Sub30_1.aBoolean335) {
														local239.aClass77_Sub30_1.aBoolean335 = true;
														Class675.method35962(Class135.aClass135_38, local239.aClass77_Sub30_1.anInt1635 * 1592054281, local252.anInt4027 * -15128681);
													}
													if (local239.aClass77_Sub30_1.aBoolean335) {
														Class675.method35962(Class135.aClass135_30, local239.aClass77_Sub30_1.anInt1635 * 1592054281, local252.anInt4027 * -15128681);
													}
												} else if (local239.aClass77_Sub30_1.aBoolean335) {
													local239.aClass77_Sub30_1.aBoolean335 = false;
													Class675.method35962(Class135.aClass135_29, local239.aClass77_Sub30_1.anInt1635 * 1592054281, local252.anInt4027 * -15128681);
												}
											}
										}
										return;
									}
									local148 = (Class1) ((Entry) local139.next()).getValue();
									local148.anInt1 -= -1425890405;
								} while (local148.anInt1 * -959968621 != 0);
								if (local148.anInt2 * -132330391 > 1 || Class136_Sub1.aBoolean349) {
									local148.anInt2 -= 1869972441;
									local148.anInt1 = Class136_Sub1.anInt1708 * -1184677759;
								} else {
									local139.remove();
								}
							}
						}
					}
					local148 = (Class1) ((Entry) local139.next()).getValue();
					local148.anInt1 -= -1425890405;
				} while (local148.anInt1 * -959968621 != 0);
				if (local148.anInt2 * -132330391 > 1 || Class136_Sub1.aBoolean349) {
					local148.anInt2 -= 1869972441;
					local148.anInt1 = Class136_Sub1.anInt1708 * -1184677759;
				} else {
					local139.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!zd", name = "sg", descriptor = "(Lclient!yf;I)V", line = 7876)
	static final void method36286(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3896 * -1230478387;
	}
}
