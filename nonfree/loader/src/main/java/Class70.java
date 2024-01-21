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

@OriginalClass("loader!fb")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "loader!fb", name = "p", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!fb", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "loader!fb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "loader!fb", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString14;

	@OriginalMember(owner = "loader!fb", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!fb", name = "l", descriptor = "I")
	private static final int anInt3284 = 1;

	@OriginalMember(owner = "loader!fb", name = "a", descriptor = "Lloader!ld;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!fb", name = "d", descriptor = "Lloader!ac;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!fb", name = "q", descriptor = "Ljava/lang/String;")
	public String aString10 = null;

	@OriginalMember(owner = "loader!fb", name = "g", descriptor = "Lloader!id;")
	private Class72 aClass72_1 = null;

	@OriginalMember(owner = "loader!fb", name = "j", descriptor = "Lloader!gd;")
	private Class71 aClass71_1 = null;

	@OriginalMember(owner = "loader!fb", name = "u", descriptor = "Ljava/lang/String;")
	public String aString15 = null;

	@OriginalMember(owner = "loader!fb", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!fb", name = "f", descriptor = "I")
	private int anInt3285 = 0;

	@OriginalMember(owner = "loader!fb", name = "t", descriptor = "Ljava/lang/String;")
	private String aString16 = null;

	@OriginalMember(owner = "loader!fb", name = "r", descriptor = "Lloader!id;")
	private Class72 aClass72_2 = null;

	@OriginalMember(owner = "loader!fb", name = "b", descriptor = "Lloader!gd;")
	private Class71 aClass71_2 = null;

	@OriginalMember(owner = "loader!fb", name = "h", descriptor = "Ljava/lang/String;")
	private String aString11 = null;

	@OriginalMember(owner = "loader!fb", name = "v", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "loader!fb", name = "w", descriptor = "I")
	private int anInt3286 = 0;

	@OriginalMember(owner = "loader!fb", name = "n", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!fb", name = "o", descriptor = "[Lloader!id;")
	private final Class72[] aClass72Array1;

	@OriginalMember(owner = "loader!fb", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!fb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class70(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anApplet2 = arg1;
		this.anInetAddress2 = arg2;
		aString12 = "1.1";
		aString13 = "Unknown";
		try {
			aString13 = System.getProperty("java.vendor");
			aString12 = System.getProperty("java.version");
			aString14 = System.getProperty("user.home");
			if (aString14 != null) {
				aString14 = aString14 + "/";
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
		this.method2115(arg4, arg3);
		this.aClass72_1 = new Class72(new File(this.aString11 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass72Array1 = new Class72[arg5];
		for (@Pc(156) int local156 = 0; local156 < arg5; local156++) {
			this.aClass72Array1[local156] = new Class72(new File(this.aString11 + "main_file_cache.idx" + local156), "rw", 1048576L);
		}
		this.aClass72_2 = new Class72(new File(this.aString11 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method2120();
		this.aBoolean169 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!fb", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method2115(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (aString14 == null) {
			aString14 = "~/";
		}
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(76) String[] local76 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString14, "/tmp/", "" };
		@Pc(85) String local85 = ".file_store_" + arg1;
		for (@Pc(87) int local87 = 0; local87 < local76.length; local87++) {
			try {
				@Pc(95) String local95 = local76[local87];
				@Pc(106) File local106;
				if (local95.length() > 0) {
					local106 = new File(local95);
					if (!local106.exists()) {
						continue;
					}
				}
				local106 = new File(local95 + local85);
				if (local106.exists() || local106.mkdir()) {
					if (arg0.length() > 0) {
						local106 = new File(local106, arg0);
						if (!local106.exists() && !local106.mkdir()) {
							continue;
						}
					}
					this.aString15 = this.aString16 = local106.getParent() + "/";
					this.aString10 = this.aString11 = local106.getPath() + "/";
					return;
				}
			} catch (@Pc(181) Exception local181) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!fb", name = "b", descriptor = "(I)V")
	private void method2120() {
		try {
			@Pc(12) File local12 = new File(this.aString16 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(38) DataOutputStream local38 = new DataOutputStream(new FileOutputStream(this.aString16 + "uid.dat"));
				local38.writeInt((int) (Math.random() * 9.9999999E7D));
				local38.close();
			}
		} catch (@Pc(48) Exception local48) {
		}
		try {
			@Pc(68) DataInputStream local68 = new DataInputStream(new FileInputStream(this.aString16 + "uid.dat"));
			this.anInt3285 = local68.readInt() + 1;
			local68.close();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "loader!fb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class71 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean169) {
						return;
					}
					if (this.aClass71_2 != null) {
						local16 = this.aClass71_2;
						this.aClass71_2 = this.aClass71_2.aClass71_3;
						if (this.aClass71_2 == null) {
							this.aClass71_1 = null;
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
				@Pc(45) int local45 = local16.anInt3288;
				if (local45 == 1) {
					local16.anObject6 = new Socket(this.anInetAddress2, local16.anInt3287);
				} else if (local45 == 2) {
					@Pc(237) Thread local237 = new Thread((Runnable) local16.anObject5);
					local237.setDaemon(true);
					local237.start();
					local237.setPriority(local16.anInt3287);
					local16.anObject6 = local237;
				} else if (local45 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(164) Object[] local164;
					if (local45 == 9) {
						local164 = (Object[]) local16.anObject5;
						if (((Class) local164[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local164[0]).getDeclaredMethod((String) local164[1], (Class[]) local164[2]);
					} else if (local45 == 10) {
						local164 = (Object[]) local16.anObject5;
						if (((Class) local164[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local164[0]).getDeclaredField((String) local164[1]);
					} else if (local45 == 3) {
						@Pc(114) String local114 = (local16.anInt3287 >> 24 & 0xFF) + "." + (local16.anInt3287 >> 16 & 0xFF) + "." + (local16.anInt3287 >> 8 & 0xFF) + "." + (local16.anInt3287 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local114).getHostName();
					} else if (local45 == 5) {
						local16.anObject6 = new Class72(new File(this.aString16 + "music" + this.anInt3286 + ".mid"), "rw", 1048576L);
						this.anInt3286 = (this.anInt3286 + 1) % 5;
					}
				}
				local16.anInt3289 = 1;
			} catch (@Pc(254) Exception local254) {
				local16.anInt3289 = 2;
			}
		}
	}
}
