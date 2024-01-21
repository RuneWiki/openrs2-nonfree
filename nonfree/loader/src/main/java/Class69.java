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

@OriginalClass("loader!aa")
public final class Class69 implements Runnable {

	@OriginalMember(owner = "loader!aa", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!aa", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString11;

	@OriginalMember(owner = "loader!aa", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "loader!aa", name = "i", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!aa", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "loader!aa", name = "e", descriptor = "I")
	private static final int anInt2864 = 1;

	@OriginalMember(owner = "loader!aa", name = "t", descriptor = "Lloader!se;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!aa", name = "u", descriptor = "Lloader!jc;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!aa", name = "c", descriptor = "Ljava/lang/String;")
	private String aString9 = null;

	@OriginalMember(owner = "loader!aa", name = "f", descriptor = "Lloader!o;")
	private Class72 aClass72_1 = null;

	@OriginalMember(owner = "loader!aa", name = "m", descriptor = "Ljava/lang/String;")
	private String aString10 = null;

	@OriginalMember(owner = "loader!aa", name = "l", descriptor = "Lloader!kb;")
	private Class71 aClass71_2 = null;

	@OriginalMember(owner = "loader!aa", name = "b", descriptor = "I")
	private int anInt2862 = 0;

	@OriginalMember(owner = "loader!aa", name = "d", descriptor = "I")
	private int anInt2863 = 0;

	@OriginalMember(owner = "loader!aa", name = "j", descriptor = "Ljava/lang/String;")
	public String aString13 = null;

	@OriginalMember(owner = "loader!aa", name = "o", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!aa", name = "p", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "loader!aa", name = "g", descriptor = "Lloader!o;")
	private Class72 aClass72_2 = null;

	@OriginalMember(owner = "loader!aa", name = "s", descriptor = "Ljava/lang/String;")
	public String aString15 = null;

	@OriginalMember(owner = "loader!aa", name = "k", descriptor = "Lloader!kb;")
	private Class71 aClass71_1 = null;

	@OriginalMember(owner = "loader!aa", name = "w", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!aa", name = "h", descriptor = "[Lloader!o;")
	private final Class72[] aClass72Array1;

	@OriginalMember(owner = "loader!aa", name = "v", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!aa", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class69(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		aString14 = "Unknown";
		this.anInetAddress2 = arg2;
		this.anApplet2 = arg1;
		aString12 = "1.1";
		try {
			aString14 = System.getProperty("java.vendor");
			aString12 = System.getProperty("java.version");
			aString11 = System.getProperty("user.home");
			if (aString11 != null) {
				aString11 = aString11 + "/";
			}
		} catch (@Pc(70) Exception local70) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method1940(arg3, arg4);
		this.aClass72_2 = new Class72(new File(this.aString10 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass72Array1 = new Class72[arg5];
		for (@Pc(157) int local157 = 0; local157 < arg5; local157++) {
			this.aClass72Array1[local157] = new Class72(new File(this.aString10 + "main_file_cache.idx" + local157), "rw", 1048576L);
		}
		this.aClass72_1 = new Class72(new File(this.aString10 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method1944();
		this.aBoolean254 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!aa", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method1940(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (aString11 == null) {
			aString11 = "~/";
		}
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString11, "/tmp/", "" };
		@Pc(84) String local84 = ".file_store_" + arg0;
		for (@Pc(86) int local86 = 0; local86 < local75.length; local86++) {
			try {
				@Pc(94) String local94 = local75[local86];
				@Pc(106) File local106;
				if (local94.length() > 0) {
					local106 = new File(local94);
					if (!local106.exists()) {
						continue;
					}
				}
				local106 = new File(local94 + local84);
				if (local106.exists() || local106.mkdir()) {
					if (arg1.length() > 0) {
						local106 = new File(local106, arg1);
						if (!local106.exists() && !local106.mkdir()) {
							continue;
						}
					}
					this.aString13 = this.aString9 = local106.getParent() + "/";
					this.aString15 = this.aString10 = local106.getPath() + "/";
					return;
				}
			} catch (@Pc(180) Exception local180) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!aa", name = "b", descriptor = "(B)V")
	private void method1944() {
		try {
			@Pc(19) File local19 = new File(this.aString9 + "uid.dat");
			if (!local19.exists() || local19.length() < 4L) {
				@Pc(43) DataOutputStream local43 = new DataOutputStream(new FileOutputStream(this.aString9 + "uid.dat"));
				local43.writeInt((int) (Math.random() * 9.9999999E7D));
				local43.close();
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			@Pc(69) DataInputStream local69 = new DataInputStream(new FileInputStream(this.aString9 + "uid.dat"));
			this.anInt2863 = local69.readInt() + 1;
			local69.close();
		} catch (@Pc(79) Exception local79) {
		}
	}

	@OriginalMember(owner = "loader!aa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class71 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean254) {
						return;
					}
					if (this.aClass71_1 != null) {
						local17 = this.aClass71_1;
						this.aClass71_1 = this.aClass71_1.aClass71_3;
						if (this.aClass71_1 == null) {
							this.aClass71_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local17.anInt2868;
				if (local46 == 1) {
					local17.anObject5 = new Socket(this.anInetAddress2, local17.anInt2867);
				} else if (local46 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local17.anObject6);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local17.anInt2867);
					local17.anObject5 = local59;
				} else if (local46 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(95) Object[] local95;
					if (local46 == 9) {
						local95 = (Object[]) local17.anObject6;
						if (((Class) local95[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local95[0]).getDeclaredMethod((String) local95[1], (Class[]) local95[2]);
					} else if (local46 == 10) {
						local95 = (Object[]) local17.anObject6;
						if (((Class) local95[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local95[0]).getDeclaredField((String) local95[1]);
					} else if (local46 == 3) {
						@Pc(194) String local194 = (local17.anInt2867 >> 24 & 0xFF) + "." + (local17.anInt2867 >> 16 & 0xFF) + "." + (local17.anInt2867 >> 8 & 0xFF) + "." + (local17.anInt2867 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local194).getHostName();
					} else if (local46 == 5) {
						local17.anObject5 = new Class72(new File(this.aString9 + "music" + this.anInt2862 + ".mid"), "rw", 1048576L);
						this.anInt2862 = (this.anInt2862 + 1) % 5;
					}
				}
				local17.anInt2866 = 1;
			} catch (@Pc(251) Exception local251) {
				local17.anInt2866 = 2;
			}
		}
	}
}
