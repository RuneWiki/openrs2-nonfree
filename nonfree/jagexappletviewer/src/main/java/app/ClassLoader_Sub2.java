package app;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLConnection;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/u")
final class ClassLoader_Sub2 extends ClassLoader {

	@OriginalMember(owner = "jagexappletviewer!app/u", name = "a", descriptor = "Ljava/lang/ClassLoader;")
	private static ClassLoader aClassLoader1;

	@OriginalMember(owner = "jagexappletviewer!app/u", name = "b", descriptor = "Ljagexappletviewer!app/u;")
	private static ClassLoader_Sub2 aClassLoader_Sub2_1;

	@OriginalMember(owner = "jagexappletviewer!app/u", name = "loadClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	public final Class loadClass(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if ("netscape.javascript.JSObject".equals(arg0)) {
			@Pc(14) CodeSource local14 = new CodeSource(null, (Certificate[]) null);
			@Pc(18) Permissions local18 = new Permissions();
			local18.add(new AllPermission());
			@Pc(29) ProtectionDomain local29 = new ProtectionDomain(local14, local18);
			try {
				@Pc(35) URL local35 = this.getClass().getClassLoader().getResource("netscape/javascript/JSObjec_.class");
				@Pc(38) URLConnection local38 = local35.openConnection();
				@Pc(41) InputStream local41 = local38.getInputStream();
				@Pc(45) byte[] local45 = new byte[local38.getContentLength()];
				for (@Pc(47) int local47 = 0; local47 < local45.length; local47 += local41.read(local45, local47, local45.length - local47)) {
				}
				for (@Pc(71) int local71 = 0; local71 < local45.length; local71++) {
					@Pc(81) int local81 = local45[local71] & 0xFF;
					if ("JSObject".charAt(0) == local81) {
						for (@Pc(88) int local88 = 1; local88 + local71 < local45.length; local88++) {
							if ("JSObject".length() - 1 == local88) {
								local45[local71 + local88] = (byte) "JSObject".charAt(local88);
								break;
							}
							local81 = local45[local71 + local88] & 0xFF;
							if ("JSObject".charAt(local88) != local81) {
								break;
							}
						}
					}
				}
				return this.defineClass(arg0, local45, 0, local45.length, local29);
			} catch (@Pc(154) IOException local154) {
				local154.printStackTrace();
			}
		}
		try {
			return this.getClass().getClassLoader().loadClass(arg0);
		} catch (@Pc(163) Exception local163) {
			return aClassLoader1.loadClass(arg0);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/u", name = "a", descriptor = "(I)V")
	static final void method42(@OriginalArg(0) int arg0) {
		aClassLoader_Sub2_1 = new ClassLoader_Sub2();
		if (arg0 != -22510) {
			return;
		}
		aClassLoader_Sub2_1.method43((byte) -112);
		try {
			aClassLoader_Sub2_1.loadClass("netscape.javascript.JSObject");
		} catch (@Pc(17) Exception local17) {
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/u", name = "a", descriptor = "(B)V")
	private final void method43(@OriginalArg(0) byte arg0) {
		try {
			aClassLoader1 = ClassLoader.getSystemClassLoader();
			@Pc(5) Field local5 = ClassLoader.class.getDeclaredField("scl");
			local5.setAccessible(true);
			if (arg0 != -112) {
				aClassLoader1 = null;
			}
			local5.set(aClassLoader1, this);
			local5.setAccessible(false);
		} catch (@Pc(25) Throwable local25) {
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/u", name = "<init>", descriptor = "()V")
	public ClassLoader_Sub2() {
	}
}
