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

@OriginalClass("loader!s")
public final class Class68 implements Runnable {

	@OriginalMember(owner = "loader!s", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod2;

	@OriginalMember(owner = "loader!s", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "loader!s", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "loader!s", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString16;

	@OriginalMember(owner = "loader!s", name = "s", descriptor = "I")
	private static final int anInt2705 = 1;

	@OriginalMember(owner = "loader!s", name = "k", descriptor = "Lloader!ia;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!s", name = "v", descriptor = "Lloader!vc;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!s", name = "m", descriptor = "Ljava/lang/String;")
	public String aString11 = null;

	@OriginalMember(owner = "loader!s", name = "n", descriptor = "I")
	private int anInt2704 = 0;

	@OriginalMember(owner = "loader!s", name = "h", descriptor = "Lloader!qc;")
	private Class67 aClass67_1 = null;

	@OriginalMember(owner = "loader!s", name = "j", descriptor = "Ljava/lang/String;")
	private String aString10 = null;

	@OriginalMember(owner = "loader!s", name = "e", descriptor = "Lloader!fa;")
	private Class66 aClass66_2 = null;

	@OriginalMember(owner = "loader!s", name = "p", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!s", name = "o", descriptor = "Z")
	private boolean aBoolean125 = false;

	@OriginalMember(owner = "loader!s", name = "l", descriptor = "Ljava/lang/String;")
	private String aString12 = null;

	@OriginalMember(owner = "loader!s", name = "u", descriptor = "Lloader!fa;")
	private Class66 aClass66_3 = null;

	@OriginalMember(owner = "loader!s", name = "f", descriptor = "Lloader!qc;")
	private Class67 aClass67_2 = null;

	@OriginalMember(owner = "loader!s", name = "i", descriptor = "Ljava/lang/String;")
	public String aString13 = null;

	@OriginalMember(owner = "loader!s", name = "t", descriptor = "I")
	private int anInt2706 = 0;

	@OriginalMember(owner = "loader!s", name = "g", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!s", name = "c", descriptor = "[Lloader!qc;")
	private final Class67[] aClass67Array1;

	@OriginalMember(owner = "loader!s", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!s", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class68(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		aString14 = "Unknown";
		this.anInetAddress2 = arg2;
		aString15 = "1.1";
		this.anApplet3 = arg1;
		try {
			aString14 = System.getProperty("java.vendor");
			aString15 = System.getProperty("java.version");
			aString16 = System.getProperty("user.home");
			if (aString16 != null) {
				aString16 = aString16 + "/";
			}
		} catch (@Pc(71) Exception local71) {
		}
		try {
			if (arg1 == null) {
				aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(99) Exception local99) {
		}
		this.method1697(arg4, arg3);
		this.aClass67_1 = new Class67(new File(this.aString10 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass67Array1 = new Class67[arg5];
		for (@Pc(132) int local132 = 0; local132 < arg5; local132++) {
			this.aClass67Array1[local132] = new Class67(new File(this.aString10 + "main_file_cache.idx" + local132), "rw", 1048576L);
		}
		this.aClass67_2 = new Class67(new File(this.aString10 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method1699();
		this.aBoolean125 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!s", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	private void method1697(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		if (aString16 == null) {
			aString16 = "~/";
		}
		@Pc(79) String[] local79 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString16, "/tmp/", "" };
		@Pc(88) String local88 = ".file_store_" + arg1;
		for (@Pc(90) int local90 = 0; local90 < local79.length; local90++) {
			try {
				@Pc(102) String local102 = local79[local90];
				@Pc(114) File local114;
				if (local102.length() > 0) {
					local114 = new File(local102);
					if (!local114.exists()) {
						continue;
					}
				}
				local114 = new File(local102 + local88);
				if (local114.exists() || local114.mkdir()) {
					if (arg0.length() > 0) {
						local114 = new File(local114, arg0);
						if (!local114.exists() && !local114.mkdir()) {
							continue;
						}
					}
					this.aString11 = this.aString12 = local114.getParent() + "/";
					this.aString13 = this.aString10 = local114.getPath() + "/";
					return;
				}
			} catch (@Pc(187) Exception local187) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!s", name = "a", descriptor = "(I)V")
	private void method1699() {
		try {
			@Pc(12) File local12 = new File(this.aString12 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(37) DataOutputStream local37 = new DataOutputStream(new FileOutputStream(this.aString12 + "uid.dat"));
				local37.writeInt((int) (Math.random() * 9.9999999E7D));
				local37.close();
			}
		} catch (@Pc(47) Exception local47) {
		}
		try {
			@Pc(63) DataInputStream local63 = new DataInputStream(new FileInputStream(this.aString12 + "uid.dat"));
			this.anInt2706 = local63.readInt() + 1;
			local63.close();
		} catch (@Pc(73) Exception local73) {
		}
	}

	@OriginalMember(owner = "loader!s", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class66 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean125) {
						return;
					}
					if (this.aClass66_3 != null) {
						local16 = this.aClass66_3;
						this.aClass66_3 = this.aClass66_3.aClass66_1;
						if (this.aClass66_3 == null) {
							this.aClass66_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt2700;
				if (local45 == 1) {
					local16.anObject6 = new Socket(this.anInetAddress2, local16.anInt2699);
				} else if (local45 == 2) {
					@Pc(238) Thread local238 = new Thread((Runnable) local16.anObject5);
					local238.setDaemon(true);
					local238.start();
					local238.setPriority(local16.anInt2699);
					local16.anObject6 = local238;
				} else if (local45 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(76) Object[] local76;
					if (local45 == 9) {
						local76 = (Object[]) local16.anObject5;
						if (((Class) local76[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local76[0]).getDeclaredMethod((String) local76[1], (Class[]) local76[2]);
					} else if (local45 == 10) {
						local76 = (Object[]) local16.anObject5;
						if (((Class) local76[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local76[0]).getDeclaredField((String) local76[1]);
					} else if (local45 == 3) {
						@Pc(150) String local150 = (local16.anInt2699 >> 24 & 0xFF) + "." + (local16.anInt2699 >> 16 & 0xFF) + "." + (local16.anInt2699 >> 8 & 0xFF) + "." + (local16.anInt2699 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local150).getHostName();
					} else if (local45 == 5) {
						local16.anObject6 = new Class67(new File(this.aString12 + "music" + this.anInt2704 + ".mid"), "rw", 1048576L);
						this.anInt2704 = (this.anInt2704 + 1) % 5;
					}
				}
				local16.anInt2701 = 1;
			} catch (@Pc(255) Exception local255) {
				local16.anInt2701 = 2;
			}
		}
	}
}
