package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public class Class142 {

	@OriginalMember(owner = "client!al", name = "ou", descriptor = "Ljava/lang/String;")
	static String aString58;

	@OriginalMember(owner = "client!al", name = "uc", descriptor = "I")
	public static int anInt2017;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "Lclient!al;")
	static final Class142 aClass142_1 = new Class142(0);

	@OriginalMember(owner = "client!al", name = "c", descriptor = "Lclient!al;")
	static final Class142 aClass142_4 = new Class142(1);

	@OriginalMember(owner = "client!al", name = "v", descriptor = "Lclient!al;")
	static final Class142 aClass142_2 = new Class142(2);

	@OriginalMember(owner = "client!al", name = "l", descriptor = "Lclient!al;")
	static final Class142 aClass142_3 = new Class142(3);

	@OriginalMember(owner = "client!al", name = "y", descriptor = "I")
	final int anInt2016;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "(Ljava/net/Socket;IB)Lclient!ta;", line = 10)
	public static Class139 method14871(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		return new Class139_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(J)V", line = 20)
	static final void method14872(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V", line = 74)
	Class142(@OriginalArg(0) int arg0) {
		this.anInt2016 = arg0 * 802664471;
	}

	@OriginalMember(owner = "client!al", name = "z", descriptor = "(CB)Z", line = 182)
	public static boolean method14873(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V", line = 709)
	public static void method14874() {
		Class277.aClass232_74.method25850();
		Class277.aClass232_72.method25850();
		Class277.aClass232_73.method25850();
		Class277.aClass232_71.method25850();
	}

	@OriginalMember(owner = "client!al", name = "it", descriptor = "(I)V", line = 4656)
	static final void method14875() {
		client.aBoolean631 = false;
		if (Class669.anInt5790 * -878424575 == 3) {
			return;
		}
		@Pc(11) Class447 local11 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
		@Pc(15) Class474 local15 = client.aClass517_1.method30441();
		@Pc(61) int local61;
		if (Class11.anInt36 * -891094135 != 2 && Class11.anInt36 * -891094135 != 3 && Class70.anInt203 * 8737185 == -1) {
			local61 = Class277.method26658(Class96_Sub13.anInt883 * -116109187, Class633.anInt5710 * -1098179003, Class669.anInt5790 * -878424575);
			if (local61 - Class672.anInt5796 * 1529694271 < 3200 && (local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][Class96_Sub13.anInt883 * -116109187 >> 9][Class633.anInt5710 * -1098179003 >> 9] & 0x4) != 0) {
				client.aBoolean631 = true;
			}
			return;
		}
		@Pc(34) Class595 local34 = client.aClass517_1.method30409();
		@Pc(72) int local72;
		if (Class11.anInt36 * -891094135 == 3) {
			@Pc(45) Class447 local45 = Class597.aClass107_Sub1_2.method8873().method23165();
			if (Float.isNaN(local45.aFloat277)) {
				return;
			}
			local61 = (int) local45.aFloat277 - (local34.anInt5504 * -424199969 << 9);
			local72 = (int) local45.aFloat278 - (local34.anInt5506 * -1166289421 << 9);
			if (local61 < 0 || local72 < 0 || local61 >> 9 >= local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575].length || local72 >> 9 >= local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local61 >> 9].length) {
				return;
			}
		} else if (Class11.anInt36 * -891094135 == 2) {
			local61 = (int) local11.aFloat277;
			local72 = (int) local11.aFloat278;
		} else {
			local61 = Class70.anInt203 * 8737185;
			local72 = anInt2017 * 133182057;
		}
		if ((local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local61 >> 9][local72 >> 9] & 0x4) != 0) {
			client.aBoolean631 = true;
			return;
		}
		@Pc(180) int local180;
		@Pc(169) int local169;
		if (Class11.anInt36 * -891094135 == 3) {
			@Pc(158) Class447 local158 = Class597.aClass107_Sub1_2.method8871().method21213();
			local169 = ((int) local158.aFloat277 >> 9) - local34.anInt5504 * -424199969;
			local180 = ((int) local158.aFloat278 >> 9) - local34.anInt5506 * -1166289421;
			if (local169 < 0 || local180 < 0 || local169 >= local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575].length || local180 >= local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169].length) {
				return;
			}
		} else {
			local169 = Class96_Sub13.anInt883 * -116109187 >> 9;
			local180 = Class633.anInt5710 * -1098179003 >> 9;
		}
		@Pc(222) int local222 = local61 >> 9;
		@Pc(226) int local226 = local72 >> 9;
		@Pc(242) int local242;
		if (local15.method29660(local169, local180)) {
			local242 = Class277.method26658(Class96_Sub13.anInt883 * -116109187, Class633.anInt5710 * -1098179003, 3);
			if (Class672.anInt5796 * 1529694271 >= local242) {
				client.aBoolean631 = true;
			}
			return;
		}
		if (Class565.anInt5338 * -864938791 >= 2560) {
			return;
		}
		if (local222 > local169) {
			local242 = local222 - local169;
		} else {
			local242 = local169 - local222;
		}
		@Pc(274) int local274;
		if (local226 > local180) {
			local274 = local226 - local180;
		} else {
			local274 = local180 - local226;
		}
		if (local242 == 0 && local274 == 0 || local242 <= -client.aClass517_1.method30411() || local242 >= client.aClass517_1.method30411() || local274 <= -client.aClass517_1.method30417() || local274 >= client.aClass517_1.method30417()) {
			if (Class11.anInt36 * -891094135 != 3) {
				Class293.method27014(local169 + Class184.aString133 + local180 + " " + local222 + Class184.aString133 + local226 + " " + local34.anInt5504 * -424199969 + Class184.aString133 + local34.anInt5506 * -1166289421, new RuntimeException());
			}
			return;
		}
		@Pc(359) int local359;
		@Pc(361) int local361;
		if (local242 <= local274) {
			local359 = local242 * 65536 / local274;
			local361 = 32768;
			while (local226 != local180) {
				if (local180 < local226) {
					local180++;
				} else if (local180 > local226) {
					local180--;
				}
				if ((local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169][local180] & 0x4) != 0) {
					client.aBoolean631 = true;
					return;
				}
				if (local169 + 1 < local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575].length && (local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169 + 1][local180] & 0x4) != 0) {
					client.aBoolean631 = true;
					return;
				}
				if (local169 > 0 && (local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169 - 1][local180] & 0x4) != 0) {
					client.aBoolean631 = true;
					return;
				}
				local361 += local359;
				if (local361 >= 65536) {
					local361 -= 65536;
					if (local169 < local222) {
						local169++;
						if (local169 + 1 < local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575].length && (local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169 + 1][local180] & 0x4) != 0) {
							client.aBoolean631 = true;
							return;
						}
					} else if (local169 > local222) {
						local169--;
						if (local169 > 0 && (local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169 - 1][local180] & 0x4) != 0) {
							client.aBoolean631 = true;
							return;
						}
					}
				}
			}
			return;
		}
		local359 = local274 * 65536 / local242;
		local361 = 32768;
		while (local222 != local169) {
			if (local169 < local222) {
				local169++;
			} else if (local169 > local222) {
				local169--;
			}
			if ((local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169][local180] & 0x4) != 0) {
				client.aBoolean631 = true;
				return;
			}
			if (local180 + 1 < local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169].length && (local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169][local180 + 1] & 0x4) != 0) {
				client.aBoolean631 = true;
				return;
			}
			if (local180 > 0 && (local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169][local180 - 1] & 0x4) != 0) {
				client.aBoolean631 = true;
				return;
			}
			local361 += local359;
			if (local361 >= 65536) {
				local361 -= 65536;
				if (local180 < local226) {
					local180++;
					if (local180 + 1 < local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169].length && (local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169][local180 + 1] & 0x4) != 0) {
						client.aBoolean631 = true;
						return;
					}
				} else if (local180 > local226) {
					local180--;
					if (local180 > 0 && (local15.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local169][local180 - 1] & 0x4) != 0) {
						client.aBoolean631 = true;
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "axj", descriptor = "(Lclient!yf;B)V", line = 13476)
	static final void method14876(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class104_Sub1) arg0.anInterface61_1).method24134();
	}

	@OriginalMember(owner = "client!al", name = "azw", descriptor = "(Lclient!yf;B)V", line = 13749)
	static final void method14877(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass248_1.method26141(local13).method26405(local23);
	}
}
