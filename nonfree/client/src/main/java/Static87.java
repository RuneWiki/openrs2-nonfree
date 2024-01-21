import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!l", name = "d", descriptor = "[I")
	public static int[] anIntArray219;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "I")
	public static int anInt2129 = 0;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
	public static int[] anIntArray220 = new int[] { 18, 34, 38, 25, 8, 33, 20, 39 };

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)I")
	public static int method1449(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCD) >>> 2);
		@Pc(37) int local37 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!jg;)V")
	public static void method1450(@OriginalArg(1) Class44 arg0) {
		Static111.aClass44_21 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	public static void method1451() {
		anIntArray220 = null;
		anIntArray219 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Lclient!qf;BLclient!og;)V")
	public static void method1452(@OriginalArg(0) Class69[] arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			for (local12 = 0; local12 < 104; local12++) {
				for (local16 = 0; local16 < 104; local16++) {
					if ((Static119.aByteArrayArrayArray5[local8][local12][local16] & 0x1) == 1) {
						@Pc(31) int local31 = local8;
						if ((Static119.aByteArrayArrayArray5[1][local12][local16] & 0x2) == 2) {
							local31 = local8 - 1;
						}
						if (local31 >= 0) {
							arg0[local31].method2252(local12, local16);
						}
					}
				}
			}
		}
		Static108.anInt2586 += (int) (Math.random() * 5.0D) - 2;
		if (Static108.anInt2586 < -8) {
			Static108.anInt2586 = -8;
		}
		if (Static108.anInt2586 > 8) {
			Static108.anInt2586 = 8;
		}
		Static94.anInt2302 += (int) (Math.random() * 5.0D) - 2;
		local12 = Static108.anInt2586 >> 2 << 10;
		if (Static94.anInt2302 < -16) {
			Static94.anInt2302 = -16;
		}
		@Pc(117) int[][] local117 = new int[104][104];
		if (Static94.anInt2302 > 16) {
			Static94.anInt2302 = 16;
		}
		local16 = Static94.anInt2302 >> 1;
		@Pc(132) int[][] local132 = new int[104][104];
		@Pc(144) int local144;
		@Pc(150) int local150;
		@Pc(152) int local152;
		@Pc(156) int local156;
		@Pc(248) int local248;
		@Pc(181) int local181;
		@Pc(202) int local202;
		@Pc(215) int local215;
		@Pc(225) int local225;
		@Pc(219) int local219;
		@Pc(231) int local231;
		@Pc(296) int local296;
		@Pc(508) int local508;
		@Pc(545) int local545;
		@Pc(862) int local862;
		@Pc(824) int local824;
		@Pc(853) int local853;
		for (@Pc(134) int local134 = 0; local134 < 4; local134++) {
			@Pc(140) byte[][] local140 = Static175.aByteArrayArrayArray7[local134];
			local144 = (int) Math.sqrt(5100.0D);
			local150 = local144 * 768 >> 8;
			for (local152 = 1; local152 < 103; local152++) {
				for (local156 = 1; local156 < 103; local156++) {
					local181 = Static133.anIntArrayArrayArray8[local134][local156 + 1][local152] - Static133.anIntArrayArrayArray8[local134][local156 - 1][local152];
					local202 = Static133.anIntArrayArrayArray8[local134][local156][local152 + 1] - Static133.anIntArrayArrayArray8[local134][local156][local152 - 1];
					local215 = (int) Math.sqrt((double) (local202 * local202 + local181 * local181 + 65536));
					local219 = 65536 / local215;
					local225 = (local181 << 8) / local215;
					local231 = (local202 << 8) / local215;
					local248 = (local219 * -10 + local225 * -50 + local231 * -50) / local150 + 96;
					local296 = (local140[local156][local152 + 1] >> 3) + (local140[local156][local152 - 1] >> 2) + (local140[local156 + -1][local152] >> 2) + (local140[local156 + 1][local152] >> 3) + (local140[local156][local152] >> 1);
					local132[local156][local152] = local248 - local296;
				}
			}
			for (local156 = 0; local156 < 104; local156++) {
				Static152.anIntArray395[local156] = 0;
				Static156.anIntArray401[local156] = 0;
				Static94.anIntArray232[local156] = 0;
				Static161.anIntArray407[local156] = 0;
				Static179.anIntArray439[local156] = 0;
			}
			for (local248 = -5; local248 < 104; local248++) {
				for (local181 = 0; local181 < 104; local181++) {
					local202 = local248 + 5;
					@Pc(413) int local413;
					if (local202 < 104) {
						local215 = Static32.aByteArrayArrayArray2[local134][local202][local181] & 0xFF;
						if (local215 > 0) {
							@Pc(377) Class3_Sub2_Sub7 local377 = Static48.method963(local215 - 1);
							Static152.anIntArray395[local181] += local377.anInt1509;
							Static156.anIntArray401[local181] += local377.anInt1518;
							Static94.anIntArray232[local181] += local377.anInt1514;
							Static161.anIntArray407[local181] += local377.anInt1507;
							local413 = Static179.anIntArray439[local181]++;
						}
					}
					local215 = local248 - 5;
					if (local215 >= 0) {
						local225 = Static32.aByteArrayArrayArray2[local134][local215][local181] & 0xFF;
						if (local225 > 0) {
							@Pc(440) Class3_Sub2_Sub7 local440 = Static48.method963(local225 - 1);
							Static152.anIntArray395[local181] -= local440.anInt1509;
							Static156.anIntArray401[local181] -= local440.anInt1518;
							Static94.anIntArray232[local181] -= local440.anInt1514;
							Static161.anIntArray407[local181] -= local440.anInt1507;
							local413 = Static179.anIntArray439[local181]--;
						}
					}
				}
				if (local248 >= 0) {
					local202 = 0;
					local215 = 0;
					local225 = 0;
					local219 = 0;
					local231 = 0;
					for (local296 = -5; local296 < 104; local296++) {
						local508 = local296 + 5;
						if (local508 < 104) {
							local215 += Static156.anIntArray401[local508];
							local202 += Static152.anIntArray395[local508];
							local231 += Static179.anIntArray439[local508];
							local219 += Static161.anIntArray407[local508];
							local225 += Static94.anIntArray232[local508];
						}
						local545 = local296 - 5;
						if (local545 >= 0) {
							local225 -= Static94.anIntArray232[local545];
							local219 -= Static161.anIntArray407[local545];
							local202 -= Static152.anIntArray395[local545];
							local215 -= Static156.anIntArray401[local545];
							local231 -= Static179.anIntArray439[local545];
						}
						if (local296 >= 0 && local231 > 0) {
							local117[local248][local296] = Static20.method402(local225 / local231, local215 / local231, local202 * 256 / local219);
						}
					}
				}
			}
			for (local181 = 1; local181 < 103; local181++) {
				for (local202 = 1; local202 < 103; local202++) {
					if (!Static71.aBoolean76 || (Static119.aByteArrayArrayArray5[0][local181][local202] & 0x2) != 0 || (Static119.aByteArrayArrayArray5[local134][local181][local202] & 0x10) == 0 && Static25.method2917(local181, local202, local134) == Static27.anInt610) {
						if (local134 < Static148.anInt3558) {
							Static148.anInt3558 = local134;
						}
						local225 = Static174.aByteArrayArrayArray6[local134][local181][local202] & 0xFF;
						local215 = Static32.aByteArrayArrayArray2[local134][local181][local202] & 0xFF;
						if (local215 > 0 || local225 > 0) {
							local219 = Static133.anIntArrayArrayArray8[local134][local181][local202];
							local296 = Static133.anIntArrayArrayArray8[local134][local181 + 1][local202 + 1];
							local508 = Static133.anIntArrayArrayArray8[local134][local181][local202 + 1];
							local231 = Static133.anIntArrayArrayArray8[local134][local181 + 1][local202];
							if (local134 > 0) {
								@Pc(745) boolean local745 = true;
								if (local215 == 0 && Static58.aByteArrayArrayArray3[local134][local181][local202] != 0) {
									local745 = false;
								}
								if (local225 > 0 && !Static141.method2369(local225 - 1).aBoolean148) {
									local745 = false;
								}
								if (local745 && local231 == local219 && local296 == local219 && local219 == local508) {
									Static83.anIntArrayArrayArray5[local134][local181][local202] |= 0x924;
								}
							}
							if (local215 > 0) {
								local545 = local117[local181][local202];
								local824 = local16 + (local545 & 0x7F);
								if (local824 < 0) {
									local824 = 0;
								} else if (local824 > 127) {
									local824 = 127;
								}
								local853 = (local545 + local12 & 0xFC00) + (local545 & 0x380) + local824;
								local862 = Static132.anIntArray348[Static33.method585(local853, 96)];
							} else {
								local862 = 0;
								local545 = -1;
							}
							local853 = local132[local181 + 1][local202];
							@Pc(884) int local884 = local132[local181][local202 + 1];
							@Pc(894) int local894 = local132[local181 + 1][local202 + 1];
							local824 = local132[local181][local202];
							if (local225 == 0) {
								arg1.method2007(local134, local181, local202, 0, 0, -1, local219, local231, local296, local508, Static33.method585(local545, local824), Static33.method585(local545, local853), Static33.method585(local545, local894), Static33.method585(local545, local884), 0, 0, 0, 0, local862, 0);
							} else {
								@Pc(949) byte local949 = Static60.aByteArrayArrayArray4[local134][local181][local202];
								@Pc(959) int local959 = Static58.aByteArrayArrayArray3[local134][local181][local202] + 1;
								@Pc(965) Class3_Sub2_Sub15 local965 = Static141.method2369(local225 - 1);
								@Pc(968) int local968 = local965.anInt3495;
								if (local968 >= 0 && !Static132.anInterface3_1.method2821(local968)) {
									local968 = -1;
								}
								@Pc(990) int local990;
								@Pc(988) int local988;
								@Pc(1002) int local1002;
								@Pc(1027) int local1027;
								if (local968 >= 0) {
									local990 = -1;
									local988 = Static132.anIntArray348[Static114.method1915(96, Static132.anInterface3_1.method2819(local968))];
								} else if (local965.anInt3499 == -1) {
									local988 = 0;
									local990 = -2;
								} else {
									local990 = local965.anInt3499;
									local1002 = (local990 & 0x7F) + local16;
									if (local1002 < 0) {
										local1002 = 0;
									} else if (local1002 > 127) {
										local1002 = 127;
									}
									local1027 = (local990 & 0x380) + (local990 + local12 & 0xFC00) + local1002;
									local988 = Static132.anIntArray348[Static114.method1915(96, local1027)];
								}
								if (local965.anInt3492 >= 0) {
									local1002 = local965.anInt3492;
									local1027 = local16 + (local1002 & 0x7F);
									if (local1027 < 0) {
										local1027 = 0;
									} else if (local1027 > 127) {
										local1027 = 127;
									}
									@Pc(1090) int local1090 = (local1002 & 0x380) + (local1002 + local12 & 0xFC00) + local1027;
									local988 = Static132.anIntArray348[Static114.method1915(96, local1090)];
								}
								arg1.method2007(local134, local181, local202, local959, local949, local968, local219, local231, local296, local508, Static33.method585(local545, local824), Static33.method585(local545, local853), Static33.method585(local545, local894), Static33.method585(local545, local884), Static114.method1915(local824, local990), Static114.method1915(local853, local990), Static114.method1915(local894, local990), Static114.method1915(local884, local990), local862, local988);
							}
						}
					}
				}
			}
			for (local202 = 1; local202 < 103; local202++) {
				for (local215 = 1; local215 < 103; local215++) {
					arg1.method1991(local134, local215, local202, Static25.method2917(local215, local202, local134));
				}
			}
			Static32.aByteArrayArrayArray2[local134] = null;
			Static174.aByteArrayArrayArray6[local134] = null;
			Static58.aByteArrayArrayArray3[local134] = null;
			Static60.aByteArrayArrayArray4[local134] = null;
			Static175.aByteArrayArrayArray7[local134] = null;
		}
		arg1.method1989();
		for (@Pc(1216) int local1216 = 0; local1216 < 104; local1216++) {
			for (local144 = 0; local144 < 104; local144++) {
				if ((Static119.aByteArrayArrayArray5[1][local1216][local144] & 0x2) == 2) {
					arg1.method1993(local1216, local144);
				}
			}
		}
		local144 = 1;
		local150 = 2;
		local152 = 4;
		for (local156 = 0; local156 < 4; local156++) {
			if (local156 > 0) {
				local144 <<= 0x3;
				local152 <<= 0x3;
				local150 <<= 0x3;
			}
			for (local248 = 0; local248 <= local156; local248++) {
				for (local181 = 0; local181 <= 104; local181++) {
					for (local202 = 0; local202 <= 104; local202++) {
						if ((Static83.anIntArrayArrayArray5[local248][local202][local181] & local144) != 0) {
							local215 = local181;
							local219 = local248;
							local225 = local181;
							while (local215 > 0 && (Static83.anIntArrayArrayArray5[local248][local202][local215 - 1] & local144) != 0) {
								local215--;
							}
							while (local225 < 104 && (Static83.anIntArrayArrayArray5[local248][local202][local225 + 1] & local144) != 0) {
								local225++;
							}
							local231 = local248;
							label350: while (local219 > 0) {
								for (local296 = local215; local296 <= local225; local296++) {
									if ((local144 & Static83.anIntArrayArrayArray5[local219 - 1][local202][local296]) == 0) {
										break label350;
									}
								}
								local219--;
							}
							label339: while (local156 > local231) {
								for (local296 = local215; local296 <= local225; local296++) {
									if ((local144 & Static83.anIntArrayArrayArray5[local231 + 1][local202][local296]) == 0) {
										break label339;
									}
								}
								local231++;
							}
							local296 = (local225 + 1 - local215) * (local231 + 1 - local219);
							if (local296 >= 8) {
								local545 = Static133.anIntArrayArrayArray8[local231][local202][local215] - 240;
								local862 = Static133.anIntArrayArrayArray8[local219][local202][local215];
								Static117.method2002(local156, 1, local202 * 128, local202 * 128, local215 * 128, local225 * 128 + 128, local545, local862);
								for (local824 = local219; local824 <= local231; local824++) {
									for (local853 = local215; local853 <= local225; local853++) {
										Static83.anIntArrayArrayArray5[local824][local202][local853] &= ~local144;
									}
								}
							}
						}
						if ((Static83.anIntArrayArrayArray5[local248][local202][local181] & local150) != 0) {
							local225 = local202;
							local219 = local248;
							for (local215 = local202; local215 > 0 && (local150 & Static83.anIntArrayArrayArray5[local248][local215 - 1][local181]) != 0; local215--) {
							}
							local231 = local248;
							while (local225 < 104 && (Static83.anIntArrayArrayArray5[local248][local225 + 1][local181] & local150) != 0) {
								local225++;
							}
							label404: while (local219 > 0) {
								for (local296 = local215; local296 <= local225; local296++) {
									if ((Static83.anIntArrayArrayArray5[local219 - 1][local296][local181] & local150) == 0) {
										break label404;
									}
								}
								local219--;
							}
							label393: while (local231 < local156) {
								for (local296 = local215; local296 <= local225; local296++) {
									if ((local150 & Static83.anIntArrayArrayArray5[local231 + 1][local296][local181]) == 0) {
										break label393;
									}
								}
								local231++;
							}
							local296 = (local231 + 1 - local219) * (local225 + 1 - local215);
							if (local296 >= 8) {
								local545 = Static133.anIntArrayArrayArray8[local231][local215][local181] - 240;
								local862 = Static133.anIntArrayArrayArray8[local219][local215][local181];
								Static117.method2002(local156, 2, local215 * 128, local225 * 128 + 128, local181 * 128, local181 * 128, local545, local862);
								for (local824 = local219; local824 <= local231; local824++) {
									for (local853 = local215; local853 <= local225; local853++) {
										Static83.anIntArrayArrayArray5[local824][local853][local181] &= ~local150;
									}
								}
							}
						}
						if ((local152 & Static83.anIntArrayArrayArray5[local248][local202][local181]) != 0) {
							local215 = local202;
							local225 = local202;
							local231 = local181;
							local219 = local181;
							while (local231 < 104 && (Static83.anIntArrayArrayArray5[local248][local202][local231 + 1] & local152) != 0) {
								local231++;
							}
							while (local219 > 0 && (Static83.anIntArrayArrayArray5[local248][local202][local219 - 1] & local152) != 0) {
								local219--;
							}
							label458: while (local215 > 0) {
								for (local296 = local219; local296 <= local231; local296++) {
									if ((Static83.anIntArrayArrayArray5[local248][local215 - 1][local296] & local152) == 0) {
										break label458;
									}
								}
								local215--;
							}
							label447: while (local225 < 104) {
								for (local296 = local219; local296 <= local231; local296++) {
									if ((Static83.anIntArrayArrayArray5[local248][local225 + 1][local296] & local152) == 0) {
										break label447;
									}
								}
								local225++;
							}
							if ((local231 + 1 - local219) * (-local215 + 1 + local225) >= 4) {
								local296 = Static133.anIntArrayArrayArray8[local248][local215][local219];
								Static117.method2002(local156, 4, local215 * 128, local225 * 128 + 128, local219 * 128, local231 * 128 + 128, local296, local296);
								for (local508 = local215; local508 <= local225; local508++) {
									for (local545 = local219; local545 <= local231; local545++) {
										Static83.anIntArrayArrayArray5[local248][local508][local545] &= ~local152;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!kb;ILjava/awt/Color;)V")
	public static void method1453(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Color arg2) {
		try {
			@Pc(2) Graphics local2 = Static100.aCanvas1.getGraphics();
			if (Static174.aFont1 == null) {
				Static174.aFont1 = new Font("Helvetica", 1, 13);
				Static10.aFontMetrics1 = Static100.aCanvas1.getFontMetrics(Static174.aFont1);
			}
			if (Static159.aBoolean149) {
				Static159.aBoolean149 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static121.anInt2857, Static43.anInt1207);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static177.anImage4 == null) {
					Static177.anImage4 = Static100.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static177.anImage4.getGraphics();
				local47.setColor(arg2);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg1 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local47.setFont(Static174.aFont1);
				local47.setColor(Color.white);
				arg0.method1362(22, local47, (304 - arg0.method1374(Static10.aFontMetrics1)) / 2);
				local2.drawImage(Static177.anImage4, Static121.anInt2857 / 2 - 152, Static43.anInt1207 / 2 + -18, null);
			} catch (@Pc(124) Exception local124) {
				@Pc(130) int local130 = Static121.anInt2857 / 2 - 152;
				@Pc(136) int local136 = Static43.anInt1207 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(local130, local136, 303, 33);
				local2.fillRect(local130 + 2, local136 - -2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local130 + 1, local136 + 1, 301, 31);
				local2.fillRect(local130 + arg1 * 3 + 2, local136 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static174.aFont1);
				local2.setColor(Color.white);
				arg0.method1362(local136 + 22, local2, local130 + (304 - arg0.method1374(Static10.aFontMetrics1)) / 2);
			}
		} catch (@Pc(215) Exception local215) {
			Static100.aCanvas1.repaint();
		}
	}
}
