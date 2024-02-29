import java.io.IOException;
import java.io.InputStream;
import java.security.ProtectionDomain;
import java.util.Hashtable;
import javax.crypto.Cipher;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!j")
final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!j", name = "c", descriptor = "I")
	static int anInt5920;

	@OriginalMember(owner = "loader!j", name = "b", descriptor = "I")
	static int anInt5921;

	@OriginalMember(owner = "loader!j", name = "a", descriptor = "I")
	static int anInt5922;

	@OriginalMember(owner = "loader!j", name = "d", descriptor = "Lloader!d;")
	private Class707 aClass707_10;

	@OriginalMember(owner = "loader!j", name = "findClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 6)
	@Override
	protected final Class findClass(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		@Pc(21) Class var2;
		@Pc(1) boolean var13;
		label70: {
			var13 = Class707.aBoolean876;
			anInt5920++;
			@Pc(8) Class707 local8 = this.aClass707_10;
			@Pc(16) Class local16 = (Class) ((Hashtable) ((Class707_Sub1_Sub1_Sub1_Sub1) local8).anObject42).get(arg0);
			if (local16 != null) {
				var2 = local16;
				if (!var13) {
					break label70;
				}
			}
			@Pc(32) byte[] var5;
			label71: {
				var5 = (byte[]) ((Hashtable) ((Class707_Sub1) local8).anObject39).get(arg0);
				if (var5 != null) {
					((Hashtable) ((Class707_Sub1) local8).anObject39).remove(arg0);
					if (!var13) {
						break label71;
					}
				}
				@Pc(59) String local59 = arg0.replace('.', '/') + ".class";
				@Pc(66) InputStream local66 = ((ClassLoader) ((Class707_Sub1_Sub1) local8).anObject40).getResourceAsStream(local59);
				if (local66 == null) {
					var2 = ((ClassLoader_Sub1) ((Class707_Sub1_Sub1) local8).anObject40).method36614(arg0, 0);
					if (!var13) {
						break label70;
					}
				}
				@Pc(83) byte[] local83 = new byte[5242880];
				@Pc(85) int local85 = 0;
				try {
					@Pc(93) int local93 = local66.read(local83, local85, 5242880 - local85);
					while (local93 != -1) {
						local85 += local93;
						local93 = local66.read(local83, local85, -local85 + 5242880);
						if (var13 || var13) {
							break;
						}
					}
				} catch (@Pc(117) IOException local117) {
				}
				@Pc(120) byte[] local120 = new byte[local85];
				System.arraycopy(local83, 0, local120, 0, local85);
				try {
					@Pc(131) Class707 local131 = (Class707) ((Class707_Sub1_Sub1_Sub1) local8).anObject41;
					@Pc(138) byte[] local138 = ((Cipher) ((Class707_Sub1) local131).anObject39).doFinal(local120);
					var5 = local138;
				} catch (@Pc(142) Exception local142) {
					throw new RuntimeException(local142);
				}
			}
			if (var5 != null) {
				@Pc(165) Class local165 = ((ClassLoader_Sub1) ((Class707_Sub1_Sub1) local8).anObject40).method36613(arg0, var5.length, var5, 59, (ProtectionDomain) ((Class707_Sub1_Sub1_Sub1_Sub1_Sub1) local8).anObject43, 0);
				var2 = local165;
				((Hashtable) ((Class707_Sub1_Sub1_Sub1_Sub1) local8).anObject42).put(arg0, local165);
				if (!var13) {
					break label70;
				}
			}
			var2 = ((ClassLoader_Sub1) ((Class707_Sub1_Sub1) local8).anObject40).method36614(arg0, 0);
		}
		if (Rs2Applet.aBoolean870) {
			Class707.aBoolean876 = !var13;
		}
		return var2;
	}

	@OriginalMember(owner = "loader!j", name = "a", descriptor = "(Ljava/lang/String;I[BILjava/security/ProtectionDomain;I)Ljava/lang/Class;", line = 89)
	private final Class method36613(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) ProtectionDomain arg4, @OriginalArg(5) int arg5) throws ClassFormatError {
		if (arg3 <= 51) {
			this.aClass707_10 = null;
		}
		anInt5921++;
		return this.defineClass(arg0, arg2, arg5, arg1, arg4);
	}

	@OriginalMember(owner = "loader!j", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 100)
	private final Class method36614(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws ClassNotFoundException {
		anInt5922++;
		if (arg1 != 0) {
			this.aClass707_10 = null;
		}
		return super.findSystemClass(arg0);
	}

	@OriginalMember(owner = "loader!j", name = "<init>", descriptor = "(Lloader!d;)V", line = 112)
	ClassLoader_Sub1(@OriginalArg(0) Class707 arg0) {
		this.aClass707_10 = arg0;
	}
}
