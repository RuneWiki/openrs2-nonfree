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

@OriginalClass("loader!ra")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "loader!ra", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "loader!ra", name = "f", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ra", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "loader!ra", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString16;

	@OriginalMember(owner = "loader!ra", name = "m", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ra", name = "a", descriptor = "I")
	private static final int anInt2973 = 1;

	@OriginalMember(owner = "loader!ra", name = "c", descriptor = "Lloader!t;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!ra", name = "l", descriptor = "Lloader!cd;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!ra", name = "u", descriptor = "Lloader!tc;")
	private Class71 aClass71_1 = null;

	@OriginalMember(owner = "loader!ra", name = "n", descriptor = "Lloader!u;")
	private Class72 aClass72_1 = null;

	@OriginalMember(owner = "loader!ra", name = "s", descriptor = "Ljava/lang/String;")
	public String aString14 = null;

	@OriginalMember(owner = "loader!ra", name = "j", descriptor = "I")
	private int anInt2971 = 0;

	@OriginalMember(owner = "loader!ra", name = "e", descriptor = "I")
	private int anInt2972 = 0;

	@OriginalMember(owner = "loader!ra", name = "d", descriptor = "Ljava/lang/String;")
	private String aString11 = null;

	@OriginalMember(owner = "loader!ra", name = "g", descriptor = "Ljava/lang/String;")
	public String aString13 = null;

	@OriginalMember(owner = "loader!ra", name = "o", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "loader!ra", name = "r", descriptor = "Lloader!u;")
	private Class72 aClass72_2 = null;

	@OriginalMember(owner = "loader!ra", name = "t", descriptor = "Ljava/lang/String;")
	private String aString10 = null;

	@OriginalMember(owner = "loader!ra", name = "b", descriptor = "Lloader!tc;")
	private Class71 aClass71_2 = null;

	@OriginalMember(owner = "loader!ra", name = "p", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ra", name = "w", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!ra", name = "h", descriptor = "[Lloader!tc;")
	private final Class71[] aClass71Array1;

	@OriginalMember(owner = "loader!ra", name = "v", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ra", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class70(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anApplet3 = arg1;
		aString15 = "Unknown";
		aString12 = "1.1";
		this.anInetAddress2 = arg2;
		try {
			aString15 = System.getProperty("java.vendor");
			aString12 = System.getProperty("java.version");
			aString16 = System.getProperty("user.home");
			if (aString16 != null) {
				aString16 = aString16 + "/";
			}
		} catch (@Pc(70) Exception local70) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method1964(arg4, arg3);
		this.aClass71_1 = new Class71(new File(this.aString10 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass71Array1 = new Class71[arg5];
		for (@Pc(157) int local157 = 0; local157 < arg5; local157++) {
			this.aClass71Array1[local157] = new Class71(new File(this.aString10 + "main_file_cache.idx" + local157), "rw", 1048576L);
		}
		this.aClass71_2 = new Class71(new File(this.aString10 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method1967();
		this.aBoolean140 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ra", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class72 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean140) {
						return;
					}
					if (this.aClass72_2 != null) {
						local16 = this.aClass72_2;
						this.aClass72_2 = this.aClass72_2.aClass72_3;
						if (this.aClass72_2 == null) {
							this.aClass72_1 = null;
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
				@Pc(44) int local44 = local16.anInt2976;
				if (local44 == 1) {
					local16.anObject5 = new Socket(this.anInetAddress2, local16.anInt2974);
				} else if (local44 == 2) {
					@Pc(225) Thread local225 = new Thread((Runnable) local16.anObject6);
					local225.setDaemon(true);
					local225.start();
					local225.setPriority(local16.anInt2974);
					local16.anObject5 = local225;
				} else if (local44 == 4) {
					local16.anObject5 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(78) Object[] local78;
					if (local44 == 9) {
						local78 = (Object[]) local16.anObject6;
						if (((Class) local78[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local78[0]).getDeclaredMethod((String) local78[1], (Class[]) local78[2]);
					} else if (local44 == 10) {
						local78 = (Object[]) local16.anObject6;
						if (((Class) local78[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local78[0]).getDeclaredField((String) local78[1]);
					} else if (local44 == 3) {
						@Pc(178) String local178 = (local16.anInt2974 >> 24 & 0xFF) + "." + (local16.anInt2974 >> 16 & 0xFF) + "." + (local16.anInt2974 >> 8 & 0xFF) + "." + (local16.anInt2974 & 0xFF);
						local16.anObject5 = InetAddress.getByName(local178).getHostName();
					} else if (local44 == 5) {
						local16.anObject5 = new Class71(new File(this.aString11 + "music" + this.anInt2971 + ".mid"), "rw", 1048576L);
						this.anInt2971 = (this.anInt2971 + 1) % 5;
					}
				}
				local16.anInt2975 = 1;
			} catch (@Pc(252) Exception local252) {
				local16.anInt2975 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!ra", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method1964(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
				@Pc(98) String local98 = local79[local90];
				@Pc(106) File local106;
				if (local98.length() > 0) {
					local106 = new File(local98);
					if (!local106.exists()) {
						continue;
					}
				}
				local106 = new File(local98 + local88);
				if (local106.exists() || local106.mkdir()) {
					if (arg0.length() > 0) {
						local106 = new File(local106, arg0);
						if (!local106.exists() && !local106.mkdir()) {
							continue;
						}
					}
					this.aString13 = this.aString11 = local106.getParent() + "/";
					this.aString14 = this.aString10 = local106.getPath() + "/";
					return;
				}
			} catch (@Pc(181) Exception local181) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ra", name = "a", descriptor = "(B)V")
	private void method1967() {
		try {
			@Pc(12) File local12 = new File(this.aString11 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(37) DataOutputStream local37 = new DataOutputStream(new FileOutputStream(this.aString11 + "uid.dat"));
				local37.writeInt((int) (Math.random() * 9.9999999E7D));
				local37.close();
			}
		} catch (@Pc(47) Exception local47) {
		}
		try {
			@Pc(70) DataInputStream local70 = new DataInputStream(new FileInputStream(this.aString11 + "uid.dat"));
			this.anInt2972 = local70.readInt() + 1;
			local70.close();
		} catch (@Pc(80) Exception local80) {
		}
	}
}
