import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!wp;BI)V")
	public static void method5359(@OriginalArg(0) int arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(3) int arg2) {
		Static39.aClass361_2 = arg1;
		Static326.anInt5526 = arg2;
		Static185.anInt3523 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	public static void method5361() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static174.aClass136Array1.length; local3++) {
				if (Static174.aClass136Array1[local3].method3396()) {
					Static253.aLongArray8[local3] = Static174.aClass136Array1[local3].method3397();
				} else {
					synchronized (Static174.aClass136Array1[local3]) {
						Static174.aClass136Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static174.aClass136Array1[Static174.aClass136Array1.length - 1].method3394();
				Static382.method5651(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static174.aClass136Array1.length - 1; local3++) {
						if (!Static174.aClass136Array1[local3].method3396()) {
							synchronized (Static174.aClass136Array1[local3]) {
								Static174.aClass136Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static174.aClass136Array1.length - 2; local102++) {
							Static174.aClass136Array1[local102].method3394();
						}
						Static382.method5651(2);
						while (!Static174.aClass136Array1[0].method3396()) {
							synchronized (Static174.aClass136Array1[0]) {
								Static174.aClass136Array1[0].notify();
							}
							try {
								Static589.method7892(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static174.aClass136Array1[0].method3394();
						return;
					}
					try {
						Static589.method7892(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static589.method7892(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
