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

@OriginalClass("loader!ue")
public final class Class84 implements Runnable {

	@OriginalMember(owner = "loader!ue", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ue", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!ue", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!ue", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!ue", name = "f", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ue", name = "c", descriptor = "I")
	private static final int anInt3212 = 1;

	@OriginalMember(owner = "loader!ue", name = "r", descriptor = "[Lloader!we;")
	private Class85[] aClass85Array1;

	@OriginalMember(owner = "loader!ue", name = "b", descriptor = "Lloader!ma;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!ue", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ue", name = "l", descriptor = "Lloader!oc;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "loader!ue", name = "h", descriptor = "I")
	private int anInt3211 = 0;

	@OriginalMember(owner = "loader!ue", name = "p", descriptor = "Lloader!we;")
	private Class85 aClass85_1 = null;

	@OriginalMember(owner = "loader!ue", name = "o", descriptor = "Lloader!oc;")
	private Class83 aClass83_3 = null;

	@OriginalMember(owner = "loader!ue", name = "s", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "loader!ue", name = "k", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!ue", name = "e", descriptor = "Lloader!we;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!ue", name = "m", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!ue", name = "g", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ue", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ue", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class84(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString7 = "1.1";
		aString9 = "Unknown";
		try {
			aString9 = System.getProperty("java.vendor");
			aString7 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString8 = System.getProperty("user.home");
			if (aString8 != null) {
				aString8 = aString8 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString8 == null) {
			aString8 = "~/";
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
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method2064(arg2, arg3, arg4);
		this.aBoolean247 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ue", name = "a", descriptor = "(IBLjava/lang/String;I)V")
	private void method2064(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", aString8, "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(72) boolean local72 = false;
		for (@Pc(82) int local82 = 0; local82 < 2; local82++) {
			for (@Pc(87) int local87 = 0; local87 < local70.length; local87++) {
				for (@Pc(97) int local97 = 0; local97 < local34.length; local97++) {
					try {
						@Pc(109) String local109 = local34[local97];
						if (local109.length() > 0 && !(new File(local109)).exists()) {
							continue;
						}
						@Pc(137) File local137 = new File(local109 + local70[local87]);
						@Pc(146) boolean local146;
						if (local82 == 1 && !local137.exists()) {
							local146 = local137.mkdir();
							if (!local146) {
								continue;
							}
						}
						@Pc(171) int local171;
						@Pc(158) File local158;
						if (!local72) {
							try {
								local158 = new File(local137, "uid.dat");
								if (local82 == 1 && (!local158.exists() || local158.length() < 4L)) {
									local171 = -1;
									@Pc(175) Random local175 = new Random();
									while (local171 == -1) {
										local171 = local175.nextInt();
									}
									@Pc(190) DataOutputStream local190 = new DataOutputStream(new FileOutputStream(local158));
									local190.writeInt(local171);
									local190.close();
								}
								if (local158.exists()) {
									@Pc(207) DataInputStream local207 = new DataInputStream(new FileInputStream(local158));
									this.anInt3211 = local207.readInt() + 1;
									local207.close();
									local72 = true;
								}
							} catch (@Pc(219) Exception local219) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local137 = new File(local137, arg1);
								if (local82 == 1 && !local137.exists()) {
									local146 = local137.mkdir();
									if (!local146) {
										continue;
									}
								}
								local158 = new File(local137, "main_file_cache.dat2");
								if (local82 == 0 && !local158.exists()) {
									continue;
								}
								this.aClass85_2 = new Class85(local158, "rw", 52428800L);
								this.aClass85Array1 = new Class85[16];
								for (local171 = 0; local171 < 16; local171++) {
									this.aClass85Array1[local171] = new Class85(new File(local137, "main_file_cache.idx" + local171), "rw", 1048576L);
								}
								this.aClass85_1 = new Class85(new File(local137, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local137;
							} catch (@Pc(320) Exception local320) {
								try {
									this.aClass85_2.method2075();
									for (local171 = 0; local171 < 16; local171++) {
										this.aClass85Array1[local171].method2075();
									}
									this.aClass85_1.method2075();
								} catch (@Pc(343) Exception local343) {
								}
								this.aFile4 = this.aFile5 = null;
								this.aClass85_2 = this.aClass85_1 = null;
								this.aClass85Array1 = null;
							}
						}
					} catch (@Pc(360) Exception local360) {
					}
					if (local72 && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!ue", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class83 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean247) {
						return;
					}
					if (this.aClass83_2 != null) {
						local15 = this.aClass83_2;
						this.aClass83_2 = this.aClass83_2.aClass83_1;
						if (this.aClass83_2 == null) {
							this.aClass83_3 = null;
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
				@Pc(45) int local45 = local15.anInt3209;
				if (local45 == 1) {
					local15.anObject5 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt3208);
				} else if (local45 == 2) {
					@Pc(74) Thread local74 = new Thread((Runnable) local15.anObject6);
					local74.setDaemon(true);
					local74.start();
					local74.setPriority(local15.anInt3208);
					local15.anObject5 = local74;
				} else if (local45 == 4) {
					local15.anObject5 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(100) Object[] local100;
					if (local45 == 9) {
						local100 = (Object[]) local15.anObject6;
						if (((Class) local100[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject5 = ((Class) local100[0]).getDeclaredMethod((String) local100[1], (Class[]) local100[2]);
					} else if (local45 == 10) {
						local100 = (Object[]) local15.anObject6;
						if (((Class) local100[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject5 = ((Class) local100[0]).getDeclaredField((String) local100[1]);
					} else if (local45 == 3) {
						@Pc(173) String local173 = (local15.anInt3208 >> 24 & 0xFF) + "." + (local15.anInt3208 >> 16 & 0xFF) + "." + (local15.anInt3208 >> 8 & 0xFF) + "." + (local15.anInt3208 & 0xFF);
						local15.anObject5 = InetAddress.getByName(local173).getHostName();
					}
				}
				local15.anInt3210 = 1;
			} catch (@Pc(221) ThreadDeath local221) {
				throw local221;
			} catch (@Pc(224) Throwable local224) {
				local15.anInt3210 = 2;
			}
		}
	}
}
