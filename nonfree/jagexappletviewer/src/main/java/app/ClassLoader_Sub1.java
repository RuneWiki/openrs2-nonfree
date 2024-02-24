package app;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Hashtable;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/aa")
final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "jagexappletviewer!app/aa", name = "a", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/aa", name = "b", descriptor = "Ljagexappletviewer!app/k;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "jagexappletviewer!app/aa", name = "c", descriptor = "Ljava/security/ProtectionDomain;")
	private ProtectionDomain aProtectionDomain1;

	@OriginalMember(owner = "jagexappletviewer!app/aa", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	protected final synchronized Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException {
		@Pc(5) Class local5 = (Class) this.aHashtable1.get(arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(23) byte[] local23 = this.aClass12_1.method31(-105, arg0 + ".class");
		if (local23 == null) {
			return super.findSystemClass(arg0);
		}
		local5 = this.defineClass(arg0, local23, 0, local23.length, this.aProtectionDomain1);
		if (arg1) {
			this.resolveClass(local5);
		}
		this.aHashtable1.put(arg0, local5);
		return local5;
	}

	@OriginalMember(owner = "jagexappletviewer!app/aa", name = "getResourceAsStream", descriptor = "(Ljava/lang/String;)Ljava/io/InputStream;")
	public final InputStream getResourceAsStream(@OriginalArg(0) String arg0) {
		@Pc(5) byte[] local5 = this.aClass12_1.method31(-117, arg0);
		return local5 == null ? ClassLoader.getSystemResourceAsStream(arg0) : new ByteArrayInputStream(local5);
	}

	@OriginalMember(owner = "jagexappletviewer!app/aa", name = "<init>", descriptor = "([BZZ)V")
	ClassLoader_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) throws IOException {
		if (arg1 || arg2) {
			@Pc(18) ByteArrayOutputStream local18 = new ByteArrayOutputStream();
			@Pc(26) GZIPInputStream local26 = new GZIPInputStream(new ByteArrayInputStream(arg0));
			if (arg1) {
				@Pc(52) JarOutputStream local52 = new JarOutputStream(local18);
				Pack200.newUnpacker().unpack(local26, local52);
				local52.close();
				local18.close();
			} else {
				@Pc(31) byte[] local31 = new byte[1000000];
				while (true) {
					@Pc(35) int local35 = local26.read(local31);
					if (local35 == -1) {
						break;
					}
					local18.write(local31, 0, local35);
				}
			}
			arg0 = local18.toByteArray();
		}
		this.aClass12_1 = new Class12(arg0);
		@Pc(76) CodeSource local76 = new CodeSource(null, (Certificate[]) null);
		@Pc(80) Permissions local80 = new Permissions();
		local80.add(new AllPermission());
		this.aProtectionDomain1 = new ProtectionDomain(local76, local80);
	}
}
