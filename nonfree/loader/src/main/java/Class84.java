import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fe")
public final class Class84 implements Runnable {

	@OriginalMember(owner = "loader!fe", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!fe", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!fe", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!fe", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!fe", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!fe", name = "q", descriptor = "I")
	private static final int anInt3215 = 1;

	@OriginalMember(owner = "loader!fe", name = "f", descriptor = "[Lloader!kd;")
	private Class85[] aClass85Array1;

	@OriginalMember(owner = "loader!fe", name = "m", descriptor = "Lloader!wd;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!fe", name = "e", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "loader!fe", name = "j", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!fe", name = "b", descriptor = "Lloader!cf;")
	private Class83 aClass83_3 = null;

	@OriginalMember(owner = "loader!fe", name = "i", descriptor = "Lloader!kd;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!fe", name = "d", descriptor = "Lloader!cf;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "loader!fe", name = "o", descriptor = "Lloader!kd;")
	private Class85 aClass85_1 = null;

	@OriginalMember(owner = "loader!fe", name = "s", descriptor = "I")
	private int anInt3216 = 0;

	@OriginalMember(owner = "loader!fe", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!fe", name = "k", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!fe", name = "g", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!fe", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!fe", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class84(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString7 = "Unknown";
		aString8 = "1.1";
		this.anApplet2 = arg1;
		try {
			aString7 = System.getProperty("java.vendor");
			aString8 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(70) Throwable local70) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method2240(arg2, arg3, arg4);
		this.aBoolean157 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!fe", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method2240(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(70) boolean local70 = false;
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(79) int local79 = 0; local79 < local68.length; local79++) {
				for (@Pc(89) int local89 = 0; local89 < local43.length; local89++) {
					try {
						@Pc(97) String local97 = local43[local89];
						if (local97.length() > 0 && !(new File(local97)).exists()) {
							continue;
						}
						@Pc(122) File local122 = new File(local97 + local68[local79]);
						@Pc(134) boolean local134;
						if (local72 == 1 && !local122.exists()) {
							local134 = local122.mkdir();
							if (!local134) {
								continue;
							}
						}
						@Pc(161) int local161;
						@Pc(146) File local146;
						if (!local70) {
							try {
								local146 = new File(local122, "uid.dat");
								if (local72 == 1 && (!local146.exists() || local146.length() < 4L)) {
									local161 = -1;
									@Pc(165) Random local165 = new Random();
									while (local161 == -1) {
										local161 = local165.nextInt();
									}
									@Pc(180) DataOutputStream local180 = new DataOutputStream(new FileOutputStream(local146));
									local180.writeInt(local161);
									local180.close();
								}
								if (local146.exists()) {
									@Pc(197) DataInputStream local197 = new DataInputStream(new FileInputStream(local146));
									local70 = true;
									this.anInt3216 = local197.readInt() + 1;
									local197.close();
								}
							} catch (@Pc(209) Exception local209) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local122 = new File(local122, arg1);
								if (local72 == 1 && !local122.exists()) {
									local134 = local122.mkdir();
									if (!local134) {
										continue;
									}
								}
								local146 = new File(local122, "main_file_cache.dat2");
								if (local72 == 0 && !local146.exists()) {
									continue;
								}
								this.aClass85_1 = new Class85(local146, "rw", 52428800L);
								this.aClass85Array1 = new Class85[16];
								for (local161 = 0; local161 < 16; local161++) {
									this.aClass85Array1[local161] = new Class85(new File(local122, "main_file_cache.idx" + local161), "rw", 1048576L);
								}
								this.aClass85_2 = new Class85(new File(local122, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local122;
							} catch (@Pc(308) Exception local308) {
								try {
									this.aClass85_1.method2253();
									for (local161 = 0; local161 < 16; local161++) {
										this.aClass85Array1[local161].method2253();
									}
									this.aClass85_2.method2253();
								} catch (@Pc(331) Exception local331) {
								}
								this.aClass85_1 = this.aClass85_2 = null;
								this.aFile4 = this.aFile5 = null;
								this.aClass85Array1 = null;
							}
						}
					} catch (@Pc(348) Exception local348) {
					}
					if (local70 && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!fe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class83 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean157) {
						return;
					}
					if (this.aClass83_2 != null) {
						local17 = this.aClass83_2;
						this.aClass83_2 = this.aClass83_2.aClass83_1;
						if (this.aClass83_2 == null) {
							this.aClass83_3 = null;
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
				@Pc(46) int local46 = local17.anInt3214;
				if (local46 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt3213);
				} else if (local46 == 2) {
					@Pc(61) Thread local61 = new Thread((Runnable) local17.anObject6);
					local61.setDaemon(true);
					local61.start();
					local61.setPriority(local17.anInt3213);
					local17.anObject5 = local61;
				} else if (local46 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(97) Object[] local97;
					if (local46 == 8) {
						local97 = (Object[]) local17.anObject6;
						if (((Class) local97[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local97[0]).getDeclaredMethod((String) local97[1], (Class[]) local97[2]);
					} else if (local46 == 9) {
						local97 = (Object[]) local17.anObject6;
						if (((Class) local97[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local97[0]).getDeclaredField((String) local97[1]);
					} else if (local46 == 3) {
						@Pc(198) String local198 = (local17.anInt3213 >> 24 & 0xFF) + "." + (local17.anInt3213 >> 16 & 0xFF) + "." + (local17.anInt3213 >> 8 & 0xFF) + "." + (local17.anInt3213 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local198).getHostName();
					}
				}
				local17.anInt3212 = 1;
			} catch (@Pc(220) ThreadDeath local220) {
				throw local220;
			} catch (@Pc(223) Throwable local223) {
				local17.anInt3212 = 2;
			}
		}
	}
}
