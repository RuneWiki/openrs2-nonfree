import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vb")
public final class Class69 implements Runnable {

	@OriginalMember(owner = "loader!vb", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString10;

	@OriginalMember(owner = "loader!vb", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod2;

	@OriginalMember(owner = "loader!vb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString11;

	@OriginalMember(owner = "loader!vb", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "loader!vb", name = "a", descriptor = "I")
	private static final int anInt2771 = 1;

	@OriginalMember(owner = "loader!vb", name = "h", descriptor = "Lloader!bb;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!vb", name = "t", descriptor = "Lloader!ma;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!vb", name = "b", descriptor = "Lloader!k;")
	private Class67 aClass67_1 = null;

	@OriginalMember(owner = "loader!vb", name = "c", descriptor = "I")
	private int anInt2772 = 0;

	@OriginalMember(owner = "loader!vb", name = "s", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "loader!vb", name = "e", descriptor = "Lloader!ud;")
	private Class68 aClass68_2 = null;

	@OriginalMember(owner = "loader!vb", name = "g", descriptor = "Lloader!k;")
	private Class67 aClass67_2 = null;

	@OriginalMember(owner = "loader!vb", name = "j", descriptor = "I")
	private int anInt2773 = 0;

	@OriginalMember(owner = "loader!vb", name = "r", descriptor = "Ljava/lang/String;")
	private String aString13 = null;

	@OriginalMember(owner = "loader!vb", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!vb", name = "o", descriptor = "Lloader!ud;")
	private Class68 aClass68_3 = null;

	@OriginalMember(owner = "loader!vb", name = "k", descriptor = "Ljava/lang/String;")
	public String aString12 = null;

	@OriginalMember(owner = "loader!vb", name = "l", descriptor = "Ljava/lang/String;")
	private String aString16 = null;

	@OriginalMember(owner = "loader!vb", name = "q", descriptor = "Ljava/lang/String;")
	public String aString15 = null;

	@OriginalMember(owner = "loader!vb", name = "f", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!vb", name = "d", descriptor = "[Lloader!k;")
	private final Class67[] aClass67Array1;

	@OriginalMember(owner = "loader!vb", name = "v", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!vb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class69(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		aString14 = "1.1";
		this.anInetAddress2 = arg2;
		this.anApplet3 = arg1;
		aString11 = "Unknown";
		try {
			aString11 = System.getProperty("java.vendor");
			aString14 = System.getProperty("java.version");
			aString10 = System.getProperty("user.home");
			if (aString10 != null) {
				aString10 = aString10 + "/";
			}
		} catch (@Pc(70) Exception local70) {
		}
		try {
			if (arg1 == null) {
				aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(97) Exception local97) {
		}
		this.method1886(arg3, arg4);
		this.aClass67_1 = new Class67(new File(this.aString16 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass67Array1 = new Class67[arg5];
		for (@Pc(129) int local129 = 0; local129 < arg5; local129++) {
			this.aClass67Array1[local129] = new Class67(new File(this.aString16 + "main_file_cache.idx" + local129), "rw", 1048576L);
		}
		this.aClass67_2 = new Class67(new File(this.aString16 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method1889();
		this.aBoolean152 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!vb", name = "a", descriptor = "(IBLjava/lang/String;)V")
	private void method1886(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		if (aString10 == null) {
			aString10 = "~/";
		}
		@Pc(32) String local32 = ".file_store_" + arg0;
		@Pc(91) String[] local91 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString10, "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			try {
				@Pc(101) String local101 = local91[local93];
				@Pc(111) File local111;
				if (local101.length() > 0) {
					local111 = new File(local101);
					if (!local111.exists()) {
						continue;
					}
				}
				local111 = new File(local101 + local32);
				if (local111.exists() || local111.mkdir()) {
					if (arg1.length() > 0) {
						local111 = new File(local111, arg1);
						if (!local111.exists() && !local111.mkdir()) {
							continue;
						}
					}
					this.aString15 = this.aString13 = local111.getParent() + "/";
					this.aString12 = this.aString16 = local111.getPath() + "/";
					return;
				}
			} catch (@Pc(184) Exception local184) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!vb", name = "b", descriptor = "(I)V")
	private void method1889() {
		try {
			@Pc(12) File local12 = new File(this.aString13 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(38) DataOutputStream local38 = new DataOutputStream(new FileOutputStream(this.aString13 + "uid.dat"));
				local38.writeInt((int) (Math.random() * 9.9999999E7D));
				local38.close();
			}
		} catch (@Pc(55) Exception local55) {
		}
		try {
			@Pc(71) DataInputStream local71 = new DataInputStream(new FileInputStream(this.aString13 + "uid.dat"));
			this.anInt2772 = local71.readInt() + 1;
			local71.close();
		} catch (@Pc(81) Exception local81) {
		}
	}

	@OriginalMember(owner = "loader!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class68 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean152) {
						return;
					}
					if (this.aClass68_2 != null) {
						local16 = this.aClass68_2;
						this.aClass68_2 = this.aClass68_2.aClass68_1;
						if (this.aClass68_2 == null) {
							this.aClass68_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(44) int local44 = local16.anInt2768;
				if (local44 == 1) {
					local16.anObject5 = new Socket(this.anInetAddress2, local16.anInt2769);
				} else if (local44 == 2) {
					@Pc(233) Thread local233 = new Thread((Runnable) local16.anObject6);
					local233.setDaemon(true);
					local233.start();
					local233.setPriority(local16.anInt2769);
					local16.anObject5 = local233;
				} else if (local44 == 4) {
					local16.anObject5 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(72) Object[] local72;
					if (local44 == 9) {
						local72 = (Object[]) local16.anObject6;
						if (((Class) local72[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local72[0]).getDeclaredMethod((String) local72[1], (Class[]) local72[2]);
					} else if (local44 == 10) {
						local72 = (Object[]) local16.anObject6;
						if (((Class) local72[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local72[0]).getDeclaredField((String) local72[1]);
					} else if (local44 == 3) {
						@Pc(176) String local176 = (local16.anInt2769 >> 24 & 0xFF) + "." + (local16.anInt2769 >> 16 & 0xFF) + "." + (local16.anInt2769 >> 8 & 0xFF) + "." + (local16.anInt2769 & 0xFF);
						local16.anObject5 = InetAddress.getByName(local176).getHostName();
					} else if (local44 == 5) {
						local16.anObject5 = new Class67(new File(this.aString13 + "music" + this.anInt2773 + ".mid"), "rw", 1048576L);
						this.anInt2773 = (this.anInt2773 + 1) % 5;
					}
				}
				local16.anInt2770 = 1;
			} catch (@Pc(260) Exception local260) {
				local16.anInt2770 = 2;
			}
		}
	}
}
