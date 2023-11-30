package com.akbar.bottomnavigation

//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.res.painterResource
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//
//
//
//sealed class Screen(val route: String, val icon: ImageVector) {
//    object Main : Screen("main", Icons.Default.Home)
//    object Profile : Screen("profile", Icons.Default.Person)
//    object Settings : Screen("settings", Icons.Default.Settings)
//}
//
//@Composable
//fun MainScreen() {
//    Image(
//        painter = painterResource(id = R.drawable.ic_main),
//        contentDescription = null,
//        modifier = Modifier.fillMaxSize()
//    )
//}
//
//@Composable
//fun ProfileScreen() {
//    Image(
//        painter = painterResource(id = R.drawable.ic_profile),
//        contentDescription = null,
//        modifier = Modifier.fillMaxSize()
//    )
//}
//
//@Composable
//fun SettingsScreen() {
//    Image(
//        painter = painterResource(id = R.drawable.ic_settings),
//        contentDescription = null,
//        modifier = Modifier.fillMaxSize()
//    )
//}
//
//@Composable
//fun BottomNavigationMenu(navController: NavHostController) {
//    BottomNavigation {
//        // Step 5: Add BottomNavigationItem for each screen
//        BottomNavigationItem(
//            icon = { Icon(Icons.Default.Home, contentDescription = null) },
//            label = { Text("Main") },
//            selected = navController.currentDestination?.route == Screen.Main.route,
//            onClick = {
//                navController.navigate(Screen.Main.route) {
//                    popUpTo(navController.graph.startDestinationId)
//                    launchSingleTop = true
//                }
//            }
//        )
//        BottomNavigationItem(
//            icon = { Icon(Icons.Default.Person, contentDescription = null) },
//            label = { Text("Profile") },
//            selected = navController.currentDestination?.route == Screen.Profile.route,
//            onClick = {
//                navController.navigate(Screen.Profile.route) {
//                    popUpTo(navController.graph.startDestinationId)
//                    launchSingleTop = true
//                }
//            }
//        )
//        BottomNavigationItem(
//            icon = { Icon(Icons.Default.Settings, contentDescription = null) },
//            label = { Text("Settings") },
//            selected = navController.currentDestination?.route == Screen.Settings.route,
//            onClick = {
//                navController.navigate(Screen.Settings.route) {
//                    popUpTo(navController.graph.startDestinationId)
//                    launchSingleTop = true
//                }
//            }
//        )
//    }
//}
//
//@Composable
//fun MyApp() {
//    // Step 7: Set up navigation logic using NavHost
//    val navController = rememberNavController()
//
//    NavHost(
//        navController = navController,
//        startDestination = Screen.Main.route
//    ) {
//        composable(Screen.Main.route) { MainScreen() }
//        composable(Screen.Profile.route) { ProfileScreen() }
//        composable(Screen.Settings.route) { SettingsScreen() }
//    }
//
//    // Step 8: Display the bottom navigation menu
//    BottomNavigationMenu(navController = navController)
//}
//
