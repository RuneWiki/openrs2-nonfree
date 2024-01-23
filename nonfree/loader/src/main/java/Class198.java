import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!e")
public final class Class198 {

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class198() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(30) GraphicsDevice local30 = local14[local18];
				if (local30 != null && local30.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local30;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ZLjava/awt/Frame;)V")
	private void method5053(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(56) Field local56 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local56.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(63) Throwable local63) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(I)[I")
	public int[] method5054() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(18) int local18 = 0; local18 < local3.length; local18++) {
			local9[local18 << 2] = local3[local18].getWidth();
			local9[(local18 << 2) + 1] = local3[local18].getHeight();
			local9[(local18 << 2) + 2] = local3[local18].getBitDepth();
			local9[(local18 << 2) + 3] = local3[local18].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "(I)V")
	public void method5055() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5053(null);
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(IILjava/awt/Frame;IIB)V")
	public void method5056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg2.setUndecorated(true);
		arg2.enableInputMethods(false);
		this.method5053(arg2);
		if (arg1 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (arg0 == local32[local36].getWidth() && local32[local36].getHeight() == arg3 && local32[local36].getBitDepth() == arg4) {
					@Pc(68) int local68 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local68 - local28) < Math.abs(arg1 - local28)) {
						arg1 = local68;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg1 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg0, arg3, arg4, arg1));
	}
}
