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

@OriginalClass("loader!sb")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "loader!sb", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString11;

	@OriginalMember(owner = "loader!sb", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "loader!sb", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "loader!sb", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!sb", name = "l", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!sb", name = "q", descriptor = "I")
	private static final int anInt2953 = 1;

	@OriginalMember(owner = "loader!sb", name = "b", descriptor = "Lloader!md;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!sb", name = "f", descriptor = "Lloader!u;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!sb", name = "n", descriptor = "Lloader!gb;")
	private Class68 aClass68_2 = null;

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "I")
	private int anInt2952 = 0;

	@OriginalMember(owner = "loader!sb", name = "e", descriptor = "Ljava/lang/String;")
	public String aString10 = null;

	@OriginalMember(owner = "loader!sb", name = "v", descriptor = "I")
	private int anInt2951 = 0;

	@OriginalMember(owner = "loader!sb", name = "m", descriptor = "Ljava/lang/String;")
	public String aString15 = null;

	@OriginalMember(owner = "loader!sb", name = "d", descriptor = "Lloader!nb;")
	private Class69 aClass69_1 = null;

	@OriginalMember(owner = "loader!sb", name = "j", descriptor = "Ljava/lang/String;")
	private String aString14 = null;

	@OriginalMember(owner = "loader!sb", name = "k", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "loader!sb", name = "t", descriptor = "Lloader!nb;")
	private Class69 aClass69_2 = null;

	@OriginalMember(owner = "loader!sb", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!sb", name = "u", descriptor = "Ljava/lang/String;")
	private String aString16 = null;

	@OriginalMember(owner = "loader!sb", name = "w", descriptor = "Lloader!gb;")
	private Class68 aClass68_3 = null;

	@OriginalMember(owner = "loader!sb", name = "o", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!sb", name = "i", descriptor = "[Lloader!nb;")
	private final Class69[] aClass69Array1;

	@OriginalMember(owner = "loader!sb", name = "s", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!sb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class70(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		aString12 = "1.1";
		this.anInetAddress2 = arg2;
		aString13 = "Unknown";
		this.anApplet3 = arg1;
		try {
			aString13 = System.getProperty("java.vendor");
			aString12 = System.getProperty("java.version");
			aString11 = System.getProperty("user.home");
			if (aString11 != null) {
				aString11 = aString11 + "/";
			}
		} catch (@Pc(70) Exception local70) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		this.method1871(arg3, arg4);
		this.aClass69_2 = new Class69(new File(this.aString14 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass69Array1 = new Class69[arg5];
		for (@Pc(157) int local157 = 0; local157 < arg5; local157++) {
			this.aClass69Array1[local157] = new Class69(new File(this.aString14 + "main_file_cache.idx" + local157), "rw", 1048576L);
		}
		this.aClass69_1 = new Class69(new File(this.aString14 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method1873();
		this.aBoolean164 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method1871(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (aString11 == null) {
			aString11 = "~/";
		}
		@Pc(63) String[] local63 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString11, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(84) String local84 = ".file_store_" + arg0;
		for (@Pc(86) int local86 = 0; local86 < local63.length; local86++) {
			try {
				@Pc(94) String local94 = local63[local86];
				@Pc(103) File local103;
				if (local94.length() > 0) {
					local103 = new File(local94);
					if (!local103.exists()) {
						continue;
					}
				}
				local103 = new File(local94 + local84);
				if (local103.exists() || local103.mkdir()) {
					if (arg1.length() > 0) {
						local103 = new File(local103, arg1);
						if (!local103.exists() && !local103.mkdir()) {
							continue;
						}
					}
					this.aString10 = this.aString16 = local103.getParent() + "/";
					this.aString15 = this.aString14 = local103.getPath() + "/";
					return;
				}
			} catch (@Pc(178) Exception local178) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(I)V")
	private void method1873() {
		try {
			@Pc(12) File local12 = new File(this.aString16 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(37) DataOutputStream local37 = new DataOutputStream(new FileOutputStream(this.aString16 + "uid.dat"));
				local37.writeInt((int) (Math.random() * 9.9999999E7D));
				local37.close();
			}
		} catch (@Pc(47) Exception local47) {
		}
		try {
			@Pc(72) DataInputStream local72 = new DataInputStream(new FileInputStream(this.aString16 + "uid.dat"));
			this.anInt2951 = local72.readInt() + 1;
			local72.close();
		} catch (@Pc(82) Exception local82) {
		}
	}

	@OriginalMember(owner = "loader!sb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class68 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean164) {
						return;
					}
					if (this.aClass68_3 != null) {
						local16 = this.aClass68_3;
						this.aClass68_3 = this.aClass68_3.aClass68_1;
						if (this.aClass68_3 == null) {
							this.aClass68_2 = null;
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
				@Pc(44) int local44 = local16.anInt2946;
				if (local44 == 1) {
					local16.anObject6 = new Socket(this.anInetAddress2, local16.anInt2947);
				} else if (local44 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local16.anObject5);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local16.anInt2947);
					local16.anObject6 = local59;
				} else if (local44 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(83) Object[] local83;
					if (local44 == 9) {
						local83 = (Object[]) local16.anObject5;
						if (((Class) local83[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local83[0]).getDeclaredMethod((String) local83[1], (Class[]) local83[2]);
					} else if (local44 == 10) {
						local83 = (Object[]) local16.anObject5;
						if (((Class) local83[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local83[0]).getDeclaredField((String) local83[1]);
					} else if (local44 == 3) {
						@Pc(220) String local220 = (local16.anInt2947 >> 24 & 0xFF) + "." + (local16.anInt2947 >> 16 & 0xFF) + "." + (local16.anInt2947 >> 8 & 0xFF) + "." + (local16.anInt2947 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local220).getHostName();
					} else if (local44 == 5) {
						local16.anObject6 = new Class69(new File(this.aString16 + "music" + this.anInt2952 + ".mid"), "rw", 1048576L);
						this.anInt2952 = (this.anInt2952 + 1) % 5;
					}
				}
				local16.anInt2948 = 1;
			} catch (@Pc(250) Exception local250) {
				local16.anInt2948 = 2;
			}
		}
	}
}
