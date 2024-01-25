import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class Class277 {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class277() throws Exception {
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

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(I)[I")
	public int[] method6019() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local3.length; local17++) {
			local9[local17 << 2] = local3[local17].getWidth();
			local9[(local17 << 2) + 1] = local3[local17].getHeight();
			local9[(local17 << 2) + 2] = local3[local17].getBitDepth();
			local9[(local17 << 2) + 3] = local3[local17].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(B)V")
	public void method6020() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6022(null);
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V")
	public void method6021(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method6022(arg0);
		if (arg4 == 0) {
			@Pc(36) int local36 = this.aDisplayMode1.getRefreshRate();
			@Pc(40) DisplayMode[] local40 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(42) boolean local42 = false;
			for (@Pc(44) int local44 = 0; local44 < local40.length; local44++) {
				if (local40[local44].getWidth() == arg1 && arg2 == local40[local44].getHeight() && local40[local44].getBitDepth() == arg3) {
					@Pc(76) int local76 = local40[local44].getRefreshRate();
					if (!local42 || Math.abs(local76 - local36) < Math.abs(arg4 - local36)) {
						arg4 = local76;
						local42 = true;
					}
				}
			}
			if (!local42) {
				arg4 = local36;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method6022(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(13) Field local13 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local13.setAccessible(true);
			@Pc(23) boolean local23 = (Boolean) local13.get(this.aGraphicsDevice1);
			if (local23) {
				local1 = true;
				local13.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(64) Field local64 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local64.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(71) Throwable local71) {
				}
			}
		}
	}
}
