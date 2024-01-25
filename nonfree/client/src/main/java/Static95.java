import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
	public static void method2014() {
		if (Static180.anInt3497 < 102) {
			Static180.anInt3497 += 6;
		}
		if (Static189.anInt4752 != 0) {
			Static488.anInt6246 -= Static189.anInt4752 * 5;
			if (Static532.anInt8981 <= Static488.anInt6246) {
				Static488.anInt6246 = Static532.anInt8981 - 1;
			}
			Static189.anInt4752 = 0;
			if (Static488.anInt6246 < 0) {
				Static488.anInt6246 = 0;
			}
		}
		for (@Pc(46) int local46 = 0; local46 < Static214.anInt4064; local46++) {
			@Pc(52) Interface1 local52 = Static39.anInterface1Array1[local46];
			@Pc(56) int local56 = local52.method5005();
			@Pc(60) char local60 = local52.method5008();
			@Pc(64) int local64 = local52.method5007();
			if (local56 == 84) {
				Static109.method2182(false);
			}
			if (local56 == 80) {
				Static109.method2182(true);
			} else if (local56 == 66 && (local64 & 0x4) != 0) {
				if (Static35.aClipboard1 != null) {
					@Pc(377) String local377 = "";
					for (@Pc(382) int local382 = Static193.aStringArray19.length - 1; local382 >= 0; local382--) {
						if (Static193.aStringArray19[local382] != null && Static193.aStringArray19[local382].length() > 0) {
							local377 = local377 + Static193.aStringArray19[local382] + '\n';
						}
					}
					Static35.aClipboard1.setContents(new StringSelection(local377), null);
				}
			} else if (local56 == 67 && (local64 & 0x4) != 0) {
				if (Static35.aClipboard1 != null) {
					@Pc(102) Transferable local102 = Static35.aClipboard1.getContents(null);
					if (local102 != null) {
						try {
							@Pc(109) String local109 = (String) local102.getTransferData(DataFlavor.stringFlavor);
							if (local109 != null) {
								@Pc(116) String[] local116 = Static514.method7107('\n', local109);
								if (local116.length <= 1) {
									Static256.aString52 = Static256.aString52 + local109;
								} else {
									for (@Pc(133) int local133 = 0; local133 < local116.length; local133++) {
										Static256.aString52 = local116[local133];
										Static109.method2182(false);
									}
								}
							}
						} catch (@Pc(153) Exception local153) {
						}
					}
				}
			} else if (local56 == 85 && Static484.anInt8949 > 0) {
				Static256.aString52 = Static256.aString52.substring(0, Static484.anInt8949 - 1) + Static256.aString52.substring(Static484.anInt8949);
				Static484.anInt8949--;
			} else if (local56 == 101 && Static484.anInt8949 < Static256.aString52.length()) {
				Static256.aString52 = Static256.aString52.substring(0, Static484.anInt8949) + Static256.aString52.substring(Static484.anInt8949 + 1);
			} else if (local56 == 96 && Static484.anInt8949 > 0) {
				Static484.anInt8949--;
			} else if (local56 == 97 && Static484.anInt8949 < Static256.aString52.length()) {
				Static484.anInt8949++;
			} else if (local56 == 102) {
				Static484.anInt8949 = 0;
			} else if (local56 == 103) {
				Static484.anInt8949 = Static256.aString52.length();
			} else if (local56 == 104 && Static28.anInt550 < Static193.aStringArray19.length) {
				Static28.anInt550++;
				Static525.method7180();
				Static484.anInt8949 = Static256.aString52.length();
			} else if (local56 == 105 && Static28.anInt550 > 0) {
				Static28.anInt550--;
				Static525.method7180();
				Static484.anInt8949 = Static256.aString52.length();
			} else if (Static117.method2267(local60) || local60 == ':' || local60 == ',' || local60 == ' ' || local60 == '_' || local60 == '-' || local60 == '+' || local60 == '[' || local60 == ']') {
				Static256.aString52 = Static256.aString52.substring(0, Static484.anInt8949) + Static39.anInterface1Array1[local46].method5008() + Static256.aString52.substring(Static484.anInt8949);
				Static484.anInt8949++;
			}
		}
		Static214.anInt4064 = 0;
		Static544.method2108();
	}
}
