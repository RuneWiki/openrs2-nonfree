import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	public static int anInt1553 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	public static void method1443() {
		for (@Pc(1) int local1 = 0; local1 < Static460.aClass360Array1.length; local1++) {
			Static460.aClass360Array1[local1].method8171();
		}
		Static460.aClass360Array1 = null;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(B)V")
	public static void method1445() {
		@Pc(20) Class5_Sub16 local20 = Static455.method6717(Static110.aClass187_32, Static16.aClass332_8);
		local20.aClass5_Sub15_Sub2_1.method3651(0);
		Static479.method7038(local20);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static229.method3288(arg0, arg1)) {
			return Static239.method3443(arg1, arg0) | (arg0 & 0xB000) != 0 | Static416.method6123(arg0, arg1) ? true : (Static488.method7146(arg1, arg0) | Static443.method6610(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(B)V")
	public static void method1447() {
		if (Static572.anInt9353 == 0) {
			return;
		}
		try {
			if (++Static456.anInt7922 > 2000) {
				if (Static537.aClass240_34 != null) {
					Static537.aClass240_34.method5658();
					Static537.aClass240_34 = null;
				}
				if (Static123.anInt2148 >= 2) {
					Static572.anInt9353 = 0;
					Static59.anInt6271 = -5;
					return;
				}
				Static515.aClass365_4.method8293();
				Static572.anInt9353 = 1;
				Static123.anInt2148++;
				Static456.anInt7922 = 0;
			}
			if (Static572.anInt9353 == 1) {
				Static444.aClass297_6 = Static515.aClass365_4.method8291(Static150.aClass202_2);
				Static572.anInt9353 = 2;
			}
			if (Static572.anInt9353 == 2) {
				if (Static444.aClass297_6.anInt8459 == 2) {
					throw new IOException();
				}
				if (Static444.aClass297_6.anInt8459 != 1) {
					return;
				}
				Static537.aClass240_34 = Static311.method4773((Socket) Static444.aClass297_6.anObject15);
				Static444.aClass297_6 = null;
				Static652.method8576();
				Static572.anInt9353 = 4;
			}
			if (Static572.anInt9353 == 4 && Static537.aClass240_34.method5659(1)) {
				Static537.aClass240_34.method5656(1, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
				@Pc(123) int local123 = Static386.aClass5_Sub15_Sub2_2.aByteArray45[0] & 0xFF;
				Static59.anInt6271 = local123;
				Static572.anInt9353 = 0;
				Static537.aClass240_34.method5658();
				Static537.aClass240_34 = null;
			}
		} catch (@Pc(134) IOException local134) {
			if (Static537.aClass240_34 != null) {
				Static537.aClass240_34.method5658();
				Static537.aClass240_34 = null;
			}
			if (Static123.anInt2148 >= 2) {
				Static572.anInt9353 = 0;
				Static59.anInt6271 = -4;
			} else {
				Static515.aClass365_4.method8293();
				Static456.anInt7922 = 0;
				Static123.anInt2148++;
				Static572.anInt9353 = 1;
			}
		}
	}
}
